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

'Verify "Search Bar" is visible.'
WebUI.verifyElementVisible(findTestObject('CRM/Account Management/User Account/field_searchBar'))

'Search by "Name" in search bar.'
WebUI.setText(findTestObject('CRM/Account Management/User Account/field_searchBar'), 'Dadi hendriadi')

WebUI.delay(3)

'Verify that the search results are displayed correctly in the table.'
WebUI.verifyElementText(findTestObject('CRM/Account Management/name_cell'), 'Dadi Hendriadi')

'Search by "Email" in search bar.'
WebUI.setText(findTestObject('CRM/Account Management/User Account/field_searchBar'), 'Prawestri@seva.id')

WebUI.delay(3)

'Verify that the search results are displayed correctly in the table.'
WebUI.verifyElementText(findTestObject('CRM/Account Management/email_cell'), 'Prawestri@seva.id')

'Search by "Phone" in search bar.'
WebUI.setText(findTestObject('CRM/Account Management/User Account/field_searchBar'), '082242603707')

WebUI.delay(3)

'Verify that the search results are displayed correctly in the table.'
WebUI.verifyElementText(findTestObject('CRM/Account Management/Phone Cell'), '082242603707')

'Search random value in search bar.'
WebUI.setText(findTestObject('CRM/Account Management/User Account/field_searchBar'), 'asdx')

WebUI.delay(3)

'Verify that when a search returns no matching data, the message \'There is nothing to be shown here.\' is displayed.'
WebUI.verifyElementText(findTestObject('CRM/Account Management/There is nothing message'), 'There is nothing to be shown here.')

