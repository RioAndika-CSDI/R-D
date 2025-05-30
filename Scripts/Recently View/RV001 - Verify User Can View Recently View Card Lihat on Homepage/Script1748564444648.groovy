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

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(5)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.verifyElementNotPresent(findTestObject('Homepage Recently View/label Lanjutkan Pencarianmu homepage'), 0)

WebUI.click(findTestObject('Homepage Recently View/Homepage Lihat Detail'))

WebUI.delay(5)

String car_name_select = WebUI.getText(findTestObject('Homepage Recently View/PDP Car Name'))

WebUI.scrollToElement(findTestObject('Homepage Recently View/PDP Harga Title'), 0)

WebUI.scrollToElement(findTestObject('Homepage Desktop Mode/seva-logo-desktop'), 0)

WebUI.click(findTestObject('Homepage Desktop Mode/seva-logo-desktop'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Homepage Recently View/label Lanjutkan Pencarianmu homepage'), 0)

WebUI.verifyElementPresent(findTestObject('Homepage Recently View/label Lanjutkan Pencarianmu homepage'), 0)

String get_text_car_name_recently_view = WebUI.getText(findTestObject('Homepage Recently View/recently view - lihat card - car name', 
        [('recently_view_type') : 'Dilihat']))

String car_name_recently_view = get_text_car_name_recently_view.split(" 1.0 M MT")[0];

WebUI.verifyMatch(car_name_select, car_name_recently_view, false)

