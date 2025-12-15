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

WebUI.navigateToUrl('https://seva-cms-frontend-bihodfa3ja-et.a.run.app/login')

WebUI.setText(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/input_Email_rounded-4px h-40px block w-full_273a50'), 
    'ayu.anggraini@seva.id')

WebUI.setText(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/input_Full Comprehensive, 1 of 2_react-sele_856d9f'), 
    'full')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/input_Password_rounded-4px h-40px block w-f_cb84c0'), 
    'TtTW+eVCo63Sb0pi9j/39g==')

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/span_Calculator Management'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/input_Calculator Management_h-40px block w-_2702c3'))

WebUI.setText(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/input_Calculator Management_h-40px block w-_2702c3_1'), 
    'commercial')

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/path'))

WebUI.setText(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/input__otr'), 
    'Rp. 175.000.000')

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/div_Select_my-react-select__input-container_753168'))

WebUI.setText(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/input_Jakarta Pusat, 1 of 1_react-select-34-input'), 
    'jakarta pusat')

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/div_Jakarta Pusat'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/div_Select_my-react-select__input-container_753168_1'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/div_Full Total Loss Only_Tenor1'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/div_Select_my-react-select__input-container_753168_2'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/div_Full Comprehensive_Tenor2'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/svg_Full Comprehensive_css-8mmkcg'))

WebUI.setText(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/input_tipeasuransiTenor2'), 
    'full')

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/div_Full Total Loss Only_Tenor2'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/svg_Full Total Loss Only_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/div_1 Tahun Comprehensive  1 Tahun TLO'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/div_Select_my-react-select__input-container_753168_3'))

WebUI.setText(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/input_tipeasuransiTenor3'), 
    'full')

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/div_Full Comprehensive_Tenor3'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/div_Full Comprehensive_my-react-select__ind_645267'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/value_asuransi_tenor3_1TahunComprehensive2TahunTLO'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/path'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/div_2 Tahun Comprehensive  1 Tahun TLO'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/svg_Full Comprehensive, 1 of 4_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/div_Full Total Loss Only_Tenor3'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/path'))

WebUI.setText(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/input_tipeasuransiTenor4'), 
    'full')

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/div_Full Comprehensive_Tenor4'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/svg_Full Comprehensive_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/value_asuransi_tenor4_1TahunComprehensive3TahunTLO'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/path'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/value_asuransi_tenor4_2TahunComprehensive2TahunTLO'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/path'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/div_3 Tahun Comprehensive  1 Tahun TLO'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/svg_Full Comprehensive, 1 of 5_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/div_Full Total Loss Only_Tenor4'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/button_Run Simulation'))

WebUI.click(findTestObject('Object Repository/Page_CMS_new/Page_Run_Simulation/Page_SEVA CMS/Page_SEVA CMS/div_Calculator SimulationOTRKotaJakarta Pus_ff72d9'))

