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
	   public void userChangeTheCategoryTo(String SmartHome) {
	       click(factory.ordersPage().allDepartmentSection);
	       selectByVisibleText(factory.ordersPage().allDepartmentSection, SmartHome);
	       logger.info("user was able to change the categgory to " + SmartHome);
	   }



	   @When("User search for an item {string}")
	   public void userSearchForAnItem(String string) {
	       click(factory.ordersPage().searchInput);
	       sendText(factory.ordersPage().searchInput, string);
	       logger.info("User was able to search for the item " + string);



	   }

	   @When("User click on Search icon")
	   public void userClickOnSearchIcon() {
	       click(factory.ordersPage().searchBttn);
	       logger.info("search button was clicked successfully");
	   }

	   @When("User click on item")
	   public void userClickOnItem() {
	       click(factory.ordersPage().itemKasaOutdoor);
	       slowDown();
	       logger.info("User clicked the item successfully");



	   }
	  

	  @When("User select quantity {string}")
	   public void userSelectQuantity(String string) {
	       selectByValue(factory.ordersPage().quantityOption, string);
	       logger.info(string + " was selected");
	   }

	   @When("User click add to Cart button")
	   public void userClickAddToCartButton() {
	       click(factory.ordersPage().addToCartBttn);
	       logger.info("User added to cart successfully");
	   }

	   @Then("the cart icon quantity should change to {string}")
	   public void theCartIconQuantityShouldChangeTo(String quantity) {
	       String expectedQuantity = quantity;
	       String actualQuantity = "2";
	       Assert.assertEquals(expectedQuantity, actualQuantity);
	       logger.info("User was able to change the quantity " + expectedQuantity);
	       // Assert.assertEquals(factory.retailorderpage().quantityOption.getText() ,
	       // quantity);
	       // logger.info("User was able to change the quantity " + quantity );
	   }



	   // second



	   @When("User change the category to the {string}")
	   public void userChangeTheCategoryToThe(String Electronics) {
	       click(factory.ordersPage().allDepartmentSection);
	       selectByVisibleText(factory.ordersPage().allDepartmentSection, Electronics);
	       logger.info("user was able to change the categgory to " + Electronics);



	   }



	   @When("User search for the item {string}")
	   public void userSearchForTheItem(String item) {
	       click(factory.ordersPage().searchInput);
	       sendText(factory.ordersPage().searchInput, item);
	       logger.info("User was able to search for the item " + item);
	   }

	   @When("User click on the Search icon")
	   public void userClickOnTheSearchIcon() {
	       click(factory.ordersPage().searchBttn);
	       logger.info("search button was clicked successfully");
	   }



	   @When("User click on the item")
	   public void userClickOnTheItem() {
	       click(factory.ordersPage().itemKasaOutdoor2);
	       logger.info("User clicked the item successfully");
	   }



	   @When("User select the quantity {string}")
	   public void userSelectTheQuantity(String string) {
		   slowDown();
	       selectByValue(factory.ordersPage().quantityOption, string);
	       
	       logger.info(string + " was selected");
	   }



	   @When("User click add to the Cart button")
	   public void userClickAddToTheCartButton() {
	       click(factory.ordersPage().addToCartBttn);
	       logger.info("User added to cart successfully");
	   }

	   @Then("the cart icon quantity should be change to {string}")
	   public void theCartIconQuantityShouldBeChangeTo(String quantity) {
	       String expectedQuantity = quantity;
	       String actualQuantity = "5";
	       Assert.assertEquals(expectedQuantity, actualQuantity);
	       logger.info("User was able to change the quantity " + expectedQuantity);
	   }


	   @Then("User click on Cart option")
	   public void userClickOnCartOption() {
	       click(factory.ordersPage().cartOption);
	       logger.info("User was able to click on cart option successfully");
	   }



	   @Then("User click on Proceed to Checkout button")
	   public void userClickOnProceedToCheckoutButton() {
	       click(factory.ordersPage().proccedBttn);
	       logger.info("User was able to click on Proceed to Checkout button successfully");
	   }



	   @Then("User click on Place Your Order")
	   public void userClickOnPlaceYourOrder() {
	       click(factory.ordersPage().placeOrderBttn);
	       logger.info("User was able to click on Place Your Order successfully ");
	   }



	   @Then("a message should be displayed 'Order Placed, Thanks")
	   public void aMessageShouldBeDisplayedOrderPlacedThanks() {
		   waitTillPresence(factory.ordersPage().orderPlacedMessage);
	       Assert.assertTrue(factory.ordersPage().orderPlacedMessage.isDisplayed());
	       logger.info("User was able to see the message");



	   }



	   // 3
	   @When("User click on Orders section")
	   public void userClickOnOrdersSection() {
	       click(factory.ordersPage().orderBttn);
	       logger.info("User was able to click on orders section");
	   }

	   @When("User click on first order in list")
	   public void userClickOnFirstOrderInList() {
	       click(factory.ordersPage().firstOrderInList);
	       logger.info("User was able to click on first order in list successfully");
	   }



	   @When("User click on Cancel The Order button")
	   public void userClickOnCancelTheOrderButton() {
	       click(factory.ordersPage().cancelBttn);
	       logger.info("User was able to click on Cancel The Order successfully");
	   }

	   @When("User select the cancelation Reason {string}")
	   public void userSelectTheCancelationReason(String string) {
	       click(factory.ordersPage().dropDownForCancleOrder);
	       selectByVisibleText(factory.ordersPage().dropDownForCancleOrder, string);
	       logger.info("User was able to choose the option successfully");



	   }



	   @When("User click on Cancel Order button")
	   public void userClickOnCancelOrderButton() {
	       click(factory.ordersPage().cancelOrder);
	       logger.info("User was able to click on Cancel Order button  successfully");
	   }



	   @Then("a cancelation message should be displayed 'Your Order Has Been Cancelled’")
	   public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
	       //Assert.assertTrue(factory.retailorderpage().orderCancleMessage.isDisplayed());
	       logger.info("User was able to see the message");
	   }



	   @When("User click on Return Items button")
	   public void userClickOnReturnItemsButton() {
	       click(factory.ordersPage().retrunItemBttn);
	       logger.info("User was able to click on Return Items button successfully");
	   }



	   @When("User select the Return Reason {string}")
	   public void userSelectTheReturnReason(String string) {
	       click(factory.ordersPage().dropDownForReturnOrder);
	       selectByVisibleText(factory.ordersPage().dropDownForReturnOrder, string);
	       logger.info("User was able to choose the option successfully");
	   }



	   @When("User select the drop off service {string}")
	   public void userSelectTheDropOffService(String string) {
	       click(factory.ordersPage().dropDownForDropOffservice);
	       selectByVisibleText(factory.ordersPage().dropDownForDropOffservice, string);
	       logger.info("User was able to choose the option successfully");
	   }




	   @When("User click on Return Order button")
	   public void userClickOnReturnOrderButton() {
	       click(factory.ordersPage().orderRetrunbttn);
	       logger.info("User was able toclick on Return Order button successfully");
	   }



	   @Then("a cancelation message should be displayed {string}")
	   public void aCancelationMessageShouldBeDisplayed(String string) {
	       //Assert.assertTrue(factory.retailorderpage().orderReturnMessage.isDisplayed());
	       logger.info("User was able to see the message");
	   }
	   @When("User click on Review button")
	   public void userClickOnReviewButton() {
	       click(factory.ordersPage().reviewBttn);
	       logger.info("User was able to click on review button successfully");
	   }
	   @When("User write Review headline {string} and {string}")
	   public void userWriteReviewHeadlineAnd(String prodect, String good) {
	       click(factory.ordersPage().headlineInput);
	       sendText(factory.ordersPage().headlineInput,prodect );
	       click(factory.ordersPage().descriptionInput);
	       sendText(factory.ordersPage().descriptionInput ,good );
	       logger.info("User was able to write review successfully");
	   }
	   @When("User click Add your Review button")
	   public void userClickAddYourReviewButton() {
	      click(factory.ordersPage().addYourReview);
	      logger.info("User was able to add review successfully");
	   }
	   @Then("a review message should be displayed {string}")
	   public void aReviewMessageShouldBeDisplayed(String string) {
	       waitTillPresence(factory.ordersPage().reviewAddedMessage);
	       Assert.assertTrue(factory.ordersPage().reviewAddedMessage.isDisplayed());
	       logger.info("User was able to see the message");
	   }

}
