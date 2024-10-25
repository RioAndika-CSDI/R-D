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

if (open_browser.equals('1')) {
    WebUI.callTestCase(findTestCase('Loan Calculator/LC001 - VerifyUserCanAccessLoanCalculatorFromHomepage'), [('close_browser') : '0'
            , ('call_tc') : '0'], FailureHandling.STOP_ON_FAILURE)
}

/**
'kota yang sudah ada value nya'
WebUI.click(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/div_SEVA Dropdown Icon'))

'hapus'
WebUI.click(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/clear_field_kota'))

WebUI.setText(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Saya ingin beli mobil di kota_inputSe_164678'), 
    kota)

WebUI.click(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/div_Jakarta Pusat'))
**/
//SELECT CITY
'Select city'
WebUI.click(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input city'))

WebUI.sendKeys(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input city empty field'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input city empty field'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input city empty field'), kota)

WebUI.click(findTestObject('Kualifikasi-Kredit/Loan-Calculator/div_dropdown list city', [('kota') : kota]))

WebUI.click(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Model mobil pilihan saya_inputSelect__bc5d4b'))

WebUI.sendKeys(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Model mobil pilihan saya_inputSelect__bc5d4b'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Model mobil pilihan saya_inputSelect__bc5d4b'), 
    Keys.chord(Keys.BACK_SPACE))

//WebUI.setText(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Model mobil pilihan saya_inputSelect__bc5d4b'), 
//    car_name)
//WebUI.click(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/Select_dropdown_car', [('car_name') : car_name]))
WebUI.click(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/Select_dropdown_car', [('car_name') : car_name]))

WebUI.delay(2)

WebUI.click(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Pelajari Lebih Lanjut_downPaymentAmount'))

WebUI.doubleClick(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Pelajari Lebih Lanjut_downPaymentAmount'))

WebUI.sendKeys(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Pelajari Lebih Lanjut_downPaymentAmount'), 
    'Rp50.000.000')

WebUI.scrollToElement(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/p_Pembayaran cicilan pertama'), 
    0)

/**
if (bayar.toString().equalsIgnoreCase('ADDM')) {
    WebUI.click(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/ADDM_nonactive'))

    //    WebUI.click(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/ADDM_nonactive'), FailureHandling.STOP_ON_FAILURE)
    WebUI.verifyElementPresent(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/ADDM_active'), 
        0)
} else {
    WebUI.verifyElementPresent(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/ADDB_active'), 
        0)
}
**/
//Jenis Pembayaran Option
if (bayar.toString().equalsIgnoreCase('ADDM')) {
    WebUI.click(findTestObject('Kualifikasi-Kredit/Loan-Calculator/button_Bayar di Muka (ADDM)Dibayar bersama dengan DP'))
} else if (bayar.toString().equalsIgnoreCase('ADDB')) {
    WebUI.click(findTestObject('Kualifikasi-Kredit/Loan-Calculator/button_Bayar di Belakang (ADDB)Dibayar sebulan setelah DP'))
}

WebUI.scrollToElement(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/Cicilan_Mobil_label'), 
    0)

WebUI.setText(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Rekomendasi Cicilan Ideal_0 input_inp_acd316'), 
    'Rp20.000.000')

WebUI.click(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Rekomendasi Cicilan Ideal_inputSelect_f8ef70'))

WebUI.click(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/div_18-27'))

WebUI.click(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Rekomendasi Cicilan Ideal_inputSelect_f8ef70'))

WebUI.click(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/kategori_umur_label'))

//WebUI.click(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/circle'))
//
//WebUI.click(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Rekomendasi Cicilan Ideal_inputSelect_f8ef70'))
//
//WebUI.click(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/div_18-27'))
WebUI.click(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/button_Hitung Kemampuan'))

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

