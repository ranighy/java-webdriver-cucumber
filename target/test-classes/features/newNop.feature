
#@newNop @sub
#Feature: Category and Sidebar Navigation
#  As a New User  I want to navigate through category and sidebar items
#  So that I can view products or pages related to my selection


#  @newNop1
#  Scenario: Navigate to a selected sidebar item
#    Given I am on the nopCommerce homepage
#    When I click on the "Computers" category tab
#    And I wait for 10 sec
#    Then I should see page title contains "Computers"

  @sub1
  Scenario: Navigate to a selected sidebar item
    Given I am on the nopCommerce homepage
    When I click on the "Computers" category tab
    Then I should see page title contains "Computers"
    When I click on "Desktops" subcategory in the sidebar
    Then I should see page title contains "Desktops"

#  @newNop2
#  Scenario: Navigate to a selected category tab
#    Given I am on the nopCommerce homepage
#    When I click on the "Electronics" category tab
#    Then I should see page title contains "Electronics"
#
#  @sub2
#  Scenario: Navigate to a selected sidebar item
#    Given I am on the nopCommerce homepage
#    When I click on the "Electronics" category tab
#    Then I should see page title contains "Electronics"
#    When I click on "Camera & Photo" subcategory in the sidebar
#    Then I should see page title contains "Camera & photo"
#
#  @newNop3
#  Scenario: Navigate to a selected sidebar item
#    Given I am on the nopCommerce homepage
#    When I click on the "Apparel" category tab
#    Then I should see page title contains "Apparel"
#
#  @sub3
#  Scenario: Navigate to a selected sidebar item
#    Given I am on the nopCommerce homepage
#    When I click on the "Apparel" category tab
#    Then I should see page title contains "Apparel"
#    When I click on "Shoes" subcategory in the sidebar
#    Then I should see page title contains "Shoes"
#
#  @newNop4
#  Scenario: Navigate to a selected sidebar item
#    Given I am on the nopCommerce homepage
#    When I click on the "Digital downloads" category tab
#    Then I should see page title contains "Digital downloads"
#
#  @newNop5
#  Scenario: Navigate to a selected sidebar item
#    Given I am on the nopCommerce homepage
#    When I click on the "Books" category tab
#    Then I should see page title contains "Books"
#
#  @newNop6
#  Scenario: Navigate to a selected sidebar item
#    Given I am on the nopCommerce homepage
#    When I click on the "Jewelry" category tab
#    Then I should see page title contains "Jewelry"
#
#  @newNop7
#  Scenario: Navigate to a selected sidebar item
#    Given I am on the nopCommerce homepage
#    When I click on the "Gift Cards" category tab
#    Then I should see page title contains "Gift Cards"