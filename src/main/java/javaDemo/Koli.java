package javaDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Koli {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://uk.kensaq.com/web?o=765613&l=dir&qo=serpSearchTopBox&q=Free+Online+Dmv+Practice+Test");
	}

}
