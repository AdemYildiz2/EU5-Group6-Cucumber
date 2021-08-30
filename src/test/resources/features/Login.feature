@wip
Feature: Login

  Scenario Outline: Users can Login
    Given User on the login page
    When The user is logged in as "<userType>"
    Then The user should see "<title>" title

    Examples:
      | userType       | title  |
      | help desk      | Portal |
      | human resource | Portal |
      | marketing      | Portal |


