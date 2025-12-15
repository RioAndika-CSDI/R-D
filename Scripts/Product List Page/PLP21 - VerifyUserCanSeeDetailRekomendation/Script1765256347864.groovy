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

WebUI.openBrowser(GlobalVariable.Prod)

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Homepage Component/bottom_widget_cari_mobil_cta'), 5)

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.click(findTestObject('Homepage Component/bottom_widget_cari_mobil_cta'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Homepage - PLP/rekomendasi_plp'), 5)

WebUI.delay(2)

WebUI.click(findTestObject('Homepage - PLP/div_toyota_plp'))

WebUI.delay(2)

WebUI.click(findTestObject('Homepage - PLP/div_daihatsu_plp'))

WebUI.delay(2)

WebUI.click(findTestObject('Homepage - PLP/div_isuzu_plp'))

WebUI.delay(2)

WebUI.click(findTestObject('Homepage - PLP/div_bmw_plp'))

WebUI.delay(2)

WebUI.click(findTestObject('Homepage - PLP/div_hyundai_plp'))

WebUI.delay(2)

WebUI.click(findTestObject('Homepage - PLP/div_wuling'))

WebUI.delay(2)

WebUI.click(findTestObject('Homepage - PLP/div_byd'))

WebUI.delay(2)

WebUI.click(findTestObject('Homepage - PLP/semua_mobilrekomendasi_plp'))

'button lihat detail sesuai mobil'
WebUI.click(findTestObject('Homepage - PLP/Lihat_Detail_PLP'))

WebUI.closeBrowser()

