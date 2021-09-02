@wip
Feature: Login

  Scenario Outline: Users can login
    Given User on the login page
    When The user is logged in as "<userType>"
    Then The user should see "<title>" title

    Examples:
      | userType       | title  |
      | help desk      | Portal |
      | human resource | Portal |
      | marketing      | Portal |


  Scenario Outline: Users can't login
    Given User on the login page
    When The user is logged in as "<fakeUser>"
    Then the user should see the same "" title
    Examples:
      | fakeUser  | password |
      | fake1     | UserUser |
      | fake2     | x        |
      | help desk | y        |




