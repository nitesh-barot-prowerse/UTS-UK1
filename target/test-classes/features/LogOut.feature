Feature: Verify Log out functionality

  Background:
    Given User should log in with username "kavyajakkula" and password "VLJakkkav$9" to the admin panel

  @Sanity
  Scenario: Verify log out feature of system
    When User clicks on Logoff button
    Then User will redirect to login page
