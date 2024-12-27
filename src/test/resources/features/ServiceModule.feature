Feature: Access to the Service module
  Agile Story: As a user, I should be able to access to the Service module.

  @modules
  Scenario: Verify visibility and order of Service Module
    Given user is on the Symmetrix home page
    When user navigates to the Service module
    And user sees different modules in specific order

      | Meeting Room Booking |
      | Ideas                |
      | Lists                |
      | e-Orders             |
      | Training             |
      | Wiki                 |
      | Contact Center       |
      | FAQ                  |
      | Polls                |
      | Technical Support    |
      | Link Directory       |
      | Change Log           |
      | Subscription         |
      | Classifieds          |

  @more
  Scenario:
    Given user is on the Symmetrix home page
    When user navigates to the Service module
    Then user clicks More button
    And user sees Hidden section
    And user sees Setting section with different options
      | Configure Menu |
      | Reset menu     |

  @faq
  Scenario: Verify users can access to the FAQ documents.
    Given user is on the Symmetrix home page
    When user navigates to the Service module
    Then user clicks FAQ is able to see documents
    And is able to access "Work Process(4)"
    And is able to access "Files and Documents(2)"
    And is able to access "Using portal services(7)"




