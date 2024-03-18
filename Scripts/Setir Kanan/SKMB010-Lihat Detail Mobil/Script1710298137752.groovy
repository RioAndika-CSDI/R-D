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
    WebUI.callTestCase(findTestCase('Setir Kanan/SKMB002-Membuka Halaman Mobil Bekas Melalui Icon Hamburger'), [('expected_url') : expected_url
            , ('open_browser') : '1', ('close_browser') : '0'], FailureHandling.STOP_ON_FAILURE)
}

String randomNumber = '1'

for (int i = 0; i < 3; i++) {
    Random rand = new Random()

    randomNumber = (rand.nextInt(10) + 1).toString()

    boolean cekElement = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Page Mobil Bekas/label_Title Card Mobil', 
            [('id') : randomNumber]), 1)

    if (cekElement == true) {
        break
    } else {
        randomNumber = '1'
    }
}

WebUI.comment('Random Number : ' + randomNumber)

title_card = WebUI.getText(findTestObject('Page Mobil Bekas/label_Title Card Mobil', [('id') : randomNumber]))

lokasi_card = WebUI.getText(findTestObject('Page Mobil Bekas/label_Card Mobil Lokasi', [('id') : randomNumber]))

harga_card = WebUI.getText(findTestObject('Page Mobil Bekas/label_Harga Mobil Bekas', [('id') : randomNumber]))

kilometer_card = WebUI.getText(findTestObject('Page Mobil Bekas/Label_Card Mobil Kilommeter', [('id') : randomNumber]))

transmisi_card = WebUI.getText(findTestObject('Page Mobil Bekas/Label_Card Mobil Transmisi', [('id') : randomNumber]))

bahan_bakar_card = WebUI.getText(findTestObject('Page Mobil Bekas/Label_Card Mobil Bahan Bakar', [('id') : randomNumber]))

WebUI.click(findTestObject('Page Mobil Bekas/label_Title Card Mobil', [('id') : randomNumber]))

WebUI.comment('CARD MOBIL')

WebUI.comment(((((((((((' title       : ' + title_card) + '\n Lokasi      : ') + lokasi_card) + '\n Harga       : ') + harga_card) + 
    '\n Kilometer   : ') + kilometer_card) + '\n transmisi   : ') + transmisi_card) + '\n bahan_bakar : ') + bahan_bakar_card)

title_detail = WebUI.getText(findTestObject('Page Detail Mobil/label_Title Mobil'))

title_harga = WebUI.getText(findTestObject('Page Detail Mobil/label_Harga Mobil'))

title_lokasi = WebUI.getText(findTestObject('Page Detail Mobil/label_Lokasi Mobil'))

kilometer_info = WebUI.getText(findTestObject('Page Detail Mobil/label_Kilometer Mobil_Informasi Mobil'))

tahun_info = WebUI.getText(findTestObject('Page Detail Mobil/label_Tahun Mobil_Informasi Mobil'))

wrna_info = WebUI.getText(findTestObject('Page Detail Mobil/label_Warna Mobil_Informasi Mobil'))

transmisi_info = WebUI.getText(findTestObject('Page Detail Mobil/label_Transmisi_Informasi Mobil'))

lokasi_info = WebUI.getText(findTestObject('Page Detail Mobil/label_Lokasi Mobil_Informasi Mobil'))

plat_info = WebUI.getText(findTestObject('Page Detail Mobil/label_Plat Mobil_Informasi Mobil'))

stnk_info = WebUI.getText(findTestObject('Page Detail Mobil/label_STNK Mobil_Informasi Mobil'))

bahan_bakar_info = WebUI.getText(findTestObject('Page Detail Mobil/label_Bahan Bakar Mobil_Informasi Mobil'))

//Title
WebUI.verifyMatch(title_card, title_detail, true)

WebUI.verifyMatch(harga_card, title_harga, true)

WebUI.verifyMatch(lokasi_card, title_lokasi, true)

WebUI.verifyElementPresent(findTestObject('Page Detail Mobil/SubMenu_Deskripsi'), 0)

WebUI.verifyElementPresent(findTestObject('Page Detail Mobil/SubMenu_Kredit'), 0)

WebUI.verifyElementPresent(findTestObject('Page Detail Mobil/label_Informasi Mobil'), 0)

//Informasi Unit
WebUI.verifyMatch(kilometer_card, kilometer_info, true)

WebUI.verifyMatch(title_card.toString().substring(title_card.length() - 4), tahun_info, true)

WebUI.verifyGreaterThan(wrna_info.length(), 0)

WebUI.verifyMatch(transmisi_card, transmisi_info, true)

WebUI.verifyMatch(lokasi_card, title_lokasi, true)

WebUI.verifyGreaterThan(plat_info.length(), 0)

WebUI.verifyGreaterThan(stnk_info.length(), 0)

WebUI.verifyMatch(bahan_bakar_card, bahan_bakar_info, true)

WebUI.comment(((((((((((' title       : ' + title_detail) + '\n Lokasi      : ') + title_lokasi) + '\n Harga       : ') + 
    title_harga) + '\n Kilometer   : ') + kilometer_info) + '\n transmisi   : ') + transmisi_info) + '\n bahan_bakar : ') + 
    bahan_bakar_info)

WebUI.verifyElementPresent(findTestObject('Page Detail Mobil/label_Informasi Mobil'), 0)

WebUI.verifyElementPresent(findTestObject('Page Detail Mobil/label_Title Tanyakan Unit'), 0)

WebUI.verifyElementPresent(findTestObject('Page Detail Mobil/label_Title Rekomendasi Mobil Baru'), 0)

WebUI.verifyElementPresent(findTestObject('Page Detail Mobil/label_Title Rekomendasi Mobil Bekas'), 0)

WebUI.takeFullPageScreenshotAsCheckpoint('ev' + screen.toString())

if (close_browser.toString().equals('1')) {
WebUI.closeBrowser()
}
