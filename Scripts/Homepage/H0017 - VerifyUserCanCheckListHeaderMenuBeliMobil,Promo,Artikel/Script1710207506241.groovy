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

WebUI.click(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/h1_Menemani Perjalanan Finansial Mobil Barumu'))

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(8)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.click(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/svg_SEVA burger menu Icon (1)'))

WebUI.click(findTestObject('Homepage - Burger menu/Expand Menu Mobil Baru'))

WebUI.click(findTestObject('Homepage - Burger menu/Menu-Mobil Baru-Lihat Semua Mobil'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Beli Mobil Baru 2024 - Harga OTR denga_2c21df/h1_Rekomendasi Mobil Baru di SEVA'), 10)

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(8)

WebUI.click(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/svg_SEVA burger menu Icon (1)'))

WebUI.click(findTestObject('Object Repository/Page_Beli Mobil Baru 2024 - Harga OTR denga_2c21df/button_Promo'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Promo cicilan mobil baru bulan March 2_dcd451/b_Promo yang Sedang Berlangsung di SEVA'), 10)

WebUI.click(findTestObject('Object Repository/Page_Promo cicilan mobil baru bulan March 2_dcd451/div_rocket-lazyload entered lazyloaded'))

WebUI.click(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/svg_SEVA burger menu Icon (1)'))

WebUI.click(findTestObject('Object Repository/Page_Promo cicilan mobil baru bulan March 2_dcd451/a_Artikel'))

WebUI.click(findTestObject('Object Repository/Page_Promo cicilan mobil baru bulan March 2_dcd451/a_Berita Utama Otomotif'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Artikel Otomotif  SEVA/h1_Otomotif'), 10)

WebUI.closeBrowser()

