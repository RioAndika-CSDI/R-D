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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser(GlobalVariable.Prod)

WebUI.maximizeWindow()

//WebUI.setViewPortSize(570, 912)
WebUI.scrollToElement(findTestObject('MRP/MRP-DESKTOP/text-reco'), 0)

//CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))
//CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(8)
//CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))
WebUI.waitForElementPresent(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'), 60)

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.click(findTestObject('MRP/MRP-DESKTOP/button_simulasi-kredit'))

String currentUrl = WebUI.getUrl().split("\\?")[0].trim()

String regexPattern = '(?i)https://www\\.seva\\.id/kalkulator-kredit/[a-z-]+/[a-z-]+/[a-z0-9-]+/?'

if (currentUrl.matches(regexPattern)) {
    KeywordUtil.markPassed('URL matches expected kalkulator-kredit pattern')
} else {
    KeywordUtil.markFailed('URL does NOT match expected pattern. Got: ' + currentUrl)
}


//WebUI.closeBrowser()

