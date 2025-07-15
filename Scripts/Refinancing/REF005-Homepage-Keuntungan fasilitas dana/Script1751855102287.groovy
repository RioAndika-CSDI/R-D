import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import groovy.json.JsonSlurper as JsonSlurper
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

if (open_browser.toString().equals('1')) {
    WebUI.openBrowser('https://www.seva.id')

    WebUI.setViewPortSize(570, 912 // Responsive mode
        )
}

WebUI.click(findTestObject('Homepage Component/Burger_Button_Baru'))

WebUI.delay(15)

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.click(findTestObject('HomeRefinancing/SubMenu_FasilitasDana'))

def actURL = WebUI.getUrl()

WebUI.verifyMatch(actURL, expected_url, true)

//When clicked, the screen should automatically scroll to FAQ section
//WebUI.scrollToElement(findTestObject('HomeRefinancing/responsive mode/Keuntungan fasilitas dana'), 10)
//
//WebUI.click(findTestObject('HomeRefinancing/responsive mode/keuntungan fasilitas dana to FAQ/bunga mulai'))
//
//WebUI.scrollToElement(findTestObject('HomeRefinancing/responsive mode/keuntungan fasilitas dana to FAQ/FAQ scroll'), 10)
//
//
//WebUI.scrollToElement(findTestObject('HomeRefinancing/responsive mode/Keuntungan fasilitas dana'), 10)
//
//WebUI.click(findTestObject('HomeRefinancing/responsive mode/keuntungan fasilitas dana to FAQ/Dana cair'))
//
//WebUI.scrollToElement(findTestObject('HomeRefinancing/responsive mode/keuntungan fasilitas dana to FAQ/FAQ scroll'), 10)
//
//
//WebUI.scrollToElement(findTestObject('HomeRefinancing/responsive mode/Keuntungan fasilitas dana'), 10)
//
//WebUI.click(findTestObject('HomeRefinancing/responsive mode/keuntungan fasilitas dana to FAQ/tenor sampai'))
//
//WebUI.scrollToElement(findTestObject('HomeRefinancing/responsive mode/keuntungan fasilitas dana to FAQ/FAQ scroll'), 10)
//
//
//WebUI.scrollToElement(findTestObject('HomeRefinancing/responsive mode/Keuntungan fasilitas dana'), 10)
//
//WebUI.click(findTestObject('HomeRefinancing/responsive mode/keuntungan fasilitas dana to FAQ/terpercaya bagian astra'))
//
//WebUI.scrollToElement(findTestObject('HomeRefinancing/responsive mode/keuntungan fasilitas dana to FAQ/FAQ scroll'), 10)
//
//
//WebUI.scrollToElement(findTestObject('HomeRefinancing/responsive mode/Keuntungan fasilitas dana'), 10)
//
//WebUI.click(findTestObject('HomeRefinancing/responsive mode/keuntungan fasilitas dana to FAQ/proses cepat'))
//
//WebUI.scrollToElement(findTestObject('HomeRefinancing/responsive mode/keuntungan fasilitas dana to FAQ/FAQ scroll'), 10)
//
//
//WebUI.scrollToElement(findTestObject('HomeRefinancing/responsive mode/Keuntungan fasilitas dana'), 10)
//
//WebUI.click(findTestObject('HomeRefinancing/responsive mode/keuntungan fasilitas dana to FAQ/pengajuan mudah'))
//
//WebUI.scrollToElement(findTestObject('HomeRefinancing/responsive mode/keuntungan fasilitas dana to FAQ/FAQ scroll'), 10)
//Submit leads
WebUI.scrollToElement(findTestObject('HomeRefinancing/responsive mode/Keuntungan fasilitas dana'), 10)

WebUI.click(findTestObject('HomeRefinancing/responsive mode/CTA keuntungan refi'))

WebUI.setText(findTestObject('HomeRefinancing/responsive mode/input nama'), 'Hilmy Testing')

WebUI.setText(findTestObject('HomeRefinancing/responsive mode/input nomor'), '85349524555')

WebUI.click(findTestObject('HomeRefinancing/responsive mode/dropdown svg'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('HomeRefinancing/responsive mode/dropdown lokasi'))

def inputField = findTestObject('HomeRefinancing/responsive mode/input teman seva')

def ceklistBtn = findTestObject('HomeRefinancing/responsive mode/cheklist saya setuju')

WebUI.setText(inputField, 'SEVA12')

WebUI.click(ceklistBtn)

WebUI.delay(1)

if (WebUI.verifyElementPresent(findTestObject('HomeRefinancing/responsive mode/error reff code'), 5, FailureHandling.OPTIONAL)) {
    WebUI.comment('❌ Kode referral SEVA12 tidak valid, diganti SEVAF8RS')

    WebUI.sendKeys(inputField, Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(inputField, Keys.chord(Keys.BACK_SPACE))

    WebUI.setText(inputField, 'SEVANV6B')

    WebUI.click(ceklistBtn)
} else {
    WebUI.comment('✅ Referral code SEVA12 tidak menimbulkan error UI')
}

// SUBMIT
WebUI.click(findTestObject('HomeRefinancing/responsive mode/dropdown svg'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('HomeRefinancing/responsive mode/dropdown lokasi'))

WebUI.click(ceklistBtn)

WebUI.delay(5)

WebUI.click(findTestObject('HomeRefinancing/responsive mode/button_kirim'))

// MASUKKAN OTP
WebUI.setText(findTestObject('Login Register Component/Input_OTP'), OTP)

WebUI.switchToWindowIndex(1)

WebUI.delay(5)

WebUI.switchToWindowIndex(0)

WebUI.waitForPageLoad(10)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Refinancing/API local storage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

