	package CSSSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafHomeWork {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//<input class="inputLogin" type="text" id="username" name="USERNAME" size="50">
		//Direct Locator (Id, Name, Class Name, Link text and Tag Name Locator)
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementByName("USERNAME").sendKeys("DemoSalesManager");
		driver.findElementByClassName("inputLogin").sendKeys("DemoSalesManager");
		driver.findElementByTagName("input").sendKeys("DemoSalesManager");
	    //Customi Locator (Xpath and CSS locator)
		//1.for CSS locator
		// For all other Attributes- ex. Name, Value, type etc. we use below Syntax-
		//Syntax: tagName[AttributeName='AttributeValue'] 
		driver.findElementByCssSelector("username").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("inputLogin").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[name='USERNAME']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[type='text']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[size='50']").sendKeys("DemoSalesManager ");
		//forStarts With
		//Syntax: tagname[attribute^='startValue of attribute']
		driver.findElementByCssSelector("input[class^='i']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[type^='t']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[id^='u']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[name^='U']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[size^='5'] ").sendKeys("DemoSalesManager");
		//forEnd with//Syntax: tagname[attribute$='EndValue of attribute']
		driver.findElementByCssSelector("input[class$='n']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[type$='t']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[id$='e']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[name$='E']").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector("input[size$='0']").sendKeys("DemoSalesManager");	
		// For parents to child//Syntax: .parentAttributeValue>ChildTagname
		driver.findElementByCssSelector(" .top>label").sendKeys("DemoSalesManager");
		driver.findElementByCssSelector(" .top>input").sendKeys("DemoSalesManager");
		//For Sibling to Sibling://Syntax: SiblingTagname[attributename='Attbvalue']+DesiredSibling tagname
		driver.findElementByCssSelector(" label[for='username']").sendKeys("DemoSalesManager");
		//2.forXpath//Absolute
		// Absolute Xpath:-/html/body/div[2]/div[2]/div/form/p[1]/input--username
		driver.findElementByXPath("/html/body/div[2]/div[2]/div/form/p[1]/input").sendKeys("DemoSalesManager");
		//for Attribute//Syntext; tagname[@attribute= 'value']
		driver.findElementByXPath("(//input[@class='inputLogin'])[1]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@type='text']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@name='USERNAME']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("(//input[@size='50'])[1]").sendKeys("DemoSalesManager");
		// forPartial Attribute//Syntax://tagname[contains(@attribute,'partialValue')]
		//Syntax://tagname[contains(@attribute,'partialValue')]
		driver.findElementByXPath("(//input[contains(@class,'i')])[1]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[contains(@type,'it')]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[contains(@id,'e')]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[contains(@name,'E')]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("(//input[contains(@size,'0')])[1]").sendKeys("DemoSalesManager");
		//For Parent child Attribute //Syntax: Parent basic xpath/child tagname
		driver.findElementByXPath("//p[@class='top']/input").sendKeys("DemoSalesManager");
		// Xpath using tagName
		driver.findElementByXPath("(//input)[1]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("").sendKeys("DemoSalesManager");
		driver.findElementByXPath("").sendKeys("DemoSalesManager");
		
			}

	
	
	
	
	
	
	
	
	
	}


