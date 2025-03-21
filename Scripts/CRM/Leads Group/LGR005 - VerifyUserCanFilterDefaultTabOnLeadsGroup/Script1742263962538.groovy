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

WebUI.verifyElementVisible(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/button_Filter'))

'Open filter.'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/button_Filter'))

'FIlter by "Assign to".'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/button_Filter Assign to'), FailureHandling.STOP_ON_FAILURE)

'Choose "Workstation" option.'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/txt_Checkbox 3 Workstation'))

WebUI.delay(3)

'Verify the filtered results in column 7 for the value "Workstation".'
verifyResults(7, 'Workstation', './/div[@class="ant-table-cell"][7]/div/div/div/div/input', 'placeholder')

'Remove filter.'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/button_Reset Filter'))

'Open filter.'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/button_Filter'))

'Filter by "Origin".'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/button_Filter Origin'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/span_filter type'))

'Select "is not empty"'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/txt_filter type Is not empty'))

WebUI.delay(3)

'Remove filter.'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/button_Reset Filter'))

'Open filter.'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/button_Filter'))

'Select filter by Product Category.'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/button_Filter Product Category'), FailureHandling.STOP_ON_FAILURE)

'Select "Used Car"'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/txt_Checkbox Used Car'))

WebUI.delay(3)

'Verify the filtered results in column 2 for the value "Used Car".'
verifyResults(2, 'Used Car')

'Remove filter.'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/button_Reset Filter'))

'Open filter.'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/button_Filter'))

'Select filter by Remaining Leads.'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/button_Filter Remaining Leads'))

WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/span_filter type'))

'Select "is not empty"'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/txt_filter type Is not empty'))

WebUI.delay(3)

'Verify the filtered results in column 6 for "Not Empty" value.'
verifyNumericResults(6, 'is not empty')

'Remove filter.'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/button_Reset Filter'))

'Open filter.'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/button_Filter'))

'Select filter by Total Bucket.'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/button_Filter Total Bucket'))

WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/span_filter type'))

'Select "is not empty"'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/txt_filter type Is not empty'))

WebUI.delay(3)

'Verify the filtered results in column 5 for "Not Empty" value.'
verifyNumericResults(5, 'is not empty', './/div[starts-with(@class, "ant-table-cell")][5]/div/div')

'Remove filter.'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/button_Reset Filter'))

'Open filter.'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/button_Filter'))

'Select filter by UTM Group'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/button_Filter UTM Group'), FailureHandling.STOP_ON_FAILURE)

'Select "blank"'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/txt_Checkbox(Blanks)'))

WebUI.verifyElementText(findTestObject('CRM/Bucket Management/Leads Group/Filter - Default/txt_There is nothing to be shown here'), 
    'There is nothing to be shown here.')

WebUI.delay(3)

WebUI.closeBrowser()

void verifyResults(int columnPosition, String searchKeyword, String customXPath = '', String attribute = '') {
    WebDriver driver = DriverFactory.getWebDriver()

    println('Starting search result verification for keyword: ' + searchKeyword)

    WebElement Table = driver.findElement(By.xpath('//div[@class=\'ant-table-tbody-virtual-holder-inner\']'))

    List<WebElement> rows_table = Table.findElements(By.xpath('.//div[contains(@class, \'ant-table-row\') and contains(@class, \'group/tr\')]'))

    boolean allMatch = true

    String xpath

    switch (customXPath) {
        case '':
            xpath = (('.//div[starts-with(@class, "ant-table-cell")][' + columnPosition) + ']')

            break
        default:
            xpath = customXPath}
    
    for (WebElement row : rows_table) {
        try {
            WebElement cell = row.findElement(By.xpath(xpath))

            String cellValue

            if (attribute.isEmpty()) {
                cellValue = cell.getText().trim()
            } else {
                cellValue = cell.getAttribute(attribute).trim()
            }
            
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
    
    println('Search Keyword: ' + searchKeyword)

    println('Total rows found: ' + rows_table.size())

    if (allMatch && (rows_table.size() > 0)) {
        println('✅ All results match the search keyword: ' + searchKeyword)

        KeywordUtil.markPassed('✅ All results match the search keyword: ' + searchKeyword)
    } else if (rows_table.isEmpty()) {
        println('❌ No results found for keyword: ' + searchKeyword)

        KeywordUtil.markFailedAndStop('No results found for search keyword: ' + searchKeyword)
    } else {
        println('❌ Some results do not match the search keyword: ' + searchKeyword)

        KeywordUtil.markFailedAndStop('Some results do not match the search criteria!')
    }
}

void verifyNumericResults(int columnPosition, String filterType, String customXPath = '') {
    WebDriver driver = DriverFactory.getWebDriver()

    println('Starting numeric filter result verification: ' + filterType)

    WebElement Table = driver.findElement(By.xpath('//div[@class="ant-table-tbody-virtual-holder-inner"]'))

    List<WebElement> rows_table = Table.findElements(By.xpath('.//div[contains(@class, "ant-table-row") and contains(@class, "group/tr")]'))

    String xpath

    switch (customXPath) {
        case '':
            xpath = (('.//div[starts-with(@class, "ant-table-cell")][' + columnPosition) + ']')

            break
        default:
            xpath = customXPath}
    
    int validRows = 0

    int unreadableRows = 0

    for (WebElement row : rows_table) {
        try {
            WebElement cell = row.findElement(By.xpath(xpath))

            String cellValue = cell.getText().trim()

            if (filterType == 'is not empty') {
                if (!(cellValue.isEmpty())) {
                    def matcher = cellValue =~ '(\\d+)\\s*[Bb]ucket'

                    if (matcher.find()) {
                        int bucketValue = matcher.group(1).toInteger()

                        if (bucketValue > 0) {
                            validRows++

                            println("✅ Valid value found: $cellValue")
                        } else {
                            println("❌ Invalid value found (zero bucket): $cellValue")

                            unreadableRows++
                        }
                    } else if (cellValue.isNumber() && (cellValue.toInteger() > 0)) {
                        validRows++

                        println("✅ Valid value found: $cellValue")
                    } else {
                        println("❌ Invalid value found: $cellValue")

                        unreadableRows++
                    }
                } else {
                    println('❌ Empty value found')

                    unreadableRows++
                }
            }
        }
        catch (Exception e) {
            println('⚠️ Unreadable value: ' + e.getMessage())
        } 
    }
    
    double validPercentage = (validRows / rows_table.size()) * 100

    double unreadablePercentage = (unreadableRows / rows_table.size()) * 100

    println('Total rows examined: ' + rows_table.size())

    println(((('Valid rows: ' + validRows) + ' (') + String.format('%.2f', validPercentage)) + '%)')

    println(((('Unreadable rows: ' + unreadableRows) + ' (') + String.format('%.2f', unreadablePercentage)) + '%)')

    if ((validPercentage >= 85) && (unreadablePercentage <= 15)) {
        println('✅ Test PASSED - Valid rows >= 85% and unreadable rows <= 15%')

        KeywordUtil.markPassed('✅ Test PASSED - Valid rows >= 85% and unreadable rows <= 15%')
    } else if (validPercentage >= 85) {
        println('⚠️ Test PASSED with note - Valid rows >= 85% but unreadable rows > 15%')

        KeywordUtil.markPassed('⚠️ Test PASSED with note - Valid rows >= 85% but unreadable rows > 15%')
    } else {
        println('❌ Test FAILED - Valid rows < 85%')

        KeywordUtil.markFailedAndStop('Test failed due to insufficient valid values!')
    }
}

