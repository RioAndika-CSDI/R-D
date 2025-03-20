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

WebUI.callTestCase(findTestCase('CRM/User Account/UAC001 - VerifyUserCanAccessUserMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify "Create New Account" button is visible by user.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management Page/Page_User Account - SEVA CRM/button_Create New Account'))

WebUI.click(findTestObject('Object Repository/CRM/Account Management Page/Page_User Account - SEVA CRM/button_Create New Account'))

'Verify that the "Create New Account" form appears when the user clicks the "Create New Account" button.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management Page/Page_User Account - SEVA CRM/form_Create New Account'))

'Verify that the title of the form is correctly displayed as "Create New Account."'
WebUI.verifyElementText(findTestObject('Object Repository/CRM/Account Management Page/Page_User Account - SEVA CRM/formTitle_Create New Account'), 
    'Create New Account')

'Verify that the "Create New Account" form contains a "Name" field.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management Page/Page_User Account - SEVA CRM/field_Name'))

'Verify that the "Create New Account" form contains a "Email" field.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management Page/Page_User Account - SEVA CRM/field_Email'))

'Verify that the "Create New Account" form contains a "Upload Avatar" field.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management Page/Page_User Account - SEVA CRM/field_Upload Avatar'))

'Verify that the "Create New Account" form contains a "Phone" field.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management Page/Page_User Account - SEVA CRM/field_Phone'))

'Verify that the "Create New Account" form contains a "Softphone Extension" field.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management Page/Page_User Account - SEVA CRM/field_Softphone Extension'))

'Verify that the "Create New Account" form contains a "Role" field.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management Page/Page_User Account - SEVA CRM/field_Role'))

'Verify that the "Create New Account" form contains a "Password Activation" field.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management Page/Page_User Account - SEVA CRM/field_Password Activation'))

'Verify that the "Create New Account" form contains a "Password" field.'
WebUI.verifyElementVisible(findTestObject('CRM/Account Management Page/Page_User Account - SEVA CRM/field_Password'))

'Verify that the "Create New Account" form contains a "BU Company" field.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management Page/Page_User Account - SEVA CRM/field_BU Company'))

'Verify that the "Create New Account" form contains a "Event" field.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management Page/Page_User Account - SEVA CRM/field_Event'))

'Verify that the "Create New Account" form contains a "CRM Status" toggle button.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management Page/Page_User Account - SEVA CRM/toggleButton_CRM Status'))

'Verify that the "Create New Account" form contains a "Save" button.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management Page/Page_User Account - SEVA CRM/button_Save'))

'Verify that the "Create New Account" form contains a "Close Form" button.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management Page/Page_User Account - SEVA CRM/button_Close Form'))

WebUI.closeBrowser()

