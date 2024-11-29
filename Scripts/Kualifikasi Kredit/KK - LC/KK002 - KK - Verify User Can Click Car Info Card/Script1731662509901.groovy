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

/** if (WebUI.verifyElementPresent(findTestObject('Kualifikasi-Kredit/KK Used/tooltip_Dapatkan hasil kualifikasi kredit yang lebih akurat dengan melengkapi profil-mu'), 
    0)) {
    WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/p_OK, Saya Mengerti'))
} else {
	KeywordUtil.markPassed('There is no tooltip')
} */
WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/tenor', [('tenor') : tenor]))

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/button_Cek Kualifikasi Kredit'))

/** WebUI.verifyElementPresent(findTestObject('Kualifikasi-Kredit/KK Used/popup cek kualifikasi kredit'), 0) */
/** WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/button_Cek Kualifikasi Kredit-pop up')) */
WebUI.delay(10)

String loginUrl = 'https://www.seva.id/masuk-akun?isShowDisclaimerToGetKkResult=true'

String kkUrl = 'https://www.seva.id/kualifikasi-kredit'

String currentUrl = WebUI.getUrl()

WebUI.comment(currentUrl)

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/cta section car kk'))

WebUI.verifyElementPresent(findTestObject('Kualifikasi-Kredit/KK Used/div_Mobil yang kamu pilih'), 0)

WebUI.click(findTestObject('Kualifikasi-Kredit/KK Used/x button - close pop up car info'))

