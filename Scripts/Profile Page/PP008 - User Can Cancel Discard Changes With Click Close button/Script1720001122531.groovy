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
        , ('open_browser') : '1', ('close_browser') : 0], FailureHandling.STOP_ON_FAILURE)
if (edit_fullname.toString().equals('1')) {
    WebUI.click(findTestObject('Profile/Profile_Page/input_fullname'))

    //    WebUI.clearText(findTestObject('Profile/Profile_Page/input_fullname'))
    WebUI.sendKeys(findTestObject('Profile/Profile_Page/input_fullname'), Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(findTestObject('Profile/Profile_Page/input_fullname'), Keys.chord(Keys.BACK_SPACE))

    WebUI.setText(findTestObject('Profile/Profile_Page/input_fullname'), fullname)
}

// Edit Email ?
if (edit_email.toString().equals('1')) {
    WebUI.click(findTestObject('Profile/Profile_Page/input_email'))

    //    WebUI.clearText(findTestObject('Profile/Profile_Page/input_email'))
    WebUI.sendKeys(findTestObject('Profile/Profile_Page/input_email'), Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(findTestObject('Profile/Profile_Page/input_email'), Keys.chord(Keys.BACK_SPACE))

    WebUI.setText(findTestObject('Profile/Profile_Page/input_email'), email)
}

// Edit DOB ?
if (edit_dob.toString().equals('1')) {
    CustomKeywords.'selector_dob.DatePickerHandler.selectDate'(dob_year, dob_month, dob_day)
}

// Edit Gender ?
if (edit_gender.toString().equals('1')) {
    WebUI.click(findTestObject('Profile/Profile_Page/input_Jenis Kelamin_gender'))

    if (gender.toString().equals('Pria')) {
        WebUI.click(findTestObject('Profile/Profile_Page/Option_Gender_Pria'))
    } else if (gender.toString().equals('Wanita')) {
        WebUI.click(findTestObject('Profile/Profile_Page/option_gender_wanita'))
    }
}

WebUI.click(findTestObject('Profile/Profile_Page/button_Keluar Akun'))

WebUI.verifyElementPresent(findTestObject('Profile/Profile_Page/Profile Page - Pop Up Screen/div_Perubahan data belum disimpan'), 
    0)

WebUI.click(findTestObject('Profile/Profile_Page/Profile Page - Pop Up Screen/svg-x button'))

WebUI.verifyElementNotVisible(findTestObject('Profile/Profile_Page/Profile Page - Pop Up Screen/div_Perubahan data belum disimpan'))

