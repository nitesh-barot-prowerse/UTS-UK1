Feature:Login To Admin Panel

  Background:
    Given User is one the website login page
    And User enters username "kavyajakkula" and password "VLJakkkav$9" and click signIn button
  @Sanity
  Scenario: Verify Login event
    Then User will be able to see dashBoard
    And User will be able to see "(en-GB)" text on right top corner of page





