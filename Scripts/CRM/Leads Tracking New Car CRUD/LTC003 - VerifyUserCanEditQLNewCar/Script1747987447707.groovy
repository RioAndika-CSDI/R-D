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

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/input_Search Leads Tracking'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/input_Search Leads Tracking'), 'TESTING AUTO PROD')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/button_To Be Assigned to SA'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/col_leads tracking (1)'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/button_Qualified Leads'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/button_Edit'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_cm'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_cm'), 
    'Ayu Anggraini')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/span_Ayu Anggraini'))

WebUI.scrollToElement(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/h2_B. PURCHASE INFORMATION'), 
    0)

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_brand'), 
    'Toyota')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/span_Toyota'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_model'), 
    'All New Avanza')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/span_All New Avanza'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_variant'), 
    '1.3 E CVT LUX')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/span_1.3 E CVT LUX'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_QL Car Color'), 
    'White')

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_city'), 
    'Jakarta Pusat')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/span_Jakarta Pusat'))

WebUI.clearText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_Rp_otr'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_Rp_otr'), 
    '436752000')

WebUI.clearText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_QL Address Details'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_QL Address Details'), 
    'Jl. Update QL Info No. 27')

WebUI.scrollToElement(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/h2_B. PURCHASE INFORMATION'), 
    0)

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_paymentMethod'), 
    'cash')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/span_Cash'))

WebUI.clearText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_Rp_downPayment'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_Rp_downPayment'), 
    '33400000')

WebUI.clearText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_Rp_dpAfterDiscount'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_Rp_dpAfterDiscount'), 
    '27500000')

WebUI.clearText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_Rp_monthlyInstallment'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_Rp_monthlyInstallment'), 
    '12500000')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/button_tenor 5'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/button_installment ADDM'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_QL Purchase Timeline'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/txt_Today purchase timeline'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/button_Have contacted with salesman before yes'))

WebUI.clearText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_QL NIK Borrower'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_QL NIK Borrower'), 
    '2345678901234567')

WebUI.clearText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_QL NIK Co-Borrower'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_QL NIK Co-Borrower'), 
    '1234567890123456')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/button_QL Trade-in-yes'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/button_isCreditProtection-no'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_QL Insurance'), 
    '3 AR')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/span_3 AR'))

WebUI.clearText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_QL Credit Package'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_QL Credit Package'), 
    'CUMA DI SEVA')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/span_CUMA DI SEVA'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/icon_x promo'))

WebUI.clearText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_QL Eligible Promo'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_QL Eligible Promo'), 
    'Free Upgrade 1 Tahun Asuransi Comprehensive')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/txt_Free Upgrade 1 Tahun Asuransi Comprehensive'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_Rp_monthlyInstallment'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_QL Leads Channel'), 
    'Paket Reguler - KTP')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/span_Paket Reguler - KTP'))

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_Dealer'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_Dealer'), 
    'Astra Daihatsu')

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/span_Astra Daihatsu'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/input_Rp_unitDiscount'), 
    '3305000')

WebUI.clearText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/textarea_notes'))

WebUI.setText(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/textarea_notes'), 
    'Update QL Info 123!')

WebUI.scrollToElement(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/h2_Leads Information'), 
    0)

WebUI.click(findTestObject('CRM/Tracking/Lead Tracking/New Car/03. Detail Leads - Edit Qualified Leads Info New Car/button_Save Changes'))

WebUI.waitForPageLoad(5)

WebUI.refresh()

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/h2_Leads Information'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_stage'), 
    'To be Assigned to Sales Agent')

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/h2_Qualified Leads Information'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_cm name'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/h2_A. CAR INFORMATION'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_brand'), 
    'Toyota')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_model'), 
    'All New Avanza')

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_variant'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_city'), 
    'Jakarta Pusat')

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_otr'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_QL Address Details'))

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_payment method'), 
    'Cash')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_dp before'), 
    'Rp 33.400.000')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_dp after'), 
    'Rp 27.500.000')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_monthly installment'), 
    'Rp 12.500.000')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_tenor'), 
    '5')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_installment type'), 
    'ADDM')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_contacted before'), 
    'Yes')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_dealer'), 
    'Astra Daihatsu')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_unit discount'), 
    'Rp 3.305.000')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_nik borrower'), 
    '2345678901234567')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_nik co borrower'), 
    '1234567890123456')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_trade in'), 
    'Yes')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_credit protection'), 
    'No')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_insurance'), 
    '3 AR')

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/h2_B. PURCHASE INFORMATION'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_credit package'), 
    'CUMA DI SEVA')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_promo'), 
    'Free Upgrade 1 Tahun Asuransi Comprehensive')

WebUI.verifyElementText(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_leads channel'), 
    'Paket Reguler - KTP')

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_notes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CRM/Tracking/Lead Tracking/New Car/02. Detail Leads - Qualified Leads Info New Car/txt_last modified'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

