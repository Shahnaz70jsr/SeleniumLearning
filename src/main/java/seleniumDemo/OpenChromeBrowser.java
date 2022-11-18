package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

		
		public static void main(String[] args) {
			
			//launch chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			// load url
			driver.get("http://leaftaps.com/opentaps");
			
			//Maximize window
			driver.manage().window().maximize();
			
			//Print Title of the page
			System.out.println(driver.getTitle());
			
			driver.close();
}
}
