Feature: Verify Report Module Features

  Background:
    Given User should log in with username "kavyajakkula" and password "VLJakkkav$9" to the admin panel
    When User clicks on reports icon on left tool bar
#
#  @Sanity
#  Scenario: All hyperlinks with icons on setting page should work
#    Then User will able to see total six section of report category
#
##  @Sanity
##  Scenario: User will able to redirect on respected report page by clicking on report icon on report page
##    When User clicks on reports icon
##    Then Respected report page displays
##

  ##Quote Report

#  @Sanity
#  Scenario: Filter quote report information upon option of product drop down
#    When User clicks on quote report button on report page
#    And User selects any option from product drop down on quote report page
#    And User clicks on search button on quote report page
#    Then Appropriate data displays on quote report page upon selected option from drop down
#
#  @Sanity
#  Scenario: Filter quote report information upon options value of quote status and quote from drop downs
#    When User clicks on quote report button on report page
#    And User selects any option from quote from and quote status drop down on quote report page
#    And User clicks on search button on quote report page
#    Then Appropriate data displays on quote report page upon selected options from drop down
#
#  @Sanity
#  Scenario: Sorting data on quote report page via quote number and sort direction
#    When User clicks on quote report button on report page
#    And User selects quote number option from sort by and Ascending option from sort by direction drop down respectively
#    And User clicks on search button on quote report page
#    Then All data on quote report page displays in sorting manner

   ##Policy Summary Report

#  @Sanity
#  Scenario: Filter policy report information upon option of product drop down
#    When User clicks on policy summary report button on report page
#    And User selects any option from product drop down on policy summary report page
#    And User clicks on search button on policy summary report page
#    Then Appropriate data displays on policy summary report page upon selected option from drop down
#
#  @Sanity
#  Scenario: Filter policy report information upon option of status drop down
#    When User clicks on policy summary report button on report page
#    And User selects any option from status drop down on policy summary report page
#    And User clicks on search button on policy summary report page
#    Then Appropriate data displays on policy summary report page upon selected option from status drop down
#
#  @Sanity
#  Scenario: Sorting data on policy summary report page via policy number and sort direction dropdowns options
#    When User clicks on policy summary report button on report page
#    And User selects policy number option from sort by and ascending option from sort direction drop down respectively
#    And User clicks on search button on policy summary report page
#    Then Appropriate data displays on policy summary report page upon selected option from both drop down

  @Sanity
  Scenario:Add premium and claim adjustments window opens by clicking on adjustment button on section 26 and 27 report page
    When User clicks on Trust summary section button on report page
    And User clicks on adjustment button on section report page
    Then Add premium and claim adjustments window opens with all details

  @Sanity
  Scenario:Payment window opens by clicking on payments button on section 26 and 27 report page
    When User clicks on Trust summary section button on report page
    And User clicks on payments button on section report page
    Then Payments window opens with all details

  @Sanity
  Scenario:Opening and Closing bank balance window opens by clicking on bank button on section 26 and 27 report page
    When User clicks on Trust summary section button on report page
    And User clicks on bank button on section report page
    Then Opening and Closing bank balance window opens with all details

