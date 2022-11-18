package testCases_LeafTapWD;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrap_Webdriver;

public class CreateOpportunity extends ProjectSpecificWrap_Webdriver  {

@Test
public void CreateOpportunity() {

driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
System.out.println(driver.getTitle());
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.findElement(By.linkText("Create Opportunity")).click();

driver.findElement(By.id("createOpportunityForm_opportunityName")).sendKeys("ABC");
WebElement opp = driver.findElement(By.id("createOpportunityForm_opportunityStageId"));
Select dd = new Select (opp);
dd.selectByVisibleText("Closed");

}


}
