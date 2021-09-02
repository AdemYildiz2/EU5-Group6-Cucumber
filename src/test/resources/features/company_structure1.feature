Feature: User should be able to use functions under Employee menu

  Background:
    Given The user is logged in as HR


  @wip1  #finished
  Scenario: The user should be able to find employees by search box and display the company structure
    When The user send "employees" text
    Then The user get "Company Structure" text

