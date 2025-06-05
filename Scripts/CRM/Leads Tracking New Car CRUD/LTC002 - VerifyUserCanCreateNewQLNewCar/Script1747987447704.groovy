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

WebUI.callTestCase(findTestCase('CRM/Leads Tracking New Car CRUD/LTC001 - VerifyUserCanAccessTestingDataAsCM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/button_Create Qualified Leads CM'))

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/txt_Create Qualified Leads Pop Up'), 'Create Qualified Leads')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/radio_new car ql'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/button_Continue Create QL CM'))

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/txt_Create New Leads New Car'), 'Create New Leads: New Car')

WebUI.scrollToElement(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_A. CUSTOMER INFORMATION'), 
    0)

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_phone number'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_phone number'), 
    '81229948663')

WebUI.scrollToElement(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_B. LEADS INFORMATION'), 
    0)

WebUI.clearText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_leadName'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_leadName'), 
    'TESTING AUTO PROD')

WebUI.clearText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_origination'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_origination'), 
    'cm')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_origination CM - Others'))

WebUI.clearText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_daasLeadsBUOwner'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_daasLeadsBUOwner'), 
    'olx')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_daasleadsBUOwner OlxMobbi'))

WebUI.clearText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_daasLeadsModelling'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_daasLeadsModelling'), 
    'acc')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_ daasLeadsModelling FIF A ACC I'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_UTM Source'), 
    'testing')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_utmgroup Testing'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_UTM Medium'), 
    'testing')

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_UTM Campaign'), 
    'testing')

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_UTM Content'), 
    'testing')

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_UTM Term'), 
    'testing')

WebUI.scrollToElement(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_C. CAR INFORMATION'), 
    0)

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_brand'), 
    'daihatsu')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_brand Daihatsu'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_model'), 
    'sigra')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_Model Sigra'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_variant'), 
    '1.0 D MT MC')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_varian 1.0 D MT MC (NEW)'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_city'), 'jakarta selatan')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_city Jakarta Selatan'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_Address Details'), 
    'Jl ABC TESTING NO. 12')

WebUI.scrollToElement(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_D. PURCHASE INFORMATION'), 
    0)

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_paymentMethod'), 
    'credit')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_payment method Credit'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_leasingRecommendation'), 
    'ACC')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_leasing ACC'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_Rp_loanDownPayment'), 
    '20000000')

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_Rp_dpAfterDiscount'), 
    '17538000')

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_Rp_loanMonthlyInstallment'), 
    '89170000')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/button_Tenor 3'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/button_ADDB'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_purchaseTimeline'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_purchase timeline Today'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/button_isContactWithSales-No'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_NIK Borrower'), 
    '1234567890123456')

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_NIK Co-Borrower'), 
    '2345678901234567')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/button_isTradeIn-No'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/button_isCreditProtection-Yes'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_Insurance'), 
    'full')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_insurance FULL AR'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_Credit Package'), 
    'spekta')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_credit package TOYOTA SPEKTA'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_Eligible Promo'), 
    'cashback')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_promo cashback 2 5 juta'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/txt_This action will create a new qualified leads to be sent to CM'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_leadsChannel'), 
    'paket seva')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_leads channel Paket SEVA - KTP'))

WebUI.scrollToElement(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_E. SEND TO CM'), 
    0)

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_cm'), 'abyaska')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/span_cm Abyaska Syafira'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/input_cmNote'), 
    'Create New QL Automation')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/01. Create Qualified Leads New Car - CM/button_Send to CM'))

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/input_Search Leads Tracking'), 'TESTING AUTO PROD')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/button_To Be Assigned to SA'))

WebUI.refresh()

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/col_leads tracking (1)'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/button_Qualified Leads'))

WebUI.verifyElementInViewport(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/h2_Leads Information'), 
    0)

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/button_Show Detail'))

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_New Car'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_leads origination'), 
    'CM Others New Car')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_stage'), 
    'To be Assigned to Sales Agent')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_pipeline'), 
    'Qualified Leads')

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_leads group'))

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_leads name'), 
    'TESTING AUTO PROD')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_utm source'), 
    'Testing')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_utm medium'), 
    'testing')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_utm campaign'), 
    'testing')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_utm group'), 
    'Testing')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_utm content'), 
    'testing')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_utm term'), 
    'testing')

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_daas leads bu owner'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_project type'), 
    '1')

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_daas leads modelling'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/h2_Qualified Leads Information'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_cm name'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/h2_A. CAR INFORMATION'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_brand'), 
    'Daihatsu')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_model'), 
    'Sigra')

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_variant'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_city'), 
    'Jakarta Selatan')

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_otr'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_QL Address Details'))

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/h2_B. PURCHASE INFORMATION'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_payment method'), 
    'Credit')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_finco'), 
    'ACC')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_dp before'), 
    'Rp 20.000.000')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_dp after'), 
    'Rp 17.538.000')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_monthly installment'), 
    'Rp 89.170.000')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_tenor'), 
    '3')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_installment type'), 
    'ADDB')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_contacted before'), 
    'No')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_nik borrower'), 
    '1234567890123456')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_nik co borrower'), 
    '2345678901234567')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_trade in'), 
    'No')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_credit protection'), 
    'Yes')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_insurance'), 
    'FULL AR')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_credit package'), 
    'TOYOTA SPEKTA')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_promo'), 
    'Cashback Rp2.5 Juta')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_leads channel'), 
    'Paket SEVA - KTP')

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_notes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_last modified'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

