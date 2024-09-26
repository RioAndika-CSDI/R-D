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

WebUI.callTestCase(findTestCase('Dealer Page/DP 004 Cari dealer berdasarkan brand mobil dan location dari search widget'), 
    [('city') : city, ('dealer') : dealer, ('expected_URL') : 'https://www.seva.id/mobil-baru/daihatsu/dealer', ('close_browser') : '0'
        , ('open_browser') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page - Dealer Location/Kontak dealer', [('id') : kontak_dealer_ke]), 0)

WebUI.click(findTestObject('Page - Dealer Location/Kontak dealer', [('id') : '1']))

WebUI.delay(5)

nama_dealer = WebUI.getText(findTestObject('Page - Dealer Location/Nama dealer by id', [('id') : kontak_dealer_ke]))

actuall_URL = WebUI.getUrl()

nama_dealer = nama_dealer.toLowerCase()

nama_dealer = nama_dealer.trim()

nama_dealer = nama_dealer.replaceAll(' ', '-')

URL_expected = ((((expected_URL + '/') + city) + '/') + nama_dealer)

