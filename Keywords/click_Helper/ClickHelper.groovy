package click_Helper

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
//import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebElement
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory

class ClickHelper {
	
	/**
	 * Coba klik biasa, kalau gagal baru fallback ke JS click
	 */
	static void safeClick(TestObject to, int timeout = 10) {
		try {
			WebUI.waitForElementClickable(to, timeout)
			WebUI.scrollToElement(to, timeout)
			WebUI.enhancedClick(to)
			WebUI.comment("click berhasil pada: " + to.getObjectId())
		} catch (Exception e) {
			WebUI.comment("click gagal pada: " + to.getObjectId() + " → fallback ke JS")
			WebElement element = WebUiCommonHelper.findWebElement(to, timeout)
			JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()
			js.executeScript("arguments[0].click();", element)
		}
	}
}