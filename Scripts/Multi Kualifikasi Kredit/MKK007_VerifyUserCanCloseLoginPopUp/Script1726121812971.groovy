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

WebUI.scrollToElement(findTestObject('Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/p_Kualifikasi'), 0)

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
WebUI.setText(findTestObject('Object Repository/Multi KK/input_Rp2.659.100.000_downPaymentAmount'), 'Rp60.000.000')

'pendapatan bulanan field'
WebUI.setText(findTestObject('Object Repository/Multi KK/input_Rp2.659.100.000_monthlyIncome'), 'Rp20.000.000')

'Tenor'
WebUI.click(findTestObject('Multi KK/div_5 (1)', [('tenor') : tenor]))

'transmisi\r\n'
WebUI.click(findTestObject('Multi KK/div_Otomatis (1)', [('transmisi') : transmisi]))

'dropdown pekerjaan'
WebUI.click(findTestObject('Object Repository/Multi KK/svg_SEVA Dropdown Icon'))

'karyawan swasta'
WebUI.click(findTestObject('Multi KK/div_Karyawan Swasta', [('pekerjaan') : pekerjaan]))

'kode referral field'
WebUI.setText(findTestObject('Object Repository/Multi KK/div_Kode Referral Teman SEVA (Opsional)_inp_97a83d'), kode_referral)

WebUI.click(findTestObject('Multi KK/check-snk'))

'button lihat rekomendasi mobil'
WebUI.click(findTestObject('Object Repository/Multi KK/button_Lihat Rekomendasi Mobil (1)'))

WebUI.click(findTestObject('Page_SEVA - Beli Mobil Terbaru Dengan Cicilan Kredit Terbaik/close_icon_pop_up_login'), FailureHandling.STOP_ON_FAILURE)

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

