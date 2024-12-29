
Feature: User should be able to access to the Employees module

  Background:
    Given User is in login page
    When User enter valid "hr1@cydeo.com" and "UserUser"
    And  User click login button
    Then User lands on home page
    Given User click Employees feature

  Scenario:Verify the option names are correct and  in order.
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


  Scenario: Verifying hidden & Settings under employee module section
    Then User click More button
    And user sees hidden section
    And user sees setting section


  Scenario: creating new department
    Then the user is on the Company Structure page
    When the user clicks the New Department button
    When the user enters a "NewDepCreated" in the input field
    And the user selects a "Mentoring" from the dropdown list
    When the user clicks the Add button
    And the newly created department is displayed in the company structure


#  @sopo
#  Scenario Outline: Creating New departments
#    Then the user is on the Company Structure page
#    When the user clicks the New Department button
#    When the user enters a "<departmentName>" and "<parentDepartment>"in the input field
#    When the user clicks the Add button
##    And the newly created department is displayed in the company structure
#
#    Examples:
#      | departmentName | parentDepartment |
#      | department_1   | . Cyber Vet      |
#      | department_2   | Accounting       |
#      | department_3   | Mentoring        |
#      | department_4   | .  . Project     |
