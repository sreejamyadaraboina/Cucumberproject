Feature: feature to test google search functionality

  Scenario: Validate google search is working
    Given browser is open
    And user is on search bar
    When user enters text in search bar
    And hits enter
    Then user able to see search results
