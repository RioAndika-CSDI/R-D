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

WebUI.openBrowser(GlobalVariable.Prod)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/h1_Menemani Perjalanan Finansial Mobil Barumu'))

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(10)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

'cek KK button'
WebUI.click(findTestObject('Object Repository/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Cek Kualifikasi Kredit'))

WebUI.click(findTestObject('Page_SEVA - Beli Mobil Terbaru Dengan Cicilan Kredit Terbaik/field_harga_terendah'))

'harga terendah field'
WebUI.setText(findTestObject('Page_SEVA - Beli Mobil Terbaru Dengan Cicilan Kredit Terbaik/field_harga_terendah'), 'Rp200.000.000')

WebUI.click(findTestObject('Page_SEVA - Beli Mobil Terbaru Dengan Cicilan Kredit Terbaik/field_harga_tertinggi'))

'harga tertinggi field'
WebUI.setText(findTestObject('Page_SEVA - Beli Mobil Terbaru Dengan Cicilan Kredit Terbaik/field_harga_tertinggi'), 'Rp400.000.000')

'maksimum DP field'
WebUI.setText(findTestObject('Object Repository/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Rp2.659.100.000_downPaymentAmount'), 
    'Rp60.000.000')

'pendapatan bulanan field'
WebUI.setText(findTestObject('Object Repository/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Rp2.659.100.000_monthlyIncome'), 
    'Rp20.000.000')

'Tenor'
WebUI.click(findTestObject('Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/div_5 (1)', [('tenor') : tenor]))

'transmisi\r\n'
WebUI.click(findTestObject('Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/div_Otomatis (1)', [('transmisi') : transmisi]))

'dropdown pekerjaan'
WebUI.click(findTestObject('Object Repository/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/svg_SEVA Dropdown Icon'))

'karyawan swasta'
WebUI.click(findTestObject('Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/div_Karyawan Swasta', [('pekerjaan') : pekerjaan]))

'kode referral field'
WebUI.setText(findTestObject('Object Repository/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/div_Kode Referral Teman SEVA (Opsional)_inp_97a83d'), 
    kode_referral)

'button lihat rekomendasi mobil'
WebUI.click(findTestObject('Object Repository/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/button_Lihat Rekomendasi Mobil (1)'))

WebUI.setText(findTestObject('Page_SEVA - Beli Mobil Terbaru Dengan Cicilan Kredit Terbaik/field_nomor_hp_pop_up'), '85349524556')

WebUI.click(findTestObject('Page_SEVA - Beli Mobil Terbaru Dengan Cicilan Kredit Terbaik/button_Masuk_pop_up'))

WebUI.setText(findTestObject('Page_SEVA - Beli Mobil Terbaru Dengan Cicilan Kredit Terbaik/field_otp_popup'), '212121')

WebUI.verifyElementVisible(findTestObject('Page_/button_Lanjut Instant Approval'))

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

