#Feature: Quote
#Scenario Outline: Quote submission
#    Given I open url "<url>"
#    And I enter user name "<userName>"
#    And I enter email "<email>"
#    And I enter password "<password>"
#    And I confirm password "<confirmPassword>"
#    And I enter first name "<firstName>"
#    And I enter last name "<lastName>"
#    And I wait for 5 sec
#   Examples:
#    | url                                | userName | email               | password    | confirmPassword | firstName | lastName |
#   | https://skryabin.com/market/quote.html | John     | john.doe@example.com | password123 | password123     | John      | Doe      |
@quote
Feature: Quote project

  @quote1
  Scenario: Quote smoke test
    Given I navigate to "quote" page
    When I fill out the required fields on the form
    And I submit the quote form
    Then I see required fields submitted successfully

  Scenario: Quote submission
  Given I navigate to "quote" page
    When I fill out required fields one the form oop
     And I "accept" third party agreement
    And I wait for 2 sec
#     And I "decline"third party agreement
    And I  submit the form oop
    And I wait for 2 sec
    Then I should see required fields submitted successfully oop
    Then I verify that third party agreement is "accepted"
#    Then I verify that third party agreement is "deleted"


# When I fill out the required fields on the form oop
#      When I "accept" third party agreement
#      When I type "Richard Roe" contact person name and "0123456789" contact person phone
#      And I wait for 2 sec
#      And I submit the quote form oop
#      And I wait for 2 sec
#      Then I see required fields submitted successfully oop
#      Then I verify that third party agreement is "accepted"
#      Then I verify that contact person name is "Richard Roe" and contact person phone is "0123456789"