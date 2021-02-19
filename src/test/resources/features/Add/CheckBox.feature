Feature: CheckBox

  @wip
  Scenario: Verify checkbox checked
    Given I open Practices Cybertek webpage and I click on CheckBox section
    When I click on Checkbox1 and Checkbox2
    Then Checkbox 1 must be unchecked
    And Checkbox 2 must be checked