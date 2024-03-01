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
    WebUI.openBrowser('seva.id')

    WebUI.setViewPortSize(500, 1000)
}

WebUI.scrollToElement(findTestObject('Homepage - PLP/Submenu_Mobil Bekas'), 0)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

WebUI.click(findTestObject('Homepage - PLP/Submenu_Mobil Bekas'))

String ambilBranSearch = ''

String navigateFilter = ''

'--Bagian Untuk Search--'
if (model.toString().length() > 0) {
    String[] modelMobil = model.toString().split(';')

    WebUI.click(findTestObject('Homepage Component/Input_Search Model Mobil Bekas'))

    for (int i = 0; i < modelMobil.length; i++) {
        WebUI.setText(findTestObject('Homepage Component/Input_Search Model Mobil Bekas'), modelMobil[i])

        WebUI.click(findTestObject('Homepage Component/SelectItem_Model'))

        ambilModel = WebUI.getText(findTestObject('Homepage Component/SelectItem_Model'))

        (modelMobil[i]) = ambilModel

        String[] brandSearch = (modelMobil[i]).split(' ')

        ambilBranSearch = ((ambilBranSearch + ' ') + (brandSearch[0]))

        navigateFilter = ((navigateFilter + ';') + (modelMobil[i]))
    }
    
    '--Bagian Untuk Mengambil Brand Dari Search--'
    ambilBranSearch = ambilBranSearch.trim()

    if (!(ambilBranSearch.equals(''))) {
        String bantu = ''

        String cek = ambilBranSearch.replaceAll(' ', '')

        while (!(cek.equals(''))) {
            ambilBranSearch = ambilBranSearch.trim()

            String[] ambil = ambilBranSearch.split(' ')

            bantu = ((bantu + ' ') + (ambil[0]))

            ambilBranSearch = ambilBranSearch.replaceAll((ambil[0]).trim(), '')

            cek = ambilBranSearch.replaceAll(' ', '')
        }
        
        ambilBranSearch = bantu.trim()
    }
    
    WebUI.click(findTestObject('Homepage - PLP/Submenu_Mobil Bekas'))
}

'--Bagian Pilih Brand--'
if (brand.toString().length() > 0) {
    WebUI.click(findTestObject('Homepage Component/Title_Brand Mobil Bekas'))

    WebUI.waitForElementPresent(findTestObject('Homepage Component/button_Terapkan Filter'), 0)

    String[] brandMobil = brand.toString().split(';')

    for (int i = 0; i < brandMobil.length; i++) {
        navigateFilter = ((navigateFilter + ';') + (brandMobil[i]))

        boolean cek = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Homepage Component/selectItem_Brand selected', 
                [('brand') : brandMobil[i]]), 1)

        if (cek == false) {
            WebUI.click(findTestObject('Homepage Component/selectItem_Brand unselected', [('brand') : brandMobil[i]]))

            WebUI.verifyElementPresent(findTestObject('Homepage Component/selectItem_Brand selected', [('brand') : brandMobil[
                        i]]), 5)
        }
    }
    
    WebUI.click(findTestObject('Homepage Component/button_Terapkan Filter'))
}

'--Bagian Pilih Tahun--'
if (tahun.toString().length() > 0) {
    String[] tahunPilih = tahun.toString().split('-')

    int cek_tahun = 0

    WebUI.click(findTestObject('Homepage Component/Title_Tahun'))

    WebUI.waitForElementPresent(findTestObject('Homepage Component/button_Terapkan Filter'), 0)

    dari = WebUI.getText(findTestObject('Homepage Component/label_Batas Bawah Tahuun'))

    hingga = WebUI.getText(findTestObject('Homepage Component/label_Batas Atas Tahun'))

    if (Integer.parseInt((tahunPilih[0]).trim()) > Integer.parseInt(dari.trim())) {
        cek_tahun = 1

        WebUI.doubleClick(findTestObject('Homepage Component/Input_Tahun Dari'))

        WebUI.sendKeys(findTestObject('Homepage Component/Input_Tahun Dari'), (tahunPilih[0]).trim())
    }
    
    if (Integer.parseInt((tahunPilih[1]).trim()) < Integer.parseInt(hingga.trim())) {
        cek_tahun = 1

        WebUI.doubleClick(findTestObject('Homepage Component/Input_Tahun Hingga'))

        WebUI.sendKeys(findTestObject('Homepage Component/Input_Tahun Hingga'), tahunPilih[1])
    }
    
    if (cek_tahun == 1) {
        navigateFilter = ((((navigateFilter + ';') + (tahunPilih[0])) + ' -') + (tahunPilih[1]))
    }
    
    WebUI.click(findTestObject('Homepage Component/button_Terapkan Filter'), FailureHandling.STOP_ON_FAILURE)
}

'--Bagian Pilih Transmisi--'
if (transmisi.toString().length() > 0) {
    WebUI.click(findTestObject('Homepage Component/Title_Transmisi'))

    WebUI.waitForElementPresent(findTestObject('Homepage Component/button_Terapkan Filter'), 0)

    String[] pilihTransmisi = transmisi.toString().split(';')

    for (int i = 0; i < pilihTransmisi.length; i++) {
        WebUI.click(findTestObject('Homepage Component/SelectItem_Transmisi_unselected', [('transmisi') : pilihTransmisi[
                    i]]))

        WebUI.verifyElementPresent(findTestObject('Homepage Component/SelectItem_Transmisi_selected', [('transmisi') : pilihTransmisi[
                    i]]), 0)

        navigateFilter = ((navigateFilter + ';') + (pilihTransmisi[i]))
    }
    
    WebUI.click(findTestObject('Homepage Component/button_Terapkan Filter'))
}

WebUI.click(findTestObject('Homepage - PLP/button_Cari Mobil Bekas'))

WebUI.waitForPageLoad(50)

WebUI.comment(navigateFilter)

String[] filter = navigateFilter.split(';')

for (int i = 0; i < filter.length; i++) {
    if ((filter[i]).length() > 0) {
    }
    
    WebUI.verifyElementPresent(findTestObject('Page Mobil Bekas/Navigator_Filter', [('filter') : filter[i]]), 0)
}

if (close_browser.toString().equals('1')) {
	
    WebUI.closeBrowser()
}

