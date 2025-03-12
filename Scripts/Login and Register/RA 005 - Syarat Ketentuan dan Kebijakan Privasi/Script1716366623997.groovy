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

WebUI.openBrowser('https://www.seva.id/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Homepage Component/Burger_Button_Baru'))

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(15)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

WebUI.click(findTestObject('Homepage Component/button_Masuk  Register'))

WebUI.setText(findTestObject('Login Register Component/Input_Phone_Number'), Phone_number)

WebUI.click(findTestObject('InstantApproval/InstantApprovalPDP/Page_Masuk Akun - SEVA/button_Lanjutkan'))

WebUI.setText(findTestObject('Login Register Component/Input_OTP'), OTP)

WebUI.scrollToElement(findTestObject('Login Register Component/label_syarat dan ketentuan'), 0)

WebUI.click(findTestObject('Login Register Component/label_syarat dan ketentuan'))

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementPresent(findTestObject('Page Syarat dan Ketentuan/Label_Title Syarat dan Ketentuan'), 60)

WebUI.verifyElementPresent(findTestObject('Page Syarat dan Ketentuan/Label_Title Syarat dan Ketentuan'), 0)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Login Register Component/label_kebijakan privasi'))

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementPresent(findTestObject('Page Kebijakan Privasi/Label_Title Kebijakan Privasi'), 60)

WebUI.verifyElementPresent(findTestObject('Page Kebijakan Privasi/Label_Title Kebijakan Privasi'), 0)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.closeBrowser()

