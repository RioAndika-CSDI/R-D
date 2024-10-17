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
    WebUI.openBrowser(GlobalVariable.Prod)
}

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Kualifikasi-Kredit/Loan-Calculator/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/card_Hitung_Kemampuan-Homepage'), 
    0)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(10)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

'Click Burger Menu'
WebUI.scrollToElement(findTestObject('Homepage Component/Burger_Button_Baru'), 0)

'Click Moengage Ads\r\n'
WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Kualifikasi-Kredit/Loan-Calculator/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/card_Hitung_Kemampuan-Homepage'), 
    0)

WebUI.click(findTestObject('Kualifikasi-Kredit/Loan-Calculator/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/card_Hitung_Kemampuan-Homepage'))

//SELECT CITY
'Select city'
WebUI.click(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input city'))

if ((os[0]).equalsIgnoreCase('Windows') || (os[0]).equalsIgnoreCase('Linux')) {
	WebUI.sendKeys(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input city empty field'), Keys.chord(Keys.CONTROL, 'A'))
} else {
	WebUI.sendKeys(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input city empty field'), Keys.chord(Keys.COMMAND, 'A'))
}

//WebUI.sendKeys(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input city empty field'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input city empty field'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Kualifikasi-Kredit/Loan-Calculator/input city empty field'), kota)

WebUI.click(findTestObject('Kualifikasi-Kredit/Loan-Calculator/div_dropdown list city', [('kota') : kota]))

//SELECT CAR MODEL
'Select car model'
WebUI.click(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Model mobil pilihan saya_inputSelect__bc5d4b'))

        if ((os[0]).equalsIgnoreCase('Windows') || (os[0]).equalsIgnoreCase('Linux')) {
            WebUI.sendKeys(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Model mobil pilihan saya_inputSelect__bc5d4b'), Keys.chord(Keys.CONTROL, 'A'))
        } else {
            WebUI.sendKeys(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Model mobil pilihan saya_inputSelect__bc5d4b'), Keys.chord(Keys.COMMAND, 'A'))
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

