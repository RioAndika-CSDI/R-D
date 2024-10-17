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

WebUI.click(findTestObject('Object Repository/Homepage - PLP/Leads PLP/btn_leads_floating'))

WebUI.setText(findTestObject('Object Repository/Homepage - PLP/Leads PLP/input_nama_leads'), 'Ditha Testing Pd')

WebUI.setText(findTestObject('Object Repository/Homepage - PLP/Leads PLP/input_nomor_leads'), '87805428944')

WebUI.delay(3)

boolean isButtonEnabled = WebUI.verifyElementClickable(findTestObject('Object Repository/Homepage - PLP/Leads PLP/btn_kirim_leads'))

if (isButtonEnabled) {
	WebUI.comment('Button Enabled')
} else {
	WebUI.comment('Button is Disabled')
}

WebUI.closeBrowser()