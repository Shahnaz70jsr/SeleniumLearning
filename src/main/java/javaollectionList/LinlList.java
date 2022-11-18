package javaollectionList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinlList {
	private static List LinlList;
	private static List list;
	private static List list2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Enter Username 
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// Enter Password 
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click Login Button 
		driver.findElement(By.className("decorativeSubmit")).click();
		// click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		List<WebElement> linkTag = driver.findElements(By.tagName("a"));
		//Find how many a link in this page?
		System.out.println(linkTag.size());
		driver.close();
	}}
