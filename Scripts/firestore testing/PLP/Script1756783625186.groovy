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
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.ConditionType

WebUI.openBrowser('https://seva-next-828696580488.asia-southeast2.run.app/')

WebUI.setViewPortSize(570, 912)

WebUI.click(findTestObject('Object Repository/Homepage - PLP/label_menemani_perjalanan_finansial'))

try {
    CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))
}
catch (Exception e) {
    println('Popup Promo Selengkapnya tidak muncul, dilewati.')
} 

try {
    CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(8)
}
catch (Exception e) {
    println('Popup Update Seva tidak muncul, dilewati.')
} 

try {
    CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))
}
catch (Exception e) {
    println('Popup Pilih Lokasi tidak muncul, dilewati.')
} 

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

TestObject searchIcon = findTestObject('Object Repository/Homepage - PLP/seva_search_icon')
WebElement element = WebUiCommonHelper.findWebElement(searchIcon, 10)
WebUI.executeJavaScript("arguments[0].click();", Arrays.asList(element))


TestObject lihatSemua = findTestObject("Object Repository/Homepage - PLP/lihat_semua_mbl_baru")
WebElement element2 = WebUiCommonHelper.findWebElement(lihatSemua, 10)

// scroll pakai JS + klik pakai JS
WebUI.executeJavaScript("arguments[0].scrollIntoView(true);", Arrays.asList(element2))
WebUI.executeJavaScript("arguments[0].click();", Arrays.asList(element2))

WebUI.closeBrowser()

