@hiii
Feature: Amazon Home Page Validation

 @sc01 @amazon @hello
Scenario: Search function
  Given user naviagtes to Amazon Home Page
  When user enter the product name "iphone" in search box
  And user clicks on search icon
  Then verify the search result
  And verify the title of the current page

   @sc02 @amazon
Scenario Outline: Search function with Multiple data
  Given user naviagtes to Amazon Home Page
  When user enter the product name "<Product Name>" in search box
  And user clicks on search icon
  Then verify the search result
  And verify the title of the current page
  Examples:
    | Product Name |
    | iphone       |
    | Mouse        |
    | Keyboard     |
