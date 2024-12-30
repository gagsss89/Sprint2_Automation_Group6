@pp
Feature: Access Mail Module and send email

  As a user, I should be able to send email via the Mail page

  Background:
    Given User is in login page
    When User enter valid "hr1@cydeo.com" and "UserUser"
    And  User click login button
    Then User lands on home page

  Scenario:Verify users access to the Mail page.
    Then user clicks Mail module
    And user verifies Bitrix24” is displayed


   Scenario: Verify that there are 8 mail operators displayed on the mail page
    Then user clicks Mail module
    Then user verifies mail operators are displayed in the following order
      | Gmail      |
      | Outlook    |
      | iCloud     |
      | Office 365 |
      | Exchange   |
      | YAHOO!     |
      | Aol.       |
      | IMAP       |
    And user verifies each email operator is clickable and "Mailbox Integration" is displayed



 Scenario Outline:  Verify users can create a mail integration using each mail option
   When user clicks Mail module
   And user clicks gmailOperator
   When user is able to write his "<E-mail>" and "<password>" fields
   And user verifies E-mail and Login field has the same emails
   Then user verifies that fetch checkbox is selected
   And user clicks connect button
#   And user verifies "Integration is successful" message is displayed

   Examples:
   |E-mail| password|
   |h1@cydeo.com| UserUser|
