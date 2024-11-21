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

WebUI.openBrowser('https://www.seva.id/ridwan-hanif')

WebUI.click(findTestObject('Marketing Page/landing_page_ridwan_hanif'))

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(15)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Marketing Page/btn_igpost_rh_quiz'), 10)

WebUI.click(findTestObject('Marketing Page/btn_igpost_rh_quiz'))

WebUI.switchToWindowIndex(1)

newTabUrl = WebUI.getUrl()

WebUI.delay(10)

expectedUrl = 'https://www.instagram.com/p/C5VjyZSJrMj/?utm_source=ig_web_copy_link&igsh=MzRlODBiNWFlZA=='

if (newTabUrl.toString().equals(expectedUrl)) {
	WebUI.verifyMatch('true', 'true', true)

	WebUI.comment('URL MATCH')
} else {
	WebUI.verifyMatch('false', 'true', true)

	WebUI.comment('URL NOT MATCH')
}

WebUI.closeBrowser()