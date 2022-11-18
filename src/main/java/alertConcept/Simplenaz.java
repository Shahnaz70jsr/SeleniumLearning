package alertConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simplenaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
	
	    //Create object of ChromeDriver Class
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize window
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		//Click Submit 
		driver.findElement(By.id("buttonDangerous")).click();
		}
	
		
	}


