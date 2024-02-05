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

WebUI.openBrowser(GlobalVariable.Prod + '/adaSEVAdiOTO')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('SEVAxOTO-LandingPage/Page_Temukan mobil baru Astra 2024 jaminan kualitas dari SEVA  SEVA x OTO/h2_Butuh Bantuan'), 
    0)

WebUI.delay(8)

WebUI.click(findTestObject('SEVAxOTO-LandingPage/Page_Temukan mobil baru Astra 2024 jaminan kualitas dari SEVA  SEVA x OTO/button_Nanti Saja'))

WebUI.click(findTestObject('Object Repository/SEVAxOTO-LandingPage/Page_Temukan mobil baru Astra 2024 jaminan _1362e3/button_x'))

WebUI.setText(findTestObject('Object Repository/SEVAxOTO-LandingPage/Page_Temukan mobil baru Astra 2024 jaminan _1362e3/input_Pilih lokasi pembelian mobilmu_inputS_6b2c7f'), 
    'Jakarta Selatan')

WebUI.click(findTestObject('Object Repository/SEVAxOTO-LandingPage/Page_Temukan mobil baru Astra 2024 jaminan _1362e3/span_Jakarta Selatan'))

WebUI.click(findTestObject('Object Repository/SEVAxOTO-LandingPage/Page_Temukan mobil baru Astra 2024 jaminan _1362e3/button_Mulai Cari Mobil'))

WebUI.click(findTestObject('Object Repository/SEVAxOTO-LandingPage/Page_Temukan mobil baru Astra 2024 jaminan _1362e3/button_Saya Tertarik'))

WebUI.setText(findTestObject('Object Repository/SEVAxOTO-LandingPage/Page_Temukan mobil baru Astra 2024 jaminan _1362e3/input_Butuh Bantuan_inputPhone_input__r86Wm false'), 
    'Marvin Ariel Johannes')

WebUI.setText(findTestObject('Object Repository/SEVAxOTO-LandingPage/Page_Temukan mobil baru Astra 2024 jaminan _1362e3/input_Butuh Bantuan_inputPhone_input__r86Wm false'), 
    '81225717129')

WebUI.click(findTestObject('Object Repository/SEVAxOTO-LandingPage/Page_Temukan mobil baru Astra 2024 jaminan _1362e3/button_Kirim'))

WebUI.setText(findTestObject('Object Repository/SEVAxOTO-LandingPage/Page_Temukan mobil baru Astra 2024 jaminan _1362e3/input_Verifikasi Nomor Kamu_false otp_otpIn_7f5bb0'), 
    '969696')

