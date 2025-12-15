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

WebUI.maximizeWindow()

// Halaman Upload 
WebUI.navigateToUrl('https://www.seva.id/fasilitas-dana/upload/6285349524555')

WebUI.verifyMatch(WebUI.getUrl(), 'https://www.seva.id/fasilitas-dana/upload/6285349524555', false)

WebUI.waitForPageLoad(10)

WebUI.verifyTextPresent('Unggah Dokumenmu', false)

// Halaman CSA Upload 
WebUI.navigateToUrl('https://www.seva.id/fasilitas-dana/csa-upload/6285349524555')

WebUI.verifyMatch(WebUI.getUrl(), 'https://www.seva.id/fasilitas-dana/csa-upload/6285349524555', false)

//WebUI.verifyElementPresent(findTestObject('HomeRefinancing/label_uploadDokumenCSA'), 10)
WebUI.waitForPageLoad(10)

WebUI.waitForElementVisible(findTestObject('HomeRefinancing/label_uploadDokumenCSA'), 10)

WebUI.closeBrowser()

