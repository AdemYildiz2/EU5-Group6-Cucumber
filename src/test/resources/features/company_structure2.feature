Feature: User should be able to use functions under Employee menu

  Background:
    Given The user is logged in as HR
    When The user navigates to "Employees"


  @wip2
  Scenario: The user should be able to add a department
    And The user click the Add Department
    Then The user add a new "NewEst2"
    And The user delete the "NewEst2"

  @wip3
  Scenario: The user should be able to find employees by search by Alphabet

  @wip4
  Scenario: User should be able to export the employee list

  @wip5 #finish
  Scenario: User should be able to display telephone directory
    Then The user click the "Telephone Directory" button
    And The user get "Telephone Directory" text

  @DataDriven # @wip5
  Scenario Outline: Usershould be able to display <tabName>
    Then The user click the "<tabName>" button
    And The user get "<text>" text
    Examples:
      | tabName             | text                |
      | Company Structure   | Company Structure   |
      | Find Employee       | Find Employee       |
      | Telephone Directory | Telephone Directory |


  @wip6
  Scenario: User should be able to send message to employee from the telephone directory
