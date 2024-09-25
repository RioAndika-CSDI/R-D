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

WebUI.callTestCase(findTestCase('CMS/CMS001 - VerifyUserCanLoginCmsProperly'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_CMS_new/button_SEVA Content Management'))

WebUI.click(findTestObject('Page_CMS_new/Page_Car_of_the_Month/Page_SEVA CMS/a_Car of the Month Management'))

WebUI.click(findTestObject('Page_SEVA CMS/CMS - Car of the Month/input_Search Car of the Month Management'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Page_SEVA CMS/CMS - Car of the Month/input_Search Car of the Month Management'), 
    0)

WebUI.setText(findTestObject('Page_SEVA CMS/CMS - Car of the Month/input_Search Car of the Month Management'), 'Raize')

WebUI.delay(3)

if (true) {
    WebUI.verifyElementText(findTestObject('Page_SEVA CMS/CMS - Car of the Month/td_Car List Car of the Month Management'), 
        'Raize')
} else {
    WebUI.scrollToElement(findTestObject('Page_SEVA CMS/CMS - Car of the Month/span_Showing 0-0 of 0 Daihatsu Car of the Month Management'), 
        0)

    WebUI.verifyElementVisibleInViewport(findTestObject('Page_SEVA CMS/CMS - Car of the Month/span_Showing 0-0 of 0 Daihatsu Car of the Month Management'), 
        0)

    WebUI.scrollToElement(findTestObject('Page_SEVA CMS/CMS - Car of the Month/span_Showing 0-0 of 0 Hyundai Car of the Month Management'), 
        0)

    WebUI.verifyElementVisibleInViewport(findTestObject('Page_SEVA CMS/CMS - Car of the Month/span_Showing 0-0 of 0 Hyundai Car of the Month Management'), 
        0)

    WebUI.scrollToElement(findTestObject('Page_SEVA CMS/CMS - Car of the Month/span_Showing 0-0 of 0 Isuzu Car of the Month Management'), 
        0)

    WebUI.verifyElementVisibleInViewport(findTestObject('Page_SEVA CMS/CMS - Car of the Month/span_Showing 0-0 of 0 Isuzu Car of the Month Management'), 
        0)

    WebUI.scrollToElement(findTestObject('Page_SEVA CMS/CMS - Car of the Month/span_Showing 0-0 of 0 Peugeot Car of the Month Management'), 
        0)

    WebUI.verifyElementVisibleInViewport(findTestObject('Page_SEVA CMS/CMS - Car of the Month/span_Showing 0-0 of 0 Peugeot Car of the Month Management'), 
        0)

    WebUI.scrollToElement(findTestObject('Page_SEVA CMS/CMS - Car of the Month/span_Showing 0-0 of 0 BMW Car of the Month Management'), 
        0)

    WebUI.verifyElementVisibleInViewport(findTestObject('Page_SEVA CMS/CMS - Car of the Month/span_Showing 0-0 of 0 BMW Car of the Month Management'), 
        0)
}

WebUI.delay(3)

WebUI.closeBrowser()

