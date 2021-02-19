Feature: Testing BasicAuth


  Scenario: Verify only authorized person can open the page
    Given I open Practices Cybertek webpage
    When I click on BasicAuth section
    And I see the alert popup
    Then I will write my id and password
    And I click enter
