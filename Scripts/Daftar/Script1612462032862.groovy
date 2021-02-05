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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode

Mobile.startApplication('C:\\Users\\USER\\Downloads\\id.co.myhomecredit_10112_apps.evozi.com.apk', true)

WebUI.delay(10)

Mobile.swipe(641, 663, 133, 650)

Mobile.swipe(613, 916, 104, 945)

Mobile.swipe(637, 290, 49, 258)

Mobile.tap(findTestObject('Daftar/android.widget.TextView - Daftar'), 0)

Mobile.tap(findTestObject('Daftar/android.widget.TextView - Setuju  Lanjutkan'), 0)

Mobile.verifyElementVisible(findTestObject('android.view.View - Buat Akun'), 0)

Mobile.tap(findTestObject('Daftar/android.widget.Spinner - 5'), 0)

Mobile.scrollToText('16')

Mobile.tap(findTestObject('Daftar/android.widget.CheckedTextView - 14'), 0)

Mobile.tap(findTestObject('Daftar/android.widget.Spinner - Februari'), 0)

Mobile.scrollToText('Desember')

Mobile.tap(findTestObject('Daftar/android.widget.CheckedTextView - Desember'), 0)

Mobile.tap(findTestObject('Daftar/android.widget.Spinner - 2021'), 0)

Mobile.scrollToText('1998')

Mobile.tap(findTestObject('Daftar/android.widget.CheckedTextView - 1996'), 0)

Mobile.tap(findTestObject('Daftar/android.widget.EditText'), 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.KEYCODE_8)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_2)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_1)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_3)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_3)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_5)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_1)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_2)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_1)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_3)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_3)

Mobile.tap(findTestObject('Daftar/android.widget.TextView - Kode PIN (6 digit)'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Daftar/android.widget.EditText (1)'), '123444', 0)

Mobile.tap(findTestObject('Daftar/android.widget.TextView - Konfirmasi Kode PIN'), 0)

Mobile.setText(findTestObject('Daftar/android.widget.EditText (2)'), '123444', 0)

Mobile.tap(findTestObject('android.widget.Button - Lanjutkan'), 0)

WebUI.delay(60)

Mobile.tap(findTestObject('android.widget.Button - Daftar'), 0)

Mobile.verifyElementVisible(findTestObject('android.view.ViewGroup'), 0)

Mobile.verifyElementVisible(findTestObject('androidx.recyclerview.widget.RecyclerView'), 0)

Mobile.closeApplication()

