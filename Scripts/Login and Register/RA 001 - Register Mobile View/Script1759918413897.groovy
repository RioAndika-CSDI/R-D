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

WebUI.setViewPortSize(500, 736)

WebUI.scrollToElement(findTestObject('Homepage Component/Promo Eksklusif'), 0)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.executeJavaScript('window.scrollTo(0, 0)', [])

WebUI.delay(10)

'Click Burger Menu'
WebUI.click(findTestObject('Homepage Component/Button_Hamburger Menu'))

WebUI.enhancedClick(findTestObject('Homepage Component/button_Masuk  Register'))

WebUI.setText(findTestObject('Login Register Component/Input_Phone_Number'), Phone_number)

WebUI.delay(3)

WebUI.click(findTestObject('Login Register Component/button_Lanjutkan'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login Register Component/Input_OTP'), OTP)

WebUI.setText(findTestObject('Login Register Component/Field nama lengkap'), Nama_lengkap)

WebUI.setText(findTestObject('Login Register Component/Field email'), Email)

WebUI.click(findTestObject('Login Register Component/Field tanggal lahir'))

WebUI.scrollToElement(findTestObject('Login Register Component/Checklist setuju dengan SK'), 0)

WebUI.click(findTestObject('Login Register Component/Button simpan tanggal lahir'))

WebUI.click(findTestObject('Login Register Component/Checklist setuju dengan SK'))

WebUI.click(findTestObject('Login Register Component/button daftar'))

WebUI.delay(5)

'Click Burger Menu'
WebUI.click(findTestObject('Homepage Component/Button_Hamburger Menu'))

WebUI.verifyElementPresent(findTestObject('Homepage - Burger menu/Label_nomor hp profile', [('nomor') : nomorHP]), 0)

