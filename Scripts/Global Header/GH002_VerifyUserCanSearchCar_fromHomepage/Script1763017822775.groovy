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

WebUI.openBrowser(GlobalVariable.Prod)

WebUI.maximizeWindow()

'search icon'
WebUI.click(findTestObject('Object Repository/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/svg_SEVA search Icon'))

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

'kata kunci mobil yang dicari'
WebUI.setText(findTestObject('Object Repository/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/input_Semua Artikel_searchComponent_styledS_159790'), 
    'Toyota All New Avanza')

WebUI.delay(2)

'text value mobil yang tampil di search bar\r\n'
WebUI.click(findTestObject('Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/span_Toyota All New Avanza'))

Url_act = WebUI.getUrl()

WebUI.verifyMatch(Url_act, 'https://www.seva.id/mobil-baru/toyota/all-new-avanza', false)

WebUI.closeBrowser()

