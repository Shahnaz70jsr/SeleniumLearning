package alertConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptaAlart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();			
	   driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	   driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
       Alert PromptaAlert = driver.switchTo().alert();
	   PromptaAlert.getText(); 
	   System.out.println(PromptaAlert.getText());
	   PromptaAlert.sendKeys("hello I am naz, to day I am sad");
	   Thread.sleep(6000);
	   PromptaAlert.accept();
	   Thread.sleep(5000);
	   String text = driver.findElement(By.id("result")).getText();
	   System.out.println(text);
	   driver.close();
		}
	}

	
	
	



