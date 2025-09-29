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
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

if (open_browser.toString().equals('1')) {
	ChromeOptions options = new ChromeOptions()
	options.addArguments("--window-size=570,912")
	options.addArguments("--user-agent=Mozilla/5.0 (iPhone; CPU iPhone OS 13_2_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Mobile/15E148 Safari/604.1")

	WebUI.openBrowser('')
	DriverFactory.changeWebDriver(new ChromeDriver(options))
	WebUI.navigateToUrl('https://seva.id')
}

boolean popupBefore = CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(5)

WebUI.click(findTestObject('Homepage Component/Burger_Button_Baru'))


if (popupBefore) {
    WebUI.comment('Popup muncul SEBELUM klik burger menu dan sudah ditutup')
}

WebUI.delay(15)

JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()
js.executeScript("""
    var iframe = document.querySelector('iframe[id*="moe-onsite-campaign"]');
    if (iframe) {
        iframe.remove();
    }
""")

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.delay(10)

JavascriptExecutor jsrefi = (JavascriptExecutor) DriverFactory.getWebDriver()
jsrefi.executeScript("""
    var iframe = document.querySelector('iframe[id*="moe-onsite-campaign"]');
    if (iframe) {
        iframe.remove();
    }
""")

WebUI.click(findTestObject('HomeRefinancing/SubMenu_FasilitasDana'))

def actURL = WebUI.getUrl()

WebUI.verifyMatch(actURL, expected_url, true)

WebUI.scrollToElement(findTestObject('HomeRefinancing/responsive mode/Cara mudah pinjaman'), 10)

WebUI.click(findTestObject('HomeRefinancing/responsive mode/CTA di sini'))

WebUI.setText(findTestObject('HomeRefinancing/responsive mode/input nama'), 'Hilmy Testing')

WebUI.setText(findTestObject('HomeRefinancing/responsive mode/input nomor'), '85349524555')

WebUI.click(findTestObject('HomeRefinancing/responsive mode/dropdown svg'), FailureHandling.STOP_ON_FAILURE)

JavascriptExecutor js2 = (JavascriptExecutor) DriverFactory.getWebDriver()
js2.executeScript("""
    var iframe = document.querySelector('iframe[id*="moe-onsite-campaign"]');
    if (iframe) {
        iframe.remove();
    }
""")

WebUI.delay(10)

WebUI.click(findTestObject('HomeRefinancing/responsive mode/dropdown lokasi'))

def inputField = findTestObject('HomeRefinancing/responsive mode/input teman seva')

def ceklistBtn = findTestObject('HomeRefinancing/responsive mode/cheklist saya setuju')

WebUI.setText(inputField, 'SEVA12')

WebUI.click(ceklistBtn)

WebUI.delay(1)

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
// Cek kondisi toggle bypass OTP
if (WebUI.waitForElementVisible(findTestObject('Login Register Component/Input_OTP'), 5, FailureHandling.OPTIONAL)) {
    WebUI.comment("Kondisi OTP normal - input OTP dulu")
    WebUI.setText(findTestObject('Login Register Component/Input_OTP'), OTP)
} else {
    WebUI.comment("Kondisi Bypass OTP")
}

//WebUI.switchToWindowIndex(1)

WebUI.delay(5)

WebUI.switchToWindowIndex(0)

WebUI.waitForPageLoad(10)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Refinancing/API local storage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

