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

WebUI.callTestCase(findTestCase('CRM/CRM051 - VerifyUserCanAccessLeadsGroupSubMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify "Customized" button is visible by user.'
WebUI.verifyElementVisible(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/button_Customized'))

'Verify "Default" button is visible by user.'
WebUI.verifyElementVisible(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/button_Default'))

'Click "Customized" button.'
WebUI.click(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/button_Customized'))

'And click the \'Default\' button to verify that it works correctly.'
WebUI.click(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/button_Default'))

'Verify if the "leadsGroup_Table Data Counter" element is visible'
WebUI.verifyElementVisible(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/leadsGroup_Table Data Counter'))

'Get the text from "leadsGroup_Table Data Counter" element'
String elementText = WebUI.getText(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/leadsGroup_Table Data Counter'))

'Verify if the elementText contains the phrase "Default Leads Group"'
WebUI.verifyMatch(elementText, '.*Default Leads Group.*', true)

'Verify if the "column_Leads Group" element is visible'
WebUI.verifyElementVisible(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/column_Leads Group'))

'Verify if the text in "column_Leads Group" is exactly "Leads Group"'
WebUI.verifyElementText(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/column_Leads Group'), 'Leads Group')

'Verify if the "column_Category" element is visible'
WebUI.verifyElementVisible(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/column_Category'))

'Verify if the text in "column_Category" is exactly "Category"'
WebUI.verifyElementText(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/column_Category'), 'Category')

'Verify if the "column_Specific Source" element is visible'
WebUI.verifyElementVisible(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/column_Specific Source'))

'Verify if the text in "column_Specific Source" is exactly "Specific Source"'
WebUI.verifyElementText(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/column_Specific Source'), 'Specific Source')

'Verify if the "column_UTM Group" element is visible'
WebUI.verifyElementVisible(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/column_UTM Group'))

'Verify if the text in "column_UTM Group" is exactly "UTM Group"'
WebUI.verifyElementText(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/column_UTM Group'), 'UTM Group')

'Verify if the "column_Total Bucket" element is visible'
WebUI.verifyElementVisible(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/column_Total Bucket'))

'Verify if the text in "column_Total Bucket" is exactly "Total Bucket"'
WebUI.verifyElementText(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/column_Total Bucket'), 'Total Bucket')

'Verify if the "column_Total Leads" element is visible'
WebUI.verifyElementVisible(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/column_Total Leads'))

'Verify if the text in "column_Total Leads" is exactly "Total Leads"'
WebUI.verifyElementText(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/column_Total Leads'), 'Total Leads')

'Verify if the "column_Assign to" element is visible'
WebUI.verifyElementVisible(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/column_Assign to'))

'Verify if the text in "column_Assign to" is exactly "Assign to"'
WebUI.verifyElementText(findTestObject('Leads Group/Page_Leads Group - SEVA CRM/column_Assign to'), 'Assign to')

WebUI.closeBrowser()

