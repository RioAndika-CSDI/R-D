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
    WebUI.callTestCase(findTestCase('Wordpress/WP001-Homepage-Akses Main Page Blog Melalui Burgaer Menu'), [('expected_url') : expected_url
            , ('open_browser') : '1', ('close_browser') : '0'], FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Page Blog Main/Label_Section Berita Baru'), FailureHandling.STOP_ON_FAILURE)

for (int i = 0; i < 3; i++) {
    WebUI.click(findTestObject('Page Blog Main/Icon_Carousel by id', [('id') : i + 1]))

    WebUI.verifyElementVisible(findTestObject('Page Blog Main/Data_Berita Terbaru_Slider by id', [('id') : i]))

    WebUI.verifyElementNotVisible(findTestObject('Page Blog Main/Data_Berita Terbaru_Slider by id', [('id') : i + 1]))

    WebUI.verifyElementPresent(findTestObject('Page Blog Main/Icon_Carousel Aktif by id', [('id') : i + 1]), 1)
}

for (int i = 2; i > 0; i--) {
    WebUI.click(findTestObject('Page Blog Main/Icon_Carousel by id', [('id') : i]))

    WebUI.verifyElementVisible(findTestObject('Page Blog Main/Data_Berita Terbaru_Slider by id', [('id') : i - 1]))

    WebUI.verifyElementNotVisible(findTestObject('Page Blog Main/Data_Berita Terbaru_Slider by id', [('id') : i]))

    WebUI.verifyElementPresent(findTestObject('Page Blog Main/Icon_Carousel Aktif by id', [('id') : i]), 1)
}

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

