Feature:  Verify Approve Claim  Module Features

  Background:
    Given User should log in with username "kavyajakkula" and password "VLJakkkav$9" to the admin panel
    When User clicks on approve claims icon on left tool bar

  Scenario:Verify that the Approve Claim page displays with data in the table after clicking on approve claim icon on dashboard page
    Then User will redirect to page with "Approve Claim" message on it
    And User will able to see data on approve claims page