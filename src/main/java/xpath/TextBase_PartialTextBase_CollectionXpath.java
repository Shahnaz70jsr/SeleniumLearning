package xpath;
import org.openqa.selenium.chrome.ChromeDriver;
public class TextBase_PartialTextBase_CollectionXpath {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://tepeople.com");
//Partial Text base Xpath.Syntax: //tagname[contains(text(),'text')]
		driver.findElementByXPath("//a[contains(text(),'s')]").click();
//Text base Xpath.Syntax: //tagname[text()='text']
		driver.findElementByXPath("//a[text()='Company']").click();
		Thread.sleep(3000);
		//Collection Xpath.//Collections Xpath: write any type of Relative Xpath then keep it in a normal bracket, i.e.(//input[@id='username']) then indexing like [1]
		//or (any Xpath)[index]
//Note: For avoid duplication or multiple matches, i.e. make it unique, we use collection Xpath
		driver.findElementByXPath("(//a[contains(text(),'Training')])[1]").click();
		Thread.sleep(2000);
	System.out.println("successful");
	driver.close();
	
	}

}
