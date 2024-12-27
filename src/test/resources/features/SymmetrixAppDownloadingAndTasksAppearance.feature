Feature: Downloading the applications and verifying the Task module appearance
  Agile story: As a user, I should be able to see different device option to download the different applications, and see the Task module.


  Background: for all scenarios user in on home page of the Symmetrix website
    Given user is already logged in on website

  @wip2
  Scenario: verify users can see 3 desktop versions to download the desktop app.
    When user scrolls down and sees the Desktop applications versions
    Then user can see three Desktop applications from below
      | MAC OS  |
      | WINDOWS |
      | LINUX   |
    Then user can click each option

