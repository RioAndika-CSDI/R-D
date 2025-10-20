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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser(GlobalVariable.Prod)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/h1_Menemani Perjalanan Finansial Mobil Barumu'))

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(8)

WebUI.click(findTestObject('Homepage Desktop Mode/location'))

WebUI.click(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/input_Pilih lokasi pembelian mobilmu_inputS_6b2c7f'))

WebUI.click(findTestObject('Homepage - PLP/Icon X city'))

WebUI.setText(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/input_Pilih lokasi pembelian mobilmu_inputS_6b2c7f'), 
    'Jakarta Pusat')

WebUI.click(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/input_Pilih lokasi pembelian mobilmu_inputS_6b2c7f'))

'belumdibuat variable, kalo ganti data di input city jangan lupa ganti value di parameter Test Object'
WebUI.waitForElementVisible(findTestObject('Homepage - PLP/Pilihan_City', [('city') : 'Jakarta Pusat']), 5)

'belumdibuat variable, kalo ganti data di input city jangan lupa ganti value di parameter Test Object'
WebUI.click(findTestObject('Homepage - PLP/Pilihan_City', [('city') : 'Jakarta Pusat']))

WebUI.click(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Mulai Cari Mobil'))

WebUI.scrollToElement(findTestObject('Homepage Desktop Mode/scroll to promo'), 5)

WebUI.delay(10)

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.click(findTestObject('Homepage Desktop Mode/navbar-mobil baru'))

WebUI.click(findTestObject('Homepage Desktop Mode/navbar-submenu-lihat semua mobil'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Beli Mobil Baru 2024 - Harga OTR denga_2c21df/span_Jakarta Pusat (3)'), 
    5)

WebUI.closeBrowser()

