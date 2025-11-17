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

WebUI.openBrowser(GlobalVariable.Prod)

WebUI.setViewPortSize(500, 736)

WebUI.scrollToElement(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/h2_Rekomendasi'), 
    0)

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

if (tab == 'Semua') {
    //    WebUI.click(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/h3_Semua'), 
    //        FailureHandling.STOP_ON_FAILURE // Optionally, you can handle what happens if 'tab' is not "a"
    //        )
} else if (tab == 'Toyota') {
    WebUI.click(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/div_Toyota'))
} else if (tab == 'Daihatsu') {
    WebUI.click(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/div_Daihatsu'))
} else if (tab == 'Isuzu') {
    WebUI.click(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/div_Isuzu'))
} else if (tab == 'BMW') {
    WebUI.click(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/div_BMW'))
} else if (tab == 'Hyundai') {
    WebUI.click(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/div_Hyundai'))
} else if (tab == 'Wuling') {
    WebUI.click(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/div_Hyundai'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('CRM/Homepage/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/div_wuling'))
} else if (tab == 'BYD') {
    WebUI.click(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/div_Hyundai'))

    WebUI.click(findTestObject('CRM/Homepage/Page_SEVA - Beli Mobil Baru Dengan Cicilan Kredit Terbaik/div_byd'))
} else {
}

WebUI.click(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Hitung Kemampuan', 
        [('mobil') : mobil]))

WebUI.waitForElementPresent(findTestObject('Page Kemampuan Kredit/Title Kemampuan Kredit'), 0)

WebUI.waitForElementNotPresent(findTestObject('Page Kemampuan Kredit/Model Mobil Null'), 0)

WebUI.waitForElementNotPresent(findTestObject('Page Kemampuan Kredit/Varian Mobil Null'), 0)

WebUI.waitForElementNotPresent(findTestObject('Page Kemampuan Kredit/DP Mobil Null'), 0)

WebUI.setText(findTestObject('Object Repository/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Rekomendasi Cicilan Ideal_0 input_inp_acd316'), 
    'Rp20.000.000')

WebUI.click(findTestObject('Object Repository/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/input_Rekomendasi Cicilan Ideal_inputSelect_f8ef70'))

WebUI.click(findTestObject('Object Repository/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/div_18-27'))

WebUI.click(findTestObject('Object Repository/Page_SEVA - Beli Mobil Terbaru Dengan Cicil_d51314/button_Hitung Kemampuan'))

WebUI.closeBrowser()

