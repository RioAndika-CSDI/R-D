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

WebUI.callTestCase(findTestCase('CRM/Reengagement Tasks Bucket/RBC001 - VerifyUserCanAccessReengagementTasksBucket'), [:], 
    FailureHandling.STOP_ON_FAILURE)

'Verify if the "Counter Bucket" element is visible'
WebUI.verifyElementVisible(findTestObject('CRM/Bucket Management/Tasks Bucket/Counter Buckets'))

'Get the text from "Counter Bucket" element'
String elementText = WebUI.getText(findTestObject('CRM/Bucket Management/Tasks Bucket/Counter Buckets'))

'Verify if the elementText contains the phrase "Buckets"'
WebUI.verifyMatch(elementText, '.*Buckets*', true)

WebUI.verifyElementText(findTestObject('CRM/Bucket Management/Tasks Bucket/txt_Bucket'), 
    'Bucket')

WebUI.verifyElementText(findTestObject('CRM/Bucket Management/Tasks Bucket/txt_CSA Assigned'), 
    'CSA Assigned')

WebUI.verifyElementText(findTestObject('CRM/Bucket Management/Tasks Bucket/txt_Remaining Task'), 
    'Remaining Task')

WebUI.verifyElementText(findTestObject('CRM/Bucket Management/Tasks Bucket/txt_Last Modified'), 
    'Last Modified')

WebUI.verifyElementVisible(findTestObject('CRM/Bucket Management/Tasks Bucket/button_See History'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CRM/Bucket Management/Tasks Bucket/txt_title bucket'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CRM/Bucket Management/Tasks Bucket/txt_Assign to'), 
    'Assign to')

WebUI.verifyElementVisible(findTestObject('CRM/Bucket Management/Tasks Bucket/button_Table Fast Track'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CRM/Bucket Management/Tasks Bucket/button_Table FIFO 1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CRM/Bucket Management/Tasks Bucket/button_Table FIFO 2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CRM/Bucket Management/Tasks Bucket/button_Table FIFO 3'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CRM/Bucket Management/Tasks Bucket/button_Table FIFO 4'), 
    FailureHandling.STOP_ON_FAILURE)

'//Function search -> future development'
WebUI.verifyElementVisible(findTestObject('CRM/Bucket Management/Tasks Bucket/input_Search Reengagement Tasks Bucket'))

'//Function filter -> future development'
WebUI.verifyElementVisible(findTestObject('CRM/Bucket Management/Tasks Bucket/button_Filter'))

WebUI.closeBrowser()

