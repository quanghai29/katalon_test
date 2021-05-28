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

WebUI.callTestCase(findTestCase('SignUp/Test_6_Data_Internal'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('http://localhost:8065/signup_email')
//
//WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_concat(What, , s your email address)_email'), 'dog2@gmail.com')
//
//WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_Choose your username_name'), 'cho1')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_Choose your password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')
//
//WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Create Account'))
WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Create a team'))

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_Team Name_teamNameInput'), 'maketing123')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Mattermost/button_Finish'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - maketing Mattermost/i_CtrlK_icon-plus'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - maketing Mattermost/span_Create New Channel'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - maketing Mattermost/input_Name_newChannelName'), 'public community123')

WebUI.click(findTestObject('Object Repository/Page_Town Square - maketing Mattermost/span_Create Channel'))

WebUI.closeBrowser()

