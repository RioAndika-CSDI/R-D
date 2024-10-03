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

WebUI.click(findTestObject('HomeRefinancing/SubMenu_FasilitasDana'))

WebUI.waitForElementPresent(findTestObject('HomeRefinancing/label_fasilitasDana'), 400)

actURL = WebUI.getUrl()

WebUI.verifyMatch(actURL, expected_url, true)

WebUI.scrollToElement(findTestObject('HomeRefinancing/field_nama_lengkap'), 0)

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(60)

WebUI.click(findTestObject('HomeRefinancing/field_nama_lengkap'))

WebUI.setText(findTestObject('HomeRefinancing/field_nama_lengkap'), 'Hilmy Testing')

WebUI.click(findTestObject('HomeRefinancing/field_nomorHP'))

WebUI.setText(findTestObject('HomeRefinancing/field_nomorHP'), '81229948663')

WebUI.click(findTestObject('HomeRefinancing/checklist'))

WebUI.click(findTestObject('HomeRefinancing/button_selanjutnyaForm1st'))

WebUI.setText(findTestObject('Login Register Component/Input_OTP'), OTP)

WebUI.waitForElementPresent(findTestObject('HomeRefinancing/label_form2'), 400)

actURL2 = WebUI.getUrl()

WebUI.verifyMatch(actURL2, ExpectedURL2, true)

WebUI.click(findTestObject('HomeRefinancing/form2_merekMobil'))

WebUI.setText(findTestObject('HomeRefinancing/form2_merekMobil'), 'Ford')

WebUI.click(findTestObject('HomeRefinancing/searc_formMerek'))

WebUI.click(findTestObject('HomeRefinancing/form2_modelMobil'))

WebUI.setText(findTestObject('HomeRefinancing/form2_modelMobil'), 'Escape')

WebUI.click(findTestObject('HomeRefinancing/Search_modelForm2'))

WebUI.click(findTestObject('HomeRefinancing/form2_tahunMobil'))

WebUI.setText(findTestObject('HomeRefinancing/form2_tahunMobil'), '2019')

WebUI.click(findTestObject('HomeRefinancing/search_tahunfrom2'))

WebUI.click(findTestObject('HomeRefinancing/form2_lokasiMobil'))

WebUI.setText(findTestObject('HomeRefinancing/form2_lokasiMobil'), 'Aceh Tamiang')

WebUI.click(findTestObject('HomeRefinancing/search_lokasiform2'))

WebUI.click(findTestObject('HomeRefinancing/form2_tenorMobil'))

WebUI.click(findTestObject('HomeRefinancing/kirim_form2'))

WebUI.waitForElementNotPresent(findTestObject('HomeRefinancing/Page_Pengajuan Data Telah Berhasil  SEVA/p_Terima Kasih'), 
    3)

SuccessURL = WebUI.getUrl()

WebUI.verifyMatch(SuccessURL, successRefi, true)

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

