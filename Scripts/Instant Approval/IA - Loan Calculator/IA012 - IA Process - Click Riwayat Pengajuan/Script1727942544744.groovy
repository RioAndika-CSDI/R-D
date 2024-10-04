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

WebUI.callTestCase(findTestCase('Instant Approval/IA - Loan Calculator/IA011 - Ajukan Instant Approval'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('InstantApproval/InstantApproval/button_Riwayat Pengajuan - ia_process'))

CustomKeywords.'close_Popup.Close_popup_update.closePopupSeva'(10)

String currentUrl_riwayat_pengajuan = WebUI.getUrl()

WebUI.comment(currentUrl_riwayat_pengajuan)

String riwayat_pengajuan_url = 'https://www.seva.id/riwayat-pengajuan'

if (currentUrl_riwayat_pengajuan == riwayat_pengajuan_url) {
    WebUI.comment('User is on the expected page: ' + currentUrl_riwayat_pengajuan)
}

