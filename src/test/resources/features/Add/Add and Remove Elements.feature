Feature: Testing Add/Remove Elements button


  Scenario: Verify Add/Remove Elements Button works
    Given I opened PracticesCybertek webpage
    And I click on Add/Remove Elements and open add_remove_elements page
    Then I click on Add Element button and Delete button appeared
    And I click on Delete button and Delete button disappeared
