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

title = title_input

kategori = kategori_input

date = date_input

if (open_browser.toString().equals('1')) {
    WebUI.openBrowser('seva.id')

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

    String randomNumber = '1'

    for (int i = 0; i < 3; i++) {
        Random rand = new Random()

        randomNumber = (rand.nextInt(3) + 1).toString()

        boolean cekElement = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject(
                'Homepage Component/Data_Artikel Carousel', [('id') : randomNumber]), 1)

        if (cekElement == true) {
            break
        } else {
            randomNumber = '1'
        }
    }
    
    WebUI.click(findTestObject('Homepage Component/Icon_Carousel Artikel', [('id') : randomNumber]))

    title = WebUI.getText(findTestObject('Homepage Component/Data_Artikel Carousel Title', [('id') : randomNumber]))

    kategori = WebUI.getText(findTestObject('Homepage Component/Data_Artikel Carousel Kategori', [('id') : randomNumber]))

    date = WebUI.getText(findTestObject('Homepage Component/Data_Artikel Carousel Date', [('id') : randomNumber]))

    WebUI.click(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : randomNumber]))
}

WebUI.waitForElementNotPresent(findTestObject('Homepage Component/Label_Artikel Terkini'), 300)

WebUI.verifyElementPresent(findTestObject('Page Data Artikel/breadcrumb_Artikel'), 0)

WebUI.verifyElementPresent(findTestObject('Page Data Artikel/breadcrumb_judul', [('title') : title]), 0)

WebUI.verifyElementPresent(findTestObject('Page Data Artikel/breadcrumb_judul', [('title') : kategori]), 0)

WebUI.verifyElementPresent(findTestObject('Page Data Artikel/Label_kategori Artikel', [('kategori') : kategori]), 0)

WebUI.verifyElementPresent(findTestObject('Page Data Artikel/Label_Title Artikel', [('title') : title]), 0)

autor = WebUI.getText(findTestObject('Page Data Artikel/Label_Detail Author'))

labelditulisOleh = autor.substring(0, 12)

autor = autor.substring(12)

WebUI.verifyMatch(labelditulisOleh, 'Ditulis oleh', true)

WebUI.verifyGreaterThan(autor.length(), 0)

WebUI.verifyElementPresent(findTestObject('Page Data Artikel/Label_Date Artikel', [('tanggal') : date]), 0)

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

