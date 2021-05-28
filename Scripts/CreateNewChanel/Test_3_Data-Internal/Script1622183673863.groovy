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

WebUI.navigateToUrl(findTestData('CreateNewChanel').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_concat(What, , s your email address)_email'), findTestData('CreateNewChanel').getValue(2, 1))

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_Choose your username_name'), findTestData('CreateNewChanel').getValue(3, 1))

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_Choose your password_password'), findTestData('CreateNewChanel').getValue(4, 1))

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Create Account'))

def error = WebUI.getText(findTestObject('Object Repository/Page_Mattermost/label_An account with that email already exists'))

if (error == 'An account with that email already exists.') {
    WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Click here to sign in'))

    WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b'), 
        findTestData('CreateNewChanel').getValue(2, 1))

    WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
        findTestData('CreateNewChanel').getValue(4, 1))

    WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Sign in'))

    WebUI.click(findTestObject('Object Repository/Page_Town Square - hello dung Mattermost/i_CtrlK_icon-plus'))

    WebUI.click(findTestObject('Object Repository/Page_Town Square - hello dung Mattermost/span_Create New Channel'))

    WebUI.click(findTestObject('Object Repository/Page_Town Square - hello dung Mattermost/input_- Anyone can join this channel_channelType'))

    WebUI.setText(findTestObject('Object Repository/Page_Town Square - hello dung Mattermost/input_Name_newChannelName'), 
        findTestData('CreateNewChanel').getValue(6, 1))

    WebUI.click(findTestObject('Object Repository/Page_Town Square - hello dung Mattermost/span_Create Channel'))

    WebUI.closeBrowser()
} else {
    WebUI.closeBrowser()
}

