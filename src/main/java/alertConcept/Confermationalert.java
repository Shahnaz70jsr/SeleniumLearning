package alertConcept;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Confermationalert {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Driver creation.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//getURL (Website open)
		driver.get("http://leaftaps.com/opentaps/control/login");
		//window maximizing.
		driver.manage().window().maximize();
		//login function.
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//selenium synchronization.
		Thread.sleep(2000);
		//lead welcome page open.
		driver.findElement(By.xpath("//*[@id='label']")).click();
		 //Create lead page open.
		 driver.findElement(By.linkText("Create Lead")).click();
		 // Open merge lead.
		 driver.findElement(By.linkText("Merge Leads")).click();
		 Thread.sleep(1000);
		 //merge lead button click.
		 driver.findElement(By.className("buttonDangerous")).click();
		 Thread.sleep(5000);
		 Alert alert = driver.switchTo().alert();
		 System.out.println(driver.switchTo().alert().getText());
		 driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.close();
        System.out.println("operation success");
	}
}
