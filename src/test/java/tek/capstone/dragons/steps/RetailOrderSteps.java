package tek.capstone.dragons.steps;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User change the category to {string}")
	public void userChangeTheCategoryT(String smartHome) {
		selectByVisibleText(factory.retailOrder().allDepartmentDropdown, smartHome);
		logger.info(smartHome + " option is selected successfully");
	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String kasaOutdoorSmartPlug) {
		sendText(factory.retailOrder().searchInputField, kasaOutdoorSmartPlug);
		logger.info(kasaOutdoorSmartPlug + " item name was entered successfully");
	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.retailOrder().searchBttn);
		logger.info("Search button was clicked successfully");

	}

	@When("User click on item")
	public void userClickOnItem() {
		click(factory.retailOrder().kasaOutdoorSmartPlugItem);
		logger.info("Item was clicked successfully");

	}

	@When("User select quantity {string}")
	public void userSelectQuantity(String itemQty) {
		selectByVisibleText(factory.retailOrder().productQtyDropdown, itemQty);
		logger.info("Item was selected successfully");
	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.retailOrder().addToCartBttn);
		logger.info("Add to Cart button was clicked successfully");

	}

	@Then("the cart icon quantity should change to{string}")
	public void theCartIconQuantityshouldChangeTo(String itemQtyInTheCart) {

		Assert.assertEquals(itemQtyInTheCart, factory.retailOrder().cartQtyField.getText());
		logger.info(itemQtyInTheCart + " this item is displayed in the cart");

	}

	@When("User search for an item Apex Legends {string}")
	public void userSearchForAnItemApexLegends(String apexLegends) {
		sendText(factory.retailOrder().searchInputField, apexLegends);
		logger.info(apexLegends + " entered successfully");

	}

	@When("User click on item Apex Legends")
	public void userClickOnItemApexLegends() {
		click(factory.retailOrder().apexLegendsItem);
		logger.info("Item was clicked successgully");
	}

	@When("User select Apex Legends quantity {string}")
	public void userSelectApexLegendsQuantity(String itemQty) {
		selectByVisibleText(factory.retailOrder().productQtyDropdown, itemQty);
		logger.info(itemQty + " quantity was selected successfully");

	}

	@Then("The cart icon quantity Apex Legends should change to {string}")
	public void theCartIconQuantityApexLegendsShouldChangeTo(String expectedQty) {
		Assert.assertEquals(expectedQty, factory.retailOrder().cartQtyField.getText());
		logger.info(expectedQty + " quantity was validated successfully");

	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.retailOrder().cartBttn);
		logger.info("Cart button was clicked successfully");

	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceesToCheckoutButton() {
		click(factory.retailOrder().proceedToCheckoutBttn);
		logger.info("Proceed to checkout button was clicked successfully");

	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.retailOrder().placeOrderBttn);
		logger.info("Place your order button was cliced successfully");

	}

	@When("User click on Orders section")
	public void userclickOnOrderSection() {
		click(factory.retailOrder().orderLink);
		logger.info("Order link clicked successfully");

	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		List<WebElement> listOfOrders = factory.retailOrder().listOfOrder;
		for (int i = 0; i < listOfOrders.size(); i++) {
			if (listOfOrders.get(i).getText().equalsIgnoreCase("Hide Details")) {
				if (factory.retailOrder().orderContentActions.getText().equals("Cancel The Order")) {
					clickElementWithJS(factory.retailOrder().cancelBttn);
					break;
				} else if (factory.retailOrder().orderContentActions.getText().equals("Buy again")) {

				}
			} else if (listOfOrders.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(factory.retailOrder().showDetails);
				if (factory.retailOrder().orderContentActions.getText().equals("Cancel The Order")) {
					clickElementWithJS(factory.retailOrder().cancelBttn);
					break;
				} else if (factory.retailOrder().orderContentActions.getText().equals("Buy again")) {

				}
			}
		}
	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.retailOrder().cancelBttn);
		logger.info("Cancel the order button was clicked successfully");
	}

	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String cancellationReason) {
		selectByVisibleText(factory.retailOrder().cancellationReason, cancellationReason);
		logger.info(cancellationReason + " reason was selected successfully");
	}

	@When("User click on Cancel Order button")
	public void userClickOncancelOrderButton() {
		click(factory.retailOrder().cancelSubmitBttn);
		logger.info("Cancel submit button was clicked successfully");
	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String cancellationMssg) {
		Assert.assertEquals(cancellationMssg, factory.retailOrder().yourOrderCancelledMssg);
		logger.info(cancellationMssg + " was verified successfully");
	}

	// return order
	@Then("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.retailOrder().returnItemsbttn);
		logger.info("User clicked on return item button successfully");
	}

	@Then("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String string) {
		selectByVisibleText(factory.retailOrder().allDepartmentDropdown, string);
		logger.info("User selected item damaged from dropdown successfully");
	}

	@Then("User select the drop off service {string}")
	public void userSelectTheDropOffService(String string) {
		selectByVisibleText(factory.retailOrder().dropOffLocationDropdown, string);
		logger.info("User selcted on Fedex successfully");
	}

	@Then("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.retailOrder().returnOrderBttn);
		logger.info("User clicked on return order button successfully");
	}

	@Then("a return message should be displayed {string}")
	public void aReturnMessageShouldBeDisplayed(String returnMessage) throws InterruptedException {
		Thread.sleep(3000);
		waitTillPresence(factory.retailOrder().returnSuccessMessage);
		Assert.assertEquals(returnMessage, factory.retailOrder().returnSuccessMessage.getText());
		logger.info(returnMessage + " is displayed");
	}

	// Review order
	@Then("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.retailOrder().reviewBttn);
		logger.info("User click on review button successfully");
	}

	@Then("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headline, String review) {
		sendText(factory.retailOrder().headlineText, headline);
		sendText(factory.retailOrder().reviewText, review);
		logger.info("User input text successfully");

	}

	@Then("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.retailOrder().addYourReviewBttn);
		logger.info("User clicked on add your review button succesfully");
		logger.info("Just add something");
	}

	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String expectedMessage) {
		waitTillPresence(factory.retailOrder().reviewAddedSuccessMssg);
		Assert.assertEquals(expectedMessage, factory.retailOrder().reviewAddedSuccessMssg.getText());
		logger.info(expectedMessage + " is displayed");
	}

}
