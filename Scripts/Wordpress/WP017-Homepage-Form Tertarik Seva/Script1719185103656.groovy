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

WebUI.click(findTestObject('Homepage Component/Burger_Button_Baru'))

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(15)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

WebUI.click(findTestObject('Homepage Component/SubMenu_Artikel'))

WebUI.click(findTestObject('Homepage Component/SubMenu_Artikel_Semua Artikel'))

WebUI.waitForElementPresent(findTestObject('Page Blog Main/Label_Section Berita Baru'), 400)

actURL = WebUI.getUrl()

WebUI.verifyMatch(actURL, expected_url, true)

WebUI.waitForElementPresent(findTestObject('Page_Lihat Semua artikel/Judul Artikel Populer 1st'), 300)

WebUI.scrollToElement(findTestObject('Page_Lihat Semua artikel/label populer section'), 0)

judul = WebUI.getText(findTestObject('Page_Lihat Semua artikel/Judul Artikel Populer 1st'))

WebUI.click(findTestObject('Page_Lihat Semua artikel/Judul Artikel Populer 1st'))

WebUI.waitForElementPresent(findTestObject('Page_Lihat Semua artikel/Match judul artikel populer 1st'), 300)

judulDetail = WebUI.getText(findTestObject('Page_Lihat Semua artikel/Match judul artikel populer 1st'))

WebUI.verifyMatch(judul, judulDetail, true)

WebUI.scrollToElement(findTestObject('Page_Lihat Semua artikel/Tertarik Beli Seva/label tertarik beli seva'), 0)

WebUI.click(findTestObject('Page_Lihat Semua artikel/Tertarik Beli Seva/form nama lengkap'))

WebUI.setText(findTestObject('Page_Lihat Semua artikel/Tertarik Beli Seva/form nama lengkap'), 'Hilmy Testing')

WebUI.click(findTestObject('Page_Lihat Semua artikel/Tertarik Beli Seva/form nomor telepon'))

WebUI.setText(findTestObject('Page_Lihat Semua artikel/Tertarik Beli Seva/form nomor telepon'), '81802793462')

WebUI.click(findTestObject('Page_Lihat Semua artikel/Tertarik Beli Seva/klik kirim'))

WebUI.waitForElementPresent(findTestObject('Page_Lihat Semua artikel/Tertarik Beli Seva/OTP Verif'), 300)

WebUI.getText(findTestObject('Page_Lihat Semua artikel/Tertarik Beli Seva/OTP Verif'))

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

