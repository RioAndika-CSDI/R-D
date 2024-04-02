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

WebUI.navigateToUrl('https://cms-fe.prod.seva.id/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_SEVA CMS/input_rounded-4px h-40px block w-full text-_eb94bc'), 'ayu.anggraini@seva.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SEVA CMS/input_rounded-4px h-40px block w-full text-_eb94bc_1'), 
    'TKuVe2416cQrilL8vjccmw==')

WebUI.click(findTestObject('Object Repository/Page_SEVA CMS/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_SEVA CMS/span_SEVA Content Management'))

WebUI.click(findTestObject('Object Repository/Page_SEVA CMS/a_Announcement Box Management'))

<<<<<<< HEAD:Scripts/CMS/CMS040 - VerifyUserCanAccessAnnouncementBoxManagement/Script1711902112833.groovy
WebUI.verifyElementText(findTestObject('Object Repository/Page_SEVA CMS/h1_Announcement Box Management'), 'Announcement Box Management')
=======
WebUI.maximizeWindow()

//WebUI.click(findTestObject('Object Repository/Page_SEVA CMS/svg_h-5 w-5')) --> can't automated cause role
//
//WebUI.click(findTestObject('Object Repository/Page_SEVA CMS/h1_Edit Announcement Box')) --> can't automated cause role
>>>>>>> eb024bb350f25e9678763835805d8dce38476071:Scripts/CMS/CMS013 - VerifyUserCanEditAnnouncementBox/Script1707798472040.groovy

WebUI.closeBrowser()

