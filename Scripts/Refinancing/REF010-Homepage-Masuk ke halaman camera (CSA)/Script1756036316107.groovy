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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



WebUI.openBrowser('')
WebUI.maximizeWindow()

// Halaman CSA Upload 
WebUI.navigateToUrl('https://www.seva.id/fasilitas-dana/csa-upload/6285349524555')
WebUI.verifyMatch(WebUI.getUrl(), 'https://www.seva.id/fasilitas-dana/csa-upload/6285349524555', false)
WebUI.verifyElementPresent(findTestObject('HomeRefinancing/label_uploadDokumenCSA'), 10)

String phoneNumber = "6285349524555"
String expectedBaseUrl = "https://www.seva.id/fasilitas-dana/csa-upload/${phoneNumber}/camera"
String startUrl = "https://www.seva.id/fasilitas-dana/csa-upload/${phoneNumber}"

// Ambil base xpath dari repo
String baseXpath = findTestObject('HomeRefinancing/upload_button').findPropertyValue("xpath")
if (baseXpath == null || baseXpath.trim() == "") {
	baseXpath = "//*[starts-with(@class, 'emptyUploadRefinancing_buttonframe')]"
}

// Loop semua button upload
for (int i = 1; i <= 12; i++) {
	TestObject buttonUpload = new TestObject("dynamicButton_${i}")
	String indexedXpath = "(${baseXpath})[${i}]"
	buttonUpload.addProperty("xpath", ConditionType.EQUALS, indexedXpath)

	WebUI.scrollToElement(buttonUpload, 10)
	WebUI.click(buttonUpload)

	WebUI.waitForPageLoad(10)

	String currentUrl = WebUI.getUrl()
	if (currentUrl.startsWith(expectedBaseUrl)) {
		WebUI.comment("Match untuk button ke-${i}, URL: ${currentUrl}")
	} else {
		WebUI.comment("URL mismatch di button ke-${i}, Dapat: ${currentUrl}")
	}

	// back ke halaman awal
	if (WebUI.getWindowIndex() > 0) {
		WebUI.closeWindowIndex(WebUI.getWindowIndex())
		WebUI.switchToWindowIndex(0)
	} else {
		  // Kembali ke halaman awal langsung by URL (bukan back)
        WebUI.navigateToUrl(startUrl)
        WebUI.waitForPageLoad(10)

	}

	WebUI.waitForPageLoad(10)
}

WebUI.closeBrowser()




