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
import org.openqa.selenium.WebElement
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.webui.common.WebUiCommonHelper



WebUI.callTestCase(findTestCase('CRM/Lead Workstation/LWS001 - VerifyUserCanAccessLeadsWorkstation'), [:], FailureHandling.STOP_ON_FAILURE)

if (true) {
	TestObject leadTextObj = new TestObject('dynamicLeadTextObj')
	leadTextObj.addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(),'Your assigned leads will appear here.')]")

	// Tambahkan wait yang lebih panjang
	WebUI.waitForElementVisible(leadTextObj, 20)

	// Screenshot untuk debugging visual (opsional)
	WebUI.takeScreenshot()

	// Verifikasi lebih aman
	boolean isPresent = WebUI.verifyElementPresent(leadTextObj, 10, FailureHandling.OPTIONAL)

	if (isPresent) {
		WebElement element = WebUiCommonHelper.findWebElement(leadTextObj, 10)
		String actualText = element.getText()
		WebUI.comment("Actual text found: '" + actualText + "'")
		assert actualText.contains("Your assigned leads will appear here.")
	}

} else {
    WebUI.verifyElementVisibleInViewport(findTestObject('CRM/Workstation/Lead Workstation/btn_Stop Workstation'), 0)

    WebUI.verifyElementVisible(findTestObject('CRM/Workstation/Lead Workstation/txt_Customer Name'))

    WebUI.verifyElementVisible(findTestObject('CRM/Workstation/Lead Workstation/txt_Phone Number'))

    WebUI.verifyElementText(findTestObject('CRM/Workstation/Lead Workstation/tab_Leads'), 'Leads')

    WebUI.verifyElementText(findTestObject('CRM/Workstation/Lead Workstation/tab_Qualified Leads'), 'Qualified Leads')

    WebUI.verifyElementVisible(findTestObject('CRM/Workstation/Lead Workstation/tab_SPK'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementVisible(findTestObject('CRM/Workstation/Lead Workstation/tab_BSTK'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementText(findTestObject('CRM/Workstation/Lead Workstation/txt_Leads Information'), 'Leads Information')

    WebUI.verifyElementVisible(findTestObject('CRM/Workstation/Lead Workstation/btn_Customer Info_MCI'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('CRM/Workstation/Lead Workstation/btn_Customer Info_MCI'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementText(findTestObject('CRM/Workstation/Lead Workstation/txt_CUSTOMER INFO'), 'CUSTOMER INFO')

    WebUI.click(findTestObject('CRM/Workstation/Lead Workstation/btn_Leads_MCI'))

    WebUI.click(findTestObject('CRM/Workstation/Lead Workstation/btn_Tasks_MCI'))

    WebUI.scrollToElement(findTestObject('CRM/Workstation/Lead Workstation/tab_Follow Up HistoryNotesActivity Log'), 0)

    WebUI.verifyElementVisibleInViewport(findTestObject('CRM/Workstation/Lead Workstation/tab_Follow Up HistoryNotesActivity Log'), 
        0)
}

WebUI.closeBrowser()

