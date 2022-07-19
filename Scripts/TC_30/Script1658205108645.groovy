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

WebUI.click(findTestObject('Object Repository/tc30/Page_soca.ai/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/tc30/Page_soca-dashboarduser/input_Email_form-control'), 'kp3skp.dev@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/tc30/Page_soca-dashboarduser/input_Password_form-control mb-2'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/tc30/Page_soca-dashboarduser/button_Sign In'))

WebUI.click(findTestObject('Object Repository/tc30/Page_soca-dashboarduser/button_OK'))

WebUI.click(findTestObject('Object Repository/tc30/Page_soca-dashboarduser/a_Projects'))

WebUI.click(findTestObject('Object Repository/tc30/Page_soca-dashboarduser/button_Dashboard'))

WebUI.click(findTestObject('Object Repository/tc30/Page_soca-ai-proctoring-dashboard/span_Master Users'))

WebUI.click(findTestObject('Object Repository/tc30/Page_soca-ai-proctoring-dashboard/button_Add Users'))

WebUI.click(findTestObject('Object Repository/tc30/Page_soca-ai-proctoring-dashboard/button_Upload Image'))

WebUI.click(findTestObject('Object Repository/tc30/Page_soca-ai-proctoring-dashboard/button_Upload Image'))

WebUI.click(findTestObject('Object Repository/tc30/Page_soca-ai-proctoring-dashboard/button_Upload Image'))

WebUI.setText(findTestObject('Object Repository/tc30/Page_soca-ai-proctoring-dashboard/input_Unique Code_txt-unique'), '12345')

WebUI.setText(findTestObject('Object Repository/tc30/Page_soca-ai-proctoring-dashboard/input_Full Name_txt-full-name'), 
    'Arpriansah')

WebUI.click(findTestObject('Object Repository/tc30/Page_soca-ai-proctoring-dashboard/input_Email_txt-email'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/tc30/Page_soca-ai-proctoring-dashboard/label_Male'))

WebUI.setText(findTestObject('Object Repository/tc30/Page_soca-ai-proctoring-dashboard/input_Exam Number_txt-exam-number'), 
    '12345')

WebUI.click(findTestObject('Object Repository/tc30/Page_soca-ai-proctoring-dashboard/label_Wednesday, July 19, 2000'))

WebUI.click(findTestObject('Object Repository/tc30/Page_soca-ai-proctoring-dashboard/div'))

WebUI.click(findTestObject('Object Repository/tc30/Page_soca-ai-proctoring-dashboard/span_18'))

WebUI.setText(findTestObject('Object Repository/tc30/Page_soca-ai-proctoring-dashboard/textarea_Address_txt-address'), 'Grand Sharon Residence')

WebUI.click(findTestObject('Object Repository/tc30/Page_soca-ai-proctoring-dashboard/button_Submit'))

WebUI.closeBrowser()

