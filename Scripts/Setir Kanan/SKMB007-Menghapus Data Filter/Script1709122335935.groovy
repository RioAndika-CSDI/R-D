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

if (open_browser.toString().equals('1')) {
    WebUI.callTestCase(findTestCase('Setir Kanan/SKMB004-Filter Mobil Bekas'), [('open_browser') : '1', ('close_browser') : '0'
            , ('url_skmb001') : url_skmb001_Filter, ('brand') : brand_Filter, ('tahun') : tahun_Filter, ('transmisi') : transmisi_Filter
            , ('plat') : plat_Filter, ('lokasi') : lokasi_Filter, ('kilometer') : kilometer_Filter, ('harga') : harga_Filter], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Homepage Component/button_Terapkan Filter'))

    WebUI.click(findTestObject('Page Mobil Bekas/button_Filter Setelah Filter'))
}

'--Bagian Merek/Brand--'
WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Merek Mobil'), 0)

boolean cekBrand = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Page Mobil Bekas/Filter/selectItem_Brand selected_1st'), 
    1)

String[] jumlahBrand = brand_Filter.toString().split(';')

int loop = 0

while ((cekBrand == true) && ((jumlahBrand.length + 1) > loop)) {
    WebUI.click(findTestObject('Page Mobil Bekas/Filter/selectItem_Brand selected_1st'))

    cekBrand = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Page Mobil Bekas/Filter/selectItem_Brand selected_1st'), 
        1)

    if (cekBrand == false) {
        break
    }
    
    loop = (loop + 1)
}

WebUI.verifyElementNotPresent(findTestObject('Page Mobil Bekas/Filter/selectItem_Brand selected_1st'), 0)

'--Bagian Tahun--'
WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Tahun Mobil'), 0)

WebUI.doubleClick(findTestObject('Page Mobil Bekas/Filter/Input_Tahun Dari Filter'))

WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Tahun Dari Filter'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Page Mobil Bekas/Filter/label_Tahun Mobil'))

WebUI.doubleClick(findTestObject('Page Mobil Bekas/Filter/Input_Tahun Hingga Filter'))

WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Tahun Hingga Filter'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Page Mobil Bekas/Filter/label_Tahun Mobil'))

if (tahun_Filter.toString().length() > 0) {
    String tahunDari = WebUI.getAttribute(findTestObject('Page Mobil Bekas/Filter/Input_Tahun Dari Filter'), 'value')

    String tahunHingga = WebUI.getAttribute(findTestObject('Page Mobil Bekas/Filter/Input_Tahun Hingga Filter'), 'value')

    String[] tahunInput = tahun_Filter.toString().trim().split('-')

    WebUI.verifyGreaterThan(Integer.parseInt(tahunInput[0]), Integer.parseInt(tahunDari))

    WebUI.verifyLessThan(Integer.parseInt(tahunInput[1]), Integer.parseInt(tahunHingga))
}

'--Bagian Transmisi--'
WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Transmisi'), 0)

String[] transmisiInput = transmisi_Filter.toString().trim().split(';')

boolean cekTransmisi = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Page Mobil Bekas/Filter/SelectItem_Selected Transmisi 1st'), 
    1)

loop = 0

while ((cekTransmisi == true) && (transmisiInput.length > loop)) {
    WebUI.click(findTestObject('Page Mobil Bekas/Filter/SelectItem_Selected Transmisi 1st'))

    cekTransmisi = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Page Mobil Bekas/Filter/SelectItem_Selected Transmisi 1st'), 
        1)

    if (cekTransmisi == false) {
        break
    }
    
    loop = (loop + 1)
}

WebUI.verifyElementNotPresent(findTestObject('Page Mobil Bekas/Filter/SelectItem_Selected Transmisi 1st'), 0)

'--Bagian Plat--'
WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Plat Nomor'), 0)

String[] platInput = plat_Filter.toString().trim().split(';')

boolean cekPlat = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Page Mobil Bekas/Filter/SelectItem_Selected Plat 1st'), 
    1)

loop = 0

while ((cekPlat == true) && (platInput.length > loop)) {
    WebUI.click(findTestObject('Page Mobil Bekas/Filter/SelectItem_Selected Plat 1st'))

    cekPlat = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Page Mobil Bekas/Filter/SelectItem_Selected Plat 1st'), 
        1)

    if (cekPlat == false) {
        break
    }
    
    loop = (loop + 1)
}

WebUI.verifyElementNotPresent(findTestObject('Page Mobil Bekas/Filter/SelectItem_Selected Plat 1st'), 0)

'--Bagian Lokasi--'
WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Lokasi Mobil'), 0)

WebUI.click(findTestObject('Page Mobil Bekas/Filter/Input_Lokasi'))

WebUI.click(findTestObject('Page Mobil Bekas/Filter/ACT_Hapus Pilihan Lokasi'))

WebUI.click(findTestObject('Page Mobil Bekas/Filter/label_Lokasi Mobil'))

WebUI.verifyElementNotPresent(findTestObject('Page Mobil Bekas/Filter/SelectItem_Lokasi Selected 1st'), 0)

'--Bagian Kilometer--'
WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Kilometer'), 0)

WebUI.doubleClick(findTestObject('Page Mobil Bekas/Filter/Input_Kilometer Minimal'))

WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Kilometer Minimal'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Page Mobil Bekas/Filter/label_Kisaran Harga'))

WebUI.doubleClick(findTestObject('Page Mobil Bekas/Filter/Input_Kilometer Maksimal'))

WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Kilometer Maksimal'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Page Mobil Bekas/Filter/label_Kisaran Harga'))

if (kilometer_Filter.toString().length() > 0) {
    kmMin = WebUI.getAttribute(findTestObject('Page Mobil Bekas/Filter/Input_Kilometer Minimal'), 'value')

    kmMax = WebUI.getAttribute(findTestObject('Page Mobil Bekas/Filter/Input_Kilometer Maksimal'), 'value')

    String[] inputKM = kilometer_Filter.toString().split('-')

    WebUI.verifyGreaterThan(Integer.parseInt((inputKM[0]).replaceAll('[^0-9]', '')), Integer.parseInt(kmMin.replaceAll('[^0-9]', 
                '')))

    WebUI.verifyLessThan(Integer.parseInt((inputKM[1]).replaceAll('[^0-9]', '')), Integer.parseInt(kmMax.replaceAll('[^0-9]', 
                '')))
}

'--Bagian Kisaran Harga--'
WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Kisaran Harga'), 0)

WebUI.doubleClick(findTestObject('Page Mobil Bekas/Filter/Input_Harga Minimal'))

WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Harga Minimal'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Page Mobil Bekas/Filter/label_Kisaran Harga'))

WebUI.doubleClick(findTestObject('Page Mobil Bekas/Filter/Input_Harga Maksimal'))

WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Harga Maksimal'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Page Mobil Bekas/Filter/label_Kisaran Harga'))

if (harga_Filter.toString().length() > 0) {
    hargaMin = WebUI.getAttribute(findTestObject('Page Mobil Bekas/Filter/Input_Harga Minimal'), 'value')

    hargaMax = WebUI.getAttribute(findTestObject('Page Mobil Bekas/Filter/Input_Harga Maksimal'), 'value')

    String[] inputHarga = harga_Filter.toString().split('-')

    WebUI.verifyGreaterThan(Integer.parseInt((inputHarga[0]).replaceAll('[^0-9]', '')), Integer.parseInt(hargaMin.replaceAll(
                '[^0-9]', '')))

    WebUI.verifyLessThan(Integer.parseInt((inputHarga[1]).replaceAll('[^0-9]', '')), Integer.parseInt(hargaMax.replaceAll(
                '[^0-9]', '')))
}

if (close_browser.toString().equals('1')) {
    WebUI.waitForElementNotPresent(findTestObject('Page Mobil Bekas/Filter/button_Terapkan Filter Disable'), 0)

    WebUI.click(findTestObject('Homepage Component/button_Terapkan Filter'))

    WebUI.waitForElementNotPresent(findTestObject('Homepage Component/button_Terapkan Filter'), 120)

    WebUI.verifyElementNotPresent(findTestObject('Page Mobil Bekas/Navigator_Filter 1st'), 0)
}

