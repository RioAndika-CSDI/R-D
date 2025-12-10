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

WebUI.click(findTestObject('Homepage Component/Button_Hamburger Menu'))

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(8)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

WebUI.click(findTestObject('Homepage Component/button_promo_page'))

// Perform actions on the element after scrolling
WebUI.scrollToElement(findTestObject('Promo Page/promo_beli_mobil_cb_2juta'), 10)

WebUI.click(findTestObject('Promo Page/promo_beli_mobil_cb_2juta'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Promo Page/form_leads_name'), 10)

WebUI.setText(findTestObject('Promo Page/form_leads_name'), 'Ditha Testing Prod')
WebUI.setText(findTestObject('Promo Page/form_leads_phone'), '87803827790')
WebUI.setText(findTestObject('Promo Page/form_leads_email'), 'ditha@gmail.com')

WebUI.delay(3)

boolean isElementPresent = WebUI.verifyElementPresent(findTestObject('Promo Page/btn_kirim_info_promo'), 10)

if (isElementPresent) {
	WebUI.comment('Element is present.')
} else {
	WebUI.comment('Element is not present.')
}

WebUI.closeBrowser()