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

WebUI.callTestCase(findTestCase('Kualifikasi Kredit/KK - LC/LC001 - Loan Calculator'), [('open_browser') : '1', ('kota') : 'Bandung'
        , ('car_name') : 'Toyota All New Agya', ('jenis_bayar') : 'ADDM'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/tenor', [('tenor') : tenor]))

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/button_Cek Kualifikasi Kredit'))

String kkUrl = 'https://www.seva.id/kualifikasi-kredit'

String currentUrl = WebUI.getUrl()

WebUI.comment(currentUrl)

if (currentUrl == kkUrl) {
    KeywordUtil.markPassed('User is on the expected page: ' + currentUrl)
}

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

WebUI.delay(15)

String loginUrl = 'https://www.seva.id/masuk-akun?isShowDisclaimerToGetKkResult=true'

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

currentUrl2 = WebUI.getUrl()

if (currentUrl == kkUrl) {
    KeywordUtil.markPassed('User is on the expected page: ' + currentUrl)
}

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

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/pendapatan bulanan kk'))

WebUI.verifyElementPresent(findTestObject('Kualifikasi-Kredit/KK Used/Page_SEVA - Beli Mobil Terbaru Dengan Cicilan Kredit Terbaik/span_Kode Teman SEVA ini tidak tersedia. Gunakan kode lainnya'), 
    0)

