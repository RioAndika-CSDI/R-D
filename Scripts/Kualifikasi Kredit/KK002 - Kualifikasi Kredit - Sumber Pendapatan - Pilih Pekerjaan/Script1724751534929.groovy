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

WebUI.callTestCase(findTestCase('Kualifikasi Kredit/KK001 - Access Kualifikasi Kredit from Loan Calculator'), [('tenor') : '5 Tahun'
        , ('nomorHP') : '85349524555', ('OTP') : '212121', ('pekerjaan') : 'Desainer & Pekerja Seni'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/input_Pekerjaan'))

WebUI.setText(findTestObject('Kualifikasi-Kredit/KK Used/input_Pekerjaan'), pekerjaan)

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/List_Pekerjaan', [('pekerjaan') : pekerjaan]))

//Gaji Edit
'edit pendapatan'
if (update_pendapatan.toString().equalsIgnoreCase('1')) {
    WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/pendapatan bulanan kk'))

    WebUI.sendKeys(findTestObject('Kualifikasi-Kredit/KK Used/pendapatan bulanan kk'), Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(findTestObject('Kualifikasi-Kredit/KK Used/pendapatan bulanan kk'), Keys.chord(Keys.BACK_SPACE))

    WebUI.setText(findTestObject('Kualifikasi-Kredit/KK Used/pendapatan bulanan kk'), pendapatan)
}

// Input Reff Code
if (update_reff_code.toString().equalsIgnoreCase('1')) {
    WebUI.setText(findTestObject('Kualifikasi-Kredit/KK Used/input_Kode Referral Teman SEVA'), reff_code)
}

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/button_Lanjutkan kk'))

