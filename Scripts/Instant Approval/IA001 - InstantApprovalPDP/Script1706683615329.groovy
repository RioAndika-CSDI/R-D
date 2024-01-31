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

WebUI.click(findTestObject('PopUP/button_Nanti Saja'))

WebUI.click(findTestObject('PopUP/button_x'))

WebUI.setText(findTestObject('Object Repository/Homepage Component/Input City Selector'), 'Jakarta Pusat')

WebUI.click(findTestObject('Homepage Component/Select City List'))

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Cari Mobil Baru'))

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_Beli Mobil Baru 2024 - Harga OTR denga_550104/h2_Daihatsu New Ayla'))

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_Daihatsu New Ayla 2024 - Spesifikasi, _d9e7aa/h2_Kredit'))

WebUI.setText(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_Daihatsu New Ayla 2024 - Spesifikasi, _d9e7aa/input_Rekomendasi Cicilan Ideal_0 input_inp_acd316'), 
    'Rp999.999.999')

WebUI.setText(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_Daihatsu New Ayla 2024 - Spesifikasi, _d9e7aa/input_Rekomendasi Cicilan Ideal_inputSelect_f8ef70'), 
    '')

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_Daihatsu New Ayla 2024 - Spesifikasi, _d9e7aa/input_Rekomendasi Cicilan Ideal_inputSelect_f8ef70'))

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_Daihatsu New Ayla 2024 - Spesifikasi, _d9e7aa/span_18-27'))

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_Daihatsu New Ayla 2024 - Spesifikasi, _d9e7aa/button_Hitung Kemampuan'))

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_Daihatsu New Ayla 2024 - Spesifikasi, _d9e7aa/button_Cek Kualifikasi Kredit'))

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_Daihatsu New Ayla 2024 - Spesifikasi, _d9e7aa/button_Cek Kualifikasi Kredit'))

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_Daihatsu New Ayla 2024 - Spesifikasi, _d9e7aa/button_Cek Kualifikasi Kredit'))

WebUI.setText(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_Masuk Akun - SEVA/input_Selamat Datang di SEVA_inputPhone_inp_4fd0c0'), 
    '81225717129')

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_Masuk Akun - SEVA/button_Lanjutkan'))

WebUI.setText(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_Masuk Akun - SEVA/input_Verifikasi Nomor Kamu_false otp_otpIn_7f5bb0'), 
    '6')

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Sumber Pendapatan_inputSelect_inputFi_f08c6c'))

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/span_Karyawan Swasta'))

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/button_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/button_Cek Kualifikasi Kredit'))

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/button_Lanjut Instant Approval'))

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/rect'))

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/button_ACC (Astra Credit Companies)'))

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/button_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApprovalPDP/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/button_Ajukan Instant Approval'))

WebUI.closeBrowser()

