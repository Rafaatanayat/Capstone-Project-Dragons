@completeScenarios
Feature: Retail SignIn

#this is comment
@test
Scenario: Verify user can sign in into Retail Application
Given User is on retail website
When User click on Sign in option
And User enter email 'rafo.anayat@gmail.com' and password 'Rafo@123'
And User click on login button
Then User should be logged into Account 

#another scenario
@createAccount
Scenario: Verify user can create an account into Retail Website
Given User is on retail website
When User click on Sign in option
And User click on Create New Account button
And User fill the signUp information with below data
| name | email               | password   | confirmPassword |
|rafo  |rafo.anayat@gmail.com| Rafo@12345 | Rafo@12345 |
And User click on SignUp button
Then User should be logged into account page