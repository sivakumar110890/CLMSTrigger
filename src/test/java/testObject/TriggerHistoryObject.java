package testObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TriggerHistoryObject {
	
	@FindBy(id="sidebarSearch")
	public static WebElement SideBarButton;
	
	@FindBy(xpath="//a[contains(text(),'Operations Manager')]")
	public static WebElement OperationsManagerButtonClick;
	
	@FindBy(xpath="(//a[contains(text(),'Application')])[1]")
	public static WebElement ApplicationButton;
	
	@FindBy(xpath="(//a[contains(text(),'Trigger History')])[1]")
	public static WebElement TriggerHistoryButton;
	
	@FindBy(id="Search_Trigger_History_search1_val")
	public static WebElement TriggerSearchInputField;
	
	@FindBy(id="search1")
	public static WebElement TriggerNameIdSelect;
	
	
	@FindBy(xpath="//span[@id=\"Search_Trigger_History_search\"]/span/button")
	public static WebElement SearchButtonClick;
	
	
	
	

}
