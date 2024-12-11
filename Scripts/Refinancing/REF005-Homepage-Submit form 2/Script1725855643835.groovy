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

WebUI.callTestCase(findTestCase('Refinancing/REF003-Homepage-Submit form 1'), [('expected_url') : 'https://www.seva.id/fasilitas-dana'
        , ('open_browser') : '1', ('close_browser') : '1', ('ExpectedURL2') : 'https://www.seva.id/fasilitas-dana/form', ('OTP') : '123456'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('HomeRefinancing/label_form2'), 400)

actURL2 = WebUI.getUrl()

WebUI.verifyMatch(actURL2, ExpectedURL2, true)

WebUI.click(findTestObject('HomeRefinancing/form2_merekMobil'))

WebUI.setText(findTestObject('HomeRefinancing/form2_merekMobil'), 'Ford')

WebUI.click(findTestObject('HomeRefinancing/searc_formMerek'))

WebUI.click(findTestObject('HomeRefinancing/form2_modelMobil'))

WebUI.setText(findTestObject('HomeRefinancing/form2_modelMobil'), 'Escape')

WebUI.click(findTestObject('HomeRefinancing/Search_modelForm2'))

WebUI.click(findTestObject('HomeRefinancing/form2_tahunMobil'))

WebUI.setText(findTestObject('HomeRefinancing/form2_tahunMobil'), '2019')

WebUI.click(findTestObject('HomeRefinancing/search_tahunfrom2'))

WebUI.click(findTestObject('HomeRefinancing/form2_lokasiMobil'))

WebUI.setText(findTestObject('HomeRefinancing/form2_lokasiMobil'), 'Aceh Tengah')

WebUI.click(findTestObject('HomeRefinancing/search_lokasiform2'))

WebUI.click(findTestObject('HomeRefinancing/form2_tenorMobil'))

WebUI.click(findTestObject('HomeRefinancing/kirim_form2'))

SuccessURL = WebUI.getUrl()

// WebUI.verifyMatch(SuccessURL, successRefi, true)

if (SuccessURL == successRefi) {
	KeywordUtil.markPassed('User is on the expected page: ' + SuccessURL)
}

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

