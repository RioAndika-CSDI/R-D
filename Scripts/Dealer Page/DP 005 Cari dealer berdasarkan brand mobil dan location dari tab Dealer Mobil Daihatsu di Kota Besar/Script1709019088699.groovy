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

WebUI.callTestCase(findTestCase('Dealer Page/DP 003 Cari dealer berdasarkan tab Dealer mobil berdasarkan merek'), [('dealer') : dealer
        , ('expected_URL') : URL_tc3, ('close_browser') : '0', ('open_browser') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_Temukan 55 Dealer Mobil Daihatsu di In_cd376c/Dealer Carousel Title'), 0)

WebUI.click(findTestObject('Page_Temukan 55 Dealer Mobil Daihatsu di In_cd376c/h3_Bandung CTA Dealer Mobil di kota besar', 
        [('city') : city]))

WebUI.delay(3)

actuall_URL = WebUI.getUrl()

if (actuall_URL == expected_URL) {
		KeywordUtil.markPassed('User is on the expected page: ' + actuall_URL)
	}
	

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

