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

WebUI.callTestCase(findTestCase('CRM/Login/HMP014 - VerifyUserCanLoginCRMProperlyasCMLeader'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('CRM/Side Menu/img_seva'))

WebUI.click(findTestObject('CRM/Side Menu/Menu_All Leads  Tasks CM'))

WebUI.click(findTestObject('CRM/Side Menu/SubMenu_Leads Tracking CM'))

'Verify that the user is on the "Leads Tracking" page.'
WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/txt_Leads Tracking'), 'Leads Tracking')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/button_Filter'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/input__Search Filter'), 'utm group')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/div_UTM Group'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/input_utm group'), 'testing')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/span_Testing'))

WebUI.verifyElementVisibleInViewport(findTestObject('CRM/Tracking/Lead Tracking/col_Leads Tracking'), 3)

