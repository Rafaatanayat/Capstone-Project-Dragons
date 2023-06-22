package tek.capstone.dragons.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailHomePage extends BaseSetup{
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
//		//Verify Department side bar
//	@FindBy(xpath = "//a[text()='TEKSCHOOL']")
//	public WebElement logo;
//
//	@FindBy(id = "searchInput")
//	public WebElement searchInputField;
//
//	@FindBy(xpath ="//img[@alt='PlayStation 5 Console']")
//	public WebElement playStationItem;
//
//	@FindBy(xpath = "//span[text()='All']") 
//	public WebElement allElement;
//
//	@FindBy(id="contentHeader")
//	public WebElement shopByDepartment;
//
//	@FindBy(id="cartBtn")
//	public WebElement cart;
//
//	@FindBy(id="signinLink")
//	public WebElement signIn;
//
//	@FindBy(xpath="//a[@id='accountLink']")
//	public WebElement account;
//
//	@FindBy(linkText="Orders")
//	public WebElement orderOption;
//
//	
//	//homePage locators
	
	@FindBy(id = "hamburgerBtn")
	public WebElement allOption;
	
	@FindBy(xpath = "//div[@data-id='1']")
	public WebElement electronics;
	
	@FindBy(xpath = "//div[@data-id='2']")
	public WebElement computers;
	
	
	@FindBy(xpath = "//div[@data-id='3']")
	public WebElement smartHome;
	
	@FindBy (xpath = "//div[@data-id='4']")
	public WebElement sports;
	

	@FindBy (xpath = "//div[@data-id='5']")
	public WebElement automative;
	
}