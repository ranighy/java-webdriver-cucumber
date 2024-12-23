#Create 2 page objects:
#UspsLookupZipCodeByAddressForm - https://tools.usps.com/zip-code-lookup.htm?byaddress
#UspsLookupZipCodeByAddressResult - no url, result page from previous form

Feature: USPS scenarios
  Scenario: Validate ZIP code for Portnov Computer School
    Given I navigate to "usps lookup a zip code by address" page oop
    And I wait for 3 sec
    And I fill out "4970 El Camino Real" street, "Los Altos" city, "CA" state, "94022" zip code
    And I click "Find" tab
    Then I validate "94022" zip code exists in the result


