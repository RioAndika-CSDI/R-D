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

WebUI.callTestCase(findTestCase('Kualifikasi Kredit/KK004 - Kualifikasi Kredit Review'), [('variable') : ''], FailureHandling.STOP_ON_FAILURE)

left = WebUI.getElementHeight(findTestObject('Kualifikasi-Kredit/KK Used/Page_SEVA - Beli Mobil Terbaru Dengan Cicilan Kredit Terbaik/grey_area_bottom_sheet_lanjut_ia'))

WebUI.clickOffset(findTestObject('Kualifikasi-Kredit/KK Used/Page_SEVA - Beli Mobil Terbaru Dengan Cicilan Kredit Terbaik/grey_area_bottom_sheet_lanjut_ia'), 
    500, 0)

