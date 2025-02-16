Feature: User visits Github. In the search bar, writes Selenium and clicks search button. Then user clicks SeleniumHQ/Selenium link.

  Scenario: User goes to Github
    Given User goes to Github
    When User clicks search button
    When User writes "TazoPsuturi" in the search bar
    And User clicks search result
    When User clicks on Users category
    When User chooses Account
    Then User should see "TazoPsuturi" account page
