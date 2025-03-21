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

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/Manage Column/icon_manage column'))

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/Manage Column/txt_Manage Column'), 'Manage Column')

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/Manage Column/txt_Created By Me'))

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/Manage Column/txt_Shared With Me'))

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/Manage Column/txt_Public Columns'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/Manage Column/input_Search Preset Manage Column'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/Manage Column/input_Search Preset Manage Column'), 'all leads')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/Manage Column/txt_All Leads'), 'All Leads')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/Manage Column/input_Search Column'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/Manage Column/input_Search Column'), 'leads')

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/Manage Column/col_column'))

WebUI.closeBrowser()

