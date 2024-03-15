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

if (open_browser.toString().equals('1')) {
    WebUI.callTestCase(findTestCase('Setir Kanan/SKMB004-Filter Mobil Bekas'), [('open_browser') : '1', ('close_browser') : '0'
            , ('url_skmb001') : url_skmb001, ('brand') : brand, ('tahun') : tahun, ('transmisi') : transmisi, ('plat') : plat
            , ('lokasi') : lokasi, ('kilometer') : kilometer, ('harga') : harga, ('navigateFilter_tambahan') : '', ('screen') : ''], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Homepage Component/button_Terapkan Filter'))
}

boolean loop = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Page Mobil Bekas/Navigator_Filter 1st'), 
    1)

while (loop == true) {
    navigatorFilter = WebUI.getText(findTestObject('Page Mobil Bekas/Navigator_Filter 1st'))

    WebUI.verifyElementPresent(findTestObject('Page Mobil Bekas/Navigator_Filter', [('filter') : navigatorFilter]), 0)

    WebUI.click(findTestObject('Page Mobil Bekas/Navigator_Filter_X 1st'))

    WebUI.waitForElementNotPresent(findTestObject('Page Mobil Bekas/Navigator_Filter', [('filter') : navigatorFilter]), 
        60)

    loop = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Page Mobil Bekas/Navigator_Filter 1st'), 
        1)
}

if (close_browser.toString().equals('1')) {
    WebUI.verifyElementNotPresent(findTestObject('Page Mobil Bekas/Navigator_Filter 1st'), 0)

    WebUI.closeBrowser()
}

