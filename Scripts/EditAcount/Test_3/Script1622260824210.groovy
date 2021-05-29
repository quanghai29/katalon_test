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

WebUI.navigateToUrl('http://localhost:8065/login')

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b'), 'dung2@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    '123456')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - hello dung Mattermost/svg'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - hello dung Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - hello dung Mattermost/button_Security'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - hello dung Mattermost/span_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - hello dung Mattermost/input_Current Password_currentPassword'), 
    '123456')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - hello dung Mattermost/input_New Password_newPassword'), 
    '12345678')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - hello dung Mattermost/input_Retype New Password_confirmPassword'), 
    '12345678')

WebUI.click(findTestObject('Object Repository/Page_Town Square - hello dung Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - hello dung Mattermost/span_'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - hello dung Mattermost/button_dungtien2_style--none sidebar-header_8995e0'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - hello dung Mattermost/button_Log Out'))

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b'), 'dung2@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    '12345678')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Sign in'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Town Square - hello dung Mattermost/div_dungtien2'), '@dungtien2')

WebUI.closeBrowser()

