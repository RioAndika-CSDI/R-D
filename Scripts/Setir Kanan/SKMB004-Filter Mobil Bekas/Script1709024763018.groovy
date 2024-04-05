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
    WebUI.callTestCase(findTestCase('Setir Kanan/SKMB001-Search Widget Mobil Bekas'), [('expected_url') : url_skmb001, ('open_browser') : '1'
            , ('close_browser') : '0'], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Page Mobil Bekas/button_Filter'))
}

String navigateFilter = navigateFilter_tambahan.toString()

WebUI.waitForElementPresent(findTestObject('Homepage Component/button_Terapkan Filter'), 0)

'--Bagian Pilih Brand--'
if (brand.toString().length() > 0) {
    WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Merek Mobil'), 0)

    String[] brandMobil = brand.toString().split(';')

    for (int i = 0; i < brandMobil.length; i++) {
        navigateFilter = ((navigateFilter + ';') + (brandMobil[i]))

        WebUI.click(findTestObject('Homepage Component/selectItem_Brand unselected', [('brand') : brandMobil[i]]))

        WebUI.verifyElementPresent(findTestObject('Homepage Component/selectItem_Brand selected', [('brand') : brandMobil[
                    i]]), 5)
    }
}

'--Bagian Pilih Tahun--'
if (tahun.toString().length() > 0) {
    WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Tahun Mobil'), 0)

    String[] tahunPilih = tahun.toString().split('-')

    int cek_tahun = 0

    dari = WebUI.getText(findTestObject('Page Mobil Bekas/Filter/label_Batas Bawah Tahun Filter'))

    hingga = WebUI.getText(findTestObject('Page Mobil Bekas/Filter/label_Batas Atas Tahun Filter'))

    WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/Input_Tahun Dari Filter'), 0)

    if (Integer.parseInt((tahunPilih[0]).trim()) > Integer.parseInt(dari.trim())) {
        cek_tahun = 1

        WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/Input_Tahun Dari Filter'), 0)

        WebUI.doubleClick(findTestObject('Page Mobil Bekas/Filter/Input_Tahun Dari Filter'))

        WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Tahun Dari Filter'), (tahunPilih[0]).trim())
    }
    
    if (Integer.parseInt((tahunPilih[1]).trim()) < Integer.parseInt(hingga.trim())) {
        cek_tahun = 1

        WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/Input_Tahun Dari Filter'), 0)

        WebUI.doubleClick(findTestObject('Page Mobil Bekas/Filter/Input_Tahun Hingga Filter'))

        WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Tahun Hingga Filter'), tahunPilih[1])
    }
    
    if (cek_tahun == 1) {
        navigateFilter = ((((navigateFilter + ';') + (tahunPilih[0])) + ' -') + (tahunPilih[1]))
    }
}

'--Bagian Pilih Transmisi--'
if (transmisi.toString().length() > 0) {
    WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Transmisi'), 0)

    String[] pilihTransmisi = transmisi.toString().split(';')

    for (int i = 0; i < pilihTransmisi.length; i++) {
        WebUI.click(findTestObject('Page Mobil Bekas/Filter/SelectItem_Transmisi Unselected Filter', [('transmisi') : pilihTransmisi[
                    i]]))

        WebUI.verifyElementPresent(findTestObject('Page Mobil Bekas/Filter/SelectItem_Transmisi Selected Filter', [('transmisi') : pilihTransmisi[
                    i]]), 0)

        navigateFilter = ((navigateFilter + ';') + (pilihTransmisi[i]))
    }
}

'--Bagian Pilih Plat Nomor--'
if (plat.toString().length() > 0) {
    WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Plat Nomor'), 0)

    String[] pilihPlat = plat.toString().split(';')

    for (int i = 0; i < pilihPlat.length; i++) {
        WebUI.click(findTestObject('Page Mobil Bekas/Filter/SelectItem_Plat Nomor Unselected Filter', [('plat') : pilihPlat[
                    i]]))

        WebUI.verifyElementPresent(findTestObject('Page Mobil Bekas/Filter/SelectItem_Plat Selected Filter', [('plat') : pilihPlat[
                    i]]), 0)

        navigateFilter = ((navigateFilter + ';') + (pilihPlat[i]))
    }
}

String ambilBranSearch = ''

'--Bagian Untuk Search Lokasi--'
if (lokasi.toString().length() > 0) {
    String[] lokasiMobil = lokasi.toString().split(';')

    WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Lokasi Mobil'), 0)

    WebUI.click(findTestObject('Page Mobil Bekas/Filter/Input_Lokasi'))

    for (int i = 0; i < lokasiMobil.length; i++) {
        WebUI.setText(findTestObject('Homepage Component/Input_Search Model Mobil Bekas'), lokasiMobil[i])

        WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Lokasi Mobil'), 0)

        ambilLokasi = WebUI.getText(findTestObject('Homepage Component/SelectItem_Model'))

        WebUI.click(findTestObject('Homepage Component/SelectItem_Model'))

        (lokasiMobil[i]) = ambilLokasi

        navigateFilter = ((navigateFilter + ';') + (lokasiMobil[i]))
    }
    
    WebUI.click(findTestObject('Page Mobil Bekas/Filter/label_Lokasi Mobil'))
}

'--Bagian Pilih Kilometer--'
if (kilometer.toString().length() > 0) {
    WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Kilometer'), 0)

    String[] kilometerPilih = kilometer.toString().split('-')

    int cek_kilometer = 0

    minimal = WebUI.getText(findTestObject('Page Mobil Bekas/Filter/label_Batas Bawah Kilometer'))

    minimal = minimal.replaceAll('[^0-9]', '')

    maksimal = WebUI.getText(findTestObject('Page Mobil Bekas/Filter/label_Batas Atas Kilometer'))

    maksimal = maksimal.replaceAll('[^0-9]', '')

    WebUI.comment((minimal.toString() + ' ') + maksimal)

    if (Integer.parseInt((kilometerPilih[0]).replaceAll('[^0-9]', '')) > Integer.parseInt(minimal.trim())) {
        cek_kilometer = 1

        WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Kilometer'), 0)

        if ((os[0]).equalsIgnoreCase('Windows') || (os[0]).equalsIgnoreCase('Linux')) {
            WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Kilometer Minimal'), Keys.chord(Keys.CONTROL, 'A'))
        } else {
            WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Kilometer Minimal'), Keys.chord(Keys.COMMAND, 'A'))
        }
        
        WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Kilometer'), 0)

        WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Kilometer Minimal'), (kilometerPilih[0]).trim())

        WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Kilometer'), 0)
    }
    
    if (Integer.parseInt((kilometerPilih[1]).replaceAll('[^0-9]', '')) < Integer.parseInt(maksimal.trim())) {
        cek_kilometer = 1

        WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Kilometer'), 0)

        if ((os[0]).equalsIgnoreCase('Windows') || (os[0]).equalsIgnoreCase('Linux')) {
            WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Kilometer Maksimal'), Keys.chord(Keys.CONTROL, 
                    'A'))
        } else {
            WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Kilometer Maksimal'), Keys.chord(Keys.COMMAND, 
                    'A'))
        }
        
        WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Kilometer'), 0)

        WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Kilometer Maksimal'), kilometerPilih[1])

        WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Kilometer'), 0)
    }
    
    if (cek_kilometer == 1) {
        navigateFilter = ((((((navigateFilter + ';') + (kilometerPilih[0])) + 'km') + ' - ') + (kilometerPilih[1])) + 'km')
    }
}

'--Bagian Pilih harga--'
if (harga.toString().length() > 0) {
    WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Kisaran Harga'), 0)

    String[] hargaPilih = harga.toString().split('-')

    int cek_harga = 0

    minimal = WebUI.getText(findTestObject('Page Mobil Bekas/Filter/label_Harga Minimum'))

    minimal = minimal.replaceAll('[^0-9]', '')

    maksimal = WebUI.getText(findTestObject('Page Mobil Bekas/Filter/label_Harga Maksimum'))

    maksimal = maksimal.replaceAll('[^0-9]', '')

    WebUI.comment((minimal.toString() + ' ') + maksimal)

    if (Integer.parseInt((hargaPilih[0]).replaceAll('[^0-9]', '')) > Integer.parseInt(minimal.trim())) {
        cek_harga = 1

        WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Kisaran Harga'), 0)

        if ((os[0]).equalsIgnoreCase('Windows') || (os[0]).equalsIgnoreCase('Linux')) {
            WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Harga Minimal'), Keys.chord(Keys.CONTROL, 'A'))
        } else {
            WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Harga Minimal'), Keys.chord(Keys.COMMAND, 'A'))
        }
        
        WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Kisaran Harga'), 0)

        WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Harga Minimal'), (hargaPilih[0]).trim())

        WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Kisaran Harga'), 0)
    }
    
    if (Integer.parseInt((hargaPilih[1]).replaceAll('[^0-9]', '')) < Integer.parseInt(maksimal.trim())) {
        cek_harga = 1

        WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Kisaran Harga'), 0)

        if ((os[0]).equalsIgnoreCase('Windows') || (os[0]).equalsIgnoreCase('Linux')) {
            WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Harga Maksimal'), Keys.chord(Keys.CONTROL, 'A'))
        } else {
            WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Harga Maksimal'), Keys.chord(Keys.COMMAND, 'A'))
        }
        
        WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Kisaran Harga'), 0)

        WebUI.sendKeys(findTestObject('Page Mobil Bekas/Filter/Input_Harga Maksimal'), hargaPilih[1])

        WebUI.scrollToElement(findTestObject('Page Mobil Bekas/Filter/label_Kisaran Harga'), 0)
    }
    
    if (cek_harga == 1) {
        navigateFilter = (((((navigateFilter + ';') + 'Rp') + (hargaPilih[0])) + ' - Rp') + (hargaPilih[1]))
    }
}

if (close_browser.toString().equals('1')) {
    WebUI.comment(navigateFilter)

    WebUI.click(findTestObject('Homepage Component/button_Terapkan Filter'))

    String[] filter = navigateFilter.split(';')

    for (int i = 0; i < filter.length; i++) {
        if ((filter[i]).length() > 0) {
        }
        
        WebUI.verifyElementPresent(findTestObject('Page Mobil Bekas/Navigator_Filter', [('filter') : filter[i]]), 0)
    }
    
    boolean cek_card = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Page Mobil Bekas/Card_Card Mobil 1st'), 
        1)

    if (cek_card == true) {
        WebUI.verifyElementPresent(findTestObject('Page Mobil Bekas/Card_Card Mobil 1st'), 0)

        WebUI.verifyElementNotPresent(findTestObject('Page Mobil Bekas/label_Tidak ada Mobil Ditemukan'), 0)
    } else {
        WebUI.verifyElementPresent(findTestObject('Page Mobil Bekas/label_Tidak ada Mobil Ditemukan'), 1)

        WebUI.verifyElementNotPresent(findTestObject('Page Mobil Bekas/Card_Card Mobil 1st'), 0)
    }
    
    WebUI.scrollToPosition(0, 0)

    WebUI.takeScreenshotAsCheckpoint('cekdata' + screen.toString())

    WebUI.closeBrowser()
}

