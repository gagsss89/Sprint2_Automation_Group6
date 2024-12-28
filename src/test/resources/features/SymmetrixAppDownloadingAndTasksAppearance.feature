Feature: Downloading the applications and verifying the Task module appearance
  Agile story: As a user, I should be able to see different device option to download the different applications, and see the Task module.


  Background: for all scenarios user in on home page of the Symmetrix website
    Given user is already logged in on website


  Scenario: verify users can see 3 desktop versions to download the desktop app.
    When user scrolls down and sees the Desktop applications versions
    Then user can see three Desktop applications from below
      | MAC OS  |
      | WINDOWS |
      | LINUX   |
    Then user can click each option


  Scenario: Verify users can select 2 mobile versions to download the mobile app.
    When user scrolls down and sees the Mobile applications versions
    Then user can see two mobile applications from below
      | APP STORE   |
      | GOOGLE PLAY |
    Then user can click on each option

  @wip2
    Scenario: Verify the users can get task summary on the homepage.
      When user should see My Task window on the page
      Then user should see the Ongoing task summary option
      And user should see the number of task

