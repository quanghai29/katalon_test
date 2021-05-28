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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import junit.framework.Assert as Assert
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.CSVData as CSV


def data = findTestData('Login_RightAccount_CSV')

for (def index : (1..data.getRowNumbers())) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('http://localhost:8065/login')

    WebUI.setText(findTestObject('Object Repository/Login/Page_Mattermost_1/input_All team communication in one place, _dcc84b'), 
        data.getValue('Username', index))

    WebUI.setText(findTestObject('Object Repository/Login/Page_Mattermost_1/input_All team communication in one place, _a3edc6'), 
        data.getValue('Password', index))

    WebUI.click(findTestObject('Object Repository/Login/Page_Mattermost_1/span_Sign in'))

    def span = WebUI.getText(findTestObject('Object Repository/Login/Page_Mattermost_2/Page_Mattermost/span_Logout'))

    if (span == 'Logout') {
        KeywordUtil.markPassed('Pass')
    } else {
        KeywordUtil.markFailed('Fail')
    }
    
    WebUI.closeBrowser()
}