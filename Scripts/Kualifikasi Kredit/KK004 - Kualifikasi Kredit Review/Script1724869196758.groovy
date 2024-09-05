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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('Kualifikasi Kredit/KK002 - Kualifikasi Kredit - Sumber Pendapatan - Pilih Pekerjaan'), 
    [('pekerjaan') : 'Desainer & Pekerja Seni', ('pendapatan') : '25000000', ('reff_code') : '', ('update_pendapatan') : '0'
        , ('update_reff_code') : '0'], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.delay(3)

String currentUrl = WebUI.getUrl()

String KKreviewUrl = 'https://www.seva.id/kualifikasi-kredit/review'

WebUI.comment(currentUrl)

// Verify the current URL matches the expected URL
if (currentUrl == KKreviewUrl) {
    KeywordUtil.markPassed('User is on the expected page: ' + currentUrl)
}

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/button_Cek Kualifikasi Kredit - kk review'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Kualifikasi-Kredit/KK Used/span_Mau Hasil yang Pasti dan Cepat Yuk, Lanjut ke Tahap Instant Approval'), 
    0)

