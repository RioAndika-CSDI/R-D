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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.seva.id/')

WebUI.scrollToElement(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/button_cari_mobil'), 
    0)

/**
CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

aslFrame = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Homepage Component/Frame_ASL'), 
    15)

if (aslFrame == true) {
    WebUI.switchToFrame(findTestObject('Homepage Component/Frame_ASL'), 0)

    WebUI.click(findTestObject('Homepage Component/Close_ASL_Banner'))

    WebUI.switchToWindowIndex(0)
}

sakuFrame = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Homepage Component/Frame_Promo Bank Saku'), 
    15)

if (sakuFrame == true) {
    WebUI.switchToFrame(findTestObject('Homepage Component/Frame_Promo Bank Saku'), 0)

    WebUI.click(findTestObject('Homepage - Burger menu/Bank saqu iklan'))

    WebUI.switchToWindowIndex(0)
}

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

**/
CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

aslFrame = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Homepage Component/Frame_ASL'), 
    15)

if (aslFrame == true) {
    WebUI.switchToFrame(findTestObject('Homepage Component/Frame_ASL'), 0)

    WebUI.click(findTestObject('Homepage Component/Close_ASL_Banner'))

    WebUI.switchToWindowIndex(0)
}

sakuFrame = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Homepage Component/Frame_Promo Bank Saku'), 
    15)

if (sakuFrame == true) {
    WebUI.switchToFrame(findTestObject('Homepage Component/Frame_Promo Bank Saku'), 0)

    WebUI.click(findTestObject('Homepage - Burger menu/Bank saqu iklan'))

    WebUI.switchToWindowIndex(0)
}

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(10)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

WebUI.waitForElementNotPresent(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'), 5)

if (WebUI.verifyElementPresent(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'), 
    5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))
}

WebUI.click(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/button_cari_mobil'))

WebUI.waitForElementPresent(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/label_car_name_plp', 
        [('id') : '1']), 120)

int temp = 1

for (int i = 1; i <= 3; i++) {
    get_car_name = WebUI.getText(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/label_car_name_plp', 
            [('id') : i]))

    if (car_name.toString().equalsIgnoreCase(get_car_name)) {
        temp = i

        WebUI.comment(get_car_name)
    }
}

WebUI.comment(temp.toString())

WebUI.scrollToElement(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/label_car_name_plp', 
        [('id') : temp]), 0)

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(10)

WebUI.click(findTestObject('Page_Beli Mobil Baru 2024 - Harga OTR dengan Promo Cicilan Bulan Oktober  SEVA/span_Lihat Detail_plp', 
        [('id') : temp]))

WebUI.click(findTestObject('Page_Daihatsu All New Ayla 2024 - Spesifikasi, Harga OTR dan Simulasi Cicilan  SEVA/button_Hitung Kemampuan_pdp'))

//WebUI.scrollToElement(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Rekomendasi Cicilan Ideal_0 input_inp_acd316'), 0)
WebUI.setText(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Rekomendasi Cicilan Ideal_0 input_inp_acd316'), 
    'Rp20.000.000')

WebUI.click(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/dropdown kategori umur pdp'))

WebUI.click(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/div_18-27'))

//WebUI.click(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/circle'))
//
//WebUI.click(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Rekomendasi Cicilan Ideal_inputSelect_f8ef70'))
//
//WebUI.click(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/div_18-27'))
WebUI.click(findTestObject('Page_Simulasi Kredit Mobil Daihatsu Sigra 2024 OTR Jakarta Pusat. Promo Oktober  SEVA/button_Hitung Kemampuan_pdp'))

WebUI.closeBrowser()

