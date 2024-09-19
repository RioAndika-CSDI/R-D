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

WebUI.callTestCase(findTestCase('Instant Approval/IA - Loan Calculator/IA002 - Edit KTP'), [('kota') : 'Jakarta Pusat', ('marriage') : 'Belum Kawin'
        , ('dob_year') : '1990', ('dob_month') : 'Desember', ('dob_day') : '29'], FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementPresent(findTestObject('InstantApproval/InstantApproval/input_Pilih Kota Domisili_KTP_review'), 0)) {
    WebUI.click(findTestObject('InstantApproval/InstantApproval/input_Pilih Kota Domisili_KTP_review'))

    WebUI.sendKeys(findTestObject('InstantApproval/InstantApproval/input_Pilih Kota Domisili_KTP_review'), Keys.chord(Keys.CONTROL, 
            'a'))

    WebUI.sendKeys(findTestObject('InstantApproval/InstantApproval/input_Pilih Kota Domisili_KTP_review'), Keys.chord(Keys.BACK_SPACE))

    WebUI.setText(findTestObject('InstantApproval/InstantApproval/input_Pilih Kota Domisili_KTP_review'), kota)

    WebUI.click(findTestObject('InstantApproval/InstantApproval/dropdown_city_domisili', [('kota') : kota]))
}

WebUI.click(findTestObject('InstantApproval/InstantApproval/button_Selanjutnya'))


