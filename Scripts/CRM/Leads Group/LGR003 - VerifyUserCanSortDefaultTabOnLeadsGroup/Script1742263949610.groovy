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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.util.regex.*

WebUI.callTestCase(findTestCase('CRM/Leads Group/LGR001 - VerifyUserCanAccessLeadsGroupDefault'), [:], FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()

String tableRow = '//div[contains(@class, "ant-table-row") and contains(@class, "group/tr")]'

'To locate table'
WebElement Table = driver.findElement(By.xpath('//div[@class="ant-table-tbody-virtual-holder-inner"]'))

'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = Table.findElements(By.xpath('.//div[contains(@class, "ant-table-row") and contains(@class, "group/tr")]'))

println('Number of rows found: ' + rows_table.size())

'Column 1 - Leads Group'
List<WebElement> initialList_LeadsGroup = []

int columnPosition = 1

for (WebElement row : rows_table) {
    try {
        // Find cell in the current row        
        WebElement cell = row.findElement(By.xpath(('.//div[starts-with(@class,"ant-table-cell")][' + columnPosition) + 
                ']'))

        String cellValue = cell.getText()

        initialList_LeadsGroup.add(cellValue)

        println('Cell value: ' + cellValue)
    }
    catch (Exception e) {
        println('Error finding element in row: ' + e.getMessage())
    } 
}

'Click the sort button for the "Leads Group" column'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_Leads Group'))

'Verify ascending order'
verifySorting(driver.findElements(By.xpath(tableRow)), columnPosition, true)

'Click the sort button again for descending order'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_Leads Group'))

'Verify descending order'
verifySorting(driver.findElements(By.xpath(tableRow)), columnPosition, false)

'Click the sort button a third time to reset'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_Leads Group'))

'Verify if the data state has returned to its initial state before sorting'
verifyInitialState(driver.findElements(By.xpath(tableRow)), columnPosition, initialList_LeadsGroup)

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
'To re-locate table'
Table = driver.findElement(By.xpath('//div[@class="ant-table-tbody-virtual-holder-inner"]'))

'To re-locate rows of table it will Capture all the rows available in the table'
rows_table = Table.findElements(By.xpath('.//div[contains(@class, "ant-table-row") and contains(@class, "group/tr")]'))

println('Number of rows found: ' + rows_table.size())

'Column 2 - Category'
List<WebElement> initialList_Category = []

columnPosition = 2

for (WebElement row : rows_table) {
    try {
        // Find cell in the current row
        WebElement cell = row.findElement(By.xpath(('.//div[starts-with(@class,"ant-table-cell")][' + columnPosition) + 
                ']'))

        String cellValue = cell.getText()

        initialList_Category.add(cellValue)

        println('Cell value: ' + cellValue)
    }
    catch (Exception e) {
        println('Error finding element in row: ' + e.getMessage())
    } 
}

'Click the sort button for the "Category" column'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_Category'))

'Verify ascending order'
verifySorting(driver.findElements(By.xpath(tableRow)), columnPosition, true)

'Click the sort button again for descending order'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_Category'))

'Verify descending order'
verifySorting(driver.findElements(By.xpath(tableRow)), columnPosition, false)

'Click the sort button a third time to reset'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_Category'))

'Verify if the data state has returned to its initial state before sorting'
verifyInitialState(driver.findElements(By.xpath(tableRow)), columnPosition, initialList_Category)

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
'To re-locate table'
Table = driver.findElement(By.xpath('//div[@class="ant-table-tbody-virtual-holder-inner"]'))

'To re-locate rows of table it will Capture all the rows available in the table'
rows_table = Table.findElements(By.xpath('.//div[contains(@class, "ant-table-row") and contains(@class, "group/tr")]'))

println('Number of rows found: ' + rows_table.size())

'Column 3 - Specific Source'
List<WebElement> initialList_SpecificSource = []

columnPosition = 3

for (WebElement row : rows_table) {
    try {
        // Find cell in the current row
        WebElement cell = row.findElement(By.xpath(('.//div[starts-with(@class,"ant-table-cell")][' + columnPosition) + 
                ']'))

        String cellValue = cell.getText()

        initialList_SpecificSource.add(cellValue)

        println('Cell value: ' + cellValue)
    }
    catch (Exception e) {
        println('Error finding element in row: ' + e.getMessage())
    } 
}

'Click the sort button for the "Specific Source" column'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_Specific Source'))

'Verify ascending order'
verifySorting(driver.findElements(By.xpath(tableRow)), columnPosition, true)

'Click the sort button again for descending order'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_Specific Source'))

'Verify descending order'
verifySorting(driver.findElements(By.xpath(tableRow)), columnPosition, false)

'Click the sort button a third time to reset'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_Specific Source'))

'Verify if the data state has returned to its initial state before sorting'
verifyInitialState(driver.findElements(By.xpath(tableRow)), columnPosition, initialList_SpecificSource)

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
'To re-locate table'
Table = driver.findElement(By.xpath('//div[@class="ant-table-tbody-virtual-holder-inner"]'))

'To re-locate rows of table it will Capture all the rows available in the table'
rows_table = Table.findElements(By.xpath('.//div[contains(@class, "ant-table-row") and contains(@class, "group/tr")]'))

println('Number of rows found: ' + rows_table.size())

'Column 4 - UTM Group'
List<WebElement> initialList_UTMGroup = []

columnPosition = 4

for (WebElement row : rows_table) {
    try {
        // Find cell in the current row
        WebElement cell = row.findElement(By.xpath(('.//div[starts-with(@class,"ant-table-cell")][' + columnPosition) + 
                ']'))

        String cellValue = cell.getText()

        initialList_UTMGroup.add(cellValue)

        println('Cell value: ' + cellValue)
    }
    catch (Exception e) {
        println('Error finding element in row: ' + e.getMessage())
    } 
}

'Click the sort button for the "UTM Group" column'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_UTM Group'))

'Verify ascending order'
verifySorting(driver.findElements(By.xpath(tableRow)), columnPosition, true)

'Click the sort button again for descending order'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_UTM Group'))

'Verify descending order'
verifySorting(driver.findElements(By.xpath(tableRow)), columnPosition, false)

'Click the sort button a third time to reset'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_UTM Group'))

'Verify if the data state has returned to its initial state before sorting'
verifyInitialState(driver.findElements(By.xpath(tableRow)), columnPosition, initialList_UTMGroup)

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
'To re-locate table'
Table = driver.findElement(By.xpath('//div[@class="ant-table-tbody-virtual-holder-inner"]'))

'To re-locate rows of table it will Capture all the rows available in the table'
rows_table = Table.findElements(By.xpath('.//div[contains(@class, "ant-table-row") and contains(@class, "group/tr")]'))

println('Number of rows found: ' + rows_table.size())

'Column 5 - Total Bucket'
List<WebElement> initialList_TotalBucket = []

columnPosition = 5

for (WebElement row : rows_table) {
    try {
        // Find cell in the current row
        WebElement cell = row.findElement(By.xpath(('.//div[starts-with(@class,"ant-table-cell")][' + columnPosition) + 
                ']'))

        String cellValue = cell.getText()

        initialList_TotalBucket.add(cellValue)

        println('Cell value: ' + cellValue)
    }
    catch (Exception e) {
        println('Error finding element in row: ' + e.getMessage())
    } 
}

'Click the sort button for the "Total Bucket" column'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_Total Bucket'))

//verifySorting2(driver.findElements(By.xpath(tableRow)), columnPosition, true)
'Verify ascending order'
verifySorting(driver.findElements(By.xpath(tableRow)), columnPosition, true, 'default', ('.//div[@class="ant-table-cell"][' + 
    columnPosition) + ']/div/div')

'Click the sort button again for descending order'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_Total Bucket'))

//verifySorting2(driver.findElements(By.xpath(tableRow)), columnPosition, false)
'Verify descending order'
verifySorting(driver.findElements(By.xpath(tableRow)), columnPosition, false, 'default', ('.//div[@class="ant-table-cell"][' + 
    columnPosition) + ']/div/div')

'Click the sort button a third time to reset'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_Total Bucket'))

'Verify if the data state has returned to its initial state before sorting'
verifyInitialState(driver.findElements(By.xpath(tableRow)), columnPosition, initialList_TotalBucket)

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
'To re-locate table'
Table = driver.findElement(By.xpath('//div[@class="ant-table-tbody-virtual-holder-inner"]'))

'To re-locate rows of table it will Capture all the rows available in the table'
rows_table = Table.findElements(By.xpath('.//div[contains(@class, "ant-table-row") and contains(@class, "group/tr")]'))

println('Number of rows found: ' + rows_table.size())

'Column 6 - Total Leads'
List<WebElement> initialList_TotalLeads = []

columnPosition = 6

for (WebElement row : rows_table) {
    try {
        // Find cell in the current row
        WebElement cell = row.findElement(By.xpath(('.//div[starts-with(@class,"ant-table-cell")][' + columnPosition) + 
                ']'))

        String cellValue = cell.getText()

        initialList_TotalLeads.add(cellValue)

        println('Cell value: ' + cellValue)
    }
    catch (Exception e) {
        println('Error finding element in row: ' + e.getMessage())
    } 
}

'Click the sort button for the "Total Leads" column'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_Total Leads'))

'Verify ascending order'
verifySorting(driver.findElements(By.xpath(tableRow)), columnPosition, true)

'Click the sort button again for descending order'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_Total Leads'))

'Verify descending order'
verifySorting(driver.findElements(By.xpath(tableRow)), columnPosition, false, 'numeric')

'Click the sort button a third time to reset'
WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_Total Leads'))

'Verify if the data state has returned to its initial state before sorting'
verifyInitialState(driver.findElements(By.xpath(tableRow)), columnPosition, initialList_TotalLeads)

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
'To re-locate table'
Table = driver.findElement(By.xpath('//div[@class="ant-table-tbody-virtual-holder-inner"]'))

'To re-locate rows of table it will Capture all the rows available in the table'
rows_table = Table.findElements(By.xpath('.//div[contains(@class, "ant-table-row") and contains(@class, "group/tr")]'))

println('Number of rows found: ' + rows_table.size())

//'Column 7 - Assign to'
//List<WebElement> initialList_AssignTo = []
//
//columnPosition = 7
//
//for (WebElement row : rows_table) {
//    try {
//        // Find cell in the current row
//        WebElement cell = row.findElement(By.xpath(('.//div[starts-with(@class,"ant-table-cell")][' + columnPosition) + 
//                ']/div/div/div/div/input'))
//
//        String cellValue = cell.getAttribute('placeholder').trim()
//
//        initialList_AssignTo.add(cellValue)
//
//        println('Cell value: ' + cellValue)
//    }
//    catch (Exception e) {
//        println('Error finding element in row: ' + e.getMessage())
//    } 
//}
//
//'Click the sort button for the "Assign to" column'
//WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_Assign to'))
//
//'Verify ascending order'
//verifySorting(driver.findElements(By.xpath(tableRow)), columnPosition, true, 'default', ('.//div[@class="ant-table-cell"][' + 
//    columnPosition) + ']/div/div/div/div/input', 'placeholder')
//
//'Click the sort button again for descending order'
//WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_Assign to'))
//
//'Verify descending order'
//verifySorting(driver.findElements(By.xpath(tableRow)), columnPosition, false, 'default', ('.//div[@class="ant-table-cell"][' + 
//    columnPosition) + ']/div/div/div/div/input', 'placeholder')
//
//'Click the sort button a third time to reset'
//WebUI.click(findTestObject('CRM/Bucket Management/Leads Group/sort_Assign to'))
//
//'Verify if the data state has returned to its initial state before sorting'
//verifyInitialState(driver.findElements(By.xpath(tableRow)), columnPosition, initialList_AssignTo, ('.//div[@class="ant-table-cell"][' + 
//    columnPosition) + ']/div/div/div/div/input', 'placeholder')

WebUI.closeBrowser() // Verifies if the table column is correctly sorted in ascending or descending order by comparing actual column values with expected sorted values.
// Dynamic XPath selection based on type
// Get all values from column
// Handle different sorting types
// For numeric sorting
// For string sorting
// Compare actual vs expected
// Print comparison results for debugging
// Validate results
// Validates that the table column is unsorted in its default state by checking whether the original column values are unchanged after loading the table.
// Pemilihan XPath dinamis
// Dapatkan semua nilai dari kolom
// Bersihkan daftar awal dari elemen kosong

void verifySorting(List<WebElement> rowsTable, int columnPosition, boolean isAscending, String type = 'default', String customXPath = '', String attribute = '') {
    List<WebElement> actualList = []

    println('Start sorting verification for column: ' + columnPosition)

    String xpath

    switch (customXPath) {
        case '':
            xpath = (('.//div[@class="ant-table-cell"][' + columnPosition) + ']')

            break
        default:
            xpath = customXPath}
    
    for (WebElement row : rowsTable) {
        try {
            WebElement cell = row.findElement(By.xpath(xpath))

            String cellValue

            if (attribute) {
                cellValue = cell.getAttribute(attribute).trim()
            } else {
                cellValue = cell.getText().trim()
            }
            
            if (!(cellValue.isEmpty())) {
                actualList.add(cellValue)

                println('Added value: ' + cellValue)
            }
        }
        catch (Exception e) {
            println('Error while getting value: ' + e.getMessage())
        } 
    }
    
    List<WebElement> expectedList = new ArrayList(actualList)

    if (type == 'numeric') {
        expectedList = actualList.collect({ 
                it.toInteger()
            })

        if (isAscending) {
            Collections.sort(expectedList)
        } else {
            Collections.sort(expectedList, Collections.reverseOrder())
        }
        
        expectedList = expectedList.collect({ 
                it.toString()
            })
    } else {
        if (isAscending) {
            Collections.sort(expectedList)
        } else {
            Collections.sort(expectedList, Collections.reverseOrder())
        }
    }
    
    boolean isSorted = actualList.equals(expectedList)

    println('\nList Comparison:')

    println('Actual List  : ' + actualList)

    println('Expected List: ' + expectedList)

    if (isSorted) {
        println('✅ Sorting successful for column ' + columnPosition)
    } else {
        println('❌ Sorting failed for column ' + columnPosition)

        KeywordUtil.markFailedAndStop((('Sorting failed! \nExpected: ' + expectedList) + '\nActual: ') + actualList)
    }
}

void verifyInitialState(List<WebElement> rowsTable, int columnPosition, List<WebElement> initialList, String customXPath = '', String attribute = '') {
    List<WebElement> currentList = []

    println('Mulai verifikasi keadaan awal untuk kolom: ' + columnPosition)

    String xpath

    if (customXPath.isEmpty()) {
        xpath = (('.//div[@class="ant-table-cell"][' + columnPosition) + ']')
    } else {
        xpath = customXPath
    }
    
    for (WebElement row : rowsTable) {
        try {
            WebElement cell = row.findElement(By.xpath(xpath))

            String cellValue

            if (attribute.isEmpty()) {
                cellValue = cell.getText().trim()
            } else {
                cellValue = cell.getAttribute(attribute).trim()
            }
            
            if (!(cellValue.isEmpty())) {
                currentList.add(cellValue)

                println('Nilai yang ditambahkan: ' + cellValue)
            }
        }
        catch (Exception e) {
            println('Error saat mendapatkan nilai: ' + e.getMessage())
        } 
    }
    
    initialList = initialList.findAll({ 
            it && !(it.trim().isEmpty())
        })

    println('Daftar awal (setelah dibersihkan): ' + initialList)

    println('Daftar saat ini: ' + currentList)

    if (currentList.equals(initialList)) {
        println(('Data di kolom ' + columnPosition) + ' telah kembali ke keadaan awal. BERHASIL ✅')
    } else {
        println(('Data di kolom ' + columnPosition) + ' tidak kembali ke keadaan awal dengan benar. GAGAL ❌')

        println('Perbedaan:')

        println('  Elemen yang ada di daftar awal tapi tidak ada di daftar saat ini: ' + (initialList - currentList))

        println('  Elemen yang ada di daftar saat ini tapi tidak ada di daftar awal: ' + (currentList - initialList))

        KeywordUtil.markFailedAndStop(('Reset ke keadaan awal gagal pada kolom ' + columnPosition) + '!')
    }
}

