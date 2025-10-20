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

WebUI.callTestCase(findTestCase('Kualifikasi Kredit/KK - LC/KK001 - Verify User Can Check Kualifikasi Kredit From LC'), 
    [('tenor') : '5 Tahun', ('nomorHP') : '85349524556', ('OTP') : '123456', ('pekerjaan') : 'Desainer & Pekerja Seni', ('pendapatan') : '25000000'
        , ('reff_code') : '', ('update_pendapatan') : '1', ('update_reff_code') : '0'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Kualifikasi-Kredit/KK Used/button_Hubungi Agen SEVA'), 0)

WebUI.verifyElementClickable(findTestObject('Kualifikasi-Kredit/KK Used/button_Hubungi Agen SEVA'))

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/button_Hubungi Agen SEVA'))
WebUI.delay(3)
WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/kk-checkbox-agreementTerms hubungi agen seva'))
WebUI.delay(2)
WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/button_Kirim'))

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/kk-checkbox-agreementTerms hubungi agen seva'))

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/button_Kirim'))

