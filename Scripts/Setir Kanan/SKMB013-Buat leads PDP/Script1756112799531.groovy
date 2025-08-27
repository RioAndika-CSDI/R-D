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

WebUI.callTestCase(findTestCase('Setir Kanan/SKMB012-Klik Saya Berminat'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('used car/leads/nama'))

WebUI.setText(findTestObject('used car/leads/nama'), 'Hilmy Testing ')

WebUI.click(findTestObject('used car/leads/nomor'))

WebUI.setText(findTestObject('used car/leads/nomor'), '85349524555')

WebUI.click(findTestObject('used car/leads/kota'))

WebUI.setText(findTestObject('used car/leads/kota'), 'Jakarta Selatan')

WebUI.delay(5)

WebUI.click(findTestObject('used car/leads/dropdown kota'))

WebUI.click(findTestObject('used car/leads/checkbox promo'))

WebUI.click(findTestObject('used car/leads/checkbox SnK'))

WebUI.click(findTestObject('used car/leads/button kirim'))

WebUI.delay(20)

WebUI.waitForElementVisible(findTestObject('Login Register Component/Input_OTP'), 10)

WebUI.verifyElementClickable(findTestObject('Login Register Component/Input_OTP'))

WebUI.setText(findTestObject('Login Register Component/Input_OTP'), OTP)

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('used car/leads/verify leads'), 5)

