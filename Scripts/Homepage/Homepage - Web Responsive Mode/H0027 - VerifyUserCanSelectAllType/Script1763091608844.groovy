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

WebUI.openBrowser(GlobalVariable.Prod)

WebUI.delay(20)

WebUI.setViewPortSize(500, 736)

WebUI.scrollToElement(findTestObject('Homepage Component/Promo Eksklusif'), 2)

WebUI.click(findTestObject('Page_Temukan Dealer Mobil Baru Rekanan SEVA di Indonesia  SEVA/click terima'))

WebUI.click(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/div_TipeMobil'))

WebUI.verifyElementPresent(findTestObject('Homepage - PLP/New Car/button_Terapkan Disable'), 0)

WebUI.click(findTestObject('Homepage - PLP/New Car/Filter Type Unselect 1st'))

WebUI.click(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Terapkan'))

WebUI.click(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/div_TipeMobil'))

WebUI.verifyElementNotPresent(findTestObject('Homepage - PLP/New Car/button_Terapkan Disable'), 0)

WebUI.click(findTestObject('Homepage - PLP/New Car/Filter Type Selected 1st'))

WebUI.verifyElementNotPresent(findTestObject('Homepage - PLP/New Car/button_Terapkan Disable'), 0)

WebUI.verifyElementClickable(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Terapkan'))

WebUI.click(findTestObject('Page_SEVA (sevaid_official)  X/Page_SEVA - Beli Mobil Baru Dengan Cicilan _bf97c5/button_Terapkan'))

WebUI.verifyElementPresent(findTestObject('Homepage Component/smart filter - all type selected'), 0)

WebUI.closeBrowser()

