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
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.interactions.Actions


if (open_browser.toString().equals('1')) {
    WebUI.openBrowser('seva.id')
	WebUI.setViewPortSize(570, 912)
}



WebUI.waitForElementPresent(findTestObject('Homepage Component/Burger_Button_Baru'), 30)
WebUI.takeScreenshot()
WebUI.enhancedClick(findTestObject('Homepage Component/Burger_Button_Baru'))
WebUI.delay(10)


JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()
js.executeScript("""
    var iframe = document.querySelector('iframe[id*="moe-onsite-campaign"]');
    if (iframe) {
        iframe.remove();
    }
""")
WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.delay(10)

JavascriptExecutor jsrefi = (JavascriptExecutor) DriverFactory.getWebDriver()
jsrefi.executeScript("""
    var iframe = document.querySelector('iframe[id*="moe-onsite-campaign"]');
    if (iframe) {
        iframe.remove();
    }
""")

WebUI.click(findTestObject('HomeRefinancing/SubMenu_FasilitasDana'))

def actURL = WebUI.getUrl()

WebUI.verifyMatch(actURL, expected_url, true)
JavascriptExecutor jsgeturl = (JavascriptExecutor) DriverFactory.getWebDriver()
jsgeturl.executeScript("""
    var iframe = document.querySelector('iframe[id*="moe-onsite-campaign"]');
    if (iframe) {
        iframe.remove();
    }
""")

WebUI.click(findTestObject('HomeRefinancing/Button_AjukanSekarang'))

WebUI.setText(findTestObject('HomeRefinancing/responsive mode/input nama'), 'Hilmy Testing')

WebUI.setText(findTestObject('HomeRefinancing/responsive mode/input nomor'), '85349524555')


//WebUI.click(findTestObject('HomeRefinancing/responsive mode/dropdown svg'), FailureHandling.STOP_ON_FAILURE)
WebDriver driver = DriverFactory.getWebDriver()
TestObject dropdown = findTestObject('Object Repository/HomeRefinancing/responsive mode/dropdown svg')
WebElement element = WebUI.findWebElement(dropdown)
((JavascriptExecutor) driver).executeScript("arguments[0].click();", element)

def selectRandomOption(String label) {
	WebDriver driver = DriverFactory.getWebDriver()
	WebDriverWait wait = new WebDriverWait(driver, 10)

	// ✅ Ambil semua dropdown yang aktif (buka)
	List<WebElement> allDropdowns = driver.findElements(By.xpath("//div[contains(@class,'inputSelect_dropdownRefinancingCity')]"))
	if (allDropdowns.size() == 0) {
		println("❌ Tidak ada dropdown aktif untuk ${label}")
		return null
	}

	// ✅ Ambil dropdown terakhir (biasanya yang baru diklik)
	WebElement activeDropdown = allDropdowns.last()
	List<WebElement> options = activeDropdown.findElements(By.xpath(".//button[not(contains(@style,'display: none'))]//div[contains(@class,'inputSelect_dropdownItemText')]"))

	println("🔍 Ditemukan ${options.size()} opsi untuk ${label}")

	if (options.size() == 0) {
		println("❌ Tidak ada opsi ditemukan untuk ${label}")
		return null
	}

// ✅ Pilih salah satu random
int randomIndex = new Random().nextInt(options.size())
WebElement selected = options[randomIndex]
String selectedText = selected.getText().trim()
println("✅ ${label} terpilih: " + selectedText)

// ✅ Scroll dan klik via JS agar React mengenali event
((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selected)
WebUI.delay(0.5)
((JavascriptExecutor) driver).executeScript("arguments[0].click();", selected)

// ✅ Tunggu dropdown itu aja hilang
wait.until(ExpectedConditions.invisibilityOf(activeDropdown))

WebUI.delay(1)
return selectedText

}
WebUI.click(findTestObject('Object Repository/HomeRefinancing/province'))
String province = selectRandomOption("Provinsi")

WebUI.click(findTestObject('Object Repository/HomeRefinancing/kabupaten'))
String kabupaten = selectRandomOption("Kabupaten")

WebUI.click(findTestObject('Object Repository/HomeRefinancing/kecamatan'))
String kecamatan = selectRandomOption("Kecamatan")

WebUI.click(findTestObject('Object Repository/HomeRefinancing/kelurahan'))
String kelurahan = selectRandomOption("Kelurahan")
 

 def inputField = findTestObject('HomeRefinancing/responsive mode/input teman seva')
 
 def ceklistBtn = findTestObject('HomeRefinancing/responsive mode/cheklist saya setuju')
 
 WebUI.setText(inputField, 'SEVA12')
 
 WebUI.click(ceklistBtn)
 
 WebUI.delay(5)
 
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
 
 // MASUKKAN OTP
 JavascriptExecutor js3 = (JavascriptExecutor) DriverFactory.getWebDriver()
 js3.executeScript("""
    var iframe = document.querySelector('iframe[id*="moe-onsite-campaign"]');
    if (iframe) {
        iframe.remove();
    }
""")
 
 // Cek kondisi toggle bypass OTP
 if (WebUI.waitForElementVisible(findTestObject('Login Register Component/Input_OTP'), 5, FailureHandling.OPTIONAL)) {
	 WebUI.comment("Kondisi OTP normal - input OTP dulu")
	 WebUI.setText(findTestObject('Login Register Component/Input_OTP'), OTP)
 } else {
	 WebUI.comment("Kondisi Bypass OTP")
 }
 
 //WebUI.switchToWindowIndex(1)
 
 WebUI.delay(5)
 
 WebUI.switchToWindowIndex(0)
 
 WebUI.waitForPageLoad(10)
 
 WebUI.delay(2)
 
 
 WebUI.delay(2)
 
 WebUI.callTestCase(findTestCase('Refinancing/API local storage'), [:], FailureHandling.CONTINUE_ON_FAILURE)
 
 WebUI.closeBrowser()
 
 


