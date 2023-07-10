Feature: Verify Account Module Functionalities

  Background:
    Given User should log in with username "kavyajakkula" and password "VLJakkkav$9" to the admin panel
    When User clicks on account icon on left tool bar

  @Sanity
  Scenario: All hyperlinks with icons on account page should work
    When User clicks on icon
    Then User will redirect to respected page

#  Scenario: Filter data of manage bank page upon entering account number
#    When User clicks on bank icon
#    And User enters account number in search box on manage bank page
#    And User clicks on search button on manage bank page
#    Then Data on manage bank page reflects upon account number
#
#  Scenario: Filter data of manage bank page upon entering account number
#    When User clicks on bank icon
#    And User enters client name in search box on manage bank page
#    And User clicks on search button on manage bank page
#    Then Data on manage bank page reflects upon client name

#  @Sanity
#  Scenario: Bank Information page displays with details after clicking on bank code link on manage bank details
#    When User clicks on bank icon
#    And User clicks on bank code link on manage bank page
#    Then Bank information page displays with details
#
#  @Sanity
#  Scenario:Add Bank page  displays will all details when user clicks on add bank icon on manage bank page
#    When User clicks on bank icon
#    And User clicks on add bank icon on manage bank page
#    Then Add bank page displays with all details
#
#  @Sanity
#  Scenario:Allocate Payment page displays will all details when user clicks on add receipt icon on manage receipt page
#    When User clicks on manage receipt icon on account page
#    And User clicks on add receipt icon on manage receipt page
#    Then Allocate Payment page displays with all details