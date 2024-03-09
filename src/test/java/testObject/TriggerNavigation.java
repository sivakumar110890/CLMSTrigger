package testObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TriggerNavigation {
	
	@FindBy(xpath="//ul[@id=\"sidebarMenu\"]/li/a[contains(text(),'Configuration Manager')]")
	@CacheLookup
	public static WebElement ConfigurationManagerButton;
	
	@FindBy(xpath="//a[contains(text(),'Customer Contact')]")
	@CacheLookup
	public static WebElement CustomerContactButton;
	
	
	@FindBy(xpath="//a[contains(text(),'Triggers')][@code=\"trigger/search\"]")
	@CacheLookup
	public static WebElement TriggersButton;
	
	
	@FindBy(id="search1")
	@CacheLookup
	public static WebElement TriggerNameSelect;
	
	
	@FindBy(id="Search_Triggers_search1_val")
	@CacheLookup
	public static WebElement TriggerInputField;
	
	@FindBy(id="status")
	@CacheLookup
	public static WebElement StatusSelect;
	
	@FindBy(id="Search_Triggers_lastrun_date1_cal_check")
	@CacheLookup
	public static WebElement LastRunDateUntick;
	
	@FindBy(xpath="//span[@id=\"Search_Triggers_search\"]/span/button")
	@CacheLookup
	public static WebElement SearchButton;
	
	@FindBy(xpath="(//table[@id=\"yui-dt0-bodytable\"]/tbody/tr/td)[1]")
	@CacheLookup
	public static WebElement TriggerSearchResultsTriggerId;
	
	
	
}
