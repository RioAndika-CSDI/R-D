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

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Homepage Component/Button Cari Mobil Baru'), 0)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(10)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

'Click Burger Menu'
WebUI.scrollToElement(findTestObject('Homepage Component/Button_Hamburger Menu'), 0)

'Click Burger Menu'
WebUI.waitForElementPresent(findTestObject('Homepage Component/Button_Hamburger Menu'), 0)

'Click Burger Menu'
WebUI.click(findTestObject('Homepage Component/Button_Hamburger Menu'))

'Click Burger Menu'
WebUI.click(findTestObject('Homepage Component/button_Masuk  Register'))

WebUI.waitForElementPresent(findTestObject('Login Register Component/Input_Phone_Number'), 0)

WebUI.setText(findTestObject('Login Register Component/Input_Phone_Number'), nomorHP)

WebUI.click(findTestObject('Login Register Component/button_Lanjutkan'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login Register Component/Input_Phone_Number'), OTP)

WebUI.verifyElementPresent(findTestObject('Login Register Component/Notif_Success_OTP'), 0)

WebUI.waitForElementPresent(findTestObject('Homepage Component/Button_Hamburger Menu'), 120)

WebUI.click(findTestObject('Homepage Component/Button_Hamburger Menu'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(10)

WebUI.verifyElementPresent(findTestObject('Homepage - Burger menu/Label_nomor hp profile', [('nomor') : nomorHP]), 0)

'start'
WebUI.click(findTestObject('Homepage - Burger menu/Profile'))

WebUI.verifyElementPresent(findTestObject('Profile/Profile_Page/profile-avatar'), 0)

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

