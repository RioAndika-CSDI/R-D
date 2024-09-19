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

WebUI.callTestCase(findTestCase('Instant Approval/IA - Loan Calculator/IA003 - KTP Review - Checklist Kota Domisili'), [:],
	FailureHandling.OPTIONAL)

WebUI.delay(3)

String currentUrl_pp = WebUI.getUrl()

String ppUrl = 'https://www.seva.id/instant-approval/perusahaan-pembiayaan'

if (currentUrl_pp == ppUrl) {
    KeywordUtil.markPassed('User is on the expected page: ' + currentUrl_pp)
}

WebUI.click(findTestObject('InstantApproval/InstantApproval/button_perusahaan_pembiayaan', [('perusahaan_pembiayaan') : perusahaan_pembiayaan]))

WebUI.verifyElementNotClickable(findTestObject('InstantApproval/InstantApproval/button_Lanjutkan - enabled - perusahaan pembiayaan'))

