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

WebUI.navigateToUrl('https://cms-fe.prod.seva.id/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_CMS_new/Page_Login/input_Email_Login'), 'superadmin@seva.id')

WebUI.setEncryptedText(findTestObject('Page_CMS_new/Page_Login/input_Password_Login'), 'NbWEQYNoPKhsA2eJ+KpJ/g==')

WebUI.click(findTestObject('Page_CMS_new/Page_Login/button_Log in_CMS'))

WebUI.click(findTestObject('Page_CMS_new/button_SEVA Content Management'))

WebUI.click(findTestObject('Page_CMS_new/Page_Testimony_Management/sub menu_Testimony Management'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_CMS_new/Page_Testimony_Management/button_Add New'))

WebUI.verifyElementText(findTestObject('Page_CMS_new/Page_Testimony_Management/h1_Add New Testimony'), 'Add New Testimony')

WebUI.delay(3)

WebUI.closeBrowser()

