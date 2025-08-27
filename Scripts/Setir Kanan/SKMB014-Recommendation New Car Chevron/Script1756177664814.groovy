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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil


// Fungsi klik berulang sampai tombol tidak bisa dipakai lagi
WebUI.callTestCase(findTestCase('Setir Kanan/SKMB010-Lihat Detail Mobil'), [('expected_url') : 'https://www.seva.id/mobil-bekas/c'
        , ('screen') : '', ('open_browser') : '1', ('close_browser') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('used car/verifyReco'), 7)

def geserSampaiMentok(String testObjectPath) {
    int counter = 0
    while (true) {
        // cek apakah button ada dan masih aktif (bukan disabled)
        if (WebUI.verifyElementPresent(findTestObject(testObjectPath), 1, FailureHandling.OPTIONAL)) {
            String classes = WebUI.getAttribute(findTestObject(testObjectPath), "class")
            if (classes.contains("disabled")) {
                break 
            }
            WebUI.click(findTestObject(testObjectPath))
            WebUI.delay(1)
            counter++
        } else {
            break
        }
    }
    WebUI.comment("${testObjectPath} diklik ${counter} kali sampai mentok")
}

// --- Jalankan ---
geserSampaiMentok("used car/RightCV_carReco") // geser kanan
geserSampaiMentok("used car/LeftCV_carReco")  // geser kiri
