package testSuite;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.commonFunctions;
import testObject.TriggerNavigation;

public class TC_TriggerSearch_002 extends commonFunctions{
	static Logger log=Logger.getLogger(TC_TriggerSearch_002.class);

	public void TriggerSearch() {

		PageFactory.initElements(driver, TriggerNavigation.class);

		TriggerNavigation.ConfigurationManagerButton.click();
		TriggerNavigation.CustomerContactButton.click();
		TriggerNavigation.TriggersButton.click();
		TriggerNavigation.TriggerInputField.sendKeys(prop.getProperty("TriggerNameForSearch"));

		Select TriggerNameSelecting = new Select(TriggerNavigation.TriggerNameSelect);
		TriggerNameSelecting.selectByVisibleText("Trigger Name");

		Select StatusSelection = new Select(TriggerNavigation.StatusSelect);
		StatusSelection.selectByVisibleText("Enabled");

		TriggerNavigation.LastRunDateUntick.click();
		TriggerNavigation.SearchButton.click();

		String ActualTriggerId=TriggerNavigation.TriggerSearchResultsTriggerId.getText();

		Assert.assertEquals(ActualTriggerId, prop.getProperty("TriggerCode"));
		{
			log.info("Actual Trigger Code : "+ActualTriggerId + " " + "ExpectedTrigger Code :"+prop.getProperty("TriggerCode"));
		}

	}
	@Test
	public void testTriggerSearch() throws IOException {
		log.info("===== Trigger search test is begin  =====");
		TriggerSearch();
		log.info("===== Trigger search test is completed ==");
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File SourceFile=screenshot.getScreenshotAs(OutputType.FILE);
		File DestinationFile= new File(System.getProperty("user.dir")+"//screenshot//003_Trigger_Search.png");
		FileHandler.copy(SourceFile, DestinationFile);
		
		
	}

}
