@hiii
Feature: Amazon Home Page Validation

  #@before
 @sc01 @amazon @hello @regression
Scenario: Search function
   #@beforestep
  Given user naviagtes to Amazon Home Page
   #@afterstep
   #@beforestep
  When user enter the product name "iphone" in search box
      #@afterstep
   #@beforestep
  And user clicks on search icon
      #@afterstep
   #@beforestep
  Then verify the search result
      #@afterstep
   #@beforestep
  And verify the title of the current page
      #@afterstep
   #@after

   @sc02 @amazon @regression
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

    @SC03 @regression
  Scenario: static Dropdown Validation
    Given user naviagtes to Amazon Home Page
    When user extracts dropdown values
    And user select value from the dropdown
    Then user validate the office product value in the dropdown

      @SC04
  Scenario: Dynamic Dropdown Handling
    Given user navigates to Spice jet
    When user select values from the dropdown

        @sc05
  Scenario: Mouse Action
    Given user clicks on baby wish list
    Then validate the navigation

  @sc06
  Scenario: Window Handling
    Given user search the product
    When user select the specific product
    Then verify the title of page
















