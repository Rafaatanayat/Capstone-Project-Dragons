package tek.capstone.dragons.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "search")
	public WebElement allDepartmentDropdown;
	@FindBy(id = "seachInput")
	public WebElement searchInputField;
	@FindBy(id = "searchBttn")
	public WebElement searchBttn;
	@FindBy(xpath = "//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement kasaOutdoorSmartPlugItem;
	@FindBy(xpath = "//select[@class='product_select']")
	public WebElement productQtyDropdown;
	@FindBy(xpath = "//span[text()='Add to Cart']")
	public WebElement addToCartBttn;
	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement cartQtyField;
	
	
	//place an order with Shipping address and payment Method
	@FindBy(id = "cartBtn")
	public WebElement cartBttn;
	@FindBy(id = "proceedBtn")
	public WebElement proceedToCheckoutBttn;
	@FindBy(id = "placeOrderBtn")
	public WebElement placeOrderBttn;
	@FindBy(xpath = "//div[text()='Order Placed Successfully']")
	public WebElement orderPlacedSuccessfullyMssg;
	@FindBy(xpath = "//img[@alt='Apex Legends - 1,000 Apex Coins']")
	public WebElement apexLegendsItem;
	
	//Cancel Order
	@FindBy(id = "orderLink")
	public WebElement orderLink;
	@FindBy(xpath = "//div[@class='order_header']")
	public List<WebElement> listOfOrder;
	@FindBy(xpath = "//p[@class='order_header-btn']")
	public WebElement orderDetailsDispaly;
	@FindBy(id = "byAgainBtn")
	public WebElement buyAgainBttn;
	@FindBy(xpath = "//div[@class='orders_container']//div[@class='order_content-actions']//button[text()='Cancel The Order']")
	public WebElement cancelBttn;
	@FindBy(id = "reasonInput")
	public WebElement cancellationReason;
	@FindBy(id = "orderSubmitBttn")
	public WebElement cancelSubmitBttn;
	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement yourOrderCancelledMssg;
	@FindBy(xpath = "//div[@class='order_content-actions]'//button")
	public WebElement orderContentActions;
	@FindBy(xpath = "//p[text()='ShowDetails']")
	public WebElement showDetails;
	
	//return order
	@FindBy(xpath = "//div[@class='order']//descendant::button[@id='returnBtn']")
	public WebElement returnItemsbttn;
	@FindBy(xpath = "//select[@id='dropOffInput']")
	public WebElement dropOffLocationDropdown;
	@FindBy(xpath = "//button[@class='order__cancel-submit']")
	public WebElement returnOrderBttn;
	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement returnSuccessMessage;
	
	//Review Order
	@FindBy(xpath = "//button[@id='reviewBtn']")
	public WebElement reviewBttn;
	@FindBy(xpath = "//input[@name='headline']")
	public WebElement headlineText;
	@FindBy(xpath = "//textarea[@name='comment']")
	public WebElement reviewText;
	@FindBy(xpath = "//button[@id='reviewSubmitBtn']")
	public WebElement addYourReviewBttn;
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewAddedSuccessMssg;
	@FindBy(xpath = "//p[text()='Order Placed']")
	public WebElement orderPlaced;
}
