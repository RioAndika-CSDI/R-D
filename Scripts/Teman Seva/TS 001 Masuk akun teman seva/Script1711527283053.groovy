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

WebUI.click(findTestObject('Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/button_Nanti Saja atas'))

WebUI.delay(60)

WebUI.click(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

WebUI.click(findTestObject('Homepage - Burger menu/Teman seva'))

WebUI.click(findTestObject('Page - Teman seva/Carousel teman seva 1'))

WebUI.click(findTestObject('Page - Teman seva/Carousel teman seva 2'))

WebUI.click(findTestObject('Page - Teman seva/Carousel teman seva 3'))

WebUI.click(findTestObject('Page - Teman seva/Checbox setuju bergabung TS'))

WebUI.scrollToElement(findTestObject('Page - Teman seva/button masuk teman seva'), 0)

WebUI.click(findTestObject('Page - Teman seva/button masuk teman seva'))

WebUI.click(findTestObject('Page - Teman seva/button masuk popup'))

WebUI.setText(findTestObject('Page - Teman seva/Field input phone number'), Phone_number)

WebUI.click(findTestObject('Page - Teman seva/button lanjutkan daftar teman seva'))

WebUI.setText(findTestObject('Page - Teman seva/Input OTP'), OTP)

boolean cek = true

cek = CustomKeywords.'ignore_warning_optional.ignore_warning.waitingIgnoreWarning'(findTestObject('Page - Teman seva/validasi berhasil masuk teman seva'), 
    10)

if (cek == false) {
    WebUI.delay(120)

    WebUI.click(findTestObject('Page - Teman seva/Close_OTP'))

    WebUI.click(findTestObject('Page - Teman seva/button lanjutkan daftar teman seva'))

    WebUI.setText(findTestObject('Page - Teman seva/Input OTP'), OTP)
}

WebUI.verifyElementPresent(findTestObject('Page - Teman seva/validasi berhasil masuk teman seva'), 0)

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

