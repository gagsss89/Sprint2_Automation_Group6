@wip
Feature: Poll functionality
  Agile story: As a user, I should be able to create a poll.

  Background: for all scenarios user in on home page of the Symmetrix website
    Given user is already logged in on website

  Scenario: User can create a simple poll with a question and 2 answers.
    When user click on the POLL feature
    And user add message
    And user enter poll question and two answers
    And user remove third answer option
    And click send button
    Then created poll should be displayed in the field

  Scenario: User can cancel poll creation
    When user click on the POLL feature
    And user add message
    And user enter poll question and two answers
    And user click cancel button
    Then poll creation will be canceled , user returned to message option
