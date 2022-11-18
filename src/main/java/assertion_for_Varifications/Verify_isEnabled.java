package assertion_for_Varifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Verify_isEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		//Load url	
		driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
	
		boolean logo = driver.findElementByXPath("//img[@alt='Bank of America']").isEnabled();	
		System.out.println(logo);

			if (logo==true) {
				}	
			System.out.println(logo);
		//isEnabled() -Get The App link is Enable(true/false)
		boolean getTheAppLink = driver.findElement(By.xpath("//a[@id='choose-device-get-the-app']/span[1]")).isEnabled();
		//if(getTheAppLink==true) {
		System.out.println("The Get the App link is Enabled");
	//else {
			System.out.println("The Get the App link is not Enabled");


	}


}
	
	


