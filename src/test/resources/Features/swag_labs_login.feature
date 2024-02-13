Feature: feature to the login functionality

  @Re-Testing
  Scenario Outline: Check login is successful with valid credentials
    Given Prakash is on login page
    When Prakash enters <username> and <password>
    And  clicks on login button
    Then user navigated to the home page
    And Backpack item is available under product section in home page
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |