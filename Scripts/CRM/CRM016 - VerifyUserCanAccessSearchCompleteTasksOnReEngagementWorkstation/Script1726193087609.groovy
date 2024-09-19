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

WebUI.callTestCase(findTestCase('CRM/CRM004 - VerifyUserCanAccessReEngagementWorkstation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_CRM_new/Page_Workstation/Page_Re-engagement/div_This Weeks Completed Task'))

 Meichella/Fixing
WebUI.setText(findTestObject('Page_CRM_new/Page_Workstation/Page_Re-engagement/Page_This Weeks Completed Task - Re-engagement Workstation - SEVA CRM/input_This Weeks Completed Task_relative h-10 w-full rounded border border-solid border-line py-13px  font-OpenSans text-xs14px placeholdertext-placeholder pl-2 pr-calc(16px8px4px)'), 

WebUI.setText(findTestObject('Page_CRM_new/Page_Workstation/Page_Re-engagement/Page_This Weeks Completed Task - Re-engagement Workstation - SEVA CRM/input this weeks'), 
 seva-2.0
    'dian')

WebUI.delay(3)

WebUI.closeBrowser()

