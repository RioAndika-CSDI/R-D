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
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.configuration.RunConfiguration

WebUI.callTestCase(findTestCase('Login and Register/LR001-TC-Login'), [('nomorHP') : '85161580003', ('OTP') : '212121', ('open_browser') : '1'
        , ('close_browser') : '0'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('InstantApproval/InstantApproval/header logo seva'))

'=== LOAN CALCULATOR PROCESS ==='
systemos = System.getProperty('os.name')

String[] os = systemos.split(' ')

WebUI.comment(os[0])

'Click Burger Menu'
WebUI.scrollToElement(findTestObject('Homepage Component/Button_Hamburger Menu'), 0)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Kualifikasi-Kredit/Loan-Calculator/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/card_Hitung_Kemampuan-Homepage'), 
    0)

WebUI.click(findTestObject('Kualifikasi-Kredit/Loan-Calculator/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/card_Hitung_Kemampuan-Homepage'))

//SELECT CITY
'Select city'
WebUI.click(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input city'))

WebUI.delay(5)

if ((os[0]).equalsIgnoreCase('Windows') || (os[0]).equalsIgnoreCase('Linux')) {
    WebUI.sendKeys(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input city'), Keys.chord(Keys.CONTROL, 'a'))
} else {
    WebUI.sendKeys(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input city'), Keys.chord(Keys.COMMAND, 'A'))
}

//WebUI.sendKeys(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input city empty field'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input city'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input city'), kota)

WebUI.click(findTestObject('Kualifikasi-Kredit/Loan-Calculator/div_dropdown list city', [('kota') : kota]))

//SELECT CAR MODEL
'Select car model'
WebUI.click(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Model mobil pilihan saya_inputSelect__bc5d4b'))

if ((os[0]).equalsIgnoreCase('Windows') || (os[0]).equalsIgnoreCase('Linux')) {
    WebUI.sendKeys(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Model mobil pilihan saya_inputSelect__bc5d4b'), 
        Keys.chord(Keys.CONTROL, 'A'))
} else {
    WebUI.sendKeys(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Model mobil pilihan saya_inputSelect__bc5d4b'), 
        Keys.chord(Keys.COMMAND, 'A'))
}

//		WebUI.sendKeys(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Model mobil pilihan saya_inputSelect__bc5d4b'),
//    Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Model mobil pilihan saya_inputSelect__bc5d4b'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/Select_dropdown_car', [('car_name') : car_name]))

//Jenis Pembayaran Option
if (jenis_bayar.toString().equalsIgnoreCase('ADDM')) {
    WebUI.click(findTestObject('Kualifikasi-Kredit/Loan-Calculator/button_Bayar di Muka (ADDM)Dibayar bersama dengan DP'))
} else if (jenis_bayar.toString().equalsIgnoreCase('ADDB')) {
    WebUI.click(findTestObject('Kualifikasi-Kredit/Loan-Calculator/button_Bayar di Belakang (ADDB)Dibayar sebulan setelah DP'))
}

WebUI.scrollToElement(findTestObject('Kualifikasi-Kredit/Loan-Calculator/span_Cicil Mobil Impianmu dengan Mudah'), 0)

WebUI.setText(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input_pendapatan'), '20000000')

WebUI.click(findTestObject('Kualifikasi-Kredit/Loan-Calculator/kategori_umur'))

WebUI.click(findTestObject('Kualifikasi-Kredit/Loan-Calculator/umur_dropdown_list'))

WebUI.click(findTestObject('Kualifikasi-Kredit/Loan-Calculator/button_Hitung Kemampuan'))

'=== KK PROCESS ==='
WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/tenor', [('tenor') : tenor]))

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/button_Cek Kualifikasi Kredit'))

WebUI.delay(10)

// Pilih Pekerjaan
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

String currentUrl_KK = WebUI.getUrl()

String KKreviewUrl = 'https://www.seva.id/kualifikasi-kredit/review'

WebUI.comment(currentUrl_KK)

// Verify the current URL matches the expected URL
if (currentUrl_KK == KKreviewUrl) {
    KeywordUtil.markPassed('User is on the expected page: ' + currentUrl_KK)
}

WebUI.scrollToElement(findTestObject('Kualifikasi-Kredit/KK Used/p_Lihat Detail Mobil - kk review'), 0)

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/kk-checkbox-agreementPromoTerms'))

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/kk-checkbox-agreementTerms'))

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/button_Cek Kualifikasi Kredit - kk review'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Kualifikasi-Kredit/KK Used/text-Hasil-Kualifikasi-Kredit'), 60)

WebUI.click(findTestObject('InstantApproval/InstantApproval/button_Lanjut Instant Approval'))

WebUI.delay(5)

'=== USER BELUM UPLOAD KTP ==='
String currentUrl_EditKTP = WebUI.getUrl()

String EditKTP_url = 'https://www.seva.id/ktp/edit'

WebUI.comment(currentUrl_EditKTP)

//assert currentUrl_EditKTP == EditKTP_url
if (currentUrl_EditKTP == EditKTP_url) {
    WebUI.verifyElementPresent(findTestObject('InstantApproval/InstantApproval/header Ktp Step_title'), 5)

    if (WebUI.verifyElementPresent(findTestObject('InstantApproval/InstantApproval/IA upload KTP frame'), 0, FailureHandling.OPTIONAL)) {
        WebUI.click(findTestObject('InstantApproval/InstantApproval/IA upload KTP frame'))

        if (ktp_upload == '1') {
            WebUI.scrollToElement(findTestObject('InstantApproval/InstantApproval/ktp-upload_btnUpload'), 0)

            //		WebUI.click(findTestObject('InstantApproval/InstantApproval/ktp-upload_btnUpload'))
            WebUI.uploadFile(findTestObject('InstantApproval/InstantApproval/svg- UPLOAD KTP'), 'C:\\\\Users\\\\lenovo\\\\Downloads\\\\KTP TESTING\\\\KTP 1.jpg')

            WebUI.delay(15)
        } else if (ktp_upload == '0') {
            WebUI.click(findTestObject('InstantApproval/InstantApproval/button-capture-image'))
        }
        
        WebUI.verifyElementPresent(findTestObject('InstantApproval/InstantApproval/KTP Image Preview Frame'), 5)
    } else {
        println('User has submitted their KTP')
    }
    
    WebUI.scrollToElement(findTestObject('InstantApproval/InstantApproval/input_ktp edit_nik'), 5)

    /* CHECK NIK */
    '=== KTP EDIT FORM FILLED ==='
    String ktpNIK = WebUI.getAttribute(findTestObject('InstantApproval/InstantApproval/input_ktp edit_nik'), 'value')

    WebUI.comment(ktpNIK)

    if (WebUI.verifyEqual(ktpNIK, '', FailureHandling.OPTIONAL)) {
        Date currentDate = new Date()

        SimpleDateFormat dateFormat = new SimpleDateFormat('yyyyMMddHHmmss')

        String formattedDate = dateFormat.format(currentDate)

        WebUI.setText(findTestObject('InstantApproval/InstantApproval/input_ktp edit_nik'), '01' + formattedDate)
    } else if (WebUI.verifyNotEqual(ktpNIK, '', FailureHandling.OPTIONAL)) {
        println('NIK already filled')
    }
    
    /* CHECK Name */
    String ktpName = WebUI.getAttribute(findTestObject('InstantApproval/InstantApproval/input_ktp edit_name'), 'value')

    WebUI.comment(ktpName)

    if (WebUI.verifyEqual(ktpName, '', FailureHandling.OPTIONAL)) {
        WebUI.setText(findTestObject('InstantApproval/InstantApproval/input_ktp edit_name'), 'Testing Automation Upload KTP')
    } else if (WebUI.verifyNotEqual(ktpName, '', FailureHandling.OPTIONAL)) {
        KeywordUtil.markPassed('KTP Name already filled')

        WebUI.setText(findTestObject('InstantApproval/InstantApproval/input_ktp edit_name'), 'testing automation')
    }
    
    /*EDIT KOTA*/
    'Edit City'
    WebUI.click(findTestObject('InstantApproval/InstantApproval/input_Kota_city'))

    WebUI.sendKeys(findTestObject('InstantApproval/InstantApproval/input_Kota_city'), Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(findTestObject('InstantApproval/InstantApproval/input_Kota_city'), Keys.chord(Keys.BACK_SPACE))

    WebUI.setText(findTestObject('InstantApproval/InstantApproval/input_Kota_city'), kota_ktp)

    WebUI.click(findTestObject('InstantApproval/InstantApproval/dropdown city edit ktp', [('kota') : kota_ktp]))

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

    WebUI.click(findTestObject('InstantApproval/InstantApproval/button Sudah Sesuai KTP'))

    if (WebUI.verifyElementPresent(findTestObject('InstantApproval/InstantApproval/error-message - KTP sudah terdaftar'), 
        0, FailureHandling.OPTIONAL)) {
        WebUI.click(findTestObject('InstantApproval/InstantApproval/KTP Sudah Terdaftar X button'))

        WebUI.click(findTestObject('InstantApproval/InstantApproval/input_ktp edit_nik'))

        if ((os[0]).equalsIgnoreCase('Windows') || (os[0]).equalsIgnoreCase('Linux')) {
            WebUI.sendKeys(findTestObject('InstantApproval/InstantApproval/input_ktp edit_nik'), Keys.chord(Keys.CONTROL, 
                    'A'))
        } else {
            WebUI.sendKeys(findTestObject('InstantApproval/InstantApproval/input_ktp edit_nik'), Keys.chord(Keys.COMMAND, 
                    'A'))
        }
        
        WebUI.sendKeys(findTestObject('InstantApproval/InstantApproval/input_ktp edit_nik'), Keys.chord(Keys.BACK_SPACE))

        Date currentDate = new Date()

        SimpleDateFormat dateFormat = new SimpleDateFormat('yyyyMMddHHmmss')

        String formattedDate = dateFormat.format(currentDate)

        WebUI.setText(findTestObject('InstantApproval/InstantApproval/input_ktp edit_nik'), '01' + formattedDate)

        WebUI.click(findTestObject('InstantApproval/InstantApproval/button_Konfirmasi'))
    } else {
        println('NIK available')
    }
}

'=== KTP Review Page ==='
WebUI.delay(5)

currentUrl_KTPreview = WebUI.getUrl()

String KTPreview_url = 'https://www.seva.id/ktp/review'

WebUI.comment(currentUrl_KTPreview)

assert currentUrl_KTPreview == KTPreview_url

if (domisili == '1') {
    WebUI.click(findTestObject('InstantApproval/InstantApproval/checkbox - Kota Domisili sama dengan KTP'))
} else if (domisili == '0') {
    WebUI.setText(findTestObject('InstantApproval/InstantApproval/dropdown-select-city-ktp-review'), kota_domisili)

    WebUI.click(findTestObject('Kualifikasi-Kredit/Loan-Calculator/div_dropdown list city', [('kota') : kota_domisili]))
}

WebUI.click(findTestObject('InstantApproval/InstantApproval/button_Selanjutnya'))

'=== Perusahaan Pembiayaan Page ==='
String currentUrl_pp = WebUI.getUrl()

String PerusahaanPembiayaan_url = 'https://www.seva.id/instant-approval/perusahaan-pembiayaan'

if (currentUrl_pp == PerusahaanPembiayaan_url) {
    KeywordUtil.markPassed('User is on the expected page: ' + currentUrl_pp)
}

WebUI.verifyElementPresent(findTestObject('InstantApproval/InstantApproval/IA step - Pilih Perusahaan Pembiayaan'), 0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('InstantApproval/InstantApproval/button_perusahaan_pembiayaan', [('perusahaan_pembiayaan') : perusahaan_pembiayaan]))

WebUI.click(findTestObject('InstantApproval/InstantApproval/checkbox-sk perusahaan pembiayaan'))

WebUI.click(findTestObject('InstantApproval/InstantApproval/button_Lanjutkan - enabled - perusahaan pembiayaan'))

'=== IA Review Page ==='
String currentUrl_IAreview = WebUI.getUrl()

String IAreview_url = 'https://www.seva.id/instant-approval/review'

if (currentUrl_IAreview == IAreview_url) {
    KeywordUtil.markPassed('User is on the expected page: ' + currentUrl_IAreview)
}

WebUI.verifyElementPresent(findTestObject('InstantApproval/InstantApproval/IA Step - Konfirmasi Data'), 0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('InstantApproval/InstantApproval/Lihat-detail-mobil-ia'), 0)

WebUI.delay(5)

WebUI.click(findTestObject('InstantApproval/InstantApproval/a_Kebijakan Privasi'))

WebUI.delay(3)

String currentUrl_kp = WebUI.getUrl()

String kpUrl = 'https://www.seva.id/info/kebijakan-privasi/'

if (currentUrl_kp == kpUrl) {
    KeywordUtil.markPassed('User is on the expected page: ' + currentUrl_kp)
}

