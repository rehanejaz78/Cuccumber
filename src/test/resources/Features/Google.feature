@Regression
Feature: Google search
  Scenario Outline: search successful
  Given As a user I opened browser
    When I enter <text> in search bar
    And I click on the search button
    Then I should be taken to reult page

    Examples:
      |text |
      |"rehan ejaz"|





