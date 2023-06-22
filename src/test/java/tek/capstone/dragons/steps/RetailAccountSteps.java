package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.accountPage().accountOption);
		logger.info("User was able to click on account option");

	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		clearTextUsingSendKeys(factory.accountPage().nameInput);
		sendText(factory.accountPage().nameInput, name);
		clearTextUsingSendKeys(factory.accountPage().phoneInput);
		sendText(factory.accountPage().phoneInput, phone);
		logger.info(name + phone + " user was able to enter the values");
	}

//	@When("User click on Update button")
//	public void userClickOnUpdateButton() {
//		click(factory.accountPage().updateBttn);
//		logger.info("User was able to click on update button successfully");
//	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		Assert.assertTrue(factory.accountPage().successMessage.isDisplayed());
		logger.info("User profile information has been upadted");

	}

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addAPaymentMethodLink);
		logger.info("User was able to click on add a payment link successfully");
	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {
			sendText(factory.accountPage().cardNumberInput, row.get("cardNumber"));
			sendText(factory.accountPage().nameOnCardInput, row.get("nameOnCard"));
			selectByValue(factory.accountPage().expirationMonthInput, row.get("expirationMonth"));
			selectByValue(factory.accountPage().expirationYearInput, row.get("expirationYear"));
			sendText(factory.accountPage().securityCodeInput, row.get("securityCode"));
			logger.info("Card information has entered successfully");
			slowDown();
		}
	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().paymentSubmitBttn);
		logger.info("user was able to click on payment submition button");
	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
		Assert.assertTrue(factory.accountPage().successMessage.isDisplayed());
		logger.info(" Payment Method added successfully");

	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().cardOption);
		click(factory.accountPage().editCardBttn);
		logger.info("edit button was clicked");
	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {
			clearTextUsingSendKeys(factory.accountPage().editCardNumberInput);
			sendText(factory.accountPage().editCardNumberInput, row.get("cardNumber"));
			clearTextUsingSendKeys(factory.accountPage().editNameOnCardInput);
			sendText(factory.accountPage().editNameOnCardInput, row.get("nameOnCard"));
			selectByValue(factory.accountPage().editExpirationMonthInput, row.get("expirationMonth"));
			selectByValue(factory.accountPage().editExpirationYearInput, row.get("expirationYear"));
			clearTextUsingSendKeys(factory.accountPage().editSecurityCodeInput);
			sendText(factory.accountPage().editSecurityCodeInput, row.get("securityCode"));
			logger.info("The information was updated successfully");
		}
	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().editpaymentSubmitBttn);
		logger.info("button was clicked successfully");
	}

	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		Assert.assertTrue(factory.accountPage().successMessage.isDisplayed());
		logger.info("Payment Method updated Successfully message was dispalyed");
	}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().cardOption);
		click(factory.accountPage().removeBttn);
		logger.info("User was able to click on remove button successfully");
	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		Assert.assertTrue(factory.accountPage().successMessage.isDisplayed());
		logger.info("Card removed successfully");

	}

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAdressOption);
		logger.info("add method option clicked successfully");
	}

	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {
			selectByVisibleText(factory.accountPage().countryDowpDown, row.get("country"));
			sendText(factory.accountPage().fullNameInput, row.get("fullName"));
			sendText(factory.accountPage().phoneNumberInput, row.get("phoneNumber"));
			sendText(factory.accountPage().streetInput, row.get("streetAddress"));
			sendText(factory.accountPage().apartmentInput, row.get("apt"));
			sendText(factory.accountPage().cityInput, row.get("city"));
			selectByVisibleText(factory.accountPage().stateInput, row.get("state"));
			sendText(factory.accountPage().zipCodeInput, row.get("zipCode"));
			logger.info("User was able to add address successfully");
		}
	}

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addressBttn);
		logger.info("the address button was cliked");
	}

	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		Assert.assertTrue(factory.accountPage().successMessage.isDisplayed());
		logger.info("Address Added Successfully message displayed");	
	}

	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().editAddresOption);
		logger.info("edit address button was clicked successfully");
	}

	@When("user eidt new address form with below information")
	public void userEidtNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> rows : data) {
			selectByVisibleText(factory.accountPage().editCountry, rows.get("country"));
			clearTextUsingSendKeys(factory.accountPage().fullNameInput);
			sendText(factory.accountPage().editFullNameInput, rows.get("fullName"));
			clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
			sendText(factory.accountPage().editPhoneNumberInput, rows.get("phoneNumber"));
			clearTextUsingSendKeys(factory.accountPage().streetInput);
			sendText(factory.accountPage().editStreetInput, rows.get("streetAddress"));
			clearTextUsingSendKeys(factory.accountPage().apartmentInput);
			sendText(factory.accountPage().editApartmentInput, rows.get("apt"));
			clearTextUsingSendKeys(factory.accountPage().cityInput);
			sendText(factory.accountPage().editCityInput, rows.get("city"));
			selectByVisibleText(factory.accountPage().editState, rows.get("state"));
			clearTextUsingSendKeys(factory.accountPage().zipCodeInput);
			sendText(factory.accountPage().editZipCoseInput, rows.get("zipCode"));
			slowDown();
			logger.info("The information has been apdated");
		}
	}

	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().editAddressBttn);
		logger.info("The butto was clicked successfully");
	}

	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		Assert.assertTrue(factory.accountPage().successMessage.isDisplayed());
		logger.info("Address Updated Successfully message was dispalyed");
		
	}

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeAddressBttn);
		logger.info("Remove Address button clicked");
	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		Assert.assertTrue(factory.accountPage().addAdressOption.isDisplayed());
		logger.info("Address removed");

	}

}
