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

WebUI.callTestCase(findTestCase('Recently View/RV001 - Verify User Can View Recently View Card Lihat on Homepage'), [:], 
    FailureHandling.STOP_ON_FAILURE)

String get_text_car_name_recently_view_v2 = WebUI.getText(findTestObject('Homepage Recently View/recently view - lihat card - car name', 
        [('recently_view_type') : 'Dilihat']))

String car_name_recently_view_v2 = get_text_car_name_recently_view_v2.split(' 1.0 M MT')[0]

WebUI.click(findTestObject('Homepage Recently View/recently view card header section', [('recently_view_type') : 'Dilihat']))

WebUI.delay(3)

String expected_url = 'https://www.seva.id/mobil-baru/'

String current_url = WebUI.getUrl()

assert current_url.contains(expected_url)

//String car_name_pdp = WebUI.getText(findTestObject('Homepage Recently View/PDP Car Name'))

WebUI.verifyMatch(car_name_recently_view_v2, car_name, false)

