package testSuite;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.commonFunctions;
import testObject.LoginTestObject;

public class TC_LoginTestCase_001 extends commonFunctions{
	static Logger log = Logger.getLogger(TC_LoginTestCase_001.class);
	public void login() {
		PageFactory.initElements(driver, LoginTestObject.class);
		LoginTestObject.Username.sendKeys(prop.getProperty("username"));
		LoginTestObject.Password.sendKeys(prop.getProperty("password"));
		LoginTestObject.SubmitButton.click();
	}

	@Test
	public void LoginTestExecution() {
		log.info("========= Login Test case execution started ======= ");
		login();
		log.info("========= Login Test case execution completed ===== ");
		
		
	}
}
