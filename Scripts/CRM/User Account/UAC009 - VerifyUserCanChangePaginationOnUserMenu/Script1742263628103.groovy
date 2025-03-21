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

'Verify "Previous Page" button is visible.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management Page/CRM049/Page_User Account - SEVA CRM/button_Previous page'))

'Verify "Next Page" button is visible.'
WebUI.verifyElementVisible(findTestObject('CRM/Account Management Page/CRM049/Page_User Account - SEVA CRM/button_Next page'))

'Verify page number is visible.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management Page/CRM049/Page_User Account - SEVA CRM/page_Number'))

'Verify data length of table is visible.'
WebUI.verifyElementVisible(findTestObject('Object Repository/CRM/Account Management Page/CRM049/Page_User Account - SEVA CRM/data_Length'))

'Verify data length of table is visible.'
dataLength_page1 = WebUI.getText(findTestObject('Object Repository/CRM/Account Management Page/CRM049/Page_User Account - SEVA CRM/data_Length'))

'Get data length page 1 before change page.'
WebUI.verifyElementText(findTestObject('CRM/Account Management Page/CRM049/Page_User Account - SEVA CRM/data_Length'), dataLength_page1)

'Get page indicator page 1 before change page.'
pageIndicator_page1 = WebUI.getText(findTestObject('Object Repository/CRM/Account Management Page/CRM049/Page_User Account - SEVA CRM/page_Number'), 
    FailureHandling.STOP_ON_FAILURE)

'Change to page 2'
WebUI.click(findTestObject('CRM/Account Management Page/CRM049/Page_User Account - SEVA CRM/button_Next page'))

'Verify data length of table is visible.'
dataLength_page2 = WebUI.getText(findTestObject('Object Repository/CRM/Account Management Page/CRM049/Page_User Account - SEVA CRM/data_Length'))

'Verify page indicator change when user navigates pages.'
WebUI.verifyElementText(findTestObject('CRM/Account Management Page/CRM049/Page_User Account - SEVA CRM/data_Length'), dataLength_page2)

'Get page number before change page'
WebUI.verifyElementText(findTestObject('Object Repository/CRM/Account Management Page/CRM049/Page_User Account - SEVA CRM/page_Number'), 
    'Page 2 of 8')

'Back to page 1'
WebUI.click(findTestObject('Object Repository/CRM/Account Management Page/CRM049/Page_User Account - SEVA CRM/button_Previous page'))

'Verify that the table data length remains the same as page 1 when the user navigates back to page 1.'
WebUI.verifyElementText(findTestObject('CRM/Account Management Page/CRM049/Page_User Account - SEVA CRM/data_Length'), dataLength_page1)

'Verify that the page indicator remains the same as page 1 when the user navigates back to page 1.'
WebUI.verifyElementText(findTestObject('Object Repository/CRM/Account Management Page/CRM049/Page_User Account - SEVA CRM/page_Number'), 
    pageIndicator_page1)

WebUI.closeBrowser()

