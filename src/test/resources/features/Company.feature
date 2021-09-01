
Feature: As a user, I should be able to add news under Company
  Background: The user is logged in as HR
    Given The user is logged in as HR

  @wip1
    Scenario: User should be able to select the type of information under preview text
      Given the user clicks the Company label
      And   the user clicks the add news
      And   the user selects the Type of information as Notice
      Then  the user should be able to see the Notice as selected

   @wip2
      Scenario: User should be able to select a date and set a time under preview text
        Given the user clicks the Company label
        And   the user clicks the add news
        And   the user selects the Type of information as Notice
        And   the user enters the "08/29/2021 10:00:00 am"
        Then  the user should able to see the date

    @wip3
       Scenario: User should be able to add and remove a picture under details
        Given the user clicks the Company label
         When the user clicks the add news
         And  the user clicks the details tab
         Then  the user



    @wip4
        Scenario: User should be able to edit a picture under details
          Given the user clicks the Company label
          And   the user clicks the add news
          When the user clicks the details label
          Then the user edit picture under details



     @wip5
        Scenario: User should be able to add tags under details
         Given the user clicks the Company label
          And   the user clicks the add news
          When  the user clicks the tags box
          Then the user added tags




    @wip6
         Scenario Outline: User should be able to select Text, HTML, and Visual Editor
          Given the user clicks the Company label
          And   the user clicks the add news
          When  the user clicks the the Preview text tab
          Then  the user  selected the Text, HTML, and Visual Editor
          Examples:


      @wip7
         Scenario: User should be able to send news
           Given the user clicks the Company label
             And  the user clicks the news button
             When the user clicks the add news button
             Then the user should able to send news








