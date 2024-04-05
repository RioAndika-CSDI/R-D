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

WebUI.scrollToElement(findTestObject('Homepage Component/label_Tab Kategori Semua'), 0)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

aslFrame = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Homepage Component/Frame_ASL'), 
    30)

if (aslFrame == true) {
    WebUI.switchToFrame(findTestObject('Homepage Component/Frame_ASL'), 0)

    WebUI.click(findTestObject('Homepage Component/Close_ASL_Banner'))

    WebUI.switchToWindowIndex(0)
}

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

int jumlahTab = 1

loop = true

while (loop == true) {
    cek = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Homepage Component/label_Tab Kategori Artikel by id', 
            [('id') : jumlahTab]), 2)

    if (cek == true) {
        jumlahTab = (jumlahTab + 1)
    } else {
        jumlahTab = (jumlahTab - 1)

        break
    }
}

WebUI.comment(jumlahTab.toString())

for (int i = 2; i <= jumlahTab; i++) {
    kategori = WebUI.getText(findTestObject('Homepage Component/label_Tab Kategori Artikel by id', [('id') : i]))

    WebUI.click(findTestObject('Homepage Component/label_Tab Kategori Artikel by id', [('id') : i]))

    WebUI.waitForElementPresent(findTestObject('Homepage Component/label_Artikel List Card Kategori by Text dan Id', [('kategori') : kategori
                , ('id') : '1']), 120)

    loop = true

    int index = 1

    while (loop == true) {
        loop = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Homepage Component/label_Artikel List Card Kategori by id', 
                [('id') : index]), 1)

        if (loop == false) {
            index = (index - 1)

            break
        }
        
        index = (index + 1)
    }
    
    WebUI.verifyLessThanOrEqual(index, 3)

    for (int j = 1; j <= index; j++) {
        WebUI.verifyElementPresent(findTestObject('Homepage Component/label_Artikel List Card Kategori by Text dan Id', 
                [('kategori') : kategori, ('id') : j]), 0)
    }
}

if (close_browser.toString().equals('1')) {
    WebUI.closeBrowser()
}

