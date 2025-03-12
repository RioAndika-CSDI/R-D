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

WebUI.callTestCase(findTestCase('Dealer Page/DP 006 Menampilkan halaman detail dealer'), [('city') : city, ('dealer') : dealer
        , ('URL_tc3') : URL_tc3, ('expected_URL') : expected_URL, ('open_browser') : '1', ('close_browser') : '0', ('kontak_dealer_ke') : kontak_dealer_ke], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page - Detail dealer/Halaman Submit leads'), 0)

WebUI.click(findTestObject('Page - Detail dealer/Field nama lengkap'))

WebUI.setText(findTestObject('Page - Detail dealer/Field nama lengkap'), nama_lengkap)

WebUI.click(findTestObject('Page - Detail dealer/Field nomor handphone'))

WebUI.setText(findTestObject('Page - Detail dealer/Field nomor handphone'), nomor_handphone)

WebUI.waitForElementPresent(findTestObject('Page - Detail dealer/Checklist leads form dealer'), 15)

WebUI.click(findTestObject('Page - Detail dealer/Checklist leads form dealer'))

WebUI.click(findTestObject('Page - Detail dealer/Button kirim'))

WebUI.waitForAlert(15)

WebUI.verifyElementVisible(findTestObject('Page - Detail dealer/Popup OTP'))

WebUI.click(findTestObject('Page - Detail dealer/Field input OTP'))

WebUI.setText(findTestObject('Page - Detail dealer/Field input OTP'), otp)

WebUI.verifyElementPresent(findTestObject('Page - Detail dealer/validasi popup nomor berhasil diverifikasi'), 0)

WebUI.closeBrowser()

