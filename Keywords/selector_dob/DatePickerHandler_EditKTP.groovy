package selector_dob


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class DatePickerHandler_EditKTP {

	@Keyword
	def selectDate(String dob_year, String dob_month, String dob_day) {
		// Open the date picker
		WebUI.click (findTestObject('Object Repository/InstantApproval/InstantApproval/button_DDMMYYYY'))

		WebUI.delay(1)

		// Select the year
		selectDatePart(dob_year)
		WebUI.delay(1)

		// Select the month
		selectDatePart(dob_month)
		WebUI.delay(1)

		// Select the day
		selectDatePart(dob_day)
		WebUI.delay(1)

		// Confirm the selection
		WebUI.click(findTestObject('Object Repository/InstantApproval/InstantApproval/OK_DOB'))
	}

	private void selectDatePart(String datePart) {
		String jsScript = """
            var elements = document.querySelectorAll('.adm-picker-view-column-item-label');
            for (var i = 0; i < elements.length; i++) {
                if (elements[i].textContent.trim() === '""" + datePart + """') {
                    if (elements[i].offsetParent !== null && elements[i].getBoundingClientRect().height > 0) {
                        elements[i].scrollIntoView();
                        elements[i].click();
                        break;
                    }
                }
            }
        """
		WebUI.executeJavaScript(jsScript, null)
	}
}


