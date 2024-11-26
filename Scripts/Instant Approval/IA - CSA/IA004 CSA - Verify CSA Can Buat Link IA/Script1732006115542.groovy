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

WebUI.callTestCase(findTestCase('Instant Approval/IA - CSA/IA002 CSA - Verify CSA Can Input Link IA Form - DP Nominal'), 
    [('csa_name') : 'Testing Katalon', ('zoho') : '123', ('customer_name') : 'Testing Automation', ('city') : 'Surabaya'
        , ('car_model') : 'Daihatsu Rocky', ('car_variant') : '1.2 X MT', ('dp_nominal') : '50000000', ('dp_percentage') : ''
        , ('jenis_bayar') : 'ADDB', ('perusahaan_pembiayaan') : 'ACC', ('notes') : 'Hitam', ('monthly_income') : '30000000'
        , ('age') : '28-34', ('open_browser') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/button_Hitung Kemampuan Customer'))

WebUI.delay(3)

WebUI.click(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/button_Buat Link Instant Approval'))

WebUI.verifyElementPresent(findTestObject('InstantApproval/InstantApprovalCSA/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/h2_Link Instant Approval dan flyer berhasil dibuat'), 
    2)

