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

WebUI.openBrowser('seva.id')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Homepage Component/Promo Eksklusif'), 2)

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.click(findTestObject('Homepage Component/bottom_widget_cari_mobil_cta'))

WebUI.click(findTestObject('Object Repository/Homepage - PLP/Bandingkan Mobil/bandingkan_mobil'))

WebUI.verifyElementPresent(findTestObject('PLP - Desktop Mode/bandingkan_mobil_popup'), 0)

WebUI.click(findTestObject('Object Repository/Homepage - PLP/Bandingkan Mobil/pilih_model_mbl'))

WebUI.click(findTestObject('Object Repository/Homepage - PLP/Bandingkan Mobil/dropdown_mbl_bmw_3'))

WebUI.click(findTestObject('Object Repository/Homepage - PLP/Bandingkan Mobil/btn_pilih_mobil'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Homepage - PLP/Bandingkan Mobil/tambah_mbl_2'))

WebUI.click(findTestObject('Object Repository/Homepage - PLP/Bandingkan Mobil/pilih_model_mbl'))

WebUI.click(findTestObject('Object Repository/Homepage - PLP/Bandingkan Mobil/dropdown_mbl_daihatsu_ayla'))

WebUI.click(findTestObject('Object Repository/Homepage - PLP/Bandingkan Mobil/btn_pilih_mobil'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Homepage - PLP/Bandingkan Mobil/btn_bandingkan'))

WebUI.delay(6)

String currentUrl = WebUI.getUrl()

String expectedUrl = 'https://www.seva.id/mobil-baru/bandingkan-mobil/hasil/jakarta-pusat/3-series-320i-sport-a6e5a85b-cd84-477f-afe7-88fbc699470e&320i-sport-bmw320isport-81063752-cf24-4eb9-bbad-8f382c256b5e/all-new-ayla-5f96c023-35e4-4d1b-b1ee-34984cf7f410&10-m-mt-a350rs-gmrej-t9-4b83d64e-943c-48e5-8da1-0969549c7kl3'

if (currentUrl == expectedUrl) {
    KeywordUtil.markPassed('User is on the expected page: ' + currentUrl)
}

WebUI.closeBrowser()

