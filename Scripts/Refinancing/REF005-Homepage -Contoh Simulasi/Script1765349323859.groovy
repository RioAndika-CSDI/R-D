import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import groovy.json.JsonSlurper as JsonSlurper
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.testobject.TestObject as TestObject
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

if (open_browser.toString().equals('1')) {
    WebUI.openBrowser('seva.id')

    WebUI.setViewPortSize(570, 912)
}

JavascriptExecutor jsbefore = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jsbefore.executeScript('\n    var iframe = document.querySelector(\'iframe[id*="moe-onsite-campaign"]\');\n    if (iframe) {\n        iframe.remove();\n    }\n')

WebUI.waitForElementPresent(findTestObject('Homepage Component/Button_Hamburger Menu'), 15)

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Homepage Component/Button_Hamburger Menu'))

WebUI.delay(15)

JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

js.executeScript('\n    var iframe = document.querySelector(\'iframe[id*="moe-onsite-campaign"]\');\n    if (iframe) {\n        iframe.remove();\n    }\n')

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.delay(15)

JavascriptExecutor jsrefi = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jsrefi.executeScript('\n    var iframe = document.querySelector(\'iframe[id*="moe-onsite-campaign"]\');\n    if (iframe) {\n        iframe.remove();\n    }\n')

WebUI.click(findTestObject('HomeRefinancing/SubMenu_FasilitasDana'))

def actURL = WebUI.getUrl()

WebUI.verifyMatch(actURL, expected_url, true)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('HomeRefinancing/responsive mode/contoh simulasi'), 0)

WebUI.click(findTestObject('HomeRefinancing/responsive mode/CTA contoh simulasi'))

WebUI.setText(findTestObject('HomeRefinancing/responsive mode/input nama'), 'Hilmy Testing')

WebUI.setText(findTestObject('HomeRefinancing/responsive mode/input nomor'), '85349524555')

WebUI.delay(5)

WebUI.click(findTestObject('HomeRefinancing/lokasi_pengajuan'))

WebUI.delay(10)

WebUI.click(findTestObject('HomeRefinancing/province'))

WebUI.delay(5)

WebUI.click(findTestObject('HomeRefinancing/kabupaten'))

WebUI.delay(5)

WebUI.click(findTestObject('HomeRefinancing/kecamatan'))

WebUI.delay(5)

WebUI.click(findTestObject('HomeRefinancing/kelurahan'))

WebUI.verifyElementNotClickable(findTestObject('HomeRefinancing/kode_teman_seva'))

WebUI.click(findTestObject('HomeRefinancing/checklist_form'))

WebUI.click(findTestObject('HomeRefinancing/responsive mode/button_kirim'))

WebUI.switchToWindowIndex(0)

WebUI.waitForPageLoad(20)

WebUI.closeBrowser()

