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

WebUI.callTestCase(findTestCase('CRM/Leads Bucket/LBC001 - VerifyUserCanAccessLeadsBucket'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CRM/Bucket Management/Leads Bucket/Filter/button_Filter'))

WebUI.verifyElementText(findTestObject('CRM/Bucket Management/Leads Bucket/Filter/txt_Created by Me'), 'CREATED BY ME')

WebUI.verifyElementText(findTestObject('CRM/Bucket Management/Leads Bucket/Filter/txt_Shared with Me'), 'SHARED WITH ME')

WebUI.verifyElementText(findTestObject('CRM/Bucket Management/Leads Bucket/Filter/txt_Filter by fields'), 'FILTER BY FIELDS')

WebUI.verifyElementText(findTestObject('CRM/Bucket Management/Leads Bucket/Filter/button_CSA Name'), 'CSA Name')

WebUI.verifyElementText(findTestObject('CRM/Bucket Management/Leads Bucket/Filter/button_Leads Group'), 'Leads Group')

WebUI.verifyElementText(findTestObject('CRM/Bucket Management/Leads Bucket/Filter/button_Origin'), 'Origin')

WebUI.verifyElementText(findTestObject('CRM/Bucket Management/Leads Bucket/Filter/button_Product Category'), 'Product Category')

WebUI.verifyElementText(findTestObject('CRM/Bucket Management/Leads Bucket/Filter/button_UTM Group'), 'UTM Group')

WebUI.closeBrowser()

