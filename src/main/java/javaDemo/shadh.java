package javaDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");	
	
	WebDriver driver=new ChromeDriver();	

	driver.get("http://leaftaps.com/opentaps/control/login");
	
	System.out.println("webpage open");
	
	driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Demosalesmanager");
	
	
	
	
	}

}
