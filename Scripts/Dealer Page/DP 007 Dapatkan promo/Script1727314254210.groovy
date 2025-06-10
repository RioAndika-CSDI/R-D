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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Dealer Page/DP 006 Menampilkan halaman detail dealer'), [('city') : city, ('dealer') : dealer
        , ('URL_tc3') : URL_tc3, ('expected_URL') : URL_tc3, ('open_browser') : '1', ('close_browser') : '0', ('kontak_dealer_ke') : kontak_dealer_ke], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page - Detail dealer/Button Dapatkan promo_detail dealer'))

WebUI.scrollToElement(findTestObject('Page - Detail dealer/Field nama lengkap'), 30)

//WebUI.waitForElementClickable(findTestObject("Page - Detail dealer/Field nama lengkap"), 10)
//
//WebUI.click(findTestObject("Page - Detail dealer/Field nama lengkap"))
// Locate the input field
WebElement inputField = WebUiCommonHelper.findWebElement(findTestObject('Page - Detail dealer/Field nama lengkap'), 10)

// Use JavaScript to focus the field
WebUI.executeJavaScript("arguments[0].focus();", Arrays.asList(inputField))


WebUI.setText(findTestObject('Page - Detail dealer/Field nama lengkap'), nama_lengkap)

//WebUI.click(findTestObject('Page - Detail dealer/Field nomor handphone'))
WebElement inputFieldHandphone = WebUiCommonHelper.findWebElement(findTestObject('Page - Detail dealer/Field nomor handphone'), 10)

// Use JavaScript to focus the field
WebUI.executeJavaScript("arguments[0].focus();", Arrays.asList(inputFieldHandphone))

WebUI.setText(findTestObject('Page - Detail dealer/Field nomor handphone'), nomor_handphone)

WebUI.waitForElementPresent(findTestObject('Page - Detail dealer/ceklistDP007'), 15)

WebUI.click(findTestObject('Page - Detail dealer/ceklistDP007'))

WebUI.click(findTestObject('Page - Detail dealer/Button kirim'))

WebUI.waitForAlert(15)

WebUI.verifyElementVisible(findTestObject('Page - Detail dealer/Popup OTP'))

WebUI.click(findTestObject('Page - Detail dealer/Field input OTP'))

WebUI.setText(findTestObject('Page - Detail dealer/Field input OTP'), otp)

WebUI.verifyElementPresent(findTestObject('Page - Detail dealer/validasi popup nomor berhasil diverifikasi'), 15)

WebUI.closeBrowser()

