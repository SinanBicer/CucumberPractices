Feature: Testing Autocomplete

  @wip2
  Scenario: Verify No Select DropDown appears when a letter is written
    Given I open PracticesCybertek webpage
    When I click on Autocomplete section
    And I click on TextForm and write "U" letter
    When Autocomplete DropDown appeared and I click on "United Kingdom"
    And I click on Submit Button
    Then I should see my selected country on the page