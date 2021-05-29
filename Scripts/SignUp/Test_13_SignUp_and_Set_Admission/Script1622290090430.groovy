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

WebUI.setText(findTestObject('Object Repository/LinhDong_Test/Page_Mattermost_Signup_SetAdmission/Page_Mattermost/input_concat(What, , s your email address)_email'), 
    'mailinhdong@gmail.com')

WebUI.setText(findTestObject('Object Repository/LinhDong_Test/Page_Mattermost_Signup_SetAdmission/Page_Mattermost/input_Choose your username_name'), 
    'linhdong64')

WebUI.setText(findTestObject('Object Repository/LinhDong_Test/Page_Mattermost_Signup_SetAdmission/Page_Mattermost/input_Choose your password_password'), 
    'linhdong64')

WebUI.click(findTestObject('Object Repository/LinhDong_Test/Page_Mattermost_Signup_SetAdmission/Page_Mattermost/span_Create Account'))

WebUI.click(findTestObject('Object Repository/LinhDong_Test/Page_Mattermost_Signup_SetAdmission/Page_Mattermost/span_Go to System Console'))

WebUI.click(findTestObject('Object Repository/LinhDong_Test/Page_Mattermost_Signup_SetAdmission/Page_System Console - Mattermost/a_Signup'))

WebUI.click(findTestObject('Object Repository/LinhDong_Test/Page_Mattermost_Signup_SetAdmission/Page_System Console - Mattermost/input_Enable Open Server_TeamSettings.Enabl_2f2a75'))

WebUI.click(findTestObject('Object Repository/LinhDong_Test/Page_Mattermost_Signup_SetAdmission/Page_System Console - Mattermost/span_Save'))

