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

WebUI.callTestCase(findTestCase('Variant List Page/TC - PickVariantModel'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Special Rate/InputCitySelector'), City)

WebUI.delay(1)

WebUI.click(findTestObject('Special Rate/CityList', [('CitySelect') : City]))

WebUI.setText(findTestObject('Special Rate/InputPendapatan'), MonthlyIncome)

WebUI.click(findTestObject('Special Rate/Page_SEVA/InputAge'))

WebUI.click(findTestObject('Special Rate/AgeList', [('Umur') : Age]))

WebUI.click(findTestObject('Special Rate/button_Selanjutnya (1)'))

if (PercentDP == '15%') {
    WebUI.click(findTestObject('Special Rate/Page_SEVA/button_15'))
} else if (PercentDP == '20%') {
    WebUI.click(findTestObject('Special Rate/Page_SEVA/button_20'))
} else if (PercentDP == '25%') {
    WebUI.click(findTestObject('Special Rate/Page_SEVA/button_25'))
} else if (PercentDP == '30%') {
    WebUI.click(findTestObject('Special Rate/Page_SEVA/button_30'))
}

WebUI.click(findTestObject('Special Rate/button_Hitung Cicilan'))

