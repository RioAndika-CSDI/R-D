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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

if (open_browser.toString().equals('1')) {
    WebUI.openBrowser('seva.id')
}

JavascriptExecutor jsbefore = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jsbefore.executeScript('\n    var iframe = document.querySelector(\'iframe[id*="moe-onsite-campaign"]\');\n    if (iframe) {\n        iframe.remove();\n    }\n')

WebUI.click(findTestObject('dealer page/sub menu mobil baru'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.click(findTestObject('dealer page/sub menu mobil baru'))

WebUI.click(findTestObject('Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/button_Dealer Mobil Baru'))

WebUI.waitForPageLoad(50)

actuall_URL = WebUI.getUrl()

//WebUI.verifyMatch(actuall_URL, expected_URL, true)
if (actuall_URL == expected_URL) {
    KeywordUtil.markPassed('User is on the expected page: ' + actuall_URL)
}

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

