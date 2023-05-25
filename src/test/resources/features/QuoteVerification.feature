Feature: Verify quote details


  Scenario: Verify quote details for UTS-UK 1
    When :User enters all pet related details under about you tab
    And User enters all customer related information under about you tab
    And User will able to see all quote details and clicks on save quote button
    And User will redirect to url "https://login.yahoo.com/"
    And User clicks on inbox
    And User fetch data

