Feature: User should be able to access to the Employees module

  Scenario:
    Given User is in login page
    When User enter valid "hr1@cydeo.com" and "UserUser"
    And  User click login button
    Then User lands on home page
    Then User click Employees feature
    And user should see below list
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New Page            |


