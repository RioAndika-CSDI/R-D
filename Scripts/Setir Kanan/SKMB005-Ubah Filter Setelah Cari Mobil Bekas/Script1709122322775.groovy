import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import java.util.Random as Random
import org.openqa.selenium.interactions.Actions as Actions
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

//  Buka browser via TC filter overlay untuk filter harga 
WebUI.callTestCase(findTestCase('Setir Kanan/SKMB004-filter overlay'), [('open_browser') : '1' // hanya buka browser di sini
        , ('close_browser') : '0' // jangan ditutup
        , ('url_skmb001') : url_skmb001_Filter, ('brand') : brand_Filter, ('body') : body_Filter, ('tahun') : tahun_Filter
        , ('transmisi') : transmisi_Filter, ('plat') : plat_Filter, ('lokasi') : lokasi_Filter, ('kilometer') : kilometer_Filter
        , ('harga') : harga_Filter, ('navigateFilter_tambahan') : '', ('screen') : screen], FailureHandling.STOP_ON_FAILURE)

// Scroll + klik filter 
WebUI.scrollToElement(findTestObject('used car/filter'), 5)

WebUI.enhancedClick(findTestObject('used car/filter'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(8)

WebUI.click(findTestObject('used car/detail mobil'))

//  Hapus filter 
WebUI.callTestCase(findTestCase('Setir Kanan/SKMB007-Menghapus Data Filter'), [('url_skmb001_Filter') : expected_url_Search
        , ('body_Filter') : brand_Search, ('brand_Filter') : brand_Search, ('tahun_Filter') : tahun_Search, ('transmisi_Filter') : transmisi_Search
        , ('plat_Filter') : '', ('lokasi_Filter') : '', ('kilometer_Filter') : '', ('harga_Filter') : '', ('screen') : screen
        , ('open_browser') : '0', ('close_browser') : '0'], FailureHandling.STOP_ON_FAILURE)

//  Buat filter ulang 

WebUI.callTestCase(findTestCase('Setir Kanan/SKMB003-Cari Mobil Bekas Hompage dengan filter'), [('model') : 'Toyota Agya;Toyota Calya'
        , ('brand') : 'Toyota;Daihatsu', ('tahun') : '2016-2020', ('transmisi') : 'Manual;Otomatis', ('expected_url') : 'https://www.seva.id/mobil-bekas/'
        , ('screen') : '', ('open_browser') : '1', ('close_browser') : '1'], FailureHandling.STOP_ON_FAILURE)

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

