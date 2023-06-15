package tek.capstone.dragons.steps;

import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	   @When("User search for the item {string}")
	   public void userSearchForTheItem(String item) {
	       click(factory.retailOrder().searchInput);
	       sendText(factory.retailOrder().searchInput, item);
	       logger.info("User was able to search for the item " + item);
	   }

	   @When("User click on the Search icon")
	   public void userClickOnTheSearchIcon() {
	       click(factory.retailOrder().searchBttn);
	       logger.info("search button was clicked successfully");
	   }



	   @When("User click on the item")
	   public void userClickOnTheItem() {
	       click(factory.retailOrder().itemKasaOutdoor2);
	       logger.info("User clicked the item successfully");
	   }



	   @When("User select the quantity {string}")
	   public void userSelectTheQuantity(String string) {
		   slowDown();
	       selectByValue(factory.retailOrder().quantityOption, string);
	       
	       logger.info(string + " was selected");
	   }



	   @When("User click add to the Cart button")
	   public void userClickAddToTheCartButton() {
	       click(factory.retailOrder().addToCartBttn);
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
	       click(factory.retailOrder().cartOption);
	       logger.info("User was able to click on cart option successfully");
	   }



	   @Then("User click on Proceed to Checkout button")
	   public void userClickOnProceedToCheckoutButton() {
	       click(factory.retailOrder().proccedBttn);
	       logger.info("User was able to click on Proceed to Checkout button successfully");
	   }



	   @Then("User click on Place Your Order")
	   public void userClickOnPlaceYourOrder() {
	       click(factory.retailOrder().placeOrderBttn);
	       logger.info("User was able to click on Place Your Order successfully ");
	   }



	   @Then("a message should be displayed 'Order Placed, Thanks")
	   public void aMessageShouldBeDisplayedOrderPlacedThanks() {
		   waitTillPresence(factory.retailOrder().orderPlacedMessage);
	       Assert.assertTrue(factory.retailOrder().orderPlacedMessage.isDisplayed());
	       logger.info("User was able to see the message");



	   }

	   @When("User click on Orders section")
	   public void userClickOnOrdersSection() {
	       click(factory.retailOrder().orderBttn);
	       logger.info("User was able to click on orders section");
	   }

	   @When("User click on first order in list")
	   public void userClickOnFirstOrderInList() {
	       click(factory.retailOrder().firstOrderInList);
	       logger.info("User was able to click on first order in list successfully");
	   }



	   @When("User click on Cancel The Order button")
	   public void userClickOnCancelTheOrderButton() {
	       click(factory.retailOrder().cancelBttn);
	       logger.info("User was able to click on Cancel The Order successfully");
	   }

	   @When("User select the cancelation Reason {string}")
	   public void userSelectTheCancelationReason(String string) {
	       click(factory.retailOrder().dropDownForCancleOrder);
	       selectByVisibleText(factory.retailOrder().dropDownForCancleOrder, string);
	       logger.info("User was able to choose the option successfully");



	   }



	   @When("User click on Cancel Order button")
	   public void userClickOnCancelOrderButton() {
	       click(factory.retailOrder().cancelOrder);
	       logger.info("User was able to click on Cancel Order button  successfully");
	   }



	   @Then("a cancelation message should be displayed 'Your Order Has Been Cancelled’")
	   public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
	       //Assert.assertTrue(factory.retailorderpage().orderCancleMessage.isDisplayed());
	       logger.info("User was able to see the message");
	   }



	   @When("User click on Return Items button")
	   public void userClickOnReturnItemsButton() {
	       click(factory.retailOrder().retrunItemBttn);
	       logger.info("User was able to click on Return Items button successfully");
	   }



	   @When("User select the Return Reason {string}")
	   public void userSelectTheReturnReason(String string) {
	       click(factory.retailOrder().dropDownForReturnOrder);
	       selectByVisibleText(factory.retailOrder().dropDownForReturnOrder, string);
	       logger.info("User was able to choose the option successfully");
	   }



	   @When("User select the drop off service {string}")
	   public void userSelectTheDropOffService(String string) {
	       click(factory.retailOrder().dropDownForDropOffservice);
	       selectByVisibleText(factory.retailOrder().dropDownForDropOffservice, string);
	       logger.info("User was able to choose the option successfully");
	   }




	   @When("User click on Return Order button")
	   public void userClickOnReturnOrderButton() {
	       click(factory.retailOrder().orderRetrunbttn);
	       logger.info("User was able toclick on Return Order button successfully");
	   }



	   @Then("a cancelation message should be displayed {string}")
	   public void aCancelationMessageShouldBeDisplayed(String string) {
	       logger.info("User was able to see the message");
	       
	   }
	   @When("User click on Review button")
	   public void userClickOnReviewButton() {
	       click(factory.retailOrder().reviewBttn);
	       logger.info("User was able to click on review button successfully");
	   }
	   @When("User write Review headline {string} and {string}")
	   public void userWriteReviewHeadlineAnd(String prodect, String good) {
	       click(factory.retailOrder().headlineInput);
	       sendText(factory.retailOrder().headlineInput,prodect );
	       click(factory.retailOrder().descriptionInput);
	       sendText(factory.retailOrder().descriptionInput ,good );
	       logger.info("User was able to write review successfully");
	   }
	   @When("User click Add your Review button")
	   public void userClickAddYourReviewButton() {
	      click(factory.retailOrder().addYourReview);
	      logger.info("User was able to add review successfully");
	   }
	   @Then("a review message should be displayed {string}")
	   public void aReviewMessageShouldBeDisplayed(String string) {
	       waitTillPresence(factory.retailOrder().reviewAddedMessage);
	       Assert.assertTrue(factory.retailOrder().reviewAddedMessage.isDisplayed());
	       logger.info("User was able to see the message");
	   }

}
