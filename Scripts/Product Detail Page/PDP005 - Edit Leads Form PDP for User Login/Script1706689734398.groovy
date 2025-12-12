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

WebUI.callTestCase(findTestCase('Product Detail Page/LR001-TC-Login'), [('nomorHP') : '8752900847', ('OTP') : '445566'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Homepage - PLP/Button_Cari_Mobil_Baru'), 0)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(10)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage - PDP/button_Terima'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/Homepage - PDP/button_Terima'))
}

WebUI.click(findTestObject('Object Repository/Homepage - PLP/Button_Cari_Mobil_Baru'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(8)

WebUI.delay(3)

//WebUI.click(findTestObject('Homepage - PLP/Car-Text-PLP', [('Car_Name') : CarName]))
WebUI.click(findTestObject('Object Repository/Homepage - PDP/label_car_name_plp', [('Car_Name') : CarName]))

WebUI.scrollToElement(findTestObject('Object Repository/Homepage - PDP/h2_Title Leads PDP'), 0)

WebUI.clearText(findTestObject('Homepage - PDP/nama lengkap'))

WebUI.setText(findTestObject('Homepage - PDP/nama lengkap'), NamaLengkap)

WebUI.click(findTestObject('Object Repository/Homepage - PDP/rect'))

WebUI.click(findTestObject('Object Repository/Homepage - PDP/button kirim'))

WebUI.verifyElementPresent(findTestObject('Homepage - PDP/message success leads'), 0)

WebUI.delay(3)

WebUI.closeBrowser()

