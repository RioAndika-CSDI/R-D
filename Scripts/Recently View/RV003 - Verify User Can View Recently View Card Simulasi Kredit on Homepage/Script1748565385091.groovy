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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser(GlobalVariable.Prod)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/h1_Menemani Perjalanan Finansial Mobil Barumu'))

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Promo Selengkapnya'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(5)

CustomKeywords.'ignore_warning_optional.ignore_warning.clickIgnoreWarning'(findTestObject('Homepage - PLP/button_Nanti Saja_Popup Pilih Lokasi'))

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.verifyElementNotPresent(findTestObject('Homepage Recently View/label Lanjutkan Pencarianmu homepage'), 0)

WebUI.scrollToElement(findTestObject('Homepage Recently View/Homepage Car Name'), 0)

WebUI.click(findTestObject('Homepage Recently View/Homepage Car Name', [('car_name') : car_name]))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Homepage Recently View/PDP Tab Kredit'), 0)

WebUI.delay(3)

TestObject tabKredit = findTestObject('Homepage Recently View/PDP Tab Kredit')

WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(WebUI.findWebElement(tabKredit)))

WebUI.delay(5)

// ==== SIMULASI KREDIT ====
systemos = System.getProperty('os.name')

String[] os = systemos.split(' ')

WebUI.comment(os[0])

WebUI.scrollToElement(findTestObject('Kualifikasi-Kredit/Loan-Calculator/span_Cicil Mobil Impianmu dengan Mudah'), 0)

WebUI.delay(3)

//skip proses select

WebUI.click(findTestObject('Homepage Recently View/PDP Income'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Homepage Recently View/PDP Income'), '20000000')

WebUI.click(findTestObject('Homepage Recently View/PDP Kategori Umur'))

WebUI.click(findTestObject('Homepage Recently View/PDP Umur Dropdown'))

WebUI.click(findTestObject('Homepage Recently View/PDP button Simulasi Kredit'))
// ========================

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Homepage Recently View/PDP cardVariantOptions_title'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

// --- Klik Logo Seva ---
WebUI.scrollToElement(findTestObject('Homepage Desktop Mode/seva-logo-desktop'), 0)

WebUI.delay(15)

TestObject Logo_Seva = findTestObject('Homepage Desktop Mode/seva-logo-desktop')

WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(WebUI.findWebElement(Logo_Seva)))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Homepage Recently View/label Lanjutkan Pencarianmu homepage'), 0)

WebUI.verifyElementPresent(findTestObject('Homepage Recently View/label Lanjutkan Pencarianmu homepage'), 0)

String get_text_car_name_recently_view = WebUI.getText(findTestObject('Homepage Recently View/recently view - lihat card - car name', 
        [('recently_view_type') : 'Simulasi Kredit']))

String car_name_recently_view = get_text_car_name_recently_view.split(' 1.0 M MT')[0]

WebUI.verifyMatch(car_name, car_name_recently_view, false)

