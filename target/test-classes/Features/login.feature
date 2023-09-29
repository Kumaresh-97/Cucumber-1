Feature: Validate the login functinality of facebook
Background:
      Given User should launch the browser and url
Scenario: Validate the login functionality with invalid username and valid password
When User should enter invalid username and valid password
And   User should print the title of your page   
And User should click the login button
Then User should navigate to incorrect credential page


#Scenario: Validate the login functionality with valid username and invalid password
#When User should enter valid username and invalid password   
#And User should click the login button
#Then User should navigate to incorrect credential page
