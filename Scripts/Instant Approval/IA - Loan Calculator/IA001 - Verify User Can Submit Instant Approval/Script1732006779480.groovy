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

WebUI.callTestCase(findTestCase('Kualifikasi Kredit/KK - LC/KK001 - Verify User Can Check Kualifikasi Kredit From LC - Not Login'), 
    [('tenor') : '5 Tahun', ('nomorHP') : '85349524556', ('OTP') : '212121', ('pekerjaan') : 'Desainer & Pekerja Seni', ('pendapatan') : '25000000'
        , ('reff_code') : '', ('update_pendapatan') : '0', ('update_reff_code') : '0'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('InstantApproval/InstantApproval/button_Lanjut Instant Approval'))

WebUI.delay(5)

String currentUrl = WebUI.getUrl()

String UploadKTPUrl = 'https://www.seva.id/ktp/upload'

WebUI.comment(currentUrl)

// Verify the current URL matches the expected URL
if (currentUrl == UploadKTPUrl) {
    WebUI.scrollToElement(findTestObject('InstantApproval/InstantApproval/svg- UPLOAD KTP'), 3)

    WebUI.uploadFile(findTestObject('InstantApproval/InstantApproval/svg- UPLOAD KTP'), 'C:\\\\Users\\\\lenovo\\\\Downloads\\\\KTP TESTING\\\\KTP 1.jpg')

    WebUI.delay(3)

    String currentUrl_verifikasi = WebUI.getUrl()

    String VerifikasiKTPUrl = 'https://www.seva.id/ktp/verifikasi'

    if (currentUrl_verifikasi == VerifikasiKTPUrl) {
        KeywordUtil.markPassed('User is on the expected page: ' + currentUrl_verifikasi)

        WebUI.click(findTestObject('InstantApproval/InstantApproval/button_Gunakan Foto Ini'))
    }
    
    WebUI.delay(3)

    /*SUDAH DI HALAMAN EDIT KTP*/
    String currentUrl_edit = WebUI.getUrl()

    String EditKTPUrl = 'https://www.seva.id/ktp/edit'

    if (currentUrl_edit == EditKTPUrl) {
        KeywordUtil.markPassed('User is on the expected page: ' + currentUrl_edit)
    }
    
    /* CHECK NIK */
    String ktpNIK = WebUI.getAttribute(findTestObject('InstantApproval/InstantApproval/input_ktp edit_nik'), 'value')

    WebUI.comment(ktpNIK)

    if (WebUI.verifyEqual(ktpNIK, '', FailureHandling.OPTIONAL)) {
        WebUI.setText(findTestObject('InstantApproval/InstantApproval/input_ktp edit_nik'), '20240913001000001')
    } else if (WebUI.verifyNotEqual(ktpNIK, '', FailureHandling.OPTIONAL)) {
        KeywordUtil.markPassed('NIK already filled')
    }
    
    /* CHECK Name */
    String ktpName = WebUI.getAttribute(findTestObject('InstantApproval/InstantApproval/input_ktp edit_name'), 'value')

    WebUI.comment(ktpName)

    if (WebUI.verifyEqual(ktpName, '', FailureHandling.OPTIONAL)) {
        WebUI.setText(findTestObject('InstantApproval/InstantApproval/input_ktp edit_name'), 'Testing Upload KTP')
    } else if (WebUI.verifyNotEqual(ktpName, '', FailureHandling.OPTIONAL)) {
        KeywordUtil.markPassed('NIK already filled')
    }
    
    /*EDIT KOTA*/
    'Edit City'
    WebUI.click(findTestObject('InstantApproval/InstantApproval/input_Kota_city'))

    WebUI.sendKeys(findTestObject('InstantApproval/InstantApproval/input_Kota_city'), Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(findTestObject('InstantApproval/InstantApproval/input_Kota_city'), Keys.chord(Keys.BACK_SPACE))

    WebUI.setText(findTestObject('InstantApproval/InstantApproval/input_Kota_city'), kota)

    WebUI.click(findTestObject('InstantApproval/InstantApproval/dropdown city edit ktp', [('kota') : kota]))

    /*EDIT STATUS PERKAWINAN*/
    'Edit Status Perkawinan'
    WebUI.click(findTestObject('InstantApproval/InstantApproval/input_Status Perkawinan_marriage'))

    WebUI.click(findTestObject('InstantApproval/InstantApproval/dropdown_status perkawinan', [('marriage') : marriage]))

    /* CHECK DOB */
    String DOB = WebUI.getText(findTestObject('InstantApproval/InstantApproval/button_DDMMYYYY'))

    WebUI.comment(DOB)

    if (WebUI.verifyEqual(DOB, 'DD/MM/YYYY', FailureHandling.OPTIONAL)) {
        CustomKeywords.'selector_dob.DatePickerHandler_EditKTP.selectDate'(dob_year, dob_month, dob_day)
    } else if (WebUI.verifyNotEqual(DOB, '', FailureHandling.OPTIONAL)) {
        KeywordUtil.markPassed('DOB already filled')
    }
    
    WebUI.click(findTestObject('InstantApproval/InstantApproval/button_Konfirmasi'))

    if (WebUI.verifyElementPresent(findTestObject('InstantApproval/InstantApproval/p_Pastikan data KTP-mu sudah sesuai'), 
        1)) {
        WebUI.waitForElementNotPresent(findTestObject('InstantApproval/InstantApproval/p_Pastikan data KTP-mu sudah sesuai'), 
            5)
    }
    
    WebUI.click(findTestObject('InstantApproval/InstantApproval/button_Konfirmasi'))
}

WebUI.delay(3)

String currentUrl_review = WebUI.getUrl()

String ReviewKTPUrl = 'https://www.seva.id/ktp/review'

if (currentUrl_review == ReviewKTPUrl) {
    KeywordUtil.markPassed('User is on the expected page: ' + currentUrl_review)
}

WebUI.click(findTestObject('InstantApproval/InstantApproval/checkbox - Kota Domisili sama dengan KTP'))

WebUI.click(findTestObject('InstantApproval/InstantApproval/button_Selanjutnya'))

WebUI.delay(3)

String currentUrl_pp = WebUI.getUrl()

String ppUrl = 'https://www.seva.id/instant-approval/perusahaan-pembiayaan'

if (currentUrl_pp == ppUrl) {
    KeywordUtil.markPassed('User is on the expected page: ' + currentUrl_pp)
}

WebUI.click(findTestObject('InstantApproval/InstantApproval/button_perusahaan_pembiayaan', [('perusahaan_pembiayaan') : perusahaan_pembiayaan]))

WebUI.click(findTestObject('InstantApproval/InstantApproval/checkbox-sk perusahaan pembiayaan'))

WebUI.click(findTestObject('InstantApproval/InstantApproval/button_Lanjutkan - enabled - perusahaan pembiayaan'))

WebUI.delay(3)

String currentUrl_ia = WebUI.getUrl()

WebUI.comment(currentUrl_ia)

String iareview_url = 'https://www.seva.id/instant-approval/review'

if (currentUrl_ia == iareview_url) {
    KeywordUtil.markPassed('User is on the expected page: ' + currentUrl_ia)
}

WebUI.scrollToElement(findTestObject('InstantApproval/InstantApproval/Lihat-detail-mobil-ia'), 0)

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/checkbox-kk'))

WebUI.click(findTestObject('InstantApproval/InstantApproval/button_Ajukan Instant Approval'))

WebUI.delay(5)

String currentUrl_ia_process = WebUI.getUrl()

WebUI.comment(currentUrl_ia_process)

String ia_process_url = 'https://www.seva.id/instant-approval/process'

if (currentUrl_ia_process == ia_process_url) {
    KeywordUtil.markPassed('User is on the expected page: ' + currentUrl_ia_process)
}

