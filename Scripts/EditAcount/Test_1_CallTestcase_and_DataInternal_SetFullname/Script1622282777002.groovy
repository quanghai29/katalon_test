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

//WebUI.openBrowser('')

//WebUI.navigateToUrl('http://localhost:8065/')

//WebUI.setText(findTestObject('Object Repository/LinhDong_Test/Page_Mattermost_AccountSettings/Page_Mattermost/input_All team communication in one place, _dcc84b'), 
//    'linhdong64')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/LinhDong_Test/Page_Mattermost_AccountSettings/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
//    'lGQN/Pbr2EsGxfFg3K2/xw==')
//
//WebUI.click(findTestObject('Object Repository/LinhDong_Test/Page_Mattermost_AccountSettings/Page_Mattermost/span_Sign in'))

def data = findTestData('EditAccount_SetFullname_DataInternal')

for (def index : (1..data.getRowNumbers())) {
WebUI.callTestCase(findTestCase('Login/Test_2_DataInternal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/LinhDong_Test/Page_Mattermost_AccountSettings/Page_Town Square - Team1 Mattermost/svg'))

WebUI.click(findTestObject('Object Repository/LinhDong_Test/Page_Mattermost_AccountSettings/Page_Town Square - Team1 Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/LinhDong_Test/Page_Mattermost_AccountSettings/Page_Town Square - Team1 Mattermost/span_Edit'))

WebUI.setText(findTestObject('Object Repository/LinhDong_Test/Page_Mattermost_AccountSettings/Page_Town Square - Team1 Mattermost/input_First Name_firstName'), 
   data.getValue(1, index))

WebUI.setText(findTestObject('Object Repository/LinhDong_Test/Page_Mattermost_AccountSettings/Page_Town Square - Team1 Mattermost/input_Last Name_lastName'), 
   data.getValue(2, index))

WebUI.click(findTestObject('Object Repository/LinhDong_Test/Page_Mattermost_AccountSettings/Page_Town Square - Team1 Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/LinhDong_Test/Page_Mattermost_AccountSettings/Page_Town Square - Team1 Mattermost/span_'))
}

