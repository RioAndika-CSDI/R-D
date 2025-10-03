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
import com.kms.katalon.core.testobject.ConditionType


WebUI.openBrowser('')
WebUI.maximizeWindow()

// Halaman CSA Upload 
String phoneNumber = "6285349524555"
String startUrl = "https://www.seva.id/fasilitas-dana/csa-upload/${phoneNumber}"
String expectedBaseUrl = "${startUrl}/camera"

WebUI.navigateToUrl(startUrl)
WebUI.verifyMatch(WebUI.getUrl(), startUrl, false)
WebUI.verifyElementPresent(findTestObject('HomeRefinancing/label_uploadDokumenCSA'), 10)

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

	// Cek dulu apakah button ada
	if (WebUI.verifyElementPresent(buttonUpload, 5, FailureHandling.OPTIONAL)) {
		WebUI.comment("Button ke-${i} ditemukan, coba scroll & klik")

		WebUI.scrollToElement(buttonUpload, 5, FailureHandling.OPTIONAL)
		WebUI.click(buttonUpload, FailureHandling.OPTIONAL)
		WebUI.waitForPageLoad(10)

		String currentUrl = WebUI.getUrl()
		if (currentUrl.startsWith(expectedBaseUrl)) {
			WebUI.comment("Match untuk button ke-${i}, URL: ${currentUrl}")
		} else {
			WebUI.comment("URL mismatch di button ke-${i}, Dapat: ${currentUrl}")
		}

		// Balik ke halaman awal
		if (WebUI.getWindowIndex() > 0) {
			WebUI.closeWindowIndex(WebUI.getWindowIndex())
			WebUI.switchToWindowIndex(0)
		} else {
			WebUI.navigateToUrl(startUrl)
			WebUI.waitForPageLoad(10)
		}

	} else {
		WebUI.comment("Button ke-${i} tidak ditemukan, skip...")
	}
}

WebUI.closeBrowser()
