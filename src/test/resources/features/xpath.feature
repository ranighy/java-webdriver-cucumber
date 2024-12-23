Feature: Nop Commerce project


  Scenario:
    Given  I open url "https://nop-qa.portnov.com"
    Then I should see page title contains "Your store. Home page title"
    And I click on element with xpath "//h2[@class='title']/a[text()=' Electronics ']"
     And I click on element with xpath "//div[@class='picture']/a[@title='Show products in category Camera & photo']"
     And I click on element with xpath "//a[contains(text(),'Nikon D5500 DSLR')]"
     Then element with xpath "//input[@id='product_enteredQuantity_15']" should be present
     And I clear element with xpath "//input[@id='product_enteredQuantity_15']"
     When I type "2" into element with xpath "//input[@id='product_enteredQuantity_15']"
     And I wait for 3 sec
     And I click on element with xpath "//div[@class='add-to-cart-panel']/button[@id='add-to-cart-button-15']"
     Then element with xpath "//li[@id='topcartlink']/a[@class='ico-cart']" should be present
    And I click on element with xpath "//li[@id='topcartlink']/a[@class='ico-cart']"
    Then element with xpath "//input[@value='2']" should be present
    And element with xpath "//td[@class='product']/a[text()='Nikon D5500 DSLR - Red']" should be present
Scenario: Quote submission
    Given I open url "https://skryabin.com/market/quote.html"






