//K
package collections;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe ");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	//Parent Window
	driver.navigate().to("https://www.w3schools.com/jsref/met_win_open.asp");
	System.out.println(driver.getTitle());
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	String window1 = driver.getWindowHandle();
	//Current window
	System.out.println("Current Window  = "  + window1);
	driver.findElement(By.linkText("Try it Yourself »")).click();
	
	Set<String> allwindow = driver.getWindowHandles();
	//Chield window
		for (String eachwindow : allwindow) {
		System.out.println(eachwindow);	
	
	
	}
		String name = driver.findElement(By.id("textareacontainer")).getText();
		System.out.println(name);
		
	
	  driver.switchTo().parentFrame();//-->> this one
	  System.out.println(driver.getTitle());
	  
	  driver.getWindowHandle().startsWith(window1, 0);
	  driver.quit();
	 	
	}

}
	



