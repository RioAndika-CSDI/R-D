import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import java.util.Arrays as Arrays

// --- Start Test ---
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.seva.id/fasilitas-dana/upload/6285349524555')

WebUI.verifyMatch(WebUI.getUrl(), 'https://www.seva.id/fasilitas-dana/upload/6285349524555', false)

WebUI.verifyElementPresent(findTestObject('HomeRefinancing/label_uploadDokumen'), 10)

String phoneNumber = '6285349524555'

String expectedBaseUrl = "https://www.seva.id/fasilitas-dana/upload/$phoneNumber/camera"

// Ambil base xpath dari repo (fallback ke default kalau kosong)
String baseXpath = findTestObject('HomeRefinancing/upload_button').findPropertyValue('xpath')

if ((baseXpath == null) || (baseXpath.trim() == '')) {
    baseXpath = '//*[starts-with(@class,\'emptyUploadRefinancing_buttonframe\')]'
}

WebDriver driver = DriverFactory.getWebDriver()

List elements = driver.findElements(By.xpath(baseXpath))

int jumlahBtn = elements.size()

WebUI.comment('Jumlah button upload ditemukan: ' + jumlahBtn)

if (jumlahBtn == 0) {
    WebUI.comment('Tidak ada button upload di halaman.')

    WebUI.closeBrowser()

    return 
}

// --- Loop semua button upload yang ada ---
for (int i = 1; i <= 12; i++) {
    TestObject buttonUpload = new TestObject("dynamicButton_$i")

    String indexedXpath = "($baseXpath)[$i]"

    buttonUpload.addProperty('xpath', ConditionType.EQUALS, indexedXpath)

    if (WebUI.verifyElementPresent(buttonUpload, 5, FailureHandling.OPTIONAL)) {
        WebUI.comment("Tombol ke-$i ditemukan, lanjut klik")

        WebUI.scrollToElement(buttonUpload, 30)

        WebUI.click(buttonUpload)

        WebUI.waitForPageLoad(10)

        String currentUrl = WebUI.getUrl()

        if (currentUrl.startsWith(expectedBaseUrl)) {
            WebUI.comment("Match untuk button ke-$i, URL: $currentUrl")

            TestObject btn = findTestObject('HomeRefinancing/panduan unggah')

            WebUI.scrollToElement(btn, 3)

            WebUI.waitForElementClickable(btn, 10)

            try {
                WebUI.click(btn)

                WebUI.comment('Klik tombol berhasil')
            }
            catch (Exception e) {
                WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(WebUI.findWebElement(btn)))

                WebUI.comment('Fallback klik pakai JavaScript')
            } 
            
            WebUI.verifyElementPresent(findTestObject('HomeRefinancing/verify pop up panduan'), 5)
        } else {
            WebUI.comment("URL mismatch di button ke-$i, Dapat: $currentUrl")
        }
        
        // Balik ke halaman awal
        if (WebUI.getWindowIndex() > 0) {
            WebUI.closeWindowIndex(WebUI.getWindowIndex())

            WebUI.switchToWindowIndex(0)
        } else {
            WebUI.back()
        }
        
        WebUI.waitForPageLoad(10)
    } else {
        WebUI.comment("Tombol ke-$i tidak ditemukan, skip")
    }
}

