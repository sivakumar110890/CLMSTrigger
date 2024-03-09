package testObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TriggerAddObjects {
	
	@FindBy(id="Search_Triggers_add")
	@CacheLookup
	public static WebElement TriggerAddButton;
	
	@FindBy(xpath="//input[@cname=\"Trigger Name\"]")
	@CacheLookup
	public static WebElement TriggerNameInputBox;
	
	@FindBy(xpath="//select[@cname=\"Status\"]")
	@CacheLookup
	public static WebElement TriggerStatusSelect;
	
	@FindBy(xpath="(//span[@class=\"yui-button yui-push-button\"]/span/button[contains(text(),'Set...')])[1]")
	@CacheLookup
	public static WebElement SetButtonFirstPage;
	
	@FindBy(xpath="(//button[contains(text(),'Set...')])[3]")
	@CacheLookup
	public static WebElement SetButtonSecondPage;
	
	@FindBy(xpath="//a[@class=\"yuimenuitemlabel\"][contains(text(),'Redemption')]")
	@CacheLookup
	public static WebElement RedemptionButton;
	
	@FindBy(xpath="//input[@title=\"Advanced Filter\"]")
	public static WebElement AdvanceFilterButton;
	
	
	@FindBy(id="adv_sel_id")
	public static WebElement CampaignNameInputBox;
	
	@FindBy(xpath="(//*[@id=\"adv_sel_filter\"]/option)[1]")
	public static WebElement FirstOutputClick;
	
	
	@FindBy(xpath="(//button[contains(text(),'OK')])[4]")
	public static WebElement OkbuttonAdvanceFilter;
	
	@FindBy(xpath="(//button[@class=\"btn btn-normal btn-emagine\"][contains(text(),'OK')])[3]")
	public static WebElement OkbuttonforAddpage;
	
	@FindBy(xpath="//input[@cname=\"Participant Limit\"]")
	@CacheLookup
	public static WebElement ParticipationLimit;
	
	@FindBy(xpath="//textarea[@cname=\"Participant List\"]")
	@CacheLookup
	public static WebElement ParticipationListInput;
	
	@FindBy(xpath="//input[@cid=\"nextrundt_dcheck\"]")
	@CacheLookup
	public static WebElement NextDateTick;
	
	@FindBy(xpath="//button[@type=\"button\"][contains(text(),'OK')]")
	@CacheLookup
	public static WebElement OkbuttonFinal;
	
	
	
	
	
	

}
