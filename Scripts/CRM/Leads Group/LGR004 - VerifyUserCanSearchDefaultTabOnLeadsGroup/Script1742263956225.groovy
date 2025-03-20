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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('CRM/Leads Group/LGR001 - VerifyUserCanAccessLeadsGroupDefault'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify "Search Bar" is visible.'
WebUI.verifyElementVisible(findTestObject('CRM/Bucket Management/Leads Group/field_Search'))

'Search by "Leads Group" column.'
WebUI.setText(findTestObject('CRM/Bucket Management/Leads Group/field_Search'), 'N398')

WebUI.delay(3)

'Verify search results for :Leads Group" column (column 1)'
verifySearchResults(1, 'N398')

WebUI.clearText(findTestObject('CRM/Bucket Management/Leads Group/field_Search'))

'Search by "Category" column.'
WebUI.setText(findTestObject('CRM/Bucket Management/Leads Group/field_Search'), 'New Car')

WebUI.delay(3)

'Verify search results for "Category" column (column 2)'
verifySearchResults(2, 'New Car')

WebUI.clearText(findTestObject('CRM/Bucket Management/Leads Group/field_Search'))

'Search by "Specific Source" column.'
WebUI.setText(findTestObject('CRM/Bucket Management/Leads Group/field_Search'), 'SEVA Car Search Page Form')

WebUI.delay(3)

'Verify search results for "Specific Source" column (column 3)'
verifySearchResults(3, 'SEVA Car Search Page Form')

WebUI.clearText(findTestObject('CRM/Bucket Management/Leads Group/field_Search'))

'Search by "UTM Group" column.'
WebUI.setText(findTestObject('CRM/Bucket Management/Leads Group/field_Search'), 'Google SEM')

WebUI.delay(3)

'Verify search results for "UTM Group" column (column 4)'
verifySearchResults(4, 'Google SEM')

WebUI.clearText(findTestObject('CRM/Bucket Management/Leads Group/field_Search'))

'Input invalid search keyword in search field'
WebUI.setText(findTestObject('CRM/Bucket Management/Leads Group/field_Search'), 'XYZ@#@!')

WebUI.delay(3)

'Verify "No Data" message is visible'
WebUI.verifyElementVisible(findTestObject('CRM/Bucket Management/Leads Group/No Data Message'))

'Verify" No Data" message content is correct'
WebUI.verifyElementText(findTestObject('CRM/Bucket Management/Leads Group/No Data Message'), 'There is nothing to be shown here.')

WebUI.closeBrowser() /**
 * Verify if all table data in specified column matches the search keyword
 * @param columnPosition int - The column position to verify (1 = first column)
 * @param searchKeyword String - The keyword used in search field
 * Example: verifySearchResults(1, 'N398')
 */
// To locate the table
// To locate the rows of the table

void verifySearchResults(int columnPosition, String searchKeyword) {
    WebDriver driver = DriverFactory.getWebDriver()

    println('Starting search result verification for keyword: ' + searchKeyword)

    WebElement Table = driver.findElement(By.xpath('//div[@class=\'ant-table-tbody-virtual-holder-inner\']'))

    List<WebElement> rows_table = Table.findElements(By.xpath('.//div[contains(@class, \'ant-table-row\') and contains(@class, \'group/tr\')]'))

    boolean allMatch = true

    for (WebElement row : rows_table) {
        try {
            String cellValue = row.findElement(By.xpath(('.//div[@class=\'ant-table-cell\'][' + columnPosition) + ']')).getText().trim()

            if (!(cellValue.isEmpty())) {
                try {
                    WebUI.verifyMatch(cellValue.toLowerCase(), ('.*' + searchKeyword.toLowerCase()) + '.*', true)

                    println('✅ Match found: ' + cellValue)
                }
                catch (Exception e) {
                    allMatch = false

                    println((('❌ Mismatch found: ' + cellValue) + ' does not contain ') + searchKeyword)
                } 
            }
        }
        catch (Exception e) {
            println('Error getting value: ' + e.getMessage())
        } 
    }
    
    println('\nSearch Result Summary:')

    println('Search Keyword: ' + searchKeyword)

    println('Total rows found: ' + rows_table.size())

    if (allMatch && (rows_table.size() > 0)) {
        println('✅ All results match the search keyword: ' + searchKeyword)
    } else if (rows_table.isEmpty()) {
        println('❌ No results found for keyword: ' + searchKeyword)

        KeywordUtil.markFailedAndStop('No results found for search keyword: ' + searchKeyword)
    } else {
        println('❌ Some results do not match the search keyword: ' + searchKeyword)

        KeywordUtil.markFailedAndStop('Some results do not match the search criteria!')
    }
}

