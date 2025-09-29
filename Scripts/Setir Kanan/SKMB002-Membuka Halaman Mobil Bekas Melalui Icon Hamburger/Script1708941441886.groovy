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
	WebUI.setViewPortSize(570, 912)
}

JavascriptExecutor jsbefore = ((DriverFactory.getWebDriver()) as JavascriptExecutor)
jsbefore.executeScript('\n    var iframe = document.querySelector(\'iframe[id*="moe-onsite-campaign"]\');\n    if (iframe) {\n        iframe.remove();\n    }\n')

WebUI.click(findTestObject('Homepage Component/Burger_Button_Baru'))
WebUI.delay(10)
WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))
WebUI.click(findTestObject('Object Repository/Page Mobil Bekas/menu_mobilBekas_burgerMenu'))
WebUI.click(findTestObject('Object Repository/Page Mobil Bekas/lihat_semua_mobilBekas_burgerMenu'))


//*ASET COMPONEN DESKTOP*//
//WebUI.click(findTestObject('dealer page/sub menu mobil baru'))
//
//WebUI.delay(10)
//
//WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))
//
//WebUI.waitForElementVisible(findTestObject('Homepage Component/Submenu_Burger_Mobil Bekas'), 10)
//
//WebUI.click(findTestObject('Homepage Component/Submenu_Burger_Mobil Bekas'))
//
//WebUI.waitForElementVisible(findTestObject('Homepage Component/Submenu_Burger_Mobil Bekas_Lihat Semua Mobil'), 10)
//
//WebUI.click(findTestObject('Homepage Component/Submenu_Burger_Mobil Bekas_Lihat Semua Mobil'))

WebUI.waitForElementPresent(findTestObject('Page Mobil Bekas/button_Filter'), 50)

String actual_url = WebUI.getUrl()

WebUI.comment(actual_url)

//menggunakan if karena jika lansung menggunakan verify match error walaupun url sudah sama persis
if (actual_url.equals(expected_url.toString())) {
    WebUI.verifyMatch('true', 'true', true)
} else {
    WebUI.verifyMatch('false', 'true', true)
}

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

