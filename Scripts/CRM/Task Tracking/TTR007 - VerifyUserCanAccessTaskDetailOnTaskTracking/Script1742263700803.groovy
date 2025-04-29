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

WebUI.callTestCase(findTestCase('CRM/Task Tracking/TTR001 - VerifyUserCanAccessTasksTracking'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CRM/Tracking/Task Tracking/input_Search Reengagement Task Tracking'))

WebUI.setText(findTestObject('CRM/Tracking/Task Tracking/input_Search Reengagement Task Tracking'), 'testing')

WebUI.verifyElementVisibleInViewport(findTestObject('CRM/Tracking/Task Tracking/col_Task Tracking'), 0)

WebUI.click(findTestObject('CRM/Tracking/Task Tracking/col_Task Tracking'))

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Task Tracking/Reengagement Task Detail/txt_Customer Name'))

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Task Tracking/Reengagement Task Detail/txt_Phone Number'))

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Task Tracking/Reengagement Task Detail/tab_Leads'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CRM/Tracking/Task Tracking/Reengagement Task Detail/txt_Task Information'), 
    'Task Information')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Task Tracking/Reengagement Task Detail/txt_Leads Information (1)'), 
    'Leads Information')

WebUI.scrollToElement(findTestObject('CRM/Tracking/Task Tracking/Reengagement Task Detail/tab_Leads'), 0)

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Task Tracking/Reengagement Task Detail/tab_Customer Info MCI'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CRM/Tracking/Task Tracking/Reengagement Task Detail/txt_CUSTOMER INFO'), 'CUSTOMER INFO')

WebUI.scrollToElement(findTestObject('CRM/Tracking/Task Tracking/Reengagement Task Detail/txt_Follow Up HistoryNotesActivity Log'), 
    0)

WebUI.verifyElementVisibleInViewport(findTestObject('CRM/Tracking/Task Tracking/Reengagement Task Detail/txt_Follow Up HistoryNotesActivity Log'), 
    0)

WebUI.closeBrowser()

