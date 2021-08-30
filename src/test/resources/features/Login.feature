Feature: Login

  @wip
  Scenario Outline: Users can Login
    Given User on the login page
    When The user is logged in as "<userType>"
    Then The user should see "Portal" title

    Examples:
      | userType       |
      | help desk      |
      | human resource |
      | marketing      |


