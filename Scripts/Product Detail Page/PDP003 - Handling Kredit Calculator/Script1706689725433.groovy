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

WebUI.callTestCase(findTestCase('Product Detail Page/PDP001 - Access PDP From PLP'), [('CarName') : 'All New Ayla'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Daihatsu New Ayla 2024 - Spesifikasi, _d9e7aa/h2_Kredit'))

WebUI.setText(findTestObject('Object Repository/Page_Daihatsu New Ayla 2024 - Spesifikasi, _d9e7aa/input_Rekomendasi Cicilan Ideal_0 input_inp_acd316'), 
    'Rp45.000.000')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Daihatsu New Ayla 2024 - Spesifikasi, _d9e7aa/input_Rekomendasi Cicilan Ideal_inputSelect_f8ef70'))

WebUI.click(findTestObject('Object Repository/Page_Daihatsu New Ayla 2024 - Spesifikasi, _d9e7aa/div_18-27'))

WebUI.click(findTestObject('Object Repository/Page_Daihatsu New Ayla 2024 - Spesifikasi, _d9e7aa/button_Hitung Kemampuan'))

