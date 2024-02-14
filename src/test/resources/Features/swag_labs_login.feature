Feature: feature to the login functionality

  @POM
  Scenario Outline: Check login is successful with valid credentials
    Given User is on login page
    When Prakash enters <username> and <password>
    And  clicks on login button
    Then the backpack is available under products section
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |