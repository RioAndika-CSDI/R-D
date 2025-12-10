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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import java.util.Random as Random
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webui.driver.DriverFactory

systemos = System.getProperty('os.name')
String[] osParts = systemos.split(' ')  
WebUI.comment(osParts[0])

if (open_browser.toString().equals('1')) {
    WebUI.callTestCase(
        findTestCase('Setir Kanan/SKMB002-Membuka Halaman Mobil Bekas Melalui Icon Hamburger'),
        [
            ('expected_url') : 'https://www.seva.id/mobil-bekas/c',
            ('open_browser') : '1',
            ('close_browser') : '0'
        ],
        FailureHandling.STOP_ON_FAILURE
    )
} else {
    if (DriverFactory.getWebDriver() == null) {
        WebUI.comment('❌ Tidak ada browser terbuka, tapi open_browser=0.')
        assert false : "Browser belum terbuka! Harap set open_browser=1 atau panggil dari TC lain."
    } else {
        WebUI.comment('✅ Browser sudah terbuka dari TC lain, lanjut eksekusi...')
    }
}

WebUI.delay(10)
WebUI.click(findTestObject('used car/filterOverlay'))


List<WebElement> filterOptions = WebUiCommonHelper.findWebElements(findTestObject('used car/pilih filter overlay'), 10)
WebUI.comment('Total opsi ditemukan: ' + filterOptions.size())

if (filterOptions.size() > 0) {
    Random rand = new Random()
    int randomIndex = rand.nextInt(filterOptions.size())

    WebElement selectedOption = filterOptions[randomIndex]
    String expectedText = selectedOption.getText().trim()

    WebUI.comment('Opsi yang dipilih: ' + expectedText)
    WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(selectedOption))
    WebUI.comment('Opsi terpilih: ' + selectedOption.getText())
} else {
    WebUI.comment(' Tidak ada opsi filter yang ditemukan! Cek lagi locator xpath-nya.')
}
