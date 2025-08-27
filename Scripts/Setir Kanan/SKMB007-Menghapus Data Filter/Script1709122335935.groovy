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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import java.util.Arrays as Arrays
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.JavascriptExecutor

systemos = System.getProperty('os.name')

String[] os = systemos.split(' ')

WebUI.comment(os[0])

if (open_browser.toString().equals('1')) {
    WebUI.callTestCase(findTestCase('Setir Kanan/SKMB003-Cari Mobil Bekas Hompage dengan filter'), [('model') : 'Toyota Agya;Toyota Calya'
            , ('brand') : 'Toyota;Daihatsu', ('tahun') : '2016-2020', ('transmisi') : 'Manual;Otomatis', ('expected_url') : 'https://www.seva.id/mobil-bekas/'
            , ('screen') : '', ('open_browser') : '1', ('close_browser') : '1'], FailureHandling.STOP_ON_FAILURE)
}

JavascriptExecutor jsbefore2 = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jsbefore2.executeScript('\n    var iframe = document.querySelector(\'iframe[id*="moe-onsite-campaign"]\');\n    if (iframe) {\n        iframe.remove();\n    }\n')

while (true) {
    List<WebElement> activeFilters = WebUiCommonHelper.findWebElements(findTestObject('used car/filter_remove_button'), 
        5)

    int count = activeFilters.size()

    WebUI.comment('Jumlah filter aktif: ' + count)

    if (count == 0) {
        WebUI.comment(' Semua filter sudah terhapus')

        break
    }
    
    // klik yang pertama (index 0) biar aman
    WebElement btnX = activeFilters[0]

    WebUI.executeJavaScript('arguments[0].scrollIntoView(true);', Arrays.asList(btnX))

    WebUI.delay(1)

    WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(btnX))

    WebUI.delay(1)
}

