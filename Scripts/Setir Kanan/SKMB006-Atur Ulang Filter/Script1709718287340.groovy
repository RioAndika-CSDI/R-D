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
        , ('url_skmb001') : url_skmb001, ('brand') : brand, ('tahun') : tahun, ('transmisi') : transmisi, ('plat') : plat
        , ('lokasi') : lokasi, ('kilometer') : kilometer, ('harga') : harga, ('navigateFilter_tambahan') : '', ('screen') : ''], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Homepage Component/button_Terapkan Filter'))
}

WebUI.waitForElementPresent(findTestObject('Page Mobil Bekas/button_Filter Setelah Filter'), 0)

WebUI.click(findTestObject('Page Mobil Bekas/button_Filter Setelah Filter'))

WebUI.waitForElementPresent(findTestObject('Page Mobil Bekas/Filter/button_Atur Ulang'), 0)

WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/button_Atur Ulang'), 0)

WebUI.click(findTestObject('Object Repository/Page Mobil Bekas/Filter/button_Atur Ulang'))

'--Bagian Merek/Brand--'
WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Merek Mobil'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page Mobil Bekas/Filter/selectItem_Brand selected_1st'), 0)

'--Bagian Tahun--'
WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Tahun Mobil'), 0)

if (tahun.toString().length() > 0) {
    String tahunDari = WebUI.getAttribute(findTestObject('Page Mobil Bekas/Filter/Input_Tahun Dari Filter'), 'value')

    String tahunHingga = WebUI.getAttribute(findTestObject('Page Mobil Bekas/Filter/Input_Tahun Hingga Filter'), 'value')

    String[] tahunInput = tahun.toString().trim().split('-')

    WebUI.verifyGreaterThan(Integer.parseInt(tahunInput[0]), Integer.parseInt(tahunDari))

    WebUI.verifyLessThan(Integer.parseInt(tahunInput[1]), Integer.parseInt(tahunHingga))
}

'--Bagian Transmisi--'
WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Transmisi'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page Mobil Bekas/Filter/SelectItem_Selected Transmisi 1st'), 0)

'--Bagian Plat--'
WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Plat Nomor'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page Mobil Bekas/Filter/SelectItem_Selected Plat 1st'), 0)

'--Bagian Lokasi--'
WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Lokasi Mobil'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page Mobil Bekas/Filter/SelectItem_Lokasi Selected 1st'), 0)

'--Bagian Kilometer--'
WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Kilometer'), 0)

if (kilometer.toString().length() > 0) {
    kmMin = WebUI.getAttribute(findTestObject('Page Mobil Bekas/Filter/Input_Kilometer Minimal'), 'value')

    kmMax = WebUI.getAttribute(findTestObject('Page Mobil Bekas/Filter/Input_Kilometer Maksimal'), 'value')

    String[] inputKM = kilometer.toString().split('-')

    WebUI.verifyGreaterThan(Integer.parseInt((inputKM[0]).replaceAll('[^0-9]', '')), Integer.parseInt(kmMin.replaceAll('[^0-9]', 
                '')))

    WebUI.verifyLessThan(Integer.parseInt((inputKM[1]).replaceAll('[^0-9]', '')), Integer.parseInt(kmMax.replaceAll('[^0-9]', 
                '')))
}

'--Bagian Kisaran Harga--'
WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Kisaran Harga'), 0)

if (harga.toString().length() > 0) {
    hargaMin = WebUI.getAttribute(findTestObject('Page Mobil Bekas/Filter/Input_Harga Minimal'), 'value')

    hargaMax = WebUI.getAttribute(findTestObject('Page Mobil Bekas/Filter/Input_Harga Maksimal'), 'value')

    String[] inputHarga = harga.toString().split('-')

    WebUI.verifyGreaterThan(Integer.parseInt((inputHarga[0]).replaceAll('[^0-9]', '')), Integer.parseInt(hargaMin.replaceAll(
                '[^0-9]', '')))

    WebUI.verifyLessThan(Integer.parseInt((inputHarga[1]).replaceAll('[^0-9]', '')), Integer.parseInt(hargaMax.replaceAll(
                '[^0-9]', '')))
}

if (close_browser.toString().equals('1')) {
    WebUI.click(findTestObject('Homepage Component/button_Terapkan Filter'))

    WebUI.waitForElementPresent(findTestObject('Page Mobil Bekas/button_Filter'), 0)

    WebUI.verifyElementNotPresent(findTestObject('Page Mobil Bekas/Navigator_Filter 1st'), 0)

    WebUI.closeBrowser()
}

