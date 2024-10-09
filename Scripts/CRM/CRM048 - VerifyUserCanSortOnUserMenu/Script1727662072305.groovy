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

WebUI.callTestCase(findTestCase('CRM/CRM042 - VerifyUserCanAccessUserMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify "Edit Account" icon/button is visible by user.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/CRM048/sort_Name'))

'Verify "Edit Account" icon/button is visible by user.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/CRM048/sort_Email'))

'Verify "Edit Account" icon/button is visible by user.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/CRM048/sort_Phone'))

'Verify "Edit Account" icon/button is visible by user.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/CRM048/sort_Role'))

'Verify "Edit Account" icon/button is visible by user.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/CRM048/sort_BU Company'))

'Verify "Edit Account" icon/button is visible by user.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/CRM048/sort_CMS Status'))

'Verify "Edit Account" icon/button is visible by user.'
WebUI.verifyElementVisible(findTestObject('Account Management Page/CRM048/sort_CRM Status'))

WebDriver driver = DriverFactory.getWebDriver()

'To locate table'
WebElement Table = driver.findElement(By.xpath('//table/tbody'))

'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

println(rows_table)

'Column 1 - Name'
List<WebElement> initialList_Name = []

for (WebElement row : rows_table) {
    String cellValue = row.findElement(By.xpath('td[1]')).getText()
	println(row)
	
	println(cellValue)

    initialList_Name.add(cellValue)
}

'Click the sort button for the "Name" column'
WebUI.click(findTestObject('Account Management Page/CRM048/sort_Name'))

'Verify ascending order'
verifySorting(driver.findElements(By.xpath('//table/tbody/tr')), 1, true)

'Click the sort button again for descending order'
WebUI.click(findTestObject('Account Management Page/CRM048/sort_Name'))

'Verify descending order'
verifySorting(driver.findElements(By.xpath('//table/tbody/tr')), 1, false)

'Click the sort button a third time to reset'
WebUI.click(findTestObject('Account Management Page/CRM048/sort_Name'))

'Verify if the data state has returned to its initial state before sorting'
verifyInitialState(driver.findElements(By.xpath('//table/tbody/tr')), 1, initialList_Name)

'To locate the table element'
Table = driver.findElement(By.xpath('//table/tbody'))

'To locate the rows of the table; it will capture all rows available in the table'
rows_table = Table.findElements(By.tagName('tr'))

'Column 2 - Email'
List<WebElement> initialList_Email = []

for (WebElement row : rows_table) {
    String cellValue = row.findElement(By.xpath('td[2]')).getText()

    initialList_Email.add(cellValue)
}

'Click the sort button for the "Email" column'
WebUI.click(findTestObject('Account Management Page/CRM048/sort_Email'))

'Verify ascending order'
verifySorting(driver.findElements(By.xpath('//table/tbody/tr')), 2, true)

'Click the sort button again for descending order'
WebUI.click(findTestObject('Account Management Page/CRM048/sort_Email'))

'Verify descending order'
verifySorting(driver.findElements(By.xpath('//table/tbody/tr')), 2, false)

'Click the sort button a third time to reset'
WebUI.click(findTestObject('Account Management Page/CRM048/sort_Email'))

'Verify if the data state has returned to its initial state before sorting'
verifyInitialState(driver.findElements(By.xpath('//table/tbody/tr')), 2, initialList_Email)

'To locate the table element'
Table = driver.findElement(By.xpath('//table/tbody'))

'To locate the rows of the table; it will capture all rows available in the table'
rows_table = Table.findElements(By.tagName('tr'))

'Column 3 - Phone'
List<WebElement> initialList_Phone = []

for (WebElement row : rows_table) {
    String cellValue = row.findElement(By.xpath('td[3]')).getText()

    initialList_Phone.add(cellValue)
}

'Click the sort button for the "Phone" column'
WebUI.click(findTestObject('Account Management Page/CRM048/sort_Phone'))

'Verify ascending order'
verifySorting(driver.findElements(By.xpath('//table/tbody/tr')), 3, true)

'Click the sort button again for descending order'
WebUI.click(findTestObject('Account Management Page/CRM048/sort_Phone'))

'Verify descending order'
verifySorting(driver.findElements(By.xpath('//table/tbody/tr')), 3, false)

'Click the sort button a third time to reset'
WebUI.click(findTestObject('Account Management Page/CRM048/sort_Phone'))

'Verify if the data state has returned to its initial state before sorting'
verifyInitialState(driver.findElements(By.xpath('//table/tbody/tr')), 3, initialList_Phone)

//'To locate the table element'
//Table = driver.findElement(By.xpath('//table/tbody'))
//
//'To locate the rows of the table; it will capture all rows available in the table'
//rows_table = Table.findElements(By.tagName('tr'))
//
//'Column 4 - Role'
//List<String> initialList_Role = [] // Initial list for the "Role" column
//for (WebElement row : rows_table) {
//	String cellValue = row.findElement(By.xpath("td[4]")).getText()
//	initialList_Role.add(cellValue)
//}
//
//'Click the sort button for the "Role" column'
//WebUI.click(findTestObject('Account Management Page/CRM048/sort_Role'))
//
//'Verify ascending order'
//verifySorting(driver.findElements(By.xpath('//table/tbody/tr')), 4, true)
//
//'Click the sort button again for descending order'
//WebUI.click(findTestObject('Account Management Page/CRM048/sort_Role'))
//
//'Verify descending order'
//verifySorting(driver.findElements(By.xpath('//table/tbody/tr')), 4, false)
//
//'Click the sort button a third time to reset'
//WebUI.click(findTestObject('Account Management Page/CRM048/sort_Role'))
//
//'Verify if the data state has returned to its initial state before sorting'
//verifyInitialState(driver.findElements(By.xpath('//table/tbody/tr')), 4, initialList_Role)
'To locate the table element'
Table = driver.findElement(By.xpath('//table/tbody'))

'To locate the rows of the table; it will capture all rows available in the table'
rows_table = Table.findElements(By.tagName('tr'))

'Column 5 - BU Company'
List<WebElement> initialList_BUCompany = []

for (WebElement row : rows_table) {
    String cellValue = row.findElement(By.xpath('td[5]')).getText()

    initialList_BUCompany.add(cellValue)
}

'Click the sort button for the "BU Company" column'
WebUI.click(findTestObject('Account Management Page/CRM048/sort_BU Company'))

'Verify ascending order'
verifySorting(driver.findElements(By.xpath('//table/tbody/tr')), 5, true)

'Click the sort button again for descending order'
WebUI.click(findTestObject('Account Management Page/CRM048/sort_BU Company'))

'Verify descending order'
verifySorting(driver.findElements(By.xpath('//table/tbody/tr')), 5, false)

'Click the sort button a third time to reset'
WebUI.click(findTestObject('Account Management Page/CRM048/sort_BU Company'))

'Verify if the data state has returned to its initial state before sorting'
verifyInitialState(driver.findElements(By.xpath('//table/tbody/tr')), 5, initialList_BUCompany)

'To locate the table element'
Table = driver.findElement(By.xpath('//table/tbody'))

'To locate the rows of the table; it will capture all rows available in the table'
rows_table = Table.findElements(By.tagName('tr'))

'Column 6 - CMS Status'
List<WebElement> initialList_CMSStatus = []

for (WebElement row : rows_table) {
    String cellValue = row.findElement(By.xpath('td[6]')).getText()

    initialList_CMSStatus.add(cellValue)
}

'Click the sort button for the "CMS Status" column'
WebUI.click(findTestObject('Account Management Page/CRM048/sort_CMS Status'))

'Verify ascending order'
verifySorting(driver.findElements(By.xpath('//table/tbody/tr')), 6, true)

'Click the sort button again for descending order'
WebUI.click(findTestObject('Account Management Page/CRM048/sort_CMS Status'))

'Verify descending order'
verifySorting(driver.findElements(By.xpath('//table/tbody/tr')), 6, false)

'Click the sort button a third time to reset'
WebUI.click(findTestObject('Account Management Page/CRM048/sort_CMS Status'))

'Verify if the data state has returned to its initial state before sorting'
verifyInitialState(driver.findElements(By.xpath('//table/tbody/tr')), 6, initialList_CMSStatus)

'To locate the table element'
Table = driver.findElement(By.xpath('//table/tbody'))

'To locate the rows of the table; it will capture all rows available in the table'
rows_table = Table.findElements(By.tagName('tr'))

'Column 7 - CRM Status'
List<WebElement> initialList_CRMStatus = []

for (WebElement row : rows_table) {
    String cellValue = row.findElement(By.xpath('td[7]')).getText()

    initialList_CRMStatus.add(cellValue)
}

'Click the sort button for the "CRM Status" column'
WebUI.click(findTestObject('Account Management Page/CRM048/sort_CRM Status'))

'Verify ascending order'
verifySorting(driver.findElements(By.xpath('//table/tbody/tr')), 7, true)

'Click the sort button again for descending order'
WebUI.click(findTestObject('Account Management Page/CRM048/sort_CRM Status'))

'Verify descending order'
verifySorting(driver.findElements(By.xpath('//table/tbody/tr')), 7, false)

'Click the sort button a third time to reset'
WebUI.click(findTestObject('Account Management Page/CRM048/sort_CRM Status'))

'Verify if the data state has returned to its initial state before sorting'
verifyInitialState(driver.findElements(By.xpath('//table/tbody/tr')), 7, initialList_CRMStatus)

WebUI.closeBrowser()

void verifySorting(List<WebElement> rowsTable, int columnPosition, boolean isAscending) {
    List<WebElement> sortedList = []

    for (WebElement row : rowsTable) {
        String cellValue = row.findElement(By.xpath(('td[' + columnPosition) + ']')).getText()

        sortedList.add(cellValue)
    }
    
    Pattern pattern = Pattern.compile('^[A-Za-z]')

    boolean isSorted = true

    String previousFirstLetter = ''

    for (String item : sortedList) {
        Matcher matcher = pattern.matcher(item)

        if (matcher.find()) {
            String currentFirstLetter = matcher.group(0).toLowerCase()

            if (previousFirstLetter.isEmpty()) {
                previousFirstLetter = currentFirstLetter

                continue
            }
            
            if (isAscending) {
                if (currentFirstLetter.compareTo(previousFirstLetter) < 0) {
                    isSorted = false

                    break
                }
            } else {
                if (currentFirstLetter.compareTo(previousFirstLetter) > 0) {
                    isSorted = false

                    break
                }
            }
            
            previousFirstLetter = currentFirstLetter
        }
    }
    
    if (isSorted) {
        println(('Sorting successful on column ' + columnPosition) + '. PASSED ✅')
    } else {
        println(('Sorting failed on column ' + columnPosition) + '. NOT PASSED ❌')

        KeywordUtil.markFailedAndStop(('Sorting failed on column ' + columnPosition) + '!')
    }
}

void verifyInitialState(List<WebElement> rowsTable, int columnPosition, List<WebElement> initialList) {
    List<WebElement> currentList = []

    for (WebElement row : rowsTable) {
        String cellValue = row.findElement(By.xpath(('td[' + columnPosition) + ']')).getText()

        currentList.add(cellValue)
    }
    
    if (currentList.equals(initialList)) {
        println(('Data in column ' + columnPosition) + ' has been reset to initial state. PASSED ✅')
    } else {
        println(('Data in column ' + columnPosition) + ' did not reset correctly. NOT PASSED ❌')

        KeywordUtil.markFailedAndStop(('Reset to initial state failed on column ' + columnPosition) + '!')
    }
}

