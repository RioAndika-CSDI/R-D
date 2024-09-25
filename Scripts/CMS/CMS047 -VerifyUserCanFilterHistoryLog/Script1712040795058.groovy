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

WebUI.callTestCase(findTestCase('CMS/CMS022 - VerifyUserCanAccessHistoryLog'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_SEVA CMS/button_History Log_align-bottom inline-flex_bcef6f'))

//WebUI.click(findTestObject('Page_CMS_new/Page_User_Management/Page_SEVA CMS/svg_History Log_h-5 w-5'))

WebUI.click(findTestObject('Page_CMS_new/Page_User_Management/Page_SEVA CMS/Page_SEVA CMS/svg_Module_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Page_SEVA CMS/div_Branches'))

WebUI.click(findTestObject('Object Repository/Page_SEVA CMS/svg_User_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Page_SEVA CMS/div_Testing Qa'))

