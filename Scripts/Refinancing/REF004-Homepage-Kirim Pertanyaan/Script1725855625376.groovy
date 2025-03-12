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
    WebUI.openBrowser('seva.id')
}

WebUI.click(findTestObject('Homepage Component/Burger_Button_Baru'))

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(15)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.click(findTestObject('HomeRefinancing/SubMenu_FasilitasDana'))

WebUI.waitForElementPresent(findTestObject('HomeRefinancing/label_fasilitasDana'), 400)

actURL = WebUI.getUrl()

WebUI.verifyMatch(actURL, expected_url, true)

WebUI.scrollToElement(findTestObject('HomeRefinancing/Button_Pertanyaan'), 0)

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(60)

WebUI.click(findTestObject('HomeRefinancing/Button_Pertanyaan'))

WebUI.click(findTestObject('HomeRefinancing/pertanyaa_nama'))

WebUI.setText(findTestObject('HomeRefinancing/pertanyaa_nama'), 'Hilmy Testing')

WebUI.click(findTestObject('HomeRefinancing/pertanyaan_nomer'))

WebUI.setText(findTestObject('HomeRefinancing/pertanyaan_nomer'), '81229948663')

WebUI.waitForElementPresent(findTestObject('HomeRefinancing/quaestion checklist'), 0)

WebUI.click(findTestObject('HomeRefinancing/quaestion checklist'))

WebUI.click(findTestObject('HomeRefinancing/klik_selanjutnyaPertanyaan'))

WebUI.waitForElementPresent(findTestObject('HomeRefinancing/Deskripsi_pertanyaan'), 300)

WebUI.click(findTestObject('HomeRefinancing/Deskripsi_pertanyaan'))

WebUI.setText(findTestObject('HomeRefinancing/Deskripsi_pertanyaan'), 'Testing')

WebUI.click(findTestObject('HomeRefinancing/klik_selanjutnyaPertanyaan'))

WebUI.waitForElementPresent(findTestObject('HomeRefinancing/success_pertanyaan'), 400)

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

