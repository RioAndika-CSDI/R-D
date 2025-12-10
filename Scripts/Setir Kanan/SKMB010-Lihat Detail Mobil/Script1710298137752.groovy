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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

if (open_browser.toString().equals('1')) {
    WebUI.callTestCase(findTestCase('Setir Kanan/SKMB002-Membuka Halaman Mobil Bekas Melalui Icon Hamburger'), [('expected_url') : expected_url
            , ('open_browser') : '1', ('close_browser') : '0'], FailureHandling.STOP_ON_FAILURE)
}

// --- Cari semua Card Title Mobil ---
List<WebElement> listTitle = WebUiCommonHelper.findWebElements(findTestObject('Page Mobil Bekas/label_Title Card Mobil', 
        [('id') : 1]), 10)

int totalTitle = listTitle.size()

WebUI.comment('Total card title ditemukan: ' + totalTitle)

if (totalTitle == 0) {
    KeywordUtil.markFailed('❌ Tidak ada card title mobil ditemukan')
}

// --- Pilih random card (dijamin tidak out of range) ---
Random rand = new Random()

int randomNumber = rand.nextInt(totalTitle) + 1

boolean cekElement = false

for (int i = 0; i < 3; i++) {
    cekElement = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Page Mobil Bekas/label_Title Card Mobil', 
            [('id') : randomNumber]), 1)

    if (cekElement) {
        break
    }
    
    randomNumber = (rand.nextInt(totalTitle) + 1)
}

WebUI.comment('🎲 Random card ke: ' + randomNumber)

// --- Ambil informasi Card ---
TestObject titleObj = findTestObject('Page Mobil Bekas/label_Title Card Mobil', [('id') : randomNumber])

String title_card = WebUI.getText(titleObj)

// --- Lokasi ---
List<WebElement> listLokasi = WebUiCommonHelper.findWebElements(findTestObject('Page Mobil Bekas/label_Card Mobil Lokasi', 
        [('id') : 1]), 10)

int totalLokasi = listLokasi.size()

int randomLokasi = rand.nextInt(totalLokasi) + 1

TestObject lokasiObj = findTestObject('Page Mobil Bekas/label_Card Mobil Lokasi', [('id') : randomLokasi])

WebUI.scrollToElement(lokasiObj, 10)

String lokasi_card = WebUI.getText(lokasiObj)

KeywordUtil.logInfo(" Lokasi random card ke-$randomLokasi: $lokasi_card")

// --- Harga ---
List<WebElement> listHarga = WebUiCommonHelper.findWebElements(findTestObject('Page Mobil Bekas/label_Harga Mobil Bekas', 
        [('id') : 1]), 10)

int totalHarga = listHarga.size()

int randomHarga = rand.nextInt(totalHarga) + 1

TestObject hargaObj = findTestObject('Page Mobil Bekas/label_Harga Mobil Bekas', [('id') : randomHarga])

WebUI.scrollToElement(hargaObj, 10)

String harga_card = WebUI.getText(hargaObj)

KeywordUtil.logInfo(" Harga random card ke-$randomHarga: $harga_card")

// --- Klik card untuk masuk ke detail ---
WebUI.enhancedClick(titleObj)

WebUI.delay(17)

WebUI.comment('CARD MOBIL DIPILIH')

WebUI.comment("Title : $title_card | Lokasi : $lokasi_card | Harga : $harga_card")

// --- Ambil data detail mobil ---
String title_detail = WebUI.getText(findTestObject('Page Detail Mobil/label_Title Mobil'))

String title_harga = WebUI.getText(findTestObject('Page Detail Mobil/label_Harga Mobil'))

WebUI.delay(5 // kasih waktu load
    )

String title_lokasi = WebUI.getText(findTestObject('Page Detail Mobil/label_Lokasi Mobil'))

String tahun_info = WebUI.getText(findTestObject('Page Detail Mobil/label_Tahun Mobil_Informasi Mobil'))

String wrna_info = WebUI.getText(findTestObject('Page Detail Mobil/label_Warna Mobil_Informasi Mobil'))

String lokasi_info = WebUI.getText(findTestObject('Page Detail Mobil/label_Lokasi Mobil_Informasi Mobil'))

String plat_info = WebUI.getText(findTestObject('Page Detail Mobil/label_Plat Mobil_Informasi Mobil'))

String stnk_info = WebUI.getText(findTestObject('Page Detail Mobil/label_STNK Mobil_Informasi Mobil'))

// --- Verifikasi Title ---
String normalized_card   = (title_card   != null) ? title_card.replace(",00", "").trim()   : ""
String normalized_detail = (title_detail != null) ? title_detail.replace(",00", "").trim() : ""

// Validasi hasil
if (!normalized_card.isEmpty() && !normalized_detail.isEmpty()) {
    if (normalized_card.equalsIgnoreCase(normalized_detail)) {
        KeywordUtil.markPassed("✅ Title matches: " + normalized_detail)
    } else {
        KeywordUtil.markFailed("❌ Title mismatch! Card: " + normalized_card + ", Detail: " + normalized_detail)
    }
} else {
    KeywordUtil.markWarning("⚠️ Salah satu title kosong → Card: '" + normalized_card + "', Detail: '" + normalized_detail + "'")
}

// --- Verifikasi elemen lain ---
WebUI.verifyElementPresent(findTestObject('Page Detail Mobil/SubMenu_Deskripsi'), 0)

WebUI.verifyElementPresent(findTestObject('Page Detail Mobil/SubMenu_Kredit'), 0)

WebUI.verifyElementPresent(findTestObject('Page Detail Mobil/label_Informasi Mobil'), 0)

WebUI.verifyElementPresent(findTestObject('Page Detail Mobil/label_Title Tanyakan Unit'), 0)

WebUI.verifyGreaterThan(wrna_info.length(), 0)

WebUI.verifyGreaterThan(plat_info.length(), 0)

WebUI.verifyGreaterThan(stnk_info.length(), 0)

// --- Tahun info aman ---
if ((tahun_info != null) && (tahun_info.length() >= 4)) {
    tahun_info = tahun_info.substring(tahun_info.length() - 4)

    WebUI.comment("Tahun Mobil: $tahun_info")
} else {
    KeywordUtil.markWarning("Data tahun mobil tidak valid: '$tahun_info'")

    tahun_info = ''
}

// --- Log detail ---
WebUI.comment("Detail Mobil: Title: $title_detail | Lokasi: $title_lokasi | Harga: $title_harga | Tahun: $tahun_info")

