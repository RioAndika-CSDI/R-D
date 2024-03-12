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

WebUI.click(findTestObject('Object Repository/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/h1_Menemani Perjalanan Finansial Mobil Barumu'))

WebUI.click(findTestObject('Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Nanti Saja (1)'))

WebUI.click(findTestObject('Object Repository/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Mau'))

WebUI.click(findTestObject('Object Repository/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/svg_SEVA burger menu Icon (2)'))

WebUI.click(findTestObject('Object Repository/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Masuk  Register'))

WebUI.setText(findTestObject('Object Repository/Page_Masuk Akun - SEVA/input_Selamat Datang di SEVA_inputPhone_inp_75cdba'), 
    '82121212121')

WebUI.click(findTestObject('Object Repository/Page_Masuk Akun - SEVA/button_Lanjutkan (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Masuk Akun - SEVA/input_Verifikasi Nomor Kamu_false otp_otpIn_7f5bb0'), 
    '123456')

WebUI.click(findTestObject('Object Repository/Page_Masuk Akun - SEVA/p_Nomor berhasil diverifikasi (1)'))

WebUI.click(findTestObject('Object Repository/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/h1_Menemani Perjalanan Finansial Mobil Barumu (1)'))

WebUI.closeBrowser()

