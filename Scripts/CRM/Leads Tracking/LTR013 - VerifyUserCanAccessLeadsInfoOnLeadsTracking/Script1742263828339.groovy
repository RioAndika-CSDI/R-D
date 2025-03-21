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

WebUI.callTestCase(findTestCase('CRM/Leads Tracking/LTR001 - VerifyUserCanAccessLeadsTracking'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/input_Search Leads Tracking'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/input_Search Leads Tracking'), 'testing')

WebUI.verifyElementVisibleInViewport(findTestObject('CRM/Tracking/Lead Tracking/Detail Leads/col_leadstracking'), 0)

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/Detail Leads/col_leadstracking'))

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/Detail Leads/txt_Customer Name'))

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/Detail Leads/txt_Phone Number'))

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/Detail Leads/tab_Leads'), 'Leads')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/Detail Leads/tab_Qualified Leads'), 'Qualified Leads')

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/Detail Leads/tab_SPK'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/Detail Leads/tab_BSTK'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CRM/Workstation/Lead Workstation/txt_Leads Information'), 'Leads Information')

WebUI.scrollToElement(findTestObject('CRM/Tracking/Lead Tracking/Detail Leads/tab_Leads'), 0)

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/Detail Leads/button_Customer Info'))

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/Detail Leads/txt_CUSTOMER INFO'), 'CUSTOMER INFO')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/Detail Leads/tab_Leads MCI'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/Detail Leads/tab_Tasks MCI'))

WebUI.scrollToElement(findTestObject('CRM/Tracking/Lead Tracking/Detail Leads/txt_Follow Up HistoryNotesActivity Log'), 
    0)

WebUI.verifyElementVisibleInViewport(findTestObject('CRM/Tracking/Lead Tracking/Detail Leads/txt_Follow Up HistoryNotesActivity Log'), 
    0)

WebUI.closeBrowser()

