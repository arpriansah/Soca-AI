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

WebUI.navigateToUrl('https://soca.ai/home')

WebUI.click(findTestObject('Object Repository/tc21/Page_soca.ai/a_Sign In'))

WebUI.click(findTestObject('Object Repository/tc21/Page_soca-dashboarduser/a_Sign Up'))

WebUI.setText(findTestObject('Object Repository/tc21/Page_soca-dashboarduser/input_Fullname_form-control'), 'Arpriansah')

WebUI.setText(findTestObject('Object Repository/tc21/Page_soca-dashboarduser/input_Email_form-control'), 'arpriansah@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/tc21/Page_soca-dashboarduser/input_Password_form-control mb-2'), 
    'V4yhZFEx0HfNPf2ts0Yqfg==')

WebUI.setText(findTestObject('tc21/Page_soca-dashboarduser/input_Position_form-control'), 'test')

WebUI.setText(findTestObject('Object Repository/tc21/Page_soca-dashboarduser/input_Phone_form-control mb-2'), '082123456789')

WebUI.setText(findTestObject('Object Repository/tc21/Page_soca-dashboarduser/textarea_Description_form-control-textarea mb-2'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/tc21/Page_soca-dashboarduser/select_IndividualCompany'), 'company', 
    true)

WebUI.setText(findTestObject('tc21/Page_soca-dashboarduser/input_Company Name_form-control'), 'Birutekno')

WebUI.click(findTestObject('tc21/Page_soca-dashboarduser/input_Email Company_form-control'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/tc21/Page_soca-dashboarduser/select_Industries'), 'industries', 
    true)

WebUI.setText(findTestObject('tc21/Page_soca-dashboarduser/textarea_Address_form-control-textarea mb-2'), 'Grand Sharon Residence')

WebUI.click(findTestObject('Object Repository/tc21/Page_soca-dashboarduser/input_I agree to SOCAand acknowledge SOCA_m_447596'))

WebUI.click(findTestObject('Object Repository/tc21/Page_soca-dashboarduser/button_Sign Up'))

WebUI.click(findTestObject('Object Repository/tc21/Page_soca-dashboarduser/button_OK'))

WebUI.closeBrowser()

