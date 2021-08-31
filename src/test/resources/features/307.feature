Feature: As a user, I should be able to interact with employees on the posts that I have access to

  @307
  Scenario:User should be able to make a comment, like, or unfollow on other employees' posts.
    Given The user is logged in as HR
    And User should be able to make comment
    When User should be able to like
    Then User should be able to unfollow other users
