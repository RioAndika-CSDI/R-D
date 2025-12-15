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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.cms_url + '/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_CMS_new/Page_Login/input_Email_Login'), 'ayu.anggraini@seva.id')

WebUI.setText(findTestObject('Page_CMS_new/Page_Login/input_Password_Login'), 'Nov@2025')

WebUI.click(findTestObject('Page_CMS_new/Page_Login/button_Log in_CMS'))

WebUI.delay(10)

String currentUrl = WebUI.getUrl()

WebUI.verifyMatch(currentUrl, GlobalVariable.cms_url + '/app/dashboard', false)

WebUI.click(findTestObject('Page_CMS_new/Page_Calculator_Management/Page_SEVA CMS/span_Calculator Management'))

WebUI.click(findTestObject('Page_CMS_new/Page_Calculator_Management/Page_SEVA CMS/button_Mobil Baru309'))

WebUI.setText(findTestObject('Page_CMS_new/Page_Calculator_Management/input_search'), '#JelasDariAwal Testing Commercial')

WebUI.delay(5)

WebUI.click(findTestObject('Page_CMS_new/Page_Calculator_Management/button_edit'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Page_CMS_new/Page_Calculator_Management/Page_SEVA CMS/h2_Calculator Simulation'), 
    0)

WebUI.delay(7)

WebUI.setText(findTestObject('Page_CMS_new/Page_Calculator_Management/input_otr'), '172000000')

WebUI.delay(5)

WebUI.click(findTestObject('Page_CMS_new/Page_Calculator_Management/dropdown_cityrun'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/input_city_run_simulation'), 'Jakarta Pusat')

WebUI.delay(5)

WebUI.click(findTestObject('Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/div_Jakarta Pusat'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/div_Select_Tenor1'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/div_Full Comprehensive_Tenor1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/div_Select_Tenor2'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/div_Full Comprehensive_Tenor2'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/div_Select_Tenor3'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/div_Full Comprehensive_Tenor3'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/div_Select_Tenor4'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/div_Full Comprehensive_Tenor4'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/button_Reset'))

WebUI.delay(5)

//field otr
WebUI.verifyElementAttributeValue(
	findTestObject('Page_CMS_new/Page_Calculator_Management/input_otr'),
	'value',
	'',
	5
)
//dropdown city
//WebUI.verifyOptionSelectedByValue(
//	findTestObject('Page_CMS_new/Page_Calculator_Management/dropdown_cityrun'),
//	'',
//	false,
//	5
//)
String valc = WebUI.getText(findTestObject('Page_CMS_new/Page_Calculator_Management/dropdown_cityrun'))
WebUI.verifyMatch(valc.trim(), 'Select...', false)
//dropdown tipe asuransi
//WebUI.verifyOptionSelectedByValue(
//	findTestObject('Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/div_Select_Tenor1'),
//	'',
//	false,
//	5
//)

String val1 = WebUI.getText(findTestObject('Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/div_Select_Tenor1'))
WebUI.verifyMatch(val1.trim(), 'Select...', false)

//WebUI.verifyOptionSelectedByValue(
//	findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/div_Select_Tenor2'),
//	'',
//	false,
//	5
//)
//
String val2 = WebUI.getText(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/div_Select_Tenor2'))
WebUI.verifyMatch(val2.trim(), '', false)
//String val2 = WebUI.getAttribute(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/div_Select_Tenor2'), 'aria-live')
//WebUI.verifyMatch(val2, 'Select...', false)

//WebUI.verifyOptionSelectedByValue(
//	findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/div_Select_Tenor3'),
//	'',
//	false,
//	5
//)

String val3 = WebUI.getText(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/div_Select_Tenor3'))
WebUI.verifyMatch(val3.trim(), '', false)
//
//WebUI.verifyOptionSelectedByValue(
//	findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/div_Select_Tenor4'),
//	'',
//	false,
//	5
//)

String val4 = WebUI.getText(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/div_Select_Tenor4'))
WebUI.verifyMatch(val4.trim(), '', false)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Mobil_Commercial/button_Run Simulation'), FailureHandling.STOP_ON_FAILURE)


WebUI.closeBrowser()

