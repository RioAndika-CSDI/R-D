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

WebUI.scrollToElement(findTestObject('Homepage Component/Promo Eksklusif'), 5)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.executeJavaScript('window.scrollTo(0, 0)', [])

WebUI.enhancedClick(findTestObject('Homepage Component/button_Masuk  Register'))

WebUI.setText(findTestObject('Login Register Component/Input_Phone_Number'), Phone_number)

WebUI.click(findTestObject('Login Register Component/button_Lanjutkan'))

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

WebUI.waitForElementPresent(findTestObject('Page Kebijakan Privasi/Label_Title Kebijakan Privasi'), 30)

WebUI.verifyElementPresent(findTestObject('Page Kebijakan Privasi/Label_Title Kebijakan Privasi'), 0)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.verifyElementPresent(findTestObject('Login Register Component/label_syarat dan ketentuan'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

