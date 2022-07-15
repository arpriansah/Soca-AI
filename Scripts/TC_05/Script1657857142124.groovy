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

WebUI.click(findTestObject('Object Repository/tc05/Page_soca.ai/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/tc05/Page_soca-dashboarduser/input_Email_form-control'), 'kp3skp.dev@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/tc05/Page_soca-dashboarduser/input_Password_form-control mb-2'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/tc05/Page_soca-dashboarduser/button_Sign In'))

WebUI.click(findTestObject('Object Repository/tc05/Page_soca-dashboarduser/button_OK'))

WebUI.click(findTestObject('Object Repository/tc05/Page_soca-dashboarduser/a_Projects'))

WebUI.click(findTestObject('Object Repository/tc05/Page_soca-dashboarduser/button_New Project'))

WebUI.setText(findTestObject('Object Repository/tc05/Page_soca-dashboarduser/input_Project Name_txt-name'), 'Test')

WebUI.click(findTestObject('Object Repository/tc05/Page_soca-dashboarduser/img'))

WebUI.click(findTestObject('Object Repository/tc05/Page_soca-dashboarduser/img_1'))

WebUI.click(findTestObject('tc05/Page_soca-dashboarduser/input_Movement Detection_face_regonition'))

WebUI.click(findTestObject('tc05/Page_soca-dashboarduser/input_Face Recognition_face_regonition'))

WebUI.click(findTestObject('Object Repository/tc05/Page_soca-dashboarduser/input_All Features_face_regonition'))

WebUI.setText(findTestObject('Object Repository/tc05/Page_soca-dashboarduser/input_API Transaction_txt-api-transaction'), 
    '1000')

WebUI.click(findTestObject('Object Repository/tc05/Page_soca-dashboarduser/button_Calculate'))

WebUI.closeBrowser()

