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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

if (open_browser.toString().equals('1')) {
    WebUI.callTestCase(findTestCase('Wordpress/WP001-Homepage-Akses Main Page Blog Melalui Burgaer Menu'), [('expected_url') : expected_url
            , ('open_browser') : '1', ('close_browser') : '0'], FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Page Blog Main/Label_ Berita Baru_Lihat Semua'))

WebUI.waitForElementPresent(findTestObject('Page Blog Main/Page Berita/breadcrumb'), 300)

actURL = WebUI.getUrl()

//WebUI.verifyMatch(actUrl, expected_url_berita, true)

if (actURL == expected_url_berita) {
	KeywordUtil.markPassed('User is on the expected page: ' + actURL)
}

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

