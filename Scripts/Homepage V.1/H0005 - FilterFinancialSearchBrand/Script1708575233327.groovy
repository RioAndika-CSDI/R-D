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

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Object Repository/Homepage Component/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/span_Tambah Filter Finansial'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Mau'))

WebUI.click(findTestObject('Object Repository/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Nanti saja'))

WebUI.click(findTestObject('Object Repository/Homepage Component/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/span_Tambah Filter Finansial'))

WebUI.click(findTestObject('Object Repository/Homepage Component/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/div_Toyota, Daihatsu, Isuzu, BMW, Peugeot, Hyundai'))

WebUI.click(findTestObject('Object Repository/Homepage Component/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/div_Toyota'))

WebUI.click(findTestObject('Object Repository/Homepage Component/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Terapkan'))

WebUI.click(findTestObject('Object Repository/Homepage Component/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Cari Mobil Baru'))

WebUI.click(findTestObject('Object Repository/Homepage Component/Page_Beli Mobil Baru 2024 - Harga OTR denga_550104/span_Toyota'))

WebUI.closeBrowser()

