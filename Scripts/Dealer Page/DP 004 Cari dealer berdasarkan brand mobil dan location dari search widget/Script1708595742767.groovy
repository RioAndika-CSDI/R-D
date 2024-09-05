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

WebUI.callTestCase(findTestCase('Dealer Page/DP 003 Cari dealer berdasarkan tab Dealer mobil berdasarkan merek'), [('dealer') : dealer
        , ('expected_URL') : expected_URL, ('close_browser') : '0', ('open_browser') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Temukan 55 Dealer Mobil Daihatsu di In_cd376c/input_Kota_inputSelect_alternativeInputFiel_da670e'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Temukan 55 Dealer Mobil Daihatsu di In_cd376c/input_Kota_inputSelect_alternativeInputFiel_da670e'), 
    city)

WebUI.click(findTestObject('Page_Temukan 55 Dealer Mobil Daihatsu di Indonesia  SEVA/option_city', [('city') : city]))

WebUI.click(findTestObject('Object Repository/Page_Temukan 55 Dealer Mobil Daihatsu di In_cd376c/button_Cari Dealer'))

WebUI.waitForPageLoad(50)

if (close_browser.toString().equals('1')) {
	actuall_URL = WebUI.getUrl()
	
	WebUI.comment(actuall_URL)
	
	WebUI.comment((expected_URL + '/') + city.toString().toLowerCase())
	
	WebUI.verifyMatch(actuall_URL, (expected_URL + '/') + city.toString().toLowerCase(), true)
	
    WebUI.closeBrowser()
}

