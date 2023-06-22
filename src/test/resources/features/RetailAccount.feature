@completeScenarios
Feature: Retail Account

	Background:
		Given User is on retail website
    When User click on Sign in option
		And User enter email 'rafo.anayat@gmail.com' and password 'Rafo@123'
		And User click on login button
    And User should be logged in into Account
    And User click on Account option
	
	@updateProfile
	Scenario: Verify User can update Profile Information
		And User update Name 'Rafo' and Phone '3134241536'
		And User click on Update button
    Then user profile information should be updated
	
	@paymentMethod
	Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
		|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
		|1234567890123456|Rafo|9							|2024												 |123|
		And User click on Add your card button
    Then a message should be displayed 'Payment Method added sucessfully' 
		
		
		@editPaymentMethod
	Scenario: Verify User can edit Debit or Credit card
    And User click on Edit option of card section
    And user edit information with below data
		|cardNumber      |nameOnCard|expirationMonth|expirationYear|securityCode|
		|1234567890113456|Rafaat    |12             |2028          |456         |
		And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'
		
		@removePaymentMethod
	Scenario: Verify User can remove Debit or Credit card
    And User click on remove option of card section
    Then payment details should be removed
		
		
		@addNewAddress
	Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
		|country      |fullName|phoneNumber |streetAddress|apt |city      | state  |zipCode|
		|United States|Rafo    |111-222-3334|1234 Sherman |12  |New Haven |New York|22036  |
		And User click Add Your Address button
    #Then a message should be displayed 'Address Added Successfully’

	@editAddress
	Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user eidt new address form with below information
		|country      |fullName|phoneNumber|streetAddress   |apt|city     |state|zipCode|
		|United States|Rafo    |4752021111 |191 edgewood Ave|1  |New Haven|Ohio |42345  |
		And User click update Your Address button
    #Then a message should be displayed 'Address Updated Successfully’

@removeAddress
Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
