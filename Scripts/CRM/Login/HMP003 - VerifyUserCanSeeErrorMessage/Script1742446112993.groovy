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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser(GlobalVariable.crmprod)

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('CRM/Login/field_email'))

WebUI.setText(findTestObject('CRM/Login/field_email'), 'testing-csaleaderr@seva.id')

WebUI.verifyElementVisible(findTestObject('CRM/Login/field_password'))

WebUI.setText(findTestObject('CRM/Login/field_password'), GlobalVariable.PassUserLeader)

WebUI.click(findTestObject('CRM/Login/button_login'))

if (WebUI.verifyElementVisible(findTestObject('CRM/Login/txtErrorMessageNotMatch'))) {
    KeywordUtil.logInfo('Message success')
} else {
    WebUI.closeBrowser()
}

