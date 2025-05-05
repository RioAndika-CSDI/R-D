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
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('CRM/Login/HMP001 - VerifyUserCanLoginCRMProperly'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('CRM/Side Menu/img_seva'))

TestObject menuWorkstation = findTestObject('CRM/Side Menu/Menu_Workstation')

WebUI.waitForElementVisible(menuWorkstation, 10)

WebUI.waitForElementClickable(menuWorkstation, 10)

WebUI.scrollToElement(menuWorkstation, 5)

WebUI.click(menuWorkstation)

TestObject submenuLeads = findTestObject('CRM/Side Menu/SubMenu_Leads Workstation')

WebUI.waitForElementVisible(submenuLeads, 10)

WebUI.waitForElementClickable(submenuLeads, 10)

WebElement leadsElement = WebUiCommonHelper.findWebElement(submenuLeads, 10)

JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

js.executeScript('arguments[0].scrollIntoView(true);', leadsElement)

js.executeScript('arguments[0].click();', leadsElement)

// verify halaman terbuka
WebUI.verifyElementText(findTestObject('CRM/Workstation/Lead Workstation/txt_Leads Workstation'), 'Leads Workstation')

// close sidebar
WebUI.click(findTestObject('CRM/Account Management/element_Header'))

