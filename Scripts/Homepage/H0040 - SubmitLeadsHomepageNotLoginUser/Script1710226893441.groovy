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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.seva.id/')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Homepage Component/Text Butuh Bantuan'), 0)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(8)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

WebUI.setText(findTestObject('Object Repository/Test/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/input_Butuh Bantuan_input_input__MAvlc'), 
    'Marvin Testing')

WebUI.setText(findTestObject('Object Repository/Test/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/input_Butuh Bantuan_inputPhone_input__r86Wm false'), 
    '8752900847')

WebUI.click(findTestObject('Homepage - Burger menu/Checkbox-agreement'))

WebUI.click(findTestObject('Object Repository/Test/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Kirim'))

WebUI.setText(findTestObject('Object Repository/Test/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/input_Verifikasi Nomor Kamu_false otp_otpIn_7f5bb0'), 
    '445566')

WebUI.click(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/p_Nomor berhasil diverifikasi. Agen SEVA ak_836ded'))

WebUI.closeBrowser()

