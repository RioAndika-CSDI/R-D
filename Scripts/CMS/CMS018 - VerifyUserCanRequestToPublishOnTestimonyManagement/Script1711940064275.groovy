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

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Testimony Management/a_Testimony Management (1)'))

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Testimony Management/input_Search Testimony Management'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_SEVA CMS/CMS - Testimony Management/input_Search Testimony Management'), 'TESTING ONLY DONT APPROVE')

WebUI.delay(6)

WebUI.verifyElementText(findTestObject('Page_SEVA CMS/CMS - Testimony Management/div_List NameTestimony Management'), 'TESTING ONLY DONT APPROVE')

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Testimony Management/div_List NameTestimony Management'))

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Testimony Management/button_Publish Testimony Management'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Testimony Management/button_Send Request Testimony Management'))

WebUI.verifyElementInViewport(findTestObject('Page_SEVA CMS/CMS - Homepage Banner Management/li_Approval request has been sent Homepage Banner Management'), 
    2)

WebUI.verifyElementVisibleInViewport(findTestObject('Page_SEVA CMS/CMS - Testimony Management/h5_This entry has a pending request to publish Testimony Management'), 
    2)

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Testimony Management/svg_Back Testimony Management'))

WebUI.setText(findTestObject('Page_SEVA CMS/CMS - Testimony Management/input_Search Testimony Management'), 'TESTING ONLY DONT APPROVE')

WebUI.delay(6)

WebUI.verifyElementText(findTestObject('Page_SEVA CMS/CMS - Testimony Management/div_List NameTestimony Management'), 'TESTING ONLY DONT APPROVE')

WebUI.verifyElementVisibleInViewport(findTestObject('Page_SEVA CMS/CMS - Testimony Management/div_Request to Publish List Testimony Management'), 
    0)

WebUI.delay(3)

WebUI.closeBrowser()

