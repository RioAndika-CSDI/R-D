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

WebUI.click(findTestObject('Object Repository/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/h1_Menemani Perjalanan Finansial Mobil Barumu'))

WebUI.click(findTestObject('Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Mau'))

WebUI.setText(findTestObject('Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/input_Pilih lokasi pembelian mobilmu_inputS_6b2c7f'), 
    'Jakarta Pusat')

WebUI.click(findTestObject('Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/span_Jakarta Pusat'))

WebUI.setText(findTestObject('Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/input_Pilih lokasi pembelian mobilmu_inputS_6b2c7f'), 
    'Jakarta Pusat')

WebUI.click(findTestObject('Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/span_Jakarta Pusat'))

WebUI.click(findTestObject('Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Mulai Cari Mobil'))

WebUI.click(findTestObject('Object Repository/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/svg_SEVA burger menu Icon (1)'))

WebUI.click(findTestObject('Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/div_Cari Mobil'))

WebUI.click(findTestObject('Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Mobil Baru'))

WebUI.click(findTestObject('Object Repository/Page_Beli Mobil Baru 2024 - Harga OTR denga_2c21df/span_Jakarta Pusat (3)'))

WebUI.click(findTestObject('Page_Daihatsu New Ayla 2024 - Spesifikasi, _167452/span_Jakarta Pusat'))

WebUI.closeBrowser()

