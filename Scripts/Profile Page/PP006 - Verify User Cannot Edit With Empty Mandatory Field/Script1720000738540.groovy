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

WebUI.callTestCase(findTestCase('Profile Page/PP001 - Verify User Can Access Profile Page'), [('nomorHP') : '85349524555', ('OTP') : '212121'
        , ('open_browser') : '1', ('close_browser') : '0'], FailureHandling.STOP_ON_FAILURE)

if (fullname_null.toString().equals('1')) {
    WebUI.click(findTestObject('Profile/Profile_Page/input_fullname'))

    WebUI.sendKeys(findTestObject('Profile/Profile_Page/input_fullname'), Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(findTestObject('Profile/Profile_Page/input_fullname'), Keys.chord(Keys.BACK_SPACE))
	
	WebUI.sendKeys(findTestObject('Profile/Profile_Page/input_fullname'), Keys.chord(Keys.TAB))

    WebUI.verifyElementPresent(findTestObject('Profile/Profile_Page/Profile Page - Alert Message/p_Wajib diisi'), 1)
}

if (email_null.toString().equals('1')) {
    WebUI.click(findTestObject('Profile/Profile_Page/input_email'))

    WebUI.sendKeys(findTestObject('Profile/Profile_Page/input_email'), Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(findTestObject('Profile/Profile_Page/input_email'), Keys.chord(Keys.BACK_SPACE))
	
	WebUI.sendKeys(findTestObject('Profile/Profile_Page/input_fullname'), Keys.chord(Keys.TAB))

    WebUI.verifyElementPresent(findTestObject('Profile/Profile_Page/Profile Page - Alert Message/p_Wajib diisi'), 1)
}

