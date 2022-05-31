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

WebUI.callTestCase(findTestCase('TC - Dev -SEVA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Homepage-SEVA/Page_SEVA - Beli Mobil Terbaru Dengan Cicilan Kredit Terbaik/div_Perhitungan kredit yang sesuai untukmu_sc-dTWLky fTqCcX'), 
    0)

WebUI.setText(findTestObject('Homepage-SEVA/Page_SEVA - Beli Mobil Terbaru Dengan Cicilan Kredit Terbaik/input_Perhitungan kredit yang sesuai untukmu_sc-bBHxTw hmWNV input-element'), 
    VariantModels)

WebUI.click(findTestObject('Homepage-SEVA/Page_SEVA - Beli Mobil Terbaru Dengan Cicilan Kredit Terbaik/div_Daihatsu New Ayla 1.0 X MT MC', 
        [('ModelVariant') : VariantModels]))

WebUI.setText(findTestObject('Special Rate/InputCitySelector'), City)

WebUI.delay(1)

WebUI.click(findTestObject('Special Rate/CityList', [('CitySelect') : City]))

