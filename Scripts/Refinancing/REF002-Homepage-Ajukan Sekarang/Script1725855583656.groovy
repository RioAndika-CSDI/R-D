import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint	
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import groovy.json.JsonSlurper as JsonSlurper
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory

if (open_browser.toString().equals('1')) {
    WebUI.openBrowser('https://www.seva.id')

    WebUI.setViewPortSize(570, 912 // Responsive mode
        )
}
JavascriptExecutor jsbefore = (JavascriptExecutor) DriverFactory.getWebDriver()
jsbefore.executeScript("""
    var iframe = document.querySelector('iframe[id*="moe-onsite-campaign"]');
    if (iframe) {
        iframe.remove();
    }
""")


WebUI.click(findTestObject('Homepage Component/Burger_Button_Baru'))

JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()
js.executeScript("""
    var iframe = document.querySelector('iframe[id*="moe-onsite-campaign"]');
    if (iframe) {
        iframe.remove();
    }
""")
WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.click(findTestObject('HomeRefinancing/SubMenu_FasilitasDana'))

def actURL = WebUI.getUrl()

WebUI.verifyMatch(actURL, expected_url, true)
JavascriptExecutor jsgeturl = (JavascriptExecutor) DriverFactory.getWebDriver()
jsgeturl.executeScript("""
    var iframe = document.querySelector('iframe[id*="moe-onsite-campaign"]');
    if (iframe) {
        iframe.remove();
    }
""")

WebUI.click(findTestObject('HomeRefinancing/Button_AjukanSekarang'))

WebUI.setText(findTestObject('HomeRefinancing/responsive mode/input nama'), 'Hilmy Testing')

WebUI.setText(findTestObject('HomeRefinancing/responsive mode/input nomor'), '85349524555')


WebUI.click(findTestObject('HomeRefinancing/responsive mode/dropdown svg'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

JavascriptExecutor js2 = (JavascriptExecutor) DriverFactory.getWebDriver()
js2.executeScript("""
    var iframe = document.querySelector('iframe[id*="moe-onsite-campaign"]');
    if (iframe) {
        iframe.remove();
    }
""")

WebUI.click(findTestObject('HomeRefinancing/responsive mode/dropdown lokasi'))

def inputField = findTestObject('HomeRefinancing/responsive mode/input teman seva')

def ceklistBtn = findTestObject('HomeRefinancing/responsive mode/cheklist saya setuju')

WebUI.setText(inputField, 'SEVA12')

WebUI.click(ceklistBtn)

WebUI.delay(5)

if (WebUI.verifyElementPresent(findTestObject('HomeRefinancing/responsive mode/error reff code'), 5, FailureHandling.OPTIONAL)) {
    WebUI.comment('❌ Kode referral SEVA12 tidak valid, diganti SEVAF8RS')

    WebUI.sendKeys(inputField, Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(inputField, Keys.chord(Keys.BACK_SPACE))

    WebUI.setText(inputField, 'SEVANV6B')

    WebUI.click(ceklistBtn)
} else {
    WebUI.comment('✅ Referral code SEVA12 tidak menimbulkan error UI')
}

// SUBMIT
WebUI.click(findTestObject('HomeRefinancing/responsive mode/dropdown svg'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('HomeRefinancing/responsive mode/dropdown lokasi'))

WebUI.click(ceklistBtn)

WebUI.delay(5)

WebUI.click(findTestObject('HomeRefinancing/responsive mode/button_kirim'))

// MASUKKAN OTP
WebUI.setText(findTestObject('Login Register Component/Input_OTP'), OTP)

WebUI.switchToWindowIndex(1)

WebUI.delay(5)

WebUI.switchToWindowIndex(0)

WebUI.waitForPageLoad(10)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Refinancing/API local storage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

