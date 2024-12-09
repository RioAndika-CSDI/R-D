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

WebUI.callTestCase(findTestCase('Setir Kanan/SKMB003-Cari Mobil Bekas Hompage'), [('model') : model_Search, ('brand') : brand_Search
        , ('tahun') : tahun_Search, ('transmisi') : transmisi_Search, ('expected_url') : expected_url_Search, ('screen') : screen
        , ('open_browser') : '1', ('close_browser') : 0], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page Mobil Bekas/button_Filter Setelah Filter'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(8)

WebUI.click(findTestObject('Page Mobil Bekas/Filter/Label_Detail Mobil'))

WebUI.callTestCase(findTestCase('Setir Kanan/SKMB007-Menghapus Data Filter'), [('url_skmb001_Filter') : expected_url_Search
        , ('body_Filter') : brand_Search, ('brand_Filter') : brand_Search, ('tahun_Filter') : tahun_Search, ('transmisi_Filter') : transmisi_Search
        , ('plat_Filter') : '', ('lokasi_Filter') : '', ('kilometer_Filter') : '', ('harga_Filter') : '', ('screen') : screen
        , ('open_browser') : '0', ('close_browser') : '0'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Setir Kanan/SKMB004-Filter Mobil Bekas'), [('open_browser') : '0', ('close_browser') : '1'
        , ('url_skmb001') : url_skmb001_Filter, ('brand') : brand_Filter, ('body') : body_Filter, ('tahun') : tahun_Filter
        , ('transmisi') : transmisi_Filter, ('plat') : plat_Filter, ('lokasi') : lokasi_Filter, ('kilometer') : kilometer_Filter
        , ('harga') : harga_Filter, ('navigateFilter_tambahan') : '', ('screen') : screen], FailureHandling.STOP_ON_FAILURE)

