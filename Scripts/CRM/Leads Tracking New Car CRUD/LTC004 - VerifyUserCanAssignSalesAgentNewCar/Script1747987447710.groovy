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

WebUI.callTestCase(findTestCase('CRM/Leads Tracking New Car CRUD/LTC001 - VerifyUserCanAccessTestingDataAsCM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/input_Search Leads Tracking'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/input_Search Leads Tracking'), 'TESTING AUTO PROD')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/button_To Be Assigned to SA'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/col_leads tracking (1)'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/button_Qualified Leads'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/04. Detail Leads - Assign Sales Agent New Car/button_Assign Sales Agent detail'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/04. Detail Leads - Assign Sales Agent New Car/input_dealer'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/04. Detail Leads - Assign Sales Agent New Car/input_dealer'), 
    'Auto 2000')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/04. Detail Leads - Assign Sales Agent New Car/span_Auto 2000'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/04. Detail Leads - Assign Sales Agent New Car/input_branch'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/04. Detail Leads - Assign Sales Agent New Car/input_branch'), 
    'Auto2000 Testing')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/04. Detail Leads - Assign Sales Agent New Car/span_Auto2000 Testing'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/04. Detail Leads - Assign Sales Agent New Car/input_salesAgent'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/04. Detail Leads - Assign Sales Agent New Car/input_salesAgent'), 
    'TSO Testing')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/04. Detail Leads - Assign Sales Agent New Car/span_TSO Testing'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/04. Detail Leads - Assign Sales Agent New Car/button_Assign Sales Agent popup'))

WebUI.waitForPageLoad(5)

WebUI.refresh()

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_stage'), 
    'In Process Sales Agent')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/04. Detail Leads - Assign Sales Agent New Car/txt_dealer'), 
    'Auto 2000')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/04. Detail Leads - Assign Sales Agent New Car/txt_branch'), 
    'Auto2000 Testing')

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/04. Detail Leads - Assign Sales Agent New Car/txt_sales'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

