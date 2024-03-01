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

WebUI.scrollToElement(findTestObject('Homepage Component/Button Cari Mobil Baru'), 0)

WebUI.delay(10)

WebUI.click(findTestObject('PopUP/button_Nanti Saja'))

not_run: WebUI.click(findTestObject('PopUP/button_x'))

WebUI.setText(findTestObject('Object Repository/Homepage Component/Input City Selector'), 'Jakarta Pusat')

WebUI.click(findTestObject('Homepage Component/Select City List'))

WebUI.click(findTestObject('Homepage Component/button_Mulai Cari Mobil'))

'Click Burger Menu'
WebUI.scrollToElement(findTestObject('Homepage Component/Burger_Button'), 0)

'Click Moengage Ads\r\n'
WebUI.delay(4)

'Click Burger Menu'
WebUI.click(findTestObject('Homepage Component/Burger_Button'))

'Click Burger Menu'
WebUI.click(findTestObject('Homepage Component/button_Masuk  Register'))

WebUI.setText(findTestObject('Login Register Component/Input_Phone_Number'), '81225717129')

WebUI.click(findTestObject('Login Register Component/button_Lanjutkan'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login Register Component/Input_Phone_Number'), '969696')

