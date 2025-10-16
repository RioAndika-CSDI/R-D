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

if (open_browser.toString().equals('1')) {
    WebUI.openBrowser(GlobalVariable.Prod)
}

if (viewport == 'desktop') {
    WebUI.maximizeWindow()

    WebUI.scrollToElement(findTestObject('Login Register Component/Rekomendasi'), 0)

    WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

    WebUI.executeJavaScript('window.scrollTo(0, 0)', [])

    WebUI.enhancedClick(findTestObject('Homepage Component/button_Masuk  Register'))

    WebUI.delay(5)

    WebUI.setText(findTestObject('Login Register Component/Input_Phone_Number'), nomorHP)

    WebUI.click(findTestObject('Login Register Component/button_Lanjutkan'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Login Register Component/Input_OTP'), OTP)

    WebUI.verifyElementPresent(findTestObject('Login Register Component/Notif_Success_OTP'), 0, FailureHandling.OPTIONAL)

    WebUI.waitForElementPresent(findTestObject('Object Repository/Homepage Component/desktop view - avatar'), 30)

    WebUI.verifyElementPresent(findTestObject('Homepage - Burger menu/Label_nomor hp profile', [('nomor') : nomorHP]), 0)
} else {
    WebUI.setViewPortSize(500, 736)

    WebUI.scrollToElement(findTestObject('Homepage Component/Promo Eksklusif'), 0)

    WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

    WebUI.executeJavaScript('window.scrollTo(0, 0)', [])

    WebUI.delay(10)

    'Click Burger Menu'
    WebUI.click(findTestObject('Homepage Component/Button_Hamburger Menu'))

    WebUI.delay(10)

    'Click Burger Menu'
    WebUI.enhancedClick(findTestObject('Homepage Component/button_Masuk  Register'))

    WebUI.delay(5)

    WebUI.setText(findTestObject('Login Register Component/Input_Phone_Number'), nomorHP)

    WebUI.click(findTestObject('Login Register Component/button_Lanjutkan'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Login Register Component/Input_OTP'), OTP)

    WebUI.verifyElementPresent(findTestObject('Login Register Component/Notif_Success_OTP'), 0, FailureHandling.OPTIONAL)

    WebUI.waitForElementPresent(findTestObject('Homepage Component/Button_Hamburger Menu'), 30)

    WebUI.click(findTestObject('Homepage Component/Button_Hamburger Menu'))

    String currentUrl = WebUI.getUrl()

    WebUI.verifyMatch(currentUrl, 'https://www.seva.id/', false)
}

