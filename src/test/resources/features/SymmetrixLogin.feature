Feature: login functionality.
  Agile story: As a user I should be able to login.

  Scenario: Successful login with valid credentials
    Given User is in login page
    When User enter valid "hr1@cydeo.com" and "UserUser"
    And User click login button
    Then User lands on home page

    Scenario: Error message displayed
      Given user is in login page
      When user enter invalid "hr1@cydeo.com" or "Useruser"
      And user click login button
      Then user get an error message for invalid login attempt



