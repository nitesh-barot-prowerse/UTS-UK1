Feature: Verify Client Module Features


  Background:
    Given User should log in with username "kavyajakkula" and password "VLJakkkav$9" to the admin panel
    When User clicks on client icon on left tool bar

  @Sanity
  Scenario:Ensure that the Manage Client page displays list of client data after clicking on client icon on left tool bar
    Then Manage client page displays with list of clients


  Scenario: view client page should displays with all details for each client code link on manage client page
    When User clicks on client code link  on manage client page
    Then View client page displays with all details


#  Scenario:Edit client page should display in editable format by clicking on edit client icon on cog dropdown menu on view client page
#    When User clicks on edit client icon on cog dropdown menu on view client page
#    Then Edit client page displays in editable format

#  @Sanity
#  Scenario:Add quote page should display in editable format by clicking on add quote icon on cog dropdown menu on view client page
#    When User clicks on add quote icon on cog dropdown menu on manage client page
#    Then Add quote page should display in editable format
#
#
#  Scenario: Policies details of client displays by clicking on policy tab on view client page
#    When User clicks on client code on manage client page
#    And User clicks on policy tab on view client page
#    Then Policies details should display on view client page
#
#
#  Scenario: Claims details of client displays by clicking on claim tab on view client page
#    When User clicks on client code on manage client page
#    And User clicks on claim tab on view client page
#    Then Claim details should display on view client page
#
#
#  Scenario: Contacts details of client displays by clicking on contact tab on view client page
#    When User clicks on client code on manage client page
#    And User clicks on contact tab on view client page
#    Then Contact details should display on view client page
#
#
#  Scenario: Notes details of client displays by clicking on notes tab on view client page
#    When User clicks on client code on manage client page
#    And User clicks on notes tab on view client page
#    Then Notes details should display on view client page
#
#
#  Scenario: Task details of client displays by clicking on task tab on view client page
#    When User clicks on client code on manage client page
#    And User clicks on task tab on view client page
#    Then Task details should display on view client page

#  @Stage
#  Scenario: To add and verify new client details inside client client module
#    When User clicks on add client icon on manage client page
#    And User enters all mandatory details on add client page
#    And User clicks on create button on add client page
#    Then View client page appears with the details of currently added client
#
#  @Stage
#  Scenario: Appropriate client data will display upon entering  code in search box
#    When User enters code number inside search box on manage client page
#    And User clicks on search button manage client page
#    Then Appropriate client information displays inside table on manage client page

#  @Sanity (not to use)
#  Scenario:Filter list of client based on active status dropdown option on manage client page also verifies client status on view client page
#    When User selects appropriate option from Active dropdown on manage client page
#    And User clicks on search button
#    And User clicks on client code on manage client page
##    Then Client status displays on view client page

#  Scenario: To check whether add quote page is displays for same user by clicking on add button on view client page
#    When User clicks on client code on manage client page to add quote
#    And User clicks on add button on view client page
#    Then Add quote page displays with same client code
#
#  @Stage
#  Scenario:Verify add contact feature of client
#    When User clicks on client code on manage client page to open view client
#    And User selects Add contact option from setting dropdown besides of active text on view client page
#    And User enters all details inside add client window
#    Then Contact details can view under contacts menu on view client page
#
#  @Stage
#  Scenario: Verify add notes feature of client
#    When User clicks on client code on manage client page
#    And User selects Add notes options from setting dropdown besides the active text on view client page
#    And User enters all details inside add notes window
#    Then Notes details can view under note menu tab on view client page
#
#  @Stage
#  Scenario: Verify add task feature of client
#    When User clicks on client code on manage client page
#    And User selects Add task options from setting dropdown besides the active text on view client page
#    And User enters all details inside add task window
#    Then Task details can view under task menu tab on view client page
#
#  @Stage
#  Scenario: To verify edit client functionality for existing client
#    When User clicks on client code on manage client page
#    And User selects edit client sections from setting dropdown besides the active text on view client page
#    And User enters all details of client on edit client window
#    Then Updated details can view on view client page

#  @Production
#  Scenario:Verify add primary contact feature of client on production
#    When User enters test client code inside search box on manage client page
#    And Uer clicks on search button on manage client page
#    And User selects Add contact option from setting dropdown against client code form list of client code table
#    And User enters all details inside add client window
#    And User clicks on client code on manage client page
#    Then Contact details can view under contacts menu on view client page
#
#  @Production
#  Scenario:Verify add note feature of client on production
#    When User enters test client code inside search box on manage client page
#    And Uer clicks on search button on manage client page
#    And User selects Add note option from setting dropdown against client code form list of client code table
#    And User enters all details inside add notes window
#    And User clicks on client code on manage client page
#    Then Notes details can view under note menu tab on view client page
#
#  @Production
#  Scenario:Verify add Task feature of client on production
#    When User enters test client code inside search box on manage client page
#    And Uer clicks on search button on manage client page
#    And User selects Add task option from setting dropdown against client code form list of client code table
#    And User enters all details inside add task window
#    And User clicks on client code on manage client page
#    Then Task details can view under task menu tab on view client page
#
#  @Production
#  Scenario:Verify edit client feature of client on production
#    When User enters test client code inside search box on manage client page
#    And Uer clicks on search button on manage client page
#    And User selects edit client option from setting dropdown against client code form list of client code table
#    And User enters all details of client on edit client window
#    And User clicks on client code on manage client page
#    Then Updated details can view on view client page
