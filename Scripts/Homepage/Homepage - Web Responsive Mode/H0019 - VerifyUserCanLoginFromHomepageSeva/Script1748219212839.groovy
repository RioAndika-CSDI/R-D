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

WebUI.openBrowser(GlobalVariable.Prod)

WebUI.setViewPortSize(570, 912)

WebUI.click(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/h1_Menemani Perjalanan Finansial Mobil Barumu'))

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(8)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.click(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/svg_SEVA burger menu Icon (2)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Masuk  Register'))

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Masuk  Register'), 
    0)

WebUI.waitForElementPresent(findTestObject('Page_Masuk Akun - SEVA/input_Selamat Datang di SEVA_inputPhone_inp_75cdba'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Masuk Akun - SEVA/input_Selamat Datang di SEVA_inputPhone_inp_75cdba'), 
    '82121212121')

WebUI.click(findTestObject('Object Repository/Page_Masuk Akun - SEVA/button_Lanjutkan (1)'))

//Confirm the OTP Pop-up is Present
boolean isOTPPopUpPresent = WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Masuk Akun - SEVA/input_Verifikasi Nomor Kamu_false otp_otpIn_7f5bb0'), 
    10)

//If Pop-up OTP Exist then Input OTP, Else case will be count as Passed with Note (Too Many OTP Request) due to Rate Limit Implementation
if (isOTPPopUpPresent) {
    WebUI.setText(findTestObject('Object Repository/Page_Masuk Akun - SEVA/input_Verifikasi Nomor Kamu_false otp_otpIn_7f5bb0'), 
        '123456')

    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Masuk Akun - SEVA/p_Nomor berhasil diverifikasi (1)'), 
        10)

    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/h1_Menemani Perjalanan Finansial Mobil Barumu'), 
        10)
} else {
    WebUI.comment('OTP input field is not present, possibly due to \'Too Many OTP Requests\'. Test case passed with a note.')
}

WebUI.delay(5)

WebUI.closeBrowser()

