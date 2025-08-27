import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration

// === CONFIG ===
String phoneNumber    = "6285349524555"
String expectedBaseUrl = "https://www.seva.id/fasilitas-dana/csa-upload/${phoneNumber}"
String filePath       = RunConfiguration.getProjectDir() + "/Data/KTP.jpg"
int maxUpload         = 12

// === OPEN PAGE ===
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(expectedBaseUrl)
WebUI.verifyMatch(WebUI.getUrl(), expectedBaseUrl, false)
WebUI.verifyElementPresent(findTestObject('HomeRefinancing/label_uploadDokumen'), 10)

// === base xpath (frame + input) ===
String baseXpath = "//*[starts-with(@class,'emptyUploadRefinancing_buttonframe')] | //*[starts-with(@class,'refinancing-upload_btnUpload')]"

// === LOOP semua slot upload ===
for (int i = 1; i <= maxUpload; i++) {
    TestObject buttonUpload = new TestObject("dynamicButton_${i}")
	String indexedXpath = "(${baseXpath})[${i}]"
	buttonUpload.addProperty("xpath", ConditionType.EQUALS, indexedXpath, true)


    // cek tombol ada?
    if (!WebUI.waitForElementVisible(buttonUpload, 10, FailureHandling.OPTIONAL)) {
        WebUI.comment("Button upload ke-${i} tidak ketemu, lanjut ke berikutnya.")
        continue
    }

    // klik slot
    WebUI.scrollToElement(buttonUpload, 10)
    WebUI.click(buttonUpload)

    // upload file ke input hidden (repo object)
    if (findTestObject('HomeRefinancing/upload_file_refi') != null) {
        WebUI.uploadFile(findTestObject('HomeRefinancing/upload_file_refi'), filePath)
        WebUI.comment(" File berhasil diupload ke slot-${i}")
    } else {
        WebUI.comment("Object 'upload_file_refi' tidak ditemukan di repo.")
        continue
    }

    // verifikasi thumbnail muncul
    if (WebUI.waitForElementVisible(findTestObject('HomeRefinancing/thumbnail preview'), 15, FailureHandling.OPTIONAL)) {
        WebUI.comment("Thumbnail untuk slot-${i} terdeteksi.")
    } else {
        WebUI.comment("Thumbnail untuk slot-${i} gagal muncul.")
    }

    WebUI.delay(1)
}

WebUI.comment("Proses upload selesai (maksimal ${maxUpload} file).")
WebUI.closeBrowser()
