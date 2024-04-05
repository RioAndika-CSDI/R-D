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
}

WebUI.scrollToElement(findTestObject('Homepage Component/label_Tab Kategori Semua'), 0)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

aslFrame = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Homepage Component/Frame_ASL'), 
    30)

if (aslFrame == true) {
    WebUI.switchToFrame(findTestObject('Homepage Component/Frame_ASL'), 0)

    WebUI.click(findTestObject('Homepage Component/Close_ASL_Banner'))

    WebUI.switchToWindowIndex(0)
}

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

tabKategoriId = 1

dataArtikelId = 1

for (int i = 0; i < 3; i++) {
    Random rand = new Random()

    randomNumber = (rand.nextInt(7) + 1).toString()

    boolean cekElement = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Homepage Component/label_Tab Kategori Artikel by id', 
            [('id') : randomNumber]), 1)

    if (cekElement == true) {
        tabKategoriId = randomNumber

        break
    }
}

cekIgnore=WebUI.getText(findTestObject('Homepage Component/label_Tab Kategori Artikel by id', [('id') : tabKategoriId]))

WebUI.comment(cekIgnore)

if(cekIgnore.equalsIgnoreCase(kecualikanKatehori.toString())) {
	tabKategoriId=1
}

WebUI.click(findTestObject('Homepage Component/label_Tab Kategori Artikel by id', [('id') : tabKategoriId]))

for (int i = 0; i < 3; i++) {
    Random rand = new Random()

    randomNumber = (rand.nextInt(3) + 1).toString()

    boolean cekElement = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Homepage Component/label_Artikel List Card Kategori by id', 
            [('id') : randomNumber]), 1)

    if (cekElement == true) {
        dataArtikelId = randomNumber

        break
    }
}

kategori = WebUI.getText(findTestObject('Homepage Component/label_Artikel List Card Kategori by id', [('id') : dataArtikelId]))

date = WebUI.getText(findTestObject('Homepage Component/label_Artikel List Card Date by id', [('id') : dataArtikelId]))

title = WebUI.getText(findTestObject('Homepage Component/label_Artikel List Card Title by id', [('id') : dataArtikelId]))

WebUI.comment(kategori)

WebUI.comment(date)

WebUI.comment(title)

WebUI.click(findTestObject('Homepage Component/label_Artikel List Card Title by id', [('id') : dataArtikelId]))

WebUI.callTestCase(findTestCase('Wordpress/WP005-Homepage-Membuka Artikel Melalui Data Carousel'), [('open_browser') : '0'
        , ('close_browser') : '1', ('title_input') : title, ('kategori_input') : kategori, ('date_input') : date], FailureHandling.STOP_ON_FAILURE)

