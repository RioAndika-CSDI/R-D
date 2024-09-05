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

WebUI.callTestCase(findTestCase('Dealer Page/DP 001 Menampilkan halaman dealer page'), [('expected_URL') : 'https://www.seva.id/mobil-baru/dealer'
        , ('close_browser') : '0', ('open_browser') : open_browser], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA_b303f5/div_Daihatsu', [('dealer') : dealer]), 
    0)

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(10)

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA_b303f5/div_Daihatsu', [('dealer') : dealer]))

WebUI.waitForPageLoad(50)

actuall_URL = WebUI.getUrl()

WebUI.verifyMatch(actuall_URL, expected_URL, true)

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

