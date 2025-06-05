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

WebUI.callTestCase(findTestCase('CRM/Refinancing/RF002 - VerifyUserCanAccessRefiCreateQL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CRM/Create QL Refinancing/input__phone'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/input__phone'))

WebUI.setText(findTestObject('CRM/Create QL Refinancing/input__phone'), '85800605524')

WebUI.verifyElementClickable(findTestObject('CRM/Create QL Refinancing/input__origination'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/input__origination'))

WebUI.waitForElementVisible(findTestObject('CRM/Create QL Refinancing/select_origination_3Dolphin WA Direct'), 5)

WebUI.click(findTestObject('CRM/Create QL Refinancing/select_origination_3Dolphin WA Direct'))

WebUI.verifyElementClickable(findTestObject('CRM/Create QL Refinancing/input__brand'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/input__brand'))

WebUI.scrollToElement(findTestObject('CRM/Create QL Refinancing/select_CarBrand'), 2)

WebUI.click(findTestObject('CRM/Create QL Refinancing/select_CarBrand'))

WebUI.verifyElementClickable(findTestObject('CRM/Create QL Refinancing/input__modelId'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/input__modelId'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/select_CarModel'))

WebUI.verifyElementVisible(findTestObject('CRM/Create QL Refinancing/input__variant'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/input__variant'))

WebUI.setText(findTestObject('CRM/Create QL Refinancing/input__variant'), '1.2 G A/T')

WebUI.verifyElementClickable(findTestObject('CRM/Create QL Refinancing/input__carYear'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/input__carYear'))

WebUI.setText(findTestObject('CRM/Create QL Refinancing/input__carYear'), '2024')

WebUI.verifyElementVisible(findTestObject('CRM/Create QL Refinancing/input_Rp_otr'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/input_Rp_otr'))

WebUI.setText(findTestObject('CRM/Create QL Refinancing/input_Rp_otr'), '250000000')

WebUI.verifyElementClickable(findTestObject('CRM/Create QL Refinancing/input__cityId'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/input__cityId'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/select_City_Bandung'))

WebUI.verifyElementVisible(findTestObject('CRM/Create QL Refinancing/input_Rp_loanAmount'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/input_Rp_loanAmount'))

WebUI.setText(findTestObject('CRM/Create QL Refinancing/input_Rp_loanAmount'), '150000000')

WebUI.verifyElementVisible(findTestObject('CRM/Create QL Refinancing/input_Rp_monthlyInstallment'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/input_Rp_monthlyInstallment'))

WebUI.setText(findTestObject('CRM/Create QL Refinancing/input_Rp_monthlyInstallment'), '1200000')

WebUI.verifyElementClickable(findTestObject('CRM/Create QL Refinancing/button_tenor3'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/button_tenor3'))

WebUI.verifyElementClickable(findTestObject('CRM/Create QL Refinancing/input__loanPurpose'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/input__loanPurpose'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/select_Traveling'))

WebUI.verifyElementVisible(findTestObject('CRM/Create QL Refinancing/input__nikBorrower'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/input__nikBorrower'))

WebUI.setText(findTestObject('CRM/Create QL Refinancing/input__nikBorrower'), '1111111111111111')

WebUI.verifyElementVisible(findTestObject('CRM/Create QL Refinancing/input__nikCoBorrower'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/input__nikCoBorrower'))

WebUI.setText(findTestObject('CRM/Create QL Refinancing/input__nikCoBorrower'), '0000000000000000')

WebUI.verifyElementClickable(findTestObject('CRM/Create QL Refinancing/input__leasingRecommendation'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/input__leasingRecommendation'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/select_leasing_ACC'))

WebUI.verifyElementClickable(findTestObject('CRM/Create QL Refinancing/input__cmId'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/input__cmId'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/select_CM_Ayu Anggraini'))

WebUI.verifyElementVisible(findTestObject('CRM/Create QL Refinancing/textarea_Notes_cmNote'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/textarea_Notes_cmNote'))

WebUI.setText(findTestObject('CRM/Create QL Refinancing/textarea_Notes_cmNote'), 'testing automation')

WebUI.verifyElementClickable(findTestObject('CRM/Create QL Refinancing/button_Send to CM'))

WebUI.click(findTestObject('CRM/Create QL Refinancing/button_Send to CM'))

