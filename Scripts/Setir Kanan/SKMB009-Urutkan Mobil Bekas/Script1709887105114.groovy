import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint	
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebElement
import org.openqa.selenium.JavascriptExecutor

// Panggil test case untuk membuka halaman
WebUI.callTestCase(findTestCase('Setir Kanan/SKMB002-Membuka Halaman Mobil Bekas Melalui Icon Hamburger'), 
    [('expected_url') : expected_url, 
     ('open_browser') : '1', 
     ('close_browser') : '0'], FailureHandling.STOP_ON_FAILURE)


// Fungsi klik aman (normal click + fallback JS)
def safeClick(TestObject to, int timeout = 10) {
    try {
        WebUI.waitForElementVisible(to, timeout)
        WebUI.scrollToElement(to, timeout)
        try {
            WebUI.click(to) // normal click dulu
        } catch (Exception e) {
            WebElement element = WebUiCommonHelper.findWebElement(to, timeout)
            JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()
            js.executeScript("arguments[0].click();", element)
        }
    } catch (Exception e) {
        WebUI.comment("❌ Gagal klik: " + to.getObjectId() + " => " + e.getMessage())
    }
}

// 🔹 Step Awal
safeClick(findTestObject('Object Repository/Page Mobil Bekas/button_urutkan'), 10)

// Tutup popup kalau ada
CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(10)

// Klik opsi urutkan
TestObject optionSort = findTestObject('Page Mobil Bekas/option_Urutkan Berdasarkan', [('sort') : sorting])
safeClick(optionSort, 10)

// 🔹 Ambil data dari hasil sorting
String data = ''
int loop = 1
String[] sortingElemen = sorting.toString().split(' ')
int maxLoop = 10
int currentLoop = 0

while (currentLoop < maxLoop) {
    if ((sortingElemen[0]).equalsIgnoreCase('mobil')) {
        boolean cek = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(
            findTestObject('Page Mobil Bekas/label_Title Card Mobil', [('id') : loop]), 1)

        if (cek) {
            String title = WebUI.getText(findTestObject('Page Mobil Bekas/label_Title Card Mobil', [('id') : loop]))
            title = title.substring(title.length() - 4) // ambil tahun
            data += " " + title
        } else {
            break
        }
    } else if ((sortingElemen[0]).equalsIgnoreCase('harga')) {
        boolean cek = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(
            findTestObject('Page Mobil Bekas/label_Harga Mobil Bekas', [('id') : loop]), 1)

        if (cek) {
            String title = WebUI.getText(findTestObject('Page Mobil Bekas/label_Harga Mobil Bekas', [('id') : loop]))
            title = title.replaceAll('[^0-9]', '') // ambil angka doang
            data += " " + title
        } else {
            break
        }
    }

    loop++
    currentLoop++
}

if (currentLoop >= maxLoop) {
    WebUI.comment("⚠️ Max loop iterations reached. Check if the expected elements are loaded correctly.")
}

WebUI.comment("Data hasil scraping: " + data.toString())

// 🔹 Proses data
data = data.trim()
String[] dataArray = data.split(' ')

// 🔹 Validasi sesuai sorting
if (sortingElemen[0].equalsIgnoreCase("mobil")) {
    if (sortingElemen[1].equalsIgnoreCase("terbaru")) {
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = i + 1; j < dataArray.length; j++) {
                WebUI.verifyGreaterThanOrEqual(Long.parseLong(dataArray[i]), Long.parseLong(dataArray[j]))
            }
        }
    } else if (sortingElemen[1].equalsIgnoreCase("terlama")) {
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = i + 1; j < dataArray.length; j++) {
                WebUI.verifyLessThanOrEqual(Long.parseLong(dataArray[i]), Long.parseLong(dataArray[j]))
            }
        }
    }
} else if (sortingElemen[0].equalsIgnoreCase("harga")) {
    if (sortingElemen[1].equalsIgnoreCase("tertinggi")) {
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = i + 1; j < dataArray.length; j++) {
                WebUI.verifyGreaterThanOrEqual(
                    Long.parseLong(dataArray[i].replaceAll(",", "")),
                    Long.parseLong(dataArray[j].replaceAll(",", ""))
                )
            }
        }
    } else if (sortingElemen[1].equalsIgnoreCase("terendah")) {
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = i + 1; j < dataArray.length; j++) {
                WebUI.verifyLessThanOrEqual(
                    Long.parseLong(dataArray[i].replaceAll(",", "")),
                    Long.parseLong(dataArray[j].replaceAll(",", ""))
                )
            }
        }
    }
}

WebUI.closeBrowser()