@nop
Feature: Category and Sidebar Navigation
  As a new user
  I want to be able to navigate through the categories and sidebar
  So that i can view products or pages related to my selection

  Background:
        Given I am on the nopCommerce homepage

  @nop1
  Scenario: Navigate to a selected category tab
   // Given I am on the nopCommerce homepage
    When I click on the "Computers" category tab
    Then I wait for 3 sec
    Then I check to see page title contains "Computers"

  @nop2
  Scenario: Navigate to a selected category tab
   //Given I am on the nopCommerce homepage
    When I click on the "Electronics" category tab
    Then I wait for 3 sec
    Then I check to see page title contains "Electronics"

  @nop3
  Scenario: Navigate to a selected category tab
#    Given I am on the nopCommerce homepage
    When I click on the "Apparel" category tab
    Then I wait for 3 sec
    Then I check to see page title contains "Apparel"

  @nop4
  Scenario: Navigate to a selected category tab
#    Given I am on the nopCommerce homepage
    When I click on the "Digital downloads" category tab
    Then I wait for 3 sec
    Then I check to see page title contains "Digital downloads"

  @nop5
  Scenario: Navigate to a selected category tab
#    Given I am on the nopCommerce homepage
    When I click on the "Books" category tab
    Then I wait for 3 sec
   Then I check to see page title contains "Books"

  @nop6
  Scenario: Navigate to a selected category tab
#    Given I am on the nopCommerce homepage
    When I click on the "Jewelry" category tab
    Then I wait for 3 sec
    Then I check to see page title contains "Jewelry"

  @nop7
  Scenario: Navigate to a selected category tab
#    Given I am on the nopCommerce homepage
    When I click on the "Gift Cards" category tab
    Then I wait for 3 sec
    Then I check to see page title contains "Gift Cards"

























