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

WebUI.callTestCase(findTestCase('CRM/Login/HMP013 - VerifyUserCanLoginCRMProperlyasQA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('CRM/Side Menu/img_seva'))

WebUI.click(findTestObject('CRM/Side Menu/Menu_Settings'))

'Verify menu "User" is visible by user.'
WebUI.click(findTestObject('CRM/Side Menu/SubMenu_User Management'))

'Verify that the user is on the "User Management" page.'
WebUI.verifyElementText(findTestObject('CRM/Account Management/page_tittle'), 'User Management')

'Click in any element to hide sidebar menu.'
WebUI.click(findTestObject('CRM/Account Management/element_Header'))

