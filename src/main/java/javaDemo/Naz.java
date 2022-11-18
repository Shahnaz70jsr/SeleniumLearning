package javaDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();


driver.get("http://leaftaps.com/opentaps/control/login");

System.out.println("webpage open");

Thread.sleep(1000);
driver.findElement(By.xpath("(//*[@class='inputLogin'])[1]")).sendKeys("Demosalesmanager");
Thread.sleep(1000);		
driver.findElement(By.xpath("//*[@type='password']")).sendKeys("crmsfa");
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@class='decorativeSubmit']")).click();
Thread.sleep(2000);
System.out.println("user successfully login");
driver.close();
System.out.println("successful automation");

		
		
		
		
	}

}
