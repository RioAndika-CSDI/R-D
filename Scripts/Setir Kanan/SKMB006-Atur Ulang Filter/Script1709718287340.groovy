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

if (open_browser.toString().equals('1')) {
    WebUI.callTestCase(findTestCase('Setir Kanan/SKMB003-Cari Mobil Bekas Hompage dengan filter'), [('model') : 'Toyota Agya;Toyota Calya'
            , ('brand') : 'Toyota;Daihatsu', ('tahun') : '2016-2020', ('transmisi') : 'Manual;Otomatis', ('expected_url') : 'https://www.seva.id/mobil-bekas/'
            , ('screen') : '', ('open_browser') : '1', ('close_browser') : '1'], FailureHandling.STOP_ON_FAILURE)
	
}
	
	WebUI.click(findTestObject('used car/aturUlangButton'))
	WebUI.click(findTestObject('used car/terapkanButton'))


    WebUI.closeBrowser()


