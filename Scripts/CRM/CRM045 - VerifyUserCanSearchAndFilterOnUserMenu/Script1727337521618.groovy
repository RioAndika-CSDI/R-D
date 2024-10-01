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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('CRM/CRM042 - VerifyUserCanAccessUserMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify "Search Bar" is visible.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/Page_User Account - SEVA CRM/field_searchBar'))

'Search by "Name" in search bar.'
WebUI.setText(findTestObject('Account Management Page/Page_User Account - SEVA CRM/field_searchBar'), 'Cynthia Devina Santoso')

'Verfiy "Add Filter" button is visible.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_Add Filter'))

WebUI.click(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_Add Filter'))

'Verfiy "BU Company" button is visible.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_BU Company Filter'))

WebUI.click(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_BU Company Filter'))

'Verify Search Bar is visible in the filter control.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/Page_User Account - SEVA CRM/searchBar_filterControl'))

WebUI.setText(findTestObject('Account Management Page/Page_User Account - SEVA CRM/searchBar_filterControl'), 'ACC')

WebUI.click(findTestObject('Account Management Page/Page_User Account - SEVA CRM/selectItem_filter'))

WebDriver driver = DriverFactory.getWebDriver()

'To locate table'
WebElement Table = driver.findElement(By.xpath('//table/tbody'))

'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

'To calculate no of rows In table'
int rows_count = rows_table.size()

'Print Rows Count'
println('Number of rows in table: ' + rows_count)

'The loop will verify whether the data in each row matches the expected values or not.'
Loop: for (int row = 1; row < rows_count; row++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

    'To calculate no of columns(cells) In that specific row'
    int columns_count = Columns_row.size()

    println((('Number of cells In Row ' + row) + ' are ') + columns_count)

    String nameColumnValue = Columns_row.get(0).getText()

    String buCompanyValue = Columns_row.get(4).getText()

    String nameExpectedValue = 'Cynthia Devina Santoso'

    String buCompanyExpectedValue = 'ACC'

    // Check the value
    if ((nameColumnValue == nameExpectedValue) && (buCompanyValue == buCompanyExpectedValue)) {
        println(((('The value of column "Name" in row ' + row) + ' is ') + nameColumnValue) + '. PASSED ✅')

        println(((('The value of column "BU Company" in row ' + row) + ' is ') + buCompanyValue) + '. PASSED ✅')
    } else {
        println(((('The value of column "Name" in row ' + row) + ' is ') + nameColumnValue) + '. NOT PASSED ❌❌❌')

        println(((('The value of column "BU Company" in row ' + row) + ' is ') + buCompanyValue) + '. NOT PASSED ❌❌❌')

        KeywordUtil.markFailedAndStop('Expected value does not match! Test FAILED.')
    }
}

WebUI.closeBrowser()

