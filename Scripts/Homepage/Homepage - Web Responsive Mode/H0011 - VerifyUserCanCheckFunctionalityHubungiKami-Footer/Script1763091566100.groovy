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

WebUI.scrollToElement(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/a_Hubungi Kami'), 
    0)

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.click(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/a_Hubungi Kami'))

WebUI.verifyElementPresent(findTestObject('Homepage Component/pop-up-leads-form'), 0)

WebUI.setText(findTestObject('Homepage Component/leads-form-input-name'), 'Testing Ruth')

WebUI.setText(findTestObject('Homepage Component/leads-form-input-no-hp'), '87736948328')

WebUI.click(findTestObject('Homepage Component/checkbox-agreement-pop-up-leads-form'))

WebUI.click(findTestObject('Homepage Component/checkbox-agreement-promo-terms-pop-up-leads-form'))

WebUI.click(findTestObject('Homepage Component/button-submit-leads-pop-up'))

WebUI.closeBrowser()

