
#Form URL: https://www.ups.com/ship/basic/shipment-info
Feature: Validate UPS Form
  Scenario: Validate UPS Form
    Given I navigate to "ups shipment info" page
    And I close simplifiedShippingExperience window
    When I fill out required fields for shipment information
    And I wait for 10 sec
    And I submit shipment form
    Then I verify that required fields present on Shipper and Receiver details

#Locators:
# //span[contains(text(),'United States')]


