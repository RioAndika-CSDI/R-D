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

systemos = System.getProperty('os.name')

String[] os = systemos.split(' ')

WebUI.comment(os[0])

if (open_browser.toString().equals('1')) {
    WebUI.openBrowser('https://www.seva.id/generate-link/mobil-baru/instant-approval')
}

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/input_Nama CSA_input_input__c0tP8'), 
    0)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(10)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

if (WebUI.verifyElementPresent(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'), 
    5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))
}

'Click Moengage Ads\r\n'
WebUI.delay(5)

'Input CSA name'
WebUI.setText(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/input_Nama CSA_input_input__c0tP8'), 
    csa_name)

'CRM Leads ID'
WebUI.setText(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/input_CRM Leads ID'), 
    crm_leads_id)

'Input Customer name'
WebUI.setText(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/input_Nama Customer_input_input__c0tP8'), 
    customer_name)

//SELECT CITY
'Select city'
WebUI.click(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/input_Kota KTP Customer_inputSelect'))

if ((os[0]).equalsIgnoreCase('Windows') || (os[0]).equalsIgnoreCase('Linux')) {
    WebUI.sendKeys(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/input_Kota KTP Customer_inputSelect'), 
        Keys.chord(Keys.CONTROL, 'A'))
} else {
    WebUI.sendKeys(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/input_Kota KTP Customer_inputSelect'), 
        Keys.chord(Keys.COMMAND, 'A'))
}

//WebUI.sendKeys(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input city empty field'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/input_Kota KTP Customer_inputSelect'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/input_Kota KTP Customer_inputSelect'), 
    city)

WebUI.click(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/dropdown_city_csa ia', 
        [('city') : city]))

//SELECT CAR MODEL
'Select car model'
WebUI.click(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/input_Model mobil pilihan customer'))

if ((os[0]).equalsIgnoreCase('Windows') || (os[0]).equalsIgnoreCase('Linux')) {
    WebUI.sendKeys(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/input_Model mobil pilihan customer'), 
        Keys.chord(Keys.CONTROL, 'A'))
} else {
    WebUI.sendKeys(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/input_Model mobil pilihan customer'), 
        Keys.chord(Keys.COMMAND, 'A'))
}

//		WebUI.sendKeys(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Model mobil pilihan saya_inputSelect__bc5d4b'), 
//    Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/input_Model mobil pilihan customer'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/dropdown_car_model', 
        [('car_model') : car_model]))

WebUI.scrollToElement(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/field title - DP IA CSA'), 
    5)

WebUI.delay(5)

'Input DP'
if ((os[0]).equalsIgnoreCase('Windows') || (os[0]).equalsIgnoreCase('Linux')) {
    WebUI.sendKeys(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/input_downPaymentAmount'), 
        Keys.chord(Keys.CONTROL, 'a'))
} else {
    WebUI.sendKeys(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/input_downPaymentAmount'), 
        Keys.chord(Keys.COMMAND, 'A'))
}

WebUI.delay(5)

//WebUI.sendKeys(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input city empty field'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/input_downPaymentAmount'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/input_downPaymentAmount'), 
    dp_nominal)

//Jenis Pembayaran Option
if (jenis_bayar.toString().equalsIgnoreCase('ADDM')) {
    WebUI.click(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/button_Bayar di Muka (ADDM)'))
} else if (jenis_bayar.toString().equalsIgnoreCase('ADDB')) {
    WebUI.click(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/button_Bayar di Belakang (ADDB)'))
}

if (perusahaan_pembiayaan.toString().equalsIgnoreCase('ACC')) {
    WebUI.click(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/button_ACC'))
} else if (perusahaan_pembiayaan.toString().equalsIgnoreCase('TAF')) {
    WebUI.click(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/button_TAF'))
}

WebUI.setText(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/div_Notes'), 
    notes)

WebUI.setText(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/income'), 
    monthly_income)

WebUI.click(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/select_umur'))

WebUI.click(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/dropdown_umur', 
        [('age') : age]))

