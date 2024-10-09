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

WebUI.openBrowser('')

WebUI.maximizeWindow()

'The user accesses the CRM login page.'
WebUI.navigateToUrl('https://crm-fe.prod.seva.id/login')

'Verify field "Email" is visible by user.'
WebUI.verifyElementVisible(findTestObject('Object Repository/Account Management Page/Page_Login SEVA CRM/field_email'))

WebUI.setText(findTestObject('Object Repository/Account Management Page/Page_Login SEVA CRM/field_email'), GlobalVariable.EmailUserQA)

'Verify field "Password" is visible by user.'
WebUI.verifyElementVisible(findTestObject('Object Repository/Account Management Page/Page_Login SEVA CRM/field_password'))

WebUI.setText(findTestObject('Object Repository/Account Management Page/Page_Login SEVA CRM/field_password'), GlobalVariable.PassUserQA)

'Verify button "Login" is visible by user.'
WebUI.verifyElementVisible(findTestObject('Object Repository/Account Management Page/Page_Login SEVA CRM/button_login'))

WebUI.click(findTestObject('Object Repository/Account Management Page/Page_Login SEVA CRM/button_login'))

'Open sidebar menu CRM.'
WebUI.click(findTestObject('Leads Group/Page_SEVA CRM Homepage - SEVA CRM/sidebar_Menu CRM'))

'Verify menu bucket management is visible'
WebUI.verifyElementVisible(findTestObject('Object Repository/Leads Group/Page_SEVA CRM Homepage - SEVA CRM/menu_Bucket Management'))

'Get value of attribute "data-state".'
String state = WebUI.getAttribute(findTestObject('Leads Group/Page_SEVA CRM Homepage - SEVA CRM/menu_Bucket Management - Copy'), 
    'data-state')

if (state == 'closed') {
    'If the Bucket Management menu is closed, click to open it.'
    WebUI.click(findTestObject('Leads Group/Page_SEVA CRM Homepage - SEVA CRM/menu_Bucket Management'))
}

'Verify sub menu Leads Group is visible.'
WebUI.verifyElementVisible(findTestObject('Leads Group/Page_SEVA CRM Homepage - SEVA CRM/subMenu_Leads Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Leads Group/Page_SEVA CRM Homepage - SEVA CRM/subMenu_Leads Group'), 'Leads Group')

'Verify sub menu Leads Bucket Management is visible.'
WebUI.verifyElementVisible(findTestObject('Leads Group/Page_SEVA CRM Homepage - SEVA CRM/subMenu_Leads Bucket Management'))

WebUI.verifyElementText(findTestObject('Leads Group/Page_SEVA CRM Homepage - SEVA CRM/subMenu_Leads Bucket Management'), 
    'Leads Bucket Management')

