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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebElement
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.StaleElementReferenceException

if (open_browser.toString().equals('1')) {
    WebUI.callTestCase(findTestCase('Setir Kanan/SKMB003-Cari Mobil Bekas Hompage dengan filter'), [('model') : 'Toyota Agya;Toyota Calya'
            , ('brand') : 'Toyota;Daihatsu', ('tahun') : '2016-2020', ('transmisi') : 'Manual;Otomatis', ('expected_url') : 'https://www.seva.id/mobil-bekas/'
            , ('screen') : '', ('open_browser') : '1', ('close_browser') : '1'], FailureHandling.STOP_ON_FAILURE)
}

// 🔹 fungsi klik stabil
def safeClick(TestObject to, int timeout = 10) {
    int retry = 0
    boolean clicked = false

    while (retry < 3 && !clicked) {
        try {
            if (WebUI.verifyElementPresent(to, timeout, FailureHandling.OPTIONAL) &&
                WebUI.verifyElementVisible(to, timeout, FailureHandling.OPTIONAL)) {

                WebUI.click(to)
                clicked = true
            }
        } catch (StaleElementReferenceException e) {
            retry++
            WebUI.delay(1)
        } catch (Exception e) {
            try {
                WebElement element = WebUiCommonHelper.findWebElement(to, timeout)
                JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()
                js.executeScript("arguments[0].click();", element)
                clicked = true
            } catch (Exception inner) {
                retry++
                WebUI.delay(1)
            }
        }
    }

    if (!clicked) {
        WebUI.comment("❌ Gagal klik object: " + to.getObjectId())
    }
}

// 🔹 Pemakaian di test case
TestObject btnAturUlang = findTestObject('used car/aturUlangButton')
TestObject btnTerapkan  = findTestObject('used car/terapkanButton')

safeClick(btnAturUlang, 15)
WebUI.scrollToElement(btnTerapkan, 5)
safeClick(btnTerapkan, 10)

WebUI.closeBrowser()