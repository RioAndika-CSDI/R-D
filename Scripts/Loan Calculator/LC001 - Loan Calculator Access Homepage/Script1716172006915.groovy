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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Prod)

WebUI.scrollToElement(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/div_Hitung KemampuanDapatkan hasil perhitun_da483e'), 
    0)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

aslFrame = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Homepage Component/Frame_ASL'), 
    15)

if (aslFrame == true) {
    WebUI.switchToFrame(findTestObject('Homepage Component/Frame_ASL'), 0)

    WebUI.click(findTestObject('Homepage Component/Close_ASL_Banner'))

    WebUI.switchToWindowIndex(0)
}

sakuFrame = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Homepage Component/Frame_Promo Bank Saku'), 
    15)

if (sakuFrame == true) {
    WebUI.switchToFrame(findTestObject('Homepage Component/Frame_Promo Bank Saku'), 0)

    WebUI.click(findTestObject('Homepage - Burger menu/Bank saqu iklan'))

    WebUI.switchToWindowIndex(0)
}

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(10)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

WebUI.waitForElementNotPresent(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'), 5)

WebUI.click(findTestObject('Loan Calculator/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/Hitung-Kemampuan-Cara-Dapatkan-Mobil-Section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Loan Calculator/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/h2_Cari Tahu Kemampuan Finansialmu'))

