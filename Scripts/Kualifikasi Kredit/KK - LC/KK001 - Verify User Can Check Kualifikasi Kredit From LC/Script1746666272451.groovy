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

WebUI.callTestCase(findTestCase('Kualifikasi Kredit/KK - LC/LC001 - Loan Calculator'), [('open_browser') : '1', ('ignore_warning') : '1'
        , ('kota') : 'Jakarta Selatan', ('car_name') : 'Toyota All New Agya', ('jenis_bayar') : 'ADDB'], FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/tenor', [('tenor') : tenor]))
//
//WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/button_Cek Kualifikasi Kredit'))
//
//WebUI.delay(10)
//
//// Pilih Pekerjaan
//WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/input_Pekerjaan'))
//
//WebUI.setText(findTestObject('Kualifikasi-Kredit/KK Used/input_Pekerjaan'), pekerjaan)
//
//WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/List_Pekerjaan', [('pekerjaan') : pekerjaan]))
//
////Gaji Edit
//'edit pendapatan'
//if (update_pendapatan.toString().equalsIgnoreCase('1')) {
//    WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/pendapatan bulanan kk'))
//
//    WebUI.sendKeys(findTestObject('Kualifikasi-Kredit/KK Used/pendapatan bulanan kk'), Keys.chord(Keys.CONTROL, 'a'))
//
//    WebUI.sendKeys(findTestObject('Kualifikasi-Kredit/KK Used/pendapatan bulanan kk'), Keys.chord(Keys.BACK_SPACE))
//
//    WebUI.setText(findTestObject('Kualifikasi-Kredit/KK Used/pendapatan bulanan kk'), pendapatan)
//}
//
//// Input Reff Code
//if (update_reff_code.toString().equalsIgnoreCase('1')) {
//    WebUI.setText(findTestObject('Kualifikasi-Kredit/KK Used/input_Kode Referral Teman SEVA'), reff_code)
//}
//
//WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/button_Lanjutkan kk'))
//
//WebUI.delay(10)
//
//String loginUrl = 'https://www.seva.id/masuk-akun?isShowDisclaimerToGetKkResult=true'
//
//String currentUrl = WebUI.getUrl()
//
//WebUI.comment(currentUrl)
//
//if (currentUrl == loginUrl) {
//    KeywordUtil.markPassed('User is on the expected page: ' + currentUrl)
//
//    WebUI.verifyElementPresent(findTestObject('Kualifikasi-Kredit/KK Used/h1_Selamat Datang di SEVA'), 0)
//
//    WebUI.setText(findTestObject('Login Register Component/Input_Phone_Number'), nomorHP)
//
//    WebUI.click(findTestObject('Login Register Component/button_Lanjutkan'), FailureHandling.STOP_ON_FAILURE)
//
//    if (WebUI.waitForElementVisible(findTestObject('Login Register Component/Error-msg-too-many-request'), 0, FailureHandling.OPTIONAL)) {
//        WebUI.delay(120)
//
//        WebUI.click(findTestObject('Login Register Component/button_Lanjutkan'), FailureHandling.STOP_ON_FAILURE)
//    } else {
//        KeywordUtil.markPassed('There is no error')
//    }
//    
//    WebUI.setText(findTestObject('Login Register Component/Input_OTP'), OTP)
//
//    WebUI.verifyElementPresent(findTestObject('Login Register Component/Notif_Success_OTP'), 0)
//} else {
//    KeywordUtil.markPassed('User already Login')
//}
//
//String currentUrl_2 = WebUI.getUrl()
//
//String KKreviewUrl = 'https://www.seva.id/kualifikasi-kredit/review'
//
//WebUI.comment(currentUrl_2)
//
//// Verify the current URL matches the expected URL
//if (currentUrl_2 == KKreviewUrl) {
//    KeywordUtil.markPassed('User is on the expected page: ' + currentUrl_2)
//}
//
//WebUI.scrollToElement(findTestObject('Kualifikasi-Kredit/KK Used/p_Lihat Detail Mobil - kk review'), 0)
//
//WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/kk-checkbox-agreementPromoTerms'))
//
//WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/kk-checkbox-agreementTerms'))
//
//WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/button_Cek Kualifikasi Kredit - kk review'))
//
//WebUI.delay(5)
//
//WebUI.verifyElementPresent(findTestObject('Kualifikasi-Kredit/KK Used/text-Hasil-Kualifikasi-Kredit'), 60)
WebUI.delay(3)

'=== KK PROCESS ==='
WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/tenor', [('tenor') : tenor]))

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/button_Cek Kualifikasi Kredit'))

WebUI.delay(10)

// Pilih Pekerjaan
WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/input_Pekerjaan'))

WebUI.setText(findTestObject('Kualifikasi-Kredit/KK Used/input_Pekerjaan'), pekerjaan)

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/List_Pekerjaan', [('pekerjaan') : pekerjaan]))
WebUI.delay(3)
WebUI.scrollToElement(findTestObject('Object Repository/Kualifikasi-Kredit/KK Used/pendapatan bulanan kk'), 0)
WebUI.delay(3)

//'edit pendapatan'
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

WebUI.delay(3)

'=== CONTINUE TO KK PROCESS ==='
WebUI.waitForElementPresent(findTestObject('Object Repository/InstantApproval/InstantApproval/headerKkStep-Konfirmasi data Peluang Kredit'), 
    30, FailureHandling.STOP_ON_FAILURE)

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

WebUI.delay(10)

//String currentUrl_Login = WebUI.getUrl()
//
//String LoginUrl = 'https://www.seva.id/masuk-akun?isShowDisclaimerToGetKkResult=true'
'=== LOGIN PROCESS ==='
if (WebUI.waitForElementVisible(findTestObject('Login Register Component/Input_Phone_Number'), 10, FailureHandling.OPTIONAL)) {
    //	KeywordUtil.markPassed('User is on the expected page: ' + currentUrl_Login)
    WebUI.delay(10)

    WebUI.setText(findTestObject('Login Register Component/Input_Phone_Number'), nomorHP)

    WebUI.click(findTestObject('Login Register Component/button_Lanjutkan'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Login Register Component/Input_OTP'), OTP)

    WebUI.delay(10)
}

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Kualifikasi-Kredit/KK Used/text-Hasil-Kualifikasi-Kredit'), 60)

