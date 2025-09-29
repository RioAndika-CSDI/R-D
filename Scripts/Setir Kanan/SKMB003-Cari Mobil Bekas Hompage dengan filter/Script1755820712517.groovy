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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import java.util.Random as Random
import org.openqa.selenium.interactions.Actions as Actions


if (open_browser.toString().equals('1')) {
    WebUI.openBrowser('seva.id')

    WebUI.setViewPortSize(570, 912)
}

JavascriptExecutor jsbefore = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jsbefore.executeScript('\n    var iframe = document.querySelector(\'iframe[id*="moe-onsite-campaign"]\');\n    if (iframe) {\n        iframe.remove();\n    }\n')

WebUI.click(findTestObject('Homepage Component/Burger_Button_Baru'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.click(findTestObject('Object Repository/Page Mobil Bekas/menu_mobilBekas_burgerMenu'))

WebUI.click(findTestObject('Object Repository/Page Mobil Bekas/lihat_semua_mobilBekas_burgerMenu'))

WebUI.delay(15)

WebUI.click(findTestObject('used car/filter'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('used car/detail mobil'), 10)

WebUI.click(findTestObject('used car/detail mobil'))

// Merek mobil
List<WebElement> allButtons = WebUiCommonHelper.findWebElements(findTestObject('used car/all button merek'), 10)

WebUI.comment('Total button ketemu: ' + allButtons.size())

for (int i = 0; i < allButtons.size(); i++) {
    WebElement btn = allButtons[i]

    WebUI.executeJavaScript('arguments[0].scrollIntoView(true);', Arrays.asList(btn))

    WebUI.delay(1)

    WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(btn))
}

Random rand = new Random()

int randomIndex = rand.nextInt(allButtons.size())

WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(allButtons[randomIndex]))

WebUI.comment('Sudah klik semua button, lalu random pilih index: ' + randomIndex)

//tipe mobil 
List<WebElement> allButtonsTipe = WebUiCommonHelper.findWebElements(findTestObject('used car/all button tipe'), 10)

WebUI.comment('Total button ketemu: ' + allButtonsTipe.size())

for (int i = 0; i < allButtonsTipe.size(); i++) {
    WebElement btnTipe = allButtonsTipe[i]

    WebUI.executeJavaScript('arguments[0].scrollIntoView(true);', Arrays.asList(btnTipe))

    WebUI.delay(1)

    WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(btnTipe))
}

Random randTipe = new Random()

int randomIndexTipe = randTipe.nextInt(allButtonsTipe.size())

WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(allButtonsTipe[randomIndexTipe]))

WebUI.comment('Sudah klik semua button, lalu random pilih index: ' + randomIndexTipe)

//input tahun
WebUI.setText(findTestObject('used car/tahunLeft'), '100')

WebUI.sendKeys(findTestObject('used car/tahunLeft'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

boolean isError = WebUI.verifyElementPresent(findTestObject('used car/tahunLeft_errorMsg'), 2, FailureHandling.OPTIONAL)

if (isError) {
    WebUI.comment('Input asal tahunLeft muncul error')

    WebUI.setText(findTestObject('used car/tahunLeft'), '2015')

    WebUI.sendKeys(findTestObject('used car/tahunLeft'), Keys.chord(Keys.ENTER))

    String finalYear = WebUI.getAttribute(findTestObject('used car/tahunLeft'), 'value')

    // cek apakah auto-correct
    if (finalYear != '2015') {
        WebUI.comment('TahunLeft di-auto-correct ke: ' + finalYear)

        KeywordUtil.markWarning('Expected 2015 tapi diubah sistem jadi: ' + finalYear)
    } else {
        WebUI.comment('Tahun Left berhasil diubah ke: ' + finalYear)
    }
}

WebUI.setText(findTestObject('used car/tahunRight'), '30')

WebUI.sendKeys(findTestObject('used car/tahunRight'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

boolean isErrorRight = WebUI.verifyElementPresent(findTestObject('used car/tahunRight_errorMsg'), 2, FailureHandling.OPTIONAL)

if (isErrorRight) {
    WebUI.comment('Input asal tahunRight muncul error')

    WebUI.setText(findTestObject('used car/tahunRight'), '2023')

    WebUI.sendKeys(findTestObject('used car/tahunRight'), Keys.chord(Keys.ENTER))

    String finalYearRight = WebUI.getAttribute(findTestObject('used car/tahunRight'), 'value')

    if (finalYearRight != '2023') {
        WebUI.comment('TahunRight di-auto-correct ke: ' + finalYearRight)

        KeywordUtil.markWarning('Expected 2023 tapi diubah sistem jadi: ' + finalYearRight)
    } else {
        WebUI.comment('Tahun Right berhasil diubah ke: ' + finalYearRight)
    }
}

// transmisi
List<WebElement> allButtonstransmisi = WebUiCommonHelper.findWebElements(findTestObject('used car/all button transmis'), 
    10)

WebUI.comment('Total button ketemu: ' + allButtonstransmisi.size())

for (int i = 0; i < allButtonstransmisi.size(); i++) {
    WebElement btnTransmisi = allButtonstransmisi[i]

    WebUI.executeJavaScript('arguments[0].scrollIntoView(true);', Arrays.asList(btnTransmisi))

    WebUI.delay(1)

    WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(btnTransmisi))
}

Random randTrans = new Random()

int randomIndexTrans = randTrans.nextInt(allButtonstransmisi.size())

WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(allButtonstransmisi[randomIndexTrans]))

WebUI.comment('Sudah klik semua button, lalu random pilih index: ' + randomIndexTrans)

// plat nomer 
List<WebElement> allButtonsPlat = WebUiCommonHelper.findWebElements(findTestObject('used car/all button plat nomor'), 10)

WebUI.comment('Total button ketemu: ' + allButtonsPlat.size())

for (int i = 0; i < allButtonsPlat.size(); i++) {
    WebElement btnPlat = allButtonsPlat[i]

    WebUI.executeJavaScript('arguments[0].scrollIntoView(true);', Arrays.asList(btnPlat))

    WebUI.delay(1)

    WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(btnPlat))
}

Random randPlat = new Random()

int randomIndexPlat = randPlat.nextInt(allButtonsPlat.size())

WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(allButtonsPlat[randomIndexPlat]))

WebUI.comment('Sudah klik semua button, lalu random pilih index: ' + randomIndexPlat)

//lokasi 
WebUI.click(findTestObject('used car/dropdownLokasi'))

WebUI.click(findTestObject('used car/lokasi_balikpapan'))

WebUI.delay(1)

WebUI.click(findTestObject('used car/lokasi_bandung'))

WebUI.click(findTestObject('used car/outsideOverlay'))

WebUI.delay(1)

// kilometer
WebUI.setText(findTestObject('used car/minimum'), '100')

WebUI.sendKeys(findTestObject('used car/minimum'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

boolean isErrorMin = WebUI.verifyElementPresent(findTestObject('used car/minimum_errorMsg'), 2, FailureHandling.OPTIONAL)

if (isErrorMin) {
    WebUI.comment('Input asal Minimum muncul error')

    WebUI.setText(findTestObject('used car/minimum'), '1.514')

    WebUI.sendKeys(findTestObject('used car/minimum'), Keys.chord(Keys.ENTER))

    String finalMin = WebUI.getAttribute(findTestObject('used car/minimum'), 'value')

    if (finalMin != '1.514') {
        WebUI.comment('Minimum di-auto-correct ke: ' + finalMin)

        KeywordUtil.markWarning('Expected 1.514 tapi diubah sistem jadi: ' + finalMin)
    } else {
        WebUI.comment('Minimum berhasil diubah ke: ' + finalMin)
    }
}

WebUI.setText(findTestObject('used car/maximum'), '30')

WebUI.sendKeys(findTestObject('used car/maximum'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

boolean isErrorMax = WebUI.verifyElementPresent(findTestObject('used car/maximum_errorMsg'), 2, FailureHandling.OPTIONAL)

if (isErrorMax) {
    WebUI.comment('Input asal Maximum muncul error')

    WebUI.setText(findTestObject('used car/maximum'), '219.676')

    WebUI.sendKeys(findTestObject('used car/maximum'), Keys.chord(Keys.ENTER))

    String finalMax = WebUI.getAttribute(findTestObject('used car/maximum'), 'value')

    if (finalMax != '219.676') {
        WebUI.comment('Maximum di-auto-correct ke: ' + finalMax)

        KeywordUtil.markWarning('Expected 219.676 tapi diubah sistem jadi: ' + finalMax)
    } else {
        WebUI.comment('Maximum berhasil diubah ke: ' + finalMax)
    }
}

//harga 
//Minimum Harga 
WebUI.setText(findTestObject('used car/minimumHarga'), '100')

WebUI.sendKeys(findTestObject('used car/minimumHarga'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

boolean isErrorMinHarga = WebUI.verifyElementPresent(findTestObject('used car/minimumHarga_error'), 2, FailureHandling.OPTIONAL)

if (isErrorMinHarga) {
    WebUI.comment('Input asal Minimum Harga muncul error')

    WebUI.setText(findTestObject('used car/minimumHarga'), '51600000')

    WebUI.sendKeys(findTestObject('used car/minimumHarga'), Keys.chord(Keys.ENTER))

    String finalMinHarga = WebUI.getAttribute(findTestObject('used car/minimumHarga'), 'value')

    // cek apakah auto-correct atau sesuai format
    if (finalMinHarga != 'Rp51.600.000') {
        WebUI.comment('Minimum Harga di-auto-correct ke: ' + finalMinHarga)

        KeywordUtil.markWarning('Expected Rp51.600.000 tapi diubah sistem jadi: ' + finalMinHarga)
    } else {
        WebUI.comment('Minimum Harga berhasil diubah ke: ' + finalMinHarga)
    }
}

//Maximum Harga
WebUI.setText(findTestObject('used car/maximumHarga'), '30')

WebUI.sendKeys(findTestObject('used car/maximumHarga'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

boolean isErrorMaxHarga = WebUI.verifyElementPresent(findTestObject('used car/maximumHarga_error'), 2, FailureHandling.OPTIONAL)

if (isErrorMaxHarga) {
    WebUI.comment('Input asal Maximum Harga muncul error')

    WebUI.setText(findTestObject('used car/maximumHarga'), '554162500')

    WebUI.sendKeys(findTestObject('used car/maximumHarga'), Keys.chord(Keys.ENTER))

    String finalMaxHarga = WebUI.getAttribute(findTestObject('used car/maximumHarga'), 'value')

    if (finalMaxHarga != 'Rp554.162.500') {
        WebUI.comment('Maximum Harga di-auto-correct ke: ' + finalMaxHarga)

        KeywordUtil.markWarning('Expected Rp554.162.500 tapi diubah sistem jadi: ' + finalMaxHarga)
    } else {
        WebUI.comment('Maximum Harga berhasil diubah ke: ' + finalMaxHarga)
    }
}

//maxDP dan pendapatan 
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('used car/maximumDP'), 10)
JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()

js.executeScript("arguments[0].scrollIntoView(true); arguments[0].focus(); arguments[0].value='100000000';", element)
js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", element)

String finalMaxDP = WebUI.getAttribute(findTestObject('used car/maximumDP'), 'value')

WebUI.comment('Maximum DP terisi: ' + finalMaxDP)

//Pendapatan Perbulan
WebElement elementPendapatan = WebUiCommonHelper.findWebElement(findTestObject('used car/pendapatanPerbulan'), 10)
JavascriptExecutor jsExec = (JavascriptExecutor) DriverFactory.getWebDriver()

jsExec.executeScript("""
    arguments[0].scrollIntoView(true);
    arguments[0].focus();
    arguments[0].value='10000';
    arguments[0].dispatchEvent(new Event('input', { bubbles: true }));
    arguments[0].dispatchEvent(new Event('change', { bubbles: true }));
    arguments[0].dispatchEvent(new KeyboardEvent('keydown', { bubbles: true, key: 'Enter', code: 'Enter', keyCode: 13, which: 13 }));
    arguments[0].dispatchEvent(new KeyboardEvent('keyup', { bubbles: true, key: 'Enter', code: 'Enter', keyCode: 13, which: 13 }));
""", elementPendapatan)


WebUI.delay(1)

boolean isErrorPendapatan = WebUI.verifyElementPresent(findTestObject('used car/errorPendapatan'), 2, FailureHandling.OPTIONAL)

if (isErrorPendapatan) {
    WebUI.comment('Pendapatan 10.000 muncul error, coba input ulang')

    WebUI.clearText(findTestObject('used car/pendapatanPerbulan'))

    WebUI.setText(findTestObject('used car/pendapatanPerbulan'), '10000000')

    WebUI.sendKeys(findTestObject('used car/pendapatanPerbulan'), Keys.chord(Keys.ENTER))

    String finalPendapatan = WebUI.getAttribute(findTestObject('used car/pendapatanPerbulan'), 'value')

    WebUI.comment('Pendapatan berhasil diubah ke: ' + finalPendapatan)
} else {
    String finalPendapatan = WebUI.getAttribute(findTestObject('used car/pendapatanPerbulan'), 'value')

    WebUI.comment('Pendapatan Perbulan berhasil diisi: ' + finalPendapatan)
}

// Tenor
List<WebElement> tenorButtons = WebUiCommonHelper.findWebElements(findTestObject('used car/tenor'), 10)

WebUI.comment('Total button Tenor ditemukan: ' + tenorButtons.size())

Random randtenor = new Random()

int randomTenorIndex = randtenor.nextInt(tenorButtons.size())

WebUI.executeJavaScript('arguments[0].scrollIntoView(true);', Arrays.asList(tenorButtons[randomTenorIndex]))

WebUI.delay(1)

WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(tenorButtons[randomTenorIndex]))

String selectedTenor = (tenorButtons[randomTenorIndex]).getText()

WebUI.comment('Tenor terpilih: ' + selectedTenor)

// Pilih Umur 
List<WebElement> umurButtons = WebUiCommonHelper.findWebElements(findTestObject('used car/umur'), 10)

WebUI.comment('Total button Umur ditemukan: ' + umurButtons.size())

int randomUmurIndex = rand.nextInt(umurButtons.size())

WebUI.executeJavaScript('arguments[0].scrollIntoView(true);', Arrays.asList(umurButtons[randomUmurIndex]))

WebUI.delay(1)

WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(umurButtons[randomUmurIndex]))

String selectedUmur = (umurButtons[randomUmurIndex]).getText()

WebUI.comment('Kategori Umur terpilih: ' + selectedUmur)

WebUI.click(findTestObject('used car/terapkanButton'))

JavascriptExecutor jsbefore2 = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jsbefore2.executeScript('\n    var iframe = document.querySelector(\'iframe[id*="moe-onsite-campaign"]\');\n    if (iframe) {\n        iframe.remove();\n    }\n')

if (close_browser.toString().equals('1')) {
    boolean cek_card = CustomKeywords.'ignore_warning_optional.ignore_warning.verifyIgnoreWarning'(findTestObject('Page Mobil Bekas/Card_Card Mobil 1st'), 
        1)

    if (cek_card == true) {
        WebUI.verifyElementPresent(findTestObject('Page Mobil Bekas/Card_Card Mobil 1st'), 0)

        WebUI.verifyElementNotPresent(findTestObject('Page Mobil Bekas/label_Tidak ada Mobil Ditemukan'), 0)
    } else {
        WebUI.verifyElementPresent(findTestObject('Page Mobil Bekas/label_Tidak ada Mobil Ditemukan'), 1)

        WebUI.verifyElementNotPresent(findTestObject('Page Mobil Bekas/Card_Card Mobil 1st'), 0)
    }
    
    WebUI.scrollToPosition(0, 0)

    WebUI.takeScreenshotAsCheckpoint('cekdata' + screen.toString())
}

