package startingPointOfFramework1;

import org.testng.annotations.Test;

public class TC001_CreatLead extends GenericWrapper {
@Test
	public void creatLead(){
	login("http://leaftaps.com/opentaps/control/main");
	enterById("username", "DemoSalesManager");
	enterByXpath("//input[@id='password']","crmsfa");
	clickByClass("decorativeSubmit");
	clickByLinkText("CRM/SFA");
	clickByLinkText("Create Lead");
	enterById("createLeadForm_companyName", "ABC");
	enterById("createLeadForm_firstName", "Hema");
	enterById("createLeadForm_lastName", "Mali");
	

}

}





