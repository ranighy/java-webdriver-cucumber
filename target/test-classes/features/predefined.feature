Feature: Smoke steps

  @predefined1

  Scenario: Predefined steps for Google
    Given I open url "https://google.com"
    Then I should see page title as "Google"
    And element with xpath "//*[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//*[@name='q']"
    And I click on element with xpath "(//input[@name='btnK'])[2]"
    And I wait for element with xpath "//*[@id='res']" to be present
    Then element with xpath "//*[@id='res']" should contain text "Cucumber"

  @predefined2
  Scenario: Predefined steps for Gibiru
    Given I open url "https://gibiru.com"
    Then I should see page title contains "Gibiru"
    And element with xpath "//*[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//*[@name='q']"
    And I click on element with xpath "//button[@id='button-addon2']"
    And I wait for element with xpath "//div[@class='gsc-results gsc-webResult']" to be present
    Then element with xpath "//div[@class='gsc-results gsc-webResult'] " should contain text "Cucumber"

  @predefined3
  Scenario: NOP Register
    Given I open url "https://nop-qa.portnov.com/"
    Then I should see page title contains "Your store. Home page title"
    And element with xpath "//a[@href='/register?returnUrl=%2F']" should be present
    When I click on element with xpath "//a[@href='/register?returnUrl=%2F']"
    Then I should see page title contains "Register"
    And I click on element with xpath "//input[@id='gender-female']"
    When I type "Ria" into element with xpath "//input[@id='FirstName']"
    And I type "Ria123" into element with xpath "//input[@id='LastName']"
    And I click on element with xpath "//select[@name='DateOfBirthDay']//option[@value='1']"
    And I click on element with xpath "//select[@name='DateOfBirthMonth']//option[@value='1']"
    And I click on element with xpath "//select[@name='DateOfBirthYear']//option[@value='1914']"
    When I type "riaa@abc.com" into element with xpath "//input[@id='Email']"
    And I type "Org" into element with xpath "//input[@id='Company']"
    And I type "Org123" into element with xpath "//input[@id='Password']"
    And I type "Org123" into element with xpath "//input[@id='ConfirmPassword']"
    And I click on element with xpath "//button[@id='register-button']"
    Then element with xpath "//div[@class='result']" should contain text "Your registration completed"

  @predefined4
  Scenario: Predefined steps for ECOSIA
    Given I open url "https://www.ecosia.org/"
    Then I should see page title contains "Ecosia - the search engine that plants trees"
    And element with xpath "//input[@placeholder='Search the web...']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@placeholder='Search the web...']"
    And I click on element with xpath "//button[@type='submit']"
    And I click on element with xpath "//span[contains(text(),'Accept all')]"
    And I wait for element with xpath "//div[@id='app']" to be present
    Then element with xpath "//div[@id='app']" should contain text "Behavior-driven development"


    @predefined5
    Scenario: Predefined steps for DuckDuckGo
        Given I open url "https://duckduckgo.com/"
        Then I should see page title contains "DuckDuckGo"
        And element with xpath "//input[@id='searchbox_input']" should be present
        When I type "Behavior Driven Development" into element with xpath "//input[@id='searchbox_input']"
        And I click on element with xpath "//button[@aria-label='Search']"
        And I wait for element with xpath "//h2[normalize-space()='Behavior-driven development']" to be present
        Then element with xpath "//h2[normalize-space()='Behavior-driven development']" should contain text "Behavior-driven development"


@predefined6
      Scenario:Predefined steps for Swisscows
      Given I open url "https://swisscows.com/en"
      Then I should see page title contains "Swisscows"
      And element with xpath "//*[@name='query']" should be present
      When I type "Behavior Driven Development" into element with xpath "//*[@name='query']"
      And I click enter on element with xpath "//input[@type='search']"
      Then I wait for 3 sec
      And I wait for element with xpath "//div[@class='web-results content']" to be present
      Then element with xpath "//div[@class='web-results content']" should contain text "Cucumber"

  @predefined7
Scenario: Predefined steps for SearchEncrypt
  Given I open url "https://www.searchencrypt.com"
  Then I should see page title contains "Search Encrypt"
  And element with xpath "//input[@name='q']" should be present
  When I type "Behavior Driven Development" into element with xpath "//input[@name='q']"
  And I click on element with xpath "//button[@type='submit']"
    And I wait for 3 sec
  And I wait for element with xpath "//section[@class='serp__results container']" to be present
  Then element with xpath "//section[@class='serp__results container']" should contain text "Behavior Driven Development"

@predefined8
Scenario: Predefined steps Skryabin
 Given I open url "https://skryabin.com/market/quote.html" 
  Then I type "ABC" into element with xpath "//textarea[@id='address']"
#  or   //select[@name='countryOfOrigin']/../label
  
