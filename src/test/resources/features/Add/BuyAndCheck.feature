Feature: BuyAndCheck

  @test
  Scenario: Verify clicked item in basket
    Given I open the SPORTSDIRECT webpage
    When I search for a t-shirt
    And I click on a t-shirt
    Then I should see the t-shirt added to basket/bag


