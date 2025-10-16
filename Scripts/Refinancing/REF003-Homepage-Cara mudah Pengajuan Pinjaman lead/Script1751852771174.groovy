import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject as TestObject
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.*
import java.util.Random as Random
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

// ==========================================
//  OPEN BROWSER
// ==========================================
if (open_browser.toString() == '1') {
    WebUI.openBrowser('https://seva.id')

    WebUI.setViewPortSize(570, 912)
}

//  CLOSE POPUP SEBELUM MULAI
boolean popupBefore = CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(5)

<<<<<<< HEAD
WebUI.waitForElementPresent(findTestObject('Homepage Component/Burger_Button_Baru'), 30)

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Homepage Component/Burger_Button_Baru'))

=======
WebUI.waitForElementPresent(findTestObject('Homepage Component/Button_Hamburger Menu'), 30)
WebUI.takeScreenshot()
WebUI.enhancedClick(findTestObject('Homepage Component/Button_Hamburger Menu'))
>>>>>>> 25a6dcb348291db1f6ec29c46282ada79afc256f
WebUI.delay(20)

if (popupBefore) {
    WebUI.comment('Popup muncul SEBELUM klik burger menu dan sudah ditutup')
}

WebUI.delay(15)

// Hapus iframe iklan
JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

js.executeScript('\n    var iframe = document.querySelector(\'iframe[id*="moe-onsite-campaign"]\');\n    if (iframe) { iframe.remove(); }\n')

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.delay(10)

// Hapus iframe iklan lagi di page refinancing
JavascriptExecutor jsrefi = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jsrefi.executeScript('\n    var iframe = document.querySelector(\'iframe[id*="moe-onsite-campaign"]\');\n    if (iframe) { iframe.remove(); }\n')

WebUI.click(findTestObject('HomeRefinancing/SubMenu_FasilitasDana'))

WebUI.delay(20)

// Verifikasi URL
String actURL = WebUI.getUrl()

WebUI.verifyMatch(actURL, expected_url, true)

// Scroll ke section "Cara mudah pengajuan pinjaman"
WebUI.scrollToElement(findTestObject('HomeRefinancing/responsive mode/Cara mudah pinjaman'), 10)

WebUI.click(findTestObject('HomeRefinancing/responsive mode/CTA di sini'))

// Isi data dasar
WebUI.setText(findTestObject('HomeRefinancing/responsive mode/input nama'), 'Hilmy Testing')

WebUI.setText(findTestObject('HomeRefinancing/responsive mode/input nomor'), '85349524555')

//WebUI.click(findTestObject('HomeRefinancing/responsive mode/dropdown svg'), FailureHandling.STOP_ON_FAILURE)
WebDriver driver = DriverFactory.getWebDriver()

TestObject dropdown = findTestObject('Object Repository/HomeRefinancing/responsive mode/dropdown svg')

WebElement element = WebUI.findWebElement(dropdown)

    ((driver) as JavascriptExecutor).executeScript('arguments[0].click();', element)

// ✅ Ambil semua dropdown yang aktif (buka)
// ✅ Ambil dropdown terakhir (biasanya yang baru diklik)
// ✅ Pilih salah satu random
// ✅ Scroll dan klik via JS agar React mengenali event
// ✅ Tunggu dropdown itu aja hilang
WebUI.click(findTestObject('Object Repository/HomeRefinancing/province'))

String province = selectRandomOption('Provinsi')

WebUI.click(findTestObject('Object Repository/HomeRefinancing/kabupaten'))

String kabupaten = selectRandomOption('Kabupaten')

WebUI.click(findTestObject('Object Repository/HomeRefinancing/kecamatan'))

String kecamatan = selectRandomOption('Kecamatan')

WebUI.click(findTestObject('Object Repository/HomeRefinancing/kelurahan'))

String kelurahan = selectRandomOption('Kelurahan')

//  ISI REFERRAL & CEKLIST
TestObject inputField = findTestObject('HomeRefinancing/responsive mode/input teman seva')

TestObject ceklistBtn = findTestObject('HomeRefinancing/responsive mode/cheklist saya setuju')

WebUI.setText(inputField, 'SEVA12')

WebUI.click(ceklistBtn)

WebUI.delay(5)

// Validasi referral code
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
WebUI.click(ceklistBtn)

WebUI.delay(5)

WebUI.click(findTestObject('HomeRefinancing/responsive mode/button_kirim'))

// Hapus iframe iklan
JavascriptExecutor js3 = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

js3.executeScript('\n    var iframe = document.querySelector(\'iframe[id*="moe-onsite-campaign"]\');\n    if (iframe) { iframe.remove(); }\n')

// MASUKKAN OTP
if (WebUI.waitForElementVisible(findTestObject('Login Register Component/Input_OTP'), 5, FailureHandling.OPTIONAL)) {
    WebUI.comment('Kondisi OTP normal - input OTP dulu')

    WebUI.setText(findTestObject('Login Register Component/Input_OTP'), OTP)
} else {
    WebUI.comment('Kondisi Bypass OTP')
}

WebUI.delay(5)

WebUI.switchToWindowIndex(0)

WebUI.waitForPageLoad(10)

WebUI.delay(2)

// API local storage
WebUI.callTestCase(findTestCase('Refinancing/API local storage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

// CLOSE BROWSER
WebUI.closeBrowser()

def selectRandomOption(String label) {
    WebDriver driver = DriverFactory.getWebDriver()

    WebDriverWait wait = new WebDriverWait(driver, 10)

    List<WebElement> allDropdowns = driver.findElements(By.xpath('//div[contains(@class,\'inputSelect_dropdownRefinancingCity\')]'))

    if (allDropdowns.size() == 0) {
        println("❌ Tidak ada dropdown aktif untuk $label")

        return null
    }
    
    WebElement activeDropdown = allDropdowns.last()

    List<WebElement> options = activeDropdown.findElements(By.xpath('.//button[not(contains(@style,\'display: none\'))]//div[contains(@class,\'inputSelect_dropdownItemText\')]'))

    println("🔍 Ditemukan $options.size() opsi untuk $label")

    if (options.size() == 0) {
        println("❌ Tidak ada opsi ditemukan untuk $label")

        return null
    }
    
    int randomIndex = new Random().nextInt(options.size())

    WebElement selected = options[randomIndex]

    String selectedText = selected.getText().trim()

    println("✅ $label terpilih: " + selectedText)

        ((driver) as JavascriptExecutor).executeScript('arguments[0].scrollIntoView(true);', selected)

    WebUI.delay(0.5)

        ((driver) as JavascriptExecutor).executeScript('arguments[0].click();', selected)

    wait.until(ExpectedConditions.invisibilityOf(activeDropdown))

    WebUI.delay(1)

    return selectedText
}

