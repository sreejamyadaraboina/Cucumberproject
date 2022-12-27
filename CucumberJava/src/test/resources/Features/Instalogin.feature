Feature: Insta login functionality

  Scenario Outline: Check login is successful with valid credentails
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigated to home page

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | sreeja   |    12345 |
