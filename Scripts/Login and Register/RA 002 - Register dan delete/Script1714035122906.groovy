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

if (open_browser.toString().equals('1') && data_existing.toString().equals('0')) {
    WebUI.callTestCase(findTestCase('Login and Register/RA 001 - Register'), [('Phone_number') : Phone_number, ('OTP') : OTP
            , ('Nama_lengkap') : Nama_lengkap, ('Email') : Email], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Homepage Component/Burger_Button_Baru'))

    WebUI.click(findTestObject('Homepage - Burger menu/Profile'))
}

WebUI.click(findTestObject('Profile/Field jenis kelamin'))

if (Jenis_kelamin.toString().equalsIgnoreCase('Perempuan')) {
    WebUI.click(findTestObject('Profile/Optional jenis kelamin perempuan'))
} else {
    WebUI.click(findTestObject('Profile/Optional jenis kelamin laki-laki'))
}

WebUI.click(findTestObject('Profile/button simpan perubahan'))

WebUI.click(findTestObject('Profile/Delete account'))

WebUI.click(findTestObject('Profile/Checklist delete account'))

WebUI.click(findTestObject('Profile/Button lanjutkan delete account'))

WebUI.click(findTestObject('Profile/Field pilih alasan delete account'))

WebUI.click(findTestObject('Profile/Opsi alasan lainnya', [('alasan') : alasan]))

WebUI.click(findTestObject('Profile/Button selanjutnya delete account'))

WebUI.click(findTestObject('Profile/Validasi ya hapus akun saya'))

WebUI.closeBrowser()

