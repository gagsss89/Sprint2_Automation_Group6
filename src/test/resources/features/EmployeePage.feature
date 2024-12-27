Feature: User should be able to access to the Employees module

  Scenario:
    Given User is in login page
    When User enter valid "hr1@cydeo.com" and "UserUser"
    And  User click login button
    Then User lands on home page
    Then User click Employees feature
    Then User click More button
    And user should see below list
      | Efficiency Report   |
      | Honored Employees   |
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Birthdays           |
      | New page            |


  Scenario:
    Given User is in login page
    When User enter valid "hr1@cydeo.com" and "UserUser"
    And  User click login button
    Then User click Employees feature
    Then User click More button
    And user sees hidden section
    And user sees setting section