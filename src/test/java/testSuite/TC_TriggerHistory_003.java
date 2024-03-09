package testSuite;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunctions.commonFunctions;
import testObject.TriggerHistoryObject;

public class TC_TriggerHistory_003 extends commonFunctions {

	public void TriggerHistory() throws InterruptedException {
		PageFactory.initElements(driver, TriggerHistoryObject.class);		
		TriggerHistoryObject.OperationsManagerButtonClick.click();
		Thread.sleep(9000);
		TriggerHistoryObject.ApplicationButton.click();
		TriggerHistoryObject.TriggerHistoryButton.click();

	} 
	public void TriggerHistoryPageNavigation() {
		TriggerHistoryObject.TriggerSearchInputField.sendKeys(prop.getProperty("TriggerNameAdd"));

		Select TriggerHistoryNameSelect = new Select(TriggerHistoryObject.TriggerNameIdSelect);
		TriggerHistoryNameSelect.selectByVisibleText("Trigger Name");

		TriggerHistoryObject.SearchButtonClick.click();

	}
	public void TakingaScreenshotTriggerHistory() throws IOException {
		TakesScreenshot takescreenshot=(TakesScreenshot) driver;
		File Source=takescreenshot.getScreenshotAs(OutputType.FILE);
		File Destination=new File(System.getProperty("user.dir")+"//screenshot//002_Trigger_History.png");
		FileHandler.copy(Source, Destination);

	}

@Test
public void testExecutionTriggerHistory() throws InterruptedException, IOException {
	TriggerHistory();
	TriggerHistoryPageNavigation();
	TakingaScreenshotTriggerHistory();
}

}
