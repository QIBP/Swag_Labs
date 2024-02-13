# Author: Reddi Prakash gude
@Smoke
Feature: feature to test the login functionality

  @SmokeTest
  Scenario: Check login is successful with valid credentials
    Given User is on login page
    When user enters username and password
    And clicks on login button
    Then user navigated to the home page

