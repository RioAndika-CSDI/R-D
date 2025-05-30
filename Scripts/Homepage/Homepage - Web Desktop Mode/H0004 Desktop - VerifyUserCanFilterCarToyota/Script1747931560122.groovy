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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser(GlobalVariable.Prod)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/h1_Menemani Perjalanan Finansial Mobil Barumu'))

//CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))
CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(8)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.click(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/selectWidget_filterMerek'))

WebUI.click(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/span_Toyota'))

WebUI.click(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Terapkan'))

WebUI.click(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Cari Mobil Baru'))

WebUI.verifyElementPresent(findTestObject('Page Mobil Bekas/Navigator_Filter', [('filter') : 'Toyota']), 0)

WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Navigator_Filter', [('filter') : 'Toyota']), 0)

//title = WebUI.getText(findTestObject('Page PLP Mobil Baru/Tlitle PLP Mobil Baru by index', [('index') : '1']))
TestObject car_title = findTestObject('Page PLP Mobil Baru/Tlitle PLP Mobil Baru by index')

WebElement el = WebUiCommonHelper.findWebElement(car_title, 10)

String jsText = WebUI.executeJavaScript('return arguments[0].childNodes[0].textContent;', Arrays.asList(el))

String brand = jsText.trim()

WebUI.comment(brand)

WebUI.verifyMatch(brand, 'Toyota', true)

WebUI.closeBrowser()

