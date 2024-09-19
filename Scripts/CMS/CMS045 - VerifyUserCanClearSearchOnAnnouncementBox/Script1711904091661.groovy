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

WebUI.callTestCase(findTestCase('CMS/CMS040 - VerifyUserCanAccessAnnouncementBoxManagement'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Announcement Box Management/input_Search Announcement Box Management'))

WebUI.verifyElementVisibleInViewport(findTestObject('Page_SEVA CMS/CMS - Announcement Box Management/input_Search Announcement Box Management'), 
    0)

WebUI.setText(findTestObject('Page_SEVA CMS/CMS - Announcement Box Management/input_Search Announcement Box Management'), 
    'Refinancing Highlight')

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Page_SEVA CMS/CMS - Announcement Box Management/div_Title List Announcement Box Management'), 
    'Refinancing Highlight')

WebUI.click(findTestObject('Page_CMS_new/Page_Announcement_Box/Page_SEVA CMS/svg_Announcement Box Management'))

if (true) {
    WebUI.verifyElementVisibleInViewport(findTestObject('Page_SEVA CMS/CMS - Announcement Box Management/div_Title List Announcement Box Management'), 
        0)
} else {
    WebUI.verifyElementVisibleInViewport(findTestObject('Page_SEVA CMS/CMS - Announcement Box Management/div_Sorry, no results found Announcement Box Management'), 
        3)
}

WebUI.delay(3)

WebUI.closeBrowser()

