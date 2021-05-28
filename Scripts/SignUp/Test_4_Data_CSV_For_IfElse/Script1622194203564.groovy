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
import org.openqa.selenium.Keys as Keys

def data = findTestData('SignUp_UsernameExist_CSV')

for (def index : (1..data.getRowNumbers())) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('http://localhost:8065/signup_email')

    WebUI.setText(findTestObject('Object Repository/SignUp/Page_Mattermost/input_concat(What, , s your email address)_email'), 
        data.getValue('Email', index))

    WebUI.setText(findTestObject('Object Repository/SignUp/Page_Mattermost/input_Choose your username_name'), data.getValue(
            'Username', index))

    WebUI.setText(findTestObject('Object Repository/SignUp/Page_Mattermost/input_Choose your password_password'), data.getValue(
            'Password', index))

    WebUI.click(findTestObject('Object Repository/SignUp/Page_Mattermost/button_Create Account'))
	
	def warning = WebUI.getText(findTestObject('Object Repository/SignUp/page3/Page_Mattermost/label_An account with that username already exists'))

    if (warning == data.getValue('Warning', index)) {
        KeywordUtil.markPassed('Pass' + index)
    } else {
        KeywordUtil.markFailed('Fail' + index)
    }
    
    WebUI.closeBrowser()
}

