Feature: login functionality.
  Agile story: As a user I should be able to login.

  Scenario: Successful login with valid credentials
    Given User is in login page
    When User enter valid "hr1@cydeo.com" and "UserUser"
    And User click login button
    Then User lands on home page
