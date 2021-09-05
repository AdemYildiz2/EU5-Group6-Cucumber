
Feature: Login

  Background:
    Given User on the login page

  @BLEU-315 @wip
#  Positive
  Scenario Outline: Users can login
    When The user is logged in as "<userType>"
    Then The user should see "<title>" title

    Examples:
      | userType       | title  |
      | help desk      | Portal |
      | human resource | Portal |
      | marketing      | Portal |

# Negative
  @BLEU-316 @wip
  Scenario Outline: Users can't login
    When The user is logged in as "<fakeUser>" credentials
    Then the user should see errorText
    Examples:
      | fakeUser  |
      | fake1     |
      | fake2     |
      | help desk |
      | blank     |




