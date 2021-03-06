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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8065/signup_email')

WebUI.setText(findTestObject('Object Repository/SignUp/Page_Mattermost_1/input_concat(What, , s your email address)_email'), 
    findTestData('Register Internal Data').getValue(1, 7))

WebUI.setText(findTestObject('Object Repository/SignUp/Page_Mattermost_1/input_Choose your username_name'), findTestData(
        'Register Internal Data').getValue(2, 7))

WebUI.setText(findTestObject('Object Repository/SignUp/Page_Mattermost_1/input_Choose your password_password'), findTestData(
        'Register Internal Data').getValue(3, 7))

WebUI.click(findTestObject('Object Repository/Page_Mattermost_2/span_Create Account'))

TestObject object = findTestObject('Object Repository/Page_Mattermost/label_Usernames have to begin with a lowerc_707f7d')

switch (object) {
    case null:
        WebUI.click(findTestObject('Object Repository/SignUp/Page_Mattermost_2/span_Logout'))

        break
    default:
        WebUI.setText(findTestObject('Object Repository/SignUp/Page_Mattermost_1/input_Choose your password_password'), 
            '077874036')

        WebUI.click(findTestObject('Object Repository/Page_Mattermost_2/span_Create Account'))

        break
}

WebUI.closeBrowser()

