Feature: Verify Setting page hyperlinks

  Background:
    Given User should log in with username "kavyajakkula" and password "VLJakkkav$9" to the admin panel
    When User clicks on look up values icon on left tool bar

  Scenario: All hyperlinks with icons on setting page should work
    When User clicks on icon on setting page
    Then User will able to redirect to respected page