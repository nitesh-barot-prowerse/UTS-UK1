Feature: Verify Report Module Features

  Background:
    Given User should log in with username "kavyajakkula" and password "VLJakkkav$9" to the admin panel
    When User clicks on reports icon on left tool bar

  @Sanity
  Scenario: All hyperlinks with icons on setting page should work
    Then User will able to see total six section of report category
#
  @Sanity
  Scenario: User will able to redirect on respected report page by clicking on report icon on report page
    When User clicks on reports icon
    Then Respected report page displays


  #Quote Report


#  Scenario: Filter quote report information upon option of product drop down
#    When User clicks on quote report button on report page
#    And User selects any option from product drop down on quote report page
#    And User clicks on search button on quote report page
#    Then Appropriate data displays on quote report page upon selected option from drop down
#
#
#  Scenario: Filter quote report information upon options value of quote status and quote from drop downs
#    When User clicks on quote report button on report page
#    And User selects any option from quote from and quote status drop down on quote report page
#    And User clicks on search button on quote report page
#    Then Appropriate data displays on quote report page upon selected options from drop down
#
#
#  Scenario: Sorting data on quote report page via quote number and sort direction
#    When User clicks on quote report button on report page
#    And User selects quote number option from sort by and Ascending option from sort by direction drop down respectively
#    And User clicks on search button on quote report page
#    Then All data on quote report page displays in sorting manner
#
#   #Policy Summary Report
#
#
#  Scenario: Filter policy report information upon option of product drop down
#    When User clicks on policy summary report button on report page
#    And User selects any option from product drop down on policy summary report page
#    And User clicks on search button on policy summary report page
#    Then Appropriate data displays on policy summary report page upon selected option from drop down


#  Scenario: Filter policy report information upon option of status drop down
#    When User clicks on policy summary report button on report page
#    And User selects any option from status drop down on policy summary report page
#    And User clicks on search button on policy summary report page
#    Then Appropriate data displays on policy summary report page upon selected option from status drop down
#
#
#  Scenario: Sorting data on policy summary report page via policy number and sort direction dropdowns options
#    When User clicks on policy summary report button on report page
#    And User selects policy number option from sort by and ascending option from sort direction drop down respectively
#    And User clicks on search button on policy summary report page
#    Then Appropriate data displays on policy summary report page upon selected option from both drop down

  #Policy Payment history report

#  Scenario: Filter Policy Payment history report information upon from and to date
#    When User clicks on policy payment history button on report page
#    And User enters from and to date value on policy payment history page
#    And User clicks on search button on policy policy payment history page page
#    Then Appropriate data displays on policy payment history page upon selected option from drop down

   #Policy Cancellation Report


#  Scenario: Filter policy cancellation report information upon option of insurer drop down
#    When User clicks on policy cancellation report button on report page
#    And User selects any option from insurer drop down on policy cancellation report page
#    And User clicks on search button on policy policy cancellation report page
#    Then Appropriate data displays on policy cancellation report page upon selected option from drop down
#
#
#  Scenario: Sorting data on policy cancellation report via sort by and sort direction dropdowns options
#    When User clicks on policy cancellation report button on report page
#    And User selects any option from sort by and option from sort direction drop down respectively
#    And  User clicks on search button on policy policy cancellation report page
#    Then Appropriate data displays on policy cancellation report page upon selected option from drop down
#
#   ##Refund Report
#
#
#  Scenario: Filter refund report information upon option of payment status drop down
#    When User clicks on refund report button on report page
#    And User selects any option from payment status drop down on refund report page
#    And User clicks on search button on refund report page
#    Then Appropriate data displays on refund report page upon selected option from drop down
#
#
#  Scenario: Sorting data on refund report via sort by and sort direction dropdowns options
#    When User clicks on refund report button on report page
#    And User selects any option from sort by and option from sort direction drop down respectively on refund report page
#    And User clicks on search button on refund report page
#    Then Appropriate data displays on refund report page upon selected option from drop down
#
#
#
#   ##Active Policy listing report
#
#
#  Scenario: Filter Active Policy Listing Report information upon option of product status drop down
#    When User clicks on  active policy listing report button on active policy listing report page
#    And User selects any option from product status drop down on active policy listing report page
#    And User clicks on search button on active policy listing report page
#    Then Appropriate data displays on active policy listing report page upon selected option from drop down
#
#
#  Scenario: Filter Active Policy Listing Report information upon option of status drop down
#    When User clicks on  active policy listing report button on active policy listing report page
#    And User selects any option from status drop down on active policy listing report page
#    And User clicks on search button on active policy listing report page
#    Then Appropriate data displays on active policy listing report page upon selected option from drop down
#
#
#  Scenario: Filter Active Policy Listing Report information upon option of insurer drop down
#    When User clicks on  active policy listing report button on active policy listing report page
#    And User selects any option from insurer drop down on active policy listing report page
#    And User clicks on search button on active policy listing report page
#    Then Appropriate data displays on active policy listing report page upon selected option from drop down
#
#
#  Scenario: Filter Active Policy Listing Report information upon option of received method drop down
#    When User clicks on  active policy listing report button on active policy listing report page
#    And User selects any option from received method drop down on active policy listing report page
#    And User clicks on search button on active policy listing report page
#    Then Appropriate data displays on active policy listing report page upon selected option from drop down
#
#
#  Scenario: Filter Active Policy Listing Report information upon option of transaction type method drop down
#    When User clicks on  active policy listing report button on active policy listing report page
#    And User selects any option from transaction type drop down on active policy listing report page
#    And User clicks on search button on active policy listing report page
#    Then Appropriate data displays on active policy listing report page upon selected option from drop down
#
#
#  Scenario: Sorting data on active policy listing report page via sort by and sort direction dropdowns options
#    When User clicks on  active policy listing report button on active policy listing report page
#    And User selects any option from sort by and option from sort direction drop down respectively on active policy listing page
#    And User clicks on search button on active policy listing report page
#    Then Appropriate data displays on active policy listing report page upon selected option from drop down

#   Outstanding claims report

#  Scenario: Filter Outstanding Claims report information upon notified from and to date
#    When User clicks on outstanding claims button on report page
#    And User enters from and to date value on outstanding claims page
#    And User clicks on search button on outstanding claims
#    Then Appropriate data displays on outstanding claims upon date values
#
#
#  Scenario: Sorting data on Filter Outstanding Claims report via sort by and sort direction dropdowns options
#    When User clicks on outstanding claims button on report page
#    And User selects any option from sort by and option from sort direction drop down respectively on Filter Outstanding Claims page
#    And  User clicks on search button on outstanding claims
#    Then Appropriate data displays on outstanding claims upon selected option from drop down

     #Unallocated Balance Report

#
#  Scenario: Sorting data on unallocated balance report page via sort by and sort direction dropdowns options
#    When User clicks on unallocated balance report button on report page
#    And User selects any option from sort by and sort direction drop down respectively on unallocated balance report page
#    And User clicks on search button on unallocated balance report page
#    Then Appropriate data displays on unallocated balance report page upon selected option from drop down



  #Agent Report


#  Scenario: Filter agent report information upon option of agent type drop down
#    When User clicks on agent list button on report page
#    And User selects any option from  option of agent type drop down on agent list report page
#    And User clicks on search button on agent list report page
#    Then Appropriate data displays on agent list report page upon selected option from drop down
#
#
#  Scenario: Filter agent report information upon option of active drop down
#    When User clicks on agent list button on report page
#    And User selects any option from  active drop down on agent list report page
#    And User clicks on search button on agent list report page
#    Then Appropriate data displays on agent list report page upon selected option from drop down
#
#
#  Scenario: Sorting data on agent list report page via sort by and sort direction dropdowns options
#    When User clicks on agent list button on report page
#    And User selects agent name or number option from sort by and ascending option from sort direction drop down respectively
#    And User clicks on search button on agent list report page
#    Then Appropriate data displays on agent list report page upon selected option from drop down



