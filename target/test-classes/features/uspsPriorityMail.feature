#Create 2 page objects:
#UspsPriorityMail - https://www.usps.com/ship/priority-mail.htm
#UspsSignIn - https://reg.usps.com/entreg/LoginAction_input - this page opens after clicking ShipNow, but we don't directly go there by url in this scenario
Feature:Usps Priority Mail Project
  Scenario: Validate ZIP code for Portnov Computer School
    Given I navigate to "usps priority mail" page
    When I click Ship Now from priority mail page
    Then  I should see "USPS.com® - Sign In" page
    Then I validate "Already have an account?" message present

