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

WebUI.navigateToUrl('https://qbank.accelq.com/')

WebUI.setText(findTestObject('Object Repository/Page_/input_Corporate Banking_qb-username'), 'qbankadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Corporate Banking_Password'), '5vhPhIOFGWAND16K/8K9wA==')

WebUI.click(findTestObject('Object Repository/Page_/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_/div_Account Statements'))

WebUI.click(findTestObject('Object Repository/Page_/div_Link a Credit Card'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Credit Card Number_input1'), '1234')

WebUI.setText(findTestObject('Object Repository/Page_/input_Credit Card Number_input2'), '5678')

WebUI.setText(findTestObject('Object Repository/Page_/input_Credit Card Number_input3'), '9876')

WebUI.setText(findTestObject('Object Repository/Page_/input_Credit Card Number_input4'), '6789')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Transfer Amount_qbf-input small ng-un_ba31be'), 'FkZwlX09ZBg=')

WebUI.setText(findTestObject('Object Repository/Page_/input__input5'), '12')

WebUI.setText(findTestObject('Object Repository/Page_/input__input6'), '27')

WebUI.click(findTestObject('Object Repository/Page_/div_Log out'))

