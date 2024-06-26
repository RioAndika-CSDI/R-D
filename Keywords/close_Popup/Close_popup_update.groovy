package close_Popup
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


class Close_popup_update {

	@Keyword
	def closePopupSeva(int timeoutPerPopup) {
		
		boolean status = WebUI.verifyElementPresent(findTestObject('Homepage Component/Iframe_Uni'), timeoutPerPopup, FailureHandling.OPTIONAL)

		while(status) {

			WebUI.click(findTestObject('Homepage Component/Close_iframe'))

			boolean cek = WebUI.verifyElementNotPresent(findTestObject('Homepage Component/Iframe_Uni'), 1, FailureHandling.OPTIONAL)

			if(cek==true) {
				break;
			}
		}

		//	CODE LAMA
		//		boolean aslFrame = WebUI.verifyElementPresent(findTestObject('Homepage Component/Frame_ASL'), 0+timeoutPerPopup, FailureHandling.OPTIONAL)
		//
		//		if (aslFrame == true) {
		//			WebUI.switchToFrame(findTestObject('Homepage Component/Frame_ASL'), 0)
		//
		//			WebUI.click(findTestObject('Homepage Component/Close_ASL_Banner'))
		//
		//			WebUI.switchToWindowIndex(0)
		//		}
		//
		//		boolean sakuFrame = WebUI.verifyElementPresent(findTestObject('Homepage Component/Frame_Promo Bank Saku'), 0+timeoutPerPopup, FailureHandling.OPTIONAL)
		//
		//		if (sakuFrame == true) {
		//			WebUI.switchToFrame(findTestObject('Homepage Component/Frame_Promo Bank Saku'), 0)
		//
		//			WebUI.click(findTestObject('Homepage - Burger menu/Bank saqu iklan'))
		//
		//			WebUI.switchToWindowIndex(0)
		//		}
	}
}