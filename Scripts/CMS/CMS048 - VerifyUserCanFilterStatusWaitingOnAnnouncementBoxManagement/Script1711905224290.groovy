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

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Announcement Box Management/button_Filter Announcement Box Management'))

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Announcement Box Management/div_Select Publish Status Announcement Box Management'))

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Announcement Box Management/div_Waiting Announcement Box Management'))

WebUI.click(findTestObject('Page_CMS_new/Page_Announcement_Box/Page_SEVA CMS/button_Apply Filter'))

if (true) {
    WebUI.verifyElementVisibleInViewport(findTestObject('Page_SEVA CMS/CMS - Announcement Box Management/div_Sorry, no results found Announcement Box Management'), 
        3)
} else {
    WebUI.verifyElementVisibleInViewport(findTestObject('Page_SEVA CMS/CMS - Announcement Box Management/div_Waiting List Announcement Box Management'), 
        3)
}

WebUI.delay(3)

WebUI.closeBrowser()

