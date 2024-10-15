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

WebUI.openBrowser(GlobalVariable.crmprod)

WebUI.setText(findTestObject('Object Repository/Page_Login SEVA CRM/input_Email'), 'testing-csaleader@seva.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login SEVA CRM/input_Password'), 'rw3JNN5i/ZAcghJh7hNBqQ==')

WebUI.click(findTestObject('Page_Login SEVA CRM/button_LOG IN'))

WebUI.click(findTestObject('Page_CRM_new/Page_Assignment/new/div_Assignment'))

WebUI.click(findTestObject('Page_CRM_new/Page_Assignment/new/a_Leads Assignment'))

WebUI.click(findTestObject('Page_CRM_new/div_Leads Assignment'))

//WebUI.closeBrowser()

