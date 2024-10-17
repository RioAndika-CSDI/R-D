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

WebUI.openBrowser('seva.id')

WebUI.click(findTestObject('Object Repository/Homepage - PLP/label_menemani_perjalanan_finansial'))

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(8)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

WebUI.click(findTestObject('Object Repository/Homepage - PLP/seva_search_icon'))

WebUI.click(findTestObject('Object Repository/Homepage - PLP/lihat_semua_mbl_baru'))

WebUI.delay(5)

// Daihatsu All New Ayla
WebUI.click(findTestObject('Object Repository/Homepage - PLP/lihat_detail_mobil'))

String currentUrl = WebUI.getUrl()

String expectedUrl = 'https://www.seva.id/mobil-baru/daihatsu/all-new-ayla?loanRankCVL=Green&source=plp&dp=23560000'

if(currentUrl.toString().equals(expectedUrl)) {
	WebUI.verifyMatch('true', 'true', true)
	WebUI.comment('URL MATCH')
} else {
	WebUI.verifyMatch('false', 'true', false)
	WebUI.comment('URL NOT MATCH')
}

WebUI.closeBrowser()

