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

WebUI.delay(10)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(15)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

'Click Burger Menu'
WebUI.scrollToElement(findTestObject('Homepage Component/Burger_Button_Baru'), 0)

'Click Moengage Ads\r\n'
WebUI.delay(1)

'Click Burger Menu'
WebUI.click(findTestObject('Homepage Component/Burger_Button_Baru'))

'Click Burger Menu'
WebUI.click(findTestObject('Homepage Component/button_Masuk  Register'))

String[] awalan = Awalan_nomorHP.toString().split(';')

for (i = 0; i < awalan.length; i++) {
    WebUI.setText(findTestObject('Login Register Component/Input_phone_umum'), awalan[i])

    String hasilInput = WebUI.getAttribute(findTestObject('Login Register Component/Input_phone_umum'), 'value')

    WebUI.comment(hasilInput)

    int output = hasilInput.toString().length()

    WebUI.verifyLessThanOrEqual(output, 0)

    WebUI.clearText(findTestObject('Login Register Component/Input_phone_umum'))
}

WebUI.setText(findTestObject('Login Register Component/Input_phone_umum'), nomor_dibawahMinimal)

WebUI.verifyElementPresent(findTestObject('Login Register Component/Button_Lanjut_Disable'), 0)

WebUI.clearText(findTestObject('Login Register Component/Input_phone_umum'))

WebUI.setText(findTestObject('Login Register Component/Input_phone_umum'), nomor_diatasMax)

hasilinputmax = WebUI.getAttribute(findTestObject('Login Register Component/Input_phone_umum'), 'value')

WebUI.verifyMatch(hasilinputmax.length().toString(), digit_max, true)

//WebUI.click(findTestObject('Login Register Component/button_Lanjutkan'), FailureHandling.STOP_ON_FAILURE)
if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

