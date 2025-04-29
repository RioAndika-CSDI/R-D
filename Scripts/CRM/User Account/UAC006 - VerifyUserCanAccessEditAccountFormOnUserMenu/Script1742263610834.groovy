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

'Verify "Edit Account" icon/button is visible by user.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management/User Account/button_Edit Account'))

'Button edit account'
WebUI.click(findTestObject('Object Repository/CRM/Account Management/User Account/button_Edit Account'))

'Verify that the title of the form is correctly displayed as "Edit Account"'
WebUI.verifyElementText(findTestObject('Object Repository/CRM/Account Management/Edit Form/formTitle_Edit Account'), 
    'Edit Account')

'Verify that the "Edit Account" form contains a "Name" field.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management/Edit Form/field_Edit Name'))

'Verify that the "Edit Account" form contains a "Email" field.'
WebUI.verifyElementVisible(findTestObject('CRM/Account Management/field_Edit Email'))

'Verify that the "Email" field is disabled or non-editable by default in the "Edit Account" form.'
WebUI.verifyElementNotClickable(findTestObject('CRM/Account Management/field_Edit Email'))

'Verify that the "Edit Account" form contains a "Phone" field.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management/Edit Form/field_Edit Phone'))

'Verify that the "Edit Account" form contains a "Softphone Extension" field.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management/Edit Form/field_Edit Softphone Extension'))

'Disable Password activation'
WebUI.verifyElementVisible(findTestObject('CRM/Account Management/Edit Form/field_Edit Password Activation'))

'Verify that the "Password" field is disabled or non-editable by default in the "Edit Account" form.'
WebUI.verifyElementNotClickable(findTestObject('CRM/Account Management/Edit Form/field_Edit Password Activation'))

'Verify that the "Edit Account" form contains a "Role" field.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management/Page_Edit felix.wijayaacc.co.id Account - SEVA CRM/field_Edit Role'))

'BU Company'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management/Page_Edit felix.wijayaacc.co.id Account - SEVA CRM/field_Edit BU Company'))

'Verify that the "Edit Account" form contains a "Event" field.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management/Page_Edit felix.wijayaacc.co.id Account - SEVA CRM/field_Edit Event'))

'Verify that the "Edit Account" form contains a "CRM Status" toggle.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management/Page_Edit felix.wijayaacc.co.id Account - SEVA CRM/toggle_CRM Status'))

'Verify that the "Edit Account" form contains a "CMS Status".'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management/Page_Edit felix.wijayaacc.co.id Account - SEVA CRM/CMS Status'))

'Verify that the "Edit Account" form contains a "Upload Avatar" field.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management/Page_Edit felix.wijayaacc.co.id Account - SEVA CRM/field_Upload Avatar'))

'Verify that the "Edit Account" form contains a "Save" button.'
WebUI.verifyElementVisible(findTestObject('CRM/Account Management/Page_Edit felix.wijayaacc.co.id Account - SEVA CRM/button_Save Edit Account'))

'Verify that the "Save" button is disabled before user made change.'
WebUI.verifyElementNotClickable(findTestObject('CRM/Account Management/Page_Edit felix.wijayaacc.co.id Account - SEVA CRM/button_Save Edit Account'))

'Verify that the "Edit Account" form contains a "Close" button.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management/Page_Edit felix.wijayaacc.co.id Account - SEVA CRM/button_Close Edit Account'))

WebUI.closeBrowser()

