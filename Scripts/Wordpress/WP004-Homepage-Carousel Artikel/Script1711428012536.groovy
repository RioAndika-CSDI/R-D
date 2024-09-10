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
    WebUI.openBrowser('seva.id')
}

WebUI.scrollToElement(findTestObject('Homepage Component/Label_Artikel Terkini'), 0)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(15)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

WebUI.verifyElementPresent(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '1']), 0)

for (int i = 1; i <= 3; i++) {
    WebUI.click(findTestObject('Homepage Component/Icon_Carousel Artikel', [('id') : i]))

    carousel1 = WebUI.getAttribute(findTestObject('Homepage Component/Icon_Carousel Artikel', [('id') : '1']), 'class')

    carousel2 = WebUI.getAttribute(findTestObject('Homepage Component/Icon_Carousel Artikel', [('id') : '2']), 'class')

    carousel3 = WebUI.getAttribute(findTestObject('Homepage Component/Icon_Carousel Artikel', [('id') : '3']), 'class')

    boolean crs1 = false

    boolean crs2 = false

    boolean crs3 = false

    if (i == 1) {
        crs1 = true

        WebUI.verifyElementVisible(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '1']))

        WebUI.verifyElementNotVisible(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '2']))

        WebUI.verifyElementNotVisible(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '3']))
    } else if (i == 2) {
        crs2 = true

        WebUI.verifyElementVisible(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '2']))

        WebUI.verifyElementNotVisible(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '1']))

        WebUI.verifyElementNotVisible(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '3']))
    } else if (i == 3) {
        crs3 = true

        WebUI.verifyElementVisible(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '3']))

        WebUI.verifyElementNotVisible(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '1']))

        WebUI.verifyElementNotVisible(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '2']))
    }
    
    if (carousel1.equals('articleWidget_bullet__gzA04 articleWidget_bulletActive__aX7b8') == crs1) {
        WebUI.verifyMatch('true', 'true', true)
    } else {
        WebUI.verifyMatch('true', 'false', true)
    }
    
    if (carousel2.equals('articleWidget_bullet__gzA04 articleWidget_bulletActive__aX7b8') == crs2) {
        WebUI.verifyMatch('true', 'true', true)
    } else {
        WebUI.verifyMatch('true', 'false', true)
    }
    
    if (carousel3.equals('articleWidget_bullet__gzA04 articleWidget_bulletActive__aX7b8') == crs3) {
        WebUI.verifyMatch('true', 'true', true)
    } else {
        WebUI.verifyMatch('true', 'false', true)
    }
}

for (int i = 3; i >= 1; i--) {
    WebUI.click(findTestObject('Homepage Component/Icon_Carousel Artikel', [('id') : i]))

    carousel1 = WebUI.getAttribute(findTestObject('Homepage Component/Icon_Carousel Artikel', [('id') : '1']), 'class')

    carousel2 = WebUI.getAttribute(findTestObject('Homepage Component/Icon_Carousel Artikel', [('id') : '2']), 'class')

    carousel3 = WebUI.getAttribute(findTestObject('Homepage Component/Icon_Carousel Artikel', [('id') : '3']), 'class')

    boolean crs1 = false

    boolean crs2 = false

    boolean crs3 = false

    if (i == 1) {
        crs1 = true

        WebUI.verifyElementVisible(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '1']))

        WebUI.verifyElementNotVisible(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '2']))

        WebUI.verifyElementNotVisible(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '3']))
    } else if (i == 2) {
        crs2 = true

        WebUI.verifyElementVisible(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '2']))

        WebUI.verifyElementNotVisible(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '1']))

        WebUI.verifyElementNotVisible(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '3']))
    } else if (i == 3) {
        crs3 = true

        WebUI.verifyElementVisible(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '3']))

        WebUI.verifyElementNotVisible(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '1']))

        WebUI.verifyElementNotVisible(findTestObject('Homepage Component/Data_Artikel Carousel', [('id') : '2']))
    }
    
    if (carousel1.equals('articleWidget_bullet__gzA04 articleWidget_bulletActive__aX7b8') == crs1) {
        WebUI.verifyMatch('true', 'true', true)
    } else {
        WebUI.verifyMatch('true', 'false', true)
    }
    
    if (carousel2.equals('articleWidget_bullet__gzA04 articleWidget_bulletActive__aX7b8') == crs2) {
        WebUI.verifyMatch('true', 'true', true)
    } else {
        WebUI.verifyMatch('true', 'false', true)
    }
    
    if (carousel3.equals('articleWidget_bullet__gzA04 articleWidget_bulletActive__aX7b8') == crs3) {
        WebUI.verifyMatch('true', 'true', true)
    } else {
        WebUI.verifyMatch('true', 'false', true)
    }
}

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

