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

WebUI.setText(findTestObject('Object Repository/Page_SEVA CMS/input_rounded-4px h-40px block w-full text-_eb94bc'), 'ayu.anggraini@seva.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SEVA CMS/input_rounded-4px h-40px block w-full text-_eb94bc_1'), 
    'TKuVe2416cQrilL8vjccmw==')

WebUI.click(findTestObject('Object Repository/Page_SEVA CMS/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_SEVA CMS/span_SEVA Content Management'))

WebUI.click(findTestObject('Object Repository/Page_SEVA CMS/CMS - Homepage Banner Management/a_Homepage Banner Management'))

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/button_Add New Homepage Banner Management'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/h1_Create New  Homepage Banner Management'))

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/input__banner_name Homepage Banner Management'))

WebUI.setText(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/input__banner_name Homepage Banner Management'), 
    'TESTING ONLY DONT APPROVE')

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/input__start_date Homepage Banner Management'))

WebUI.doubleClick(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/button_next satart date picker Homepage Banner Management'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/div_30 start date Homepage Banner Management'))

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/button_OK date Homepage Banner Management'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/input__end_date Homepage Banner Management'))

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/button_next end date Homepage Banner Management'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/button_next end date Homepage Banner Management'))

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/div_31 end date Homepage Banner Management'))

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/button_OK end date Homepage Banner Management'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Homepage Component/div_Banner Slot Homepage Banner Management'))

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/div_Slot 5 Homepage Banner Management'))

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/input__url Homepage Banner Management'))

WebUI.setText(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/input__url Homepage Banner Management'), 'https://cms-fe.prod.seva.id/testing-only123')

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/input_Creative ContextHomepage Banner Management'))

WebUI.setText(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/input_Creative ContextHomepage Banner Management'), 
    'TESTING ONLY 12!')

WebUI.uploadFile(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/div_Click to select photo or drag and drop in this area Homepage Banner Management'), 
    'D:\\App\\Katalon_Studio_Windows_64-8.6.8\\Katalon_Studio_Windows_64-8.6.8\\Automation\\Homepage Banner Management.webp')

WebUI.scrollToElement(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/button_Save Homepage Banner Management'), 
    0)

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/button_Save Homepage Banner Management'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/li_Entry have been saved Homepage Banner Management'), 
    2)

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/svg_Icon Back Homepage Banner Management (2)'))

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Testimony Management/input_Search Testimony Management'))

WebUI.setText(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/input_search Homepage Banner Management'), 
    'TESTING ONLY DONT APPROVE')

WebUI.delay(6)

WebUI.verifyElementText(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/div_List Banner Name Homepage Banner Management'), 
    'TESTING ONLY DONT APPROVE')

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/div_List Banner Name Homepage Banner Management'))

WebUI.verifyElementVisible(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/h1_Edit Homepage Banner Management'))

WebUI.delay(3)

WebUI.closeBrowser()

