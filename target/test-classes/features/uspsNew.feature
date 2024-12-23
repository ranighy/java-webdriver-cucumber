Feature: USPS new scenarios
  Scenario: Validate Boxes count
    Given I navigate to "usps lookup a zip code by address" page
    When I hover over search and search for "Boxes"
    And I wait for 3 sec
    And I filter results with "Send"
    Then I verify 8 results are displayed

