package assertion_for_Varifications;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.IFactoryAnnotation;

import javaDemo.IfElse;
// practice
public class Verify_IsEnabled_IsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//How to verify Element Displayed ( Visible), Enabled in Selenium.
	System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
	boolean isEnabled =  driver.findElementByXPath("//input[@id='enterID-input']").isEnabled();
	boolean isDisplayed = driver.findElementByXPath("//input[@id='enterID-input']").isDisplayed();
	
	
if(isEnabled) {
System.out.println("Btn is Enabled");
	
	}else {
		System.out.println("Btn is not Enabled");	
	}

	
	
if(isDisplayed) {
System.out.println("Btn is Displayed");
	
	}else {
		System.out.println("Btn is not Displayed");	
	}

	
	
	}
}
