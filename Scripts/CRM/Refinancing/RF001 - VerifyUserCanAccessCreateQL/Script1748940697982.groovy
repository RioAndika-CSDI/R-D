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

WebUI.callTestCase(findTestCase('CRM/Login/HMP001 - VerifyUserCanLoginCRMProperly'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('CRM/Create QL Refinancing/span_sidebar'))

WebUI.verifyElementVisible(findTestObject('CRM/Create QL Refinancing/cta_All Leads Tasks'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/cta_All Leads Tasks'))

WebUI.verifyElementClickable(findTestObject('CRM/Create QL Refinancing/ctaLeads Tracking'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/ctaLeads Tracking'))

WebUI.verifyElementClickable(findTestObject('CRM/Create QL Refinancing/button_Create Qualified Leads'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/button_Create Qualified Leads'))

WebUI.verifyElementText(findTestObject('CRM/Create QL Refinancing/txt_Create Qualified Leads'), 'Create Qualified Leads')

