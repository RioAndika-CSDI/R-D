import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword as Keyword
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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import groovyjarjarantlr4.v4.codegen.model.Loop as Loop
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.apache.poi.hssf.record.PageBreakRecord.Break as Break
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('CRM/CRM042 - VerifyUserCanAccessUserMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Verfiy "Add Filter" button is visible.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_Add Filter'))

'Open Filter'
WebUI.click(findTestObject('Object Repository/Account Management Page/Page_User Account - SEVA CRM/button_Add Filter'))

'Verfiy "BU Company" button is visible.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_BU Company Filter'))

'Verfiy "CMS Status" button is visible.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_CMS Status Filter'))

'Verfiy "CRM Role" button is visible.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_CRM Role Filter'))

'Verfiy "CRM Status" button is visible.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_CRM Status Filter'))

'Verfiy "Event" button is visible.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_Event'))

'Filter data by "BU Company".'
WebUI.click(findTestObject('Object Repository/Account Management Page/Page_User Account - SEVA CRM/button_BU Company Filter'))

'Verify Search Bar is visible in the filter control.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/Page_User Account - SEVA CRM/searchBar_filterControl'))

WebUI.setText(findTestObject('Account Management Page/Page_User Account - SEVA CRM/searchBar_filterControl'), 'Astra Life')

WebUI.delay(3)

'Click Item.'
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

    String rowCellValue = Columns_row.get(4).getText()

    String expectedValue = 'Astra Life'

    // Check the value
    if (rowCellValue == expectedValue) {
        println(((('The value of "BU Company" in row ' + row) + ' is ') + expectedValue) + '. PASSED ✅')
    } else {
        println(((('The value of "BU Company" in row ' + row) + ' is ') + expectedValue) + '. NOT PASSED ❌')

        KeywordUtil.markFailedAndStop('Expected value does not match! Test FAILED.')
    }
}

'Remove Filter.'
WebUI.click(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_removeFilter'))

'Open Filter'
WebUI.click(findTestObject('Object Repository/Account Management Page/Page_User Account - SEVA CRM/button_Add Filter'))

'Filter data by "CMS Status".'
WebUI.click(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_CMS Status Filter'))

WebUI.setText(findTestObject('Account Management Page/Page_User Account - SEVA CRM/searchBar_filterControl'), 'Inactive')

WebUI.delay(3)

'Click Item.'
WebUI.click(findTestObject('Account Management Page/Page_User Account - SEVA CRM/selectItem_filter'))

'Locate the table again after applying the filter'
Table = driver.findElement(By.xpath('//table/tbody'))

'Locate rows of the table after filtering'
rows_table = Table.findElements(By.tagName('tr'))

'Calculate number of rows in the table after filtering'
rows_count = rows_table.size()

'Print Rows Count after filter'
println('Number of rows in table after filtering: ' + rows_count)

'The loop will verify whether the data in each row matches the expected values or not.'
Loop: for (int row = 1; row < rows_count; row++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

    'To calculate no of columns(cells) In that specific row'
    int columns_count = Columns_row.size()

    println((('Number of cells In Row ' + row) + ' are ') + columns_count)

    String rowCellValue = Columns_row.get(5).getText()

    String expectedValue = 'Inactive'

    // Check the value
    if (rowCellValue == expectedValue) {
        println(((('The value of "CMS Status" column in row ' + row) + ' is ') + expectedValue) + '. PASSED ✅')
    } else {
        println(((('The value of "CMS Status" column in row ' + row) + ' is ') + expectedValue) + '. NOT PASSED ❌')

        KeywordUtil.markFailedAndStop('Expected value does not match! Test FAILED.')
    }
}

'Remove Filter.'
WebUI.click(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_removeFilter'))

'Open Filter'
WebUI.click(findTestObject('Object Repository/Account Management Page/Page_User Account - SEVA CRM/button_Add Filter'))

'Filter data by "CRM Role".'
WebUI.click(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_CRM Role Filter'))

WebUI.setText(findTestObject('Account Management Page/Page_User Account - SEVA CRM/searchBar_filterControl'), 'QA')

WebUI.delay(3)

'Click Item.'
WebUI.click(findTestObject('Account Management Page/Page_User Account - SEVA CRM/selectItem_filter'))

'Locate the table again after applying the filter'
Table = driver.findElement(By.xpath('//table/tbody'))

'Locate rows of the table after filtering'
rows_table = Table.findElements(By.tagName('tr'))

'Calculate number of rows in the table after filtering'
rows_count = rows_table.size()

'Print Rows Count after filter'
println('Number of rows in table after filtering: ' + rows_count)

'The loop will verify whether the data in each row matches the expected values or not.'
Loop: for (int row = 1; row < rows_count; row++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

    'To calculate no of columns(cells) In that specific row'
    int columns_count = Columns_row.size()

    println((('Number of cells In Row ' + row) + ' are ') + columns_count)

    String rowCellValue = Columns_row.get(3).getText()

    String expectedValue = 'QA'

    // Check the value
    if (rowCellValue == expectedValue) {
        println(((('The value of "Role" column in row ' + row) + ' is ') + expectedValue) + '. PASSED ✅')
    } else {
        println(((('The value of "Role" column in row ' + row) + ' is ') + expectedValue) + '. NOT PASSED ❌')

        KeywordUtil.markFailedAndStop('Expected value does not match! Test FAILED.')
    }
}

'Remove Filter.'
WebUI.click(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_removeFilter'))

'Open Filter'
WebUI.click(findTestObject('Object Repository/Account Management Page/Page_User Account - SEVA CRM/button_Add Filter'))

'Filter data by "CRM Status".'
WebUI.click(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_CRM Status Filter'))

WebUI.setText(findTestObject('Account Management Page/Page_User Account - SEVA CRM/searchBar_filterControl'), 'Inactive')

WebUI.delay(3)

'Click Item.'
WebUI.click(findTestObject('Account Management Page/Page_User Account - SEVA CRM/selectItem_filter'))

'Locate the table again after applying the filter'
Table = driver.findElement(By.xpath('//table/tbody'))

'Locate rows of the table after filtering'
rows_table = Table.findElements(By.tagName('tr'))

'Calculate number of rows in the table after filtering'
rows_count = rows_table.size()

'Print Rows Count after filter'
println('Number of rows in table after filtering: ' + rows_count)

'The loop will verify whether the data in each row matches the expected values or not.'
Loop: for (int row = 1; row < rows_count; row++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

    'To calculate no of columns(cells) In that specific row'
    int columns_count = Columns_row.size()

    println((('Number of cells In Row ' + row) + ' are ') + columns_count)

    String rowCellValue = Columns_row.get(6).getText()

    String expectedValue = 'Inactive'

    // Check the value
    if (rowCellValue == expectedValue) {
        println(((('The value of "CRM Status" column in row ' + row) + ' is ') + expectedValue) + '. PASSED ✅')
    } else {
        println(((('The value of "CRM Status" column in row ' + row) + ' is ') + expectedValue) + '. NOT PASSED ❌')

        KeywordUtil.markFailedAndStop('Expected value does not match! Test FAILED.')
    }
}

'Remove Filter.'
WebUI.click(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_removeFilter'))

'Open Filter'
WebUI.click(findTestObject('Object Repository/Account Management Page/Page_User Account - SEVA CRM/button_Add Filter'))

'Filter data by "Event".'
WebUI.click(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_Event'))

WebUI.setText(findTestObject('Account Management Page/Page_User Account - SEVA CRM/searchBar_filterControl'), 'GIIAS Tangerang 2023')

WebUI.delay(3)

'Click Item.'
WebUI.click(findTestObject('Account Management Page/Page_User Account - SEVA CRM/selectItem_filter'))

//'Verify "GIIAS Tangerang 2023" event has been selected.'
//WebUI.verifyElementVisible(findTestObject('Account Management Page/selectedItem_Event GIIAS Tangerang 2023'))
'Verify "Edit" button for is visible.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/button_Edit User Row 1'))

'Verify "Edit" button for is visible.'
WebUI.click(findTestObject('Account Management Page/button_Edit User Row 1'))

WebUI.verifyElementVisible(findTestObject('Account Management Page/field_Edit Event User Row 1'))

WebUI.waitForElementAttributeValue(findTestObject('Account Management Page/field_Edit Event User Row 1'), 'placeholder', 
    'GIIAS Tangerang 2023', 0)

'Remove Filter.'
WebUI.click(findTestObject('Account Management Page/Page_User Account - SEVA CRM/button_removeFilter'))

