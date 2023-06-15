@completeScenarios
Feature: Retail Home

Background:
	Given User is on retail website
	When User clicks on sign in option
	And User enters email 'rafo.anayat@gmail.com' and password 'Rafo@123'
	And User clicks on login button
	Then User should be logged into account page
	
@verifyshopByDept
Scenario: Verify Shop by Department sidebar
	When User click on All section
	Then below options are present in Shop by Department sidebar
	|Electronics|Computers|Smart Home|Sports|Automative|

@validateOptionsAllDepts
Scenario Outline: Verify department sidebar options
	Given User is on retail website
	When User click on All section
	And User on <department>
	Then below options are present in department
		| <optionOne> | <optionTwo> |
Examples:
	|department| optionOne| optionTwo|
	|'Electronics'| TV & Video| Video Games|
	|'Computers'|Accessories|Networking |
	|'Smart Home'| Smart Home Lightning| Plugs and Outlets|
	|'Sports'| Athletic Clothing| Exercise & Fitness|
	|'Automotive'| Automative Parts & Accessories | MotorCycle & Powersports|

