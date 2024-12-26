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

WebUI.callTestCase(findTestCase('Dealer Page/DP 006 Menampilkan halaman detail dealer'), [('city') : 'Yogyakarta', ('dealer') : 'Daihatsu'
        , ('URL_tc3') : 'https://www.seva.id/mobil-baru/daihatsu/dealer', ('expected_URL') : 'https://www.seva.id/mobil-baru/daihatsu/dealer/'
        , ('open_browser') : '1', ('close_browser') : '1', ('kontak_dealer_ke') : '2'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page - Detail dealer/CardtoPage3'))

WebUI.scrollToElement(findTestObject('Page - Detail dealer/BacaSelengkapnya'), 10)

WebUI.click(findTestObject('Page - Detail dealer/BacaSelengkapnya'))

WebUI.waitForElementPresent(findTestObject('Page - Detail dealer/Tutup'), 50)

WebUI.closeBrowser()

