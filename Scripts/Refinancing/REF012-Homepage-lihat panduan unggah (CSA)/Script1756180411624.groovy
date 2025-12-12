import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import java.util.Arrays as Arrays
import internal.GlobalVariable as GlobalVariable

// --- Start Test ---
String phoneNumber = '6285349524555'

String expectedBaseUrl = "https://www.seva.id/fasilitas-dana/csa-upload/$phoneNumber/camera"

String startUrl = "https://www.seva.id/fasilitas-dana/csa-upload/$phoneNumber"

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(startUrl)

WebUI.verifyElementPresent(findTestObject('HomeRefinancing/label_uploadDokumen'), 10)

WebUI.click(findTestObject('HomeRefinancing/upload_dokumen'))

WebUI.click(findTestObject('HomeRefinancing/panduan unggah'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('HomeRefinancing/verify pop up panduan'), 10)

WebUI.closeBrowser()

