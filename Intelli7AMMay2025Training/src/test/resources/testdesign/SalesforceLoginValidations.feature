Feature: Sales Force Login Page

  Scenario Outline: login validation
    Given user enter username "<User Name>" and password "<Password>"

    Examples:
      | User Name | Password |
      | abc       | xyz      |
      | jak       | xyx      |
      | ram       |asd       |

    @amazon
  Scenario: label name validation
    Given user naviages to home page
    Then user validates the label name