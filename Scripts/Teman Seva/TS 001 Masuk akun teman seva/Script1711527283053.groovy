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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import click_Helper.ClickHelper as ClickHelper

// Buka browser
WebUI.openBrowser('')

WebUI.navigateToUrl('https://seva.id')

WebUI.maximizeWindow()

// Hapus popup iframe Moe
WebUI.executeJavaScript('\n    var iframe = document.querySelector(\'iframe[id*="moe-onsite-campaign"]\');\n    if (iframe) { iframe.remove(); }\n', 
    null)

// Klik menu mobil baru
ClickHelper.safeClick(findTestObject('dealer page/sub menu mobil baru'))

// Klik tombol terima cookies
ClickHelper.safeClick(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

// Klik burger menu lainnya
ClickHelper.safeClick(findTestObject('Homepage - Burger menu/lainnya'))

// Klik Teman Seva
ClickHelper.safeClick(findTestObject('Homepage - Burger menu/Teman seva'))

// Klik carousel Teman Seva
ClickHelper.safeClick(findTestObject('Page - Teman seva/Carousel teman seva 1'))

// Tutup popup kalau ada
CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(15)

// Klik lagi carousel Teman Seva
ClickHelper.safeClick(findTestObject('Page - Teman seva/Carousel teman seva 1'))

// Checklist setuju
ClickHelper.safeClick(findTestObject('Page - Teman seva/Checbox setuju bergabung TS'))

//TestObject checkbox = findTestObject('Page - Teman seva/Checbox setuju bergabung TS')
//WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(WebUI.findWebElement(checkbox, 10)))

//WebUI.executeJavaScript('\n  var el = document.evaluate(\n    \'//div[contains(@class,"swiper-slide-active")]//div[@role="tab" and contains(@class,"temanSevaOnboarding_boxWrapper")]\',\n    document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null\n  ).singleNodeValue;\n  if (el) el.click();\n', null)
// Klik button masuk Teman Seva
ClickHelper.safeClick(findTestObject('Page - Teman seva/button masuk teman seva'))

WebUI.delay(10)

// Klik button masuk popup
WebUI.waitForElementPresent(findTestObject('Page - Teman seva/button masuk popup'), 10)

ClickHelper.safeClick(findTestObject('Page - Teman seva/button masuk popup'))

// Input nomor HP
WebUI.waitForElementPresent(findTestObject('Page - Teman seva/Field input phone number'), 10)
ClickHelper.safeClick(findTestObject('Page - Teman seva/Field input phone number'))
WebUI.setText(findTestObject('Page - Teman seva/Field input phone number'), Phone_number)

// Klik lanjutkan daftar
WebUI.waitForElementPresent(findTestObject('Page - Teman seva/button lanjutkan daftar teman seva'), 10)
ClickHelper.safeClick(findTestObject('Page - Teman seva/button lanjutkan daftar teman seva'))
WebUI.delay(20)

// Tunggu input OTP muncul
//WebUI.waitForElementPresent(findTestObject('Login Register Component/Input_OTP'), 20)
ClickHelper.safeClick(findTestObject('Login Register Component/Input_OTP'))
WebUI.setText(findTestObject('Login Register Component/Input_OTP'), OTP)
WebUI.delay(10)

// Ambil URL saat ini
String currentUrl = WebUI.getUrl()
WebUI.verifyMatch(currentUrl, 'https://www.seva.id/teman-seva/dashboard', false)

