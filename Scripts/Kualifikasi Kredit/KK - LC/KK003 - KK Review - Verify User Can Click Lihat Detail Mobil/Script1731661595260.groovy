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

/** WebUI.callTestCase(findTestCase('Kualifikasi Kredit/KK - LC/LC001 - Loan Calculator'), [('open_browser') : '1', ('kota') : 'Bandung'
        , ('car_name') : 'Toyota All New Agya', ('jenis_bayar') : 'ADDM'], FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementPresent(findTestObject('Kualifikasi-Kredit/KK Used/tooltip_Dapatkan hasil kualifikasi kredit yang lebih akurat dengan melengkapi profil-mu'), 
    0)) {
    WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/p_OK, Saya Mengerti'))
}

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/tenor', [('tenor') : tenor]))

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/button_Cek Kualifikasi Kredit'))

WebUI.verifyElementPresent(findTestObject('Kualifikasi-Kredit/KK Used/popup cek kualifikasi kredit'), 0)

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/button_Cek Kualifikasi Kredit-pop up'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('Kualifikasi-Kredit/KK Used/h1_Selamat Datang di SEVA'), 0)

String loginUrl = 'https://www.seva.id/masuk-akun'

String kkUrl = 'https://www.seva.id/kualifikasi-kredit'

String currentUrl = WebUI.getUrl()

WebUI.comment(currentUrl)

if (currentUrl == loginUrl) {
    WebUI.setText(findTestObject('Login Register Component/Input_Phone_Number'), nomorHP)

    WebUI.click(findTestObject('Login Register Component/button_Lanjutkan'), FailureHandling.STOP_ON_FAILURE)

    if (WebUI.waitForElementVisible(findTestObject('Login Register Component/Error-msg-too-many-request'), 0, FailureHandling.OPTIONAL)) {
        WebUI.delay(120)

        WebUI.click(findTestObject('Login Register Component/button_Lanjutkan'), FailureHandling.STOP_ON_FAILURE)
    } else {
        KeywordUtil.markPassed('There is no error')
    }
    
    WebUI.setText(findTestObject('Login Register Component/Input_OTP'), OTP)

    WebUI.verifyElementPresent(findTestObject('Login Register Component/Notif_Success_OTP'), 0)
}

WebUI.delay(5)

// Verify the current URL matches the expected URL
if (currentUrl == kkUrl) {
    KeywordUtil.markPassed('User is on the expected page: ' + currentUrl)
}

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

WebUI.scrollToElement(findTestObject('Kualifikasi-Kredit/KK Used/p_Lihat Detail Mobil - kk review'), 0)

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/p_Lihat Detail Mobil - kk review'))

WebUI.verifyElementPresent(findTestObject('Kualifikasi-Kredit/KK Used/h3_Detail Mobil - kk review'), 0)
*/

WebUI.callTestCase(findTestCase('Kualifikasi Kredit/KK - LC/LC001 - Loan Calculator'), [('open_browser') : '1', ('kota') : 'Bandung'
	, ('car_name') : 'Toyota All New Agya', ('jenis_bayar') : 'ADDM'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/tenor', [('tenor') : tenor]))

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/button_Cek Kualifikasi Kredit'))

WebUI.delay(10)

String loginUrl = 'https://www.seva.id/masuk-akun?isShowDisclaimerToGetKkResult=true'

String kkUrl = 'https://www.seva.id/kualifikasi-kredit'

String currentUrl = WebUI.getUrl()

WebUI.comment(currentUrl)

// Verify the current URL matches the expected URL
if (currentUrl == kkUrl) {
KeywordUtil.markPassed('User is on the expected page: ' + currentUrl)

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
}

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Kualifikasi-Kredit/KK Used/h1_Selamat Datang di SEVA'), 0)

String currentUrl_login = WebUI.getUrl()

if (currentUrl_login == loginUrl) {
WebUI.setText(findTestObject('Login Register Component/Input_Phone_Number'), nomorHP)

WebUI.click(findTestObject('Login Register Component/button_Lanjutkan'), FailureHandling.STOP_ON_FAILURE)

if (WebUI.waitForElementVisible(findTestObject('Login Register Component/Error-msg-too-many-request'), 0, FailureHandling.OPTIONAL)) {
	WebUI.delay(120)

	WebUI.click(findTestObject('Login Register Component/button_Lanjutkan'), FailureHandling.STOP_ON_FAILURE)
} else {
	KeywordUtil.markPassed('There is no error')
}

WebUI.setText(findTestObject('Login Register Component/Input_OTP'), OTP)

WebUI.verifyElementPresent(findTestObject('Login Register Component/Notif_Success_OTP'), 0)
}

WebUI.delay(5)

String currentUrl2 = WebUI.getUrl()

String KKreviewUrl = 'https://www.seva.id/kualifikasi-kredit/review'

WebUI.comment(currentUrl2)

// Verify the current URL matches the expected URL
if (currentUrl2 == KKreviewUrl) {
KeywordUtil.markPassed('User is on the expected page: ' + currentUrl)
}

WebUI.scrollToElement(findTestObject('Kualifikasi-Kredit/KK Used/p_Lihat Detail Mobil - kk review'), 0)

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/p_Lihat Detail Mobil - kk review'))

WebUI.verifyElementPresent(findTestObject('Kualifikasi-Kredit/KK Used/h3_Detail Mobil - kk review'), 0)