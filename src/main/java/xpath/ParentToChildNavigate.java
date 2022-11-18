package xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class ParentToChildNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//writing Xpath base on parent basic Xpath and /(slash)child tagname
	//Syntax: Parent basic xpath/child tagname
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com");
		String headline = driver.findElementByXPath("/html/body/header/section").getText();
	//System.out.println(headline);
	String name = driver.findElementsByXPath("/html/body/div[1]/div[2]/div/div[2]/aside[1]/ul/li[1]/a").get(0).getText();
	 System.out.println(name);
	String name1 = driver.findElementByXPath("/html/body/div[1]/div[2]/div/div[2]/aside[1]/ul/li[2]/a").getText();
	System.out.println(name1);
	String name2 = driver.findElementByXPath("/html/body/div[1]/div[2]/div/div[2]/aside[1]/h3").getText();
	System.out.println(name2);
	}

}
