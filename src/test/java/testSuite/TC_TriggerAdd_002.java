package testSuite;

import java.io.File;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunctions.commonFunctions;
import testObject.TriggerAddObjects;
import testObject.TriggerNavigation;

public class TC_TriggerAdd_002 extends commonFunctions{

	/*
	 * Random random=new Random(); int RandomNumber=random.nextInt(10000); String
	 * TriggerName = (prop.getProperty("TriggerNameAdd"))+RandomNumber;
	 */

	static Logger log= Logger.getLogger(TC_TriggerAdd_002.class);
	public void TriggerAddWithReward() throws IOException {

		PageFactory.initElements(driver, TriggerAddObjects.class);
		log.info("=====================================================");
		log.info("==== Trigger Add test Case execution is begin    ====");
		TriggerAddObjects.TriggerAddButton.click();
		log.info("Trigger Add button is clicked");
		TriggerAddObjects.TriggerNameInputBox.sendKeys(prop.getProperty("TriggerNameAdd"));
		log.info("TriggerName is entered : "+prop.getProperty("TriggerNameAdd"));
		
		Select triggerStatusSelect=new Select (TriggerAddObjects.TriggerStatusSelect);
		triggerStatusSelect.selectByVisibleText("Enabled");

		TriggerAddObjects.SetButtonFirstPage.click();
		TriggerAddObjects.SetButtonSecondPage.click();
		TriggerAddObjects.RedemptionButton.click();
		TriggerAddObjects.AdvanceFilterButton.click();
		TriggerAddObjects.AdvanceFilterButton.sendKeys(prop.getProperty("RewardId"));
		TriggerAddObjects.FirstOutputClick.click();
		TriggerAddObjects.OkbuttonAdvanceFilter.click();
		TriggerAddObjects.OkbuttonforAddpage.click();
		TriggerAddObjects.ParticipationLimit.sendKeys("1");
		TriggerAddObjects.ParticipationListInput.sendKeys(prop.getProperty("TriggerParticipationMSISDN"));
		TriggerAddObjects.NextDateTick.click();
		TriggerAddObjects.OkbuttonFinal.click();
		log.info("==== Trigger Add test Case execution is completed ===");
		log.info("=====================================================");
		
		TakesScreenshot screenshotTrigger=(TakesScreenshot) driver;
		File SourceFile=screenshotTrigger.getScreenshotAs(OutputType.FILE);
		File DestinationFile=new File("TriggerAdd.png");
		FileHandler.copy(SourceFile, DestinationFile);
		



	}

	public void TriggerSearchWithcreated() {
		PageFactory.initElements(driver,TriggerNavigation.class);
		log.info("=====================================================");
		TriggerNavigation.TriggerInputField.clear();
		TriggerNavigation.TriggerInputField.sendKeys(prop.getProperty("TriggerNameAdd"));
		//TriggerNavigation.LastRunDateUntick.click();
		TriggerNavigation.SearchButton.click();
		log.info("Trigger name is entered to search for the last run ");
		log.info("====     ====");
	}
	
	public void TakingaScreenshotAfterTriggerAdd() throws IOException {
		
		TakesScreenshot takescreenshot=(TakesScreenshot)driver;
		File Source=takescreenshot.getScreenshotAs(OutputType.FILE);
		File Destination = new File(System.getProperty("user.dir")+"//screenshot//001_After_Adding_Trigger.png");
		FileHandler.copy(Source, Destination);
	}
	
	@Test
	public void testExecutionTriggerAdd() throws IOException {
		TriggerAddWithReward();
		TriggerSearchWithcreated();
		TakingaScreenshotAfterTriggerAdd();
	}

}
