Feature: Verify Quote Module Features


  Background:
    Given User should log in with username "kavyajakkula" and password "VLJakkkav$9" to the admin panel
    When User clicks on quote icon on left tool bar

#  @Sanity
#  Scenario: Manage Quote page displays with list of quotes.
#    Then Manage quote page displays with list of quote
#
#  @Sanity
#  Scenario:To verify dates under Quote date and Expire date columns displays in dd-mm-yyyy format
#    Then User will able to see all data under quote date and expire date column displays with dd-mm-yyyy format
#
#
#  Scenario: One can redirect to add quote page by clicking add quote button on top right corner of manage quote
#    When User clicks add quote button on manage quote page
#    Then User will able to see add quote page with data
#
#  @Sanity
#  Scenario:Data under total and monthly premium column should prefixed by £ sign
#    Then User will able to see  all data under total and monthly premium colum prefixed by £ sign

#  @Sanity(Do not use this one for UK1)
#  Scenario:To check whether user will able able to redirect and see data on microchip file upload  page after clicking on upload microchip button on manage quote page
#    When User clicks on upload microchip file button
#    Then User will be able to see microchip file upload page with data
#
#  @Sanity
#  Scenario:On the Add Quote page, verify that the Product dropdown appears with list of products
#    When User clicks on add quote button
#    Then On add quote page product dropdown will appear with desired list

#  @Sanity
#  Scenario: Verify Generate and save quote feature for Exotic
#    When User clicks on add quote button
#    And User selects the exotic value form product dropdown
#    And User enters client details form "client/client.json"
#    And User enters exotic species information from "quote/exotic.json"
#    And User calculate premium value for exotic
#    And User enters all required information and click on save quote
#    And  User Generates policy for exotic

#  @Sanity
#  Scenario: Verify Generate and save quote feature for Exotic using credit/debit card option
#    When User clicks on add quote button
#    And User selects the exotic value form product dropdown
#    And User enters client details form "client/client.json"
#    And User enters exotic species information from "quote/exotic.json"
#    And User calculate premium value for exotic
#    And User enters all required information and click on save quote
#    And  User Generates policy for exotic with credit and debit card option

#  @Sanity
#  Scenario: Verify Generate and save quote feature for Exotic using direct debit payment option
#    When User clicks on add quote button
#    And User selects the exotic value form product dropdown
#    And User enters client details form "client/client.json"
#    And User enters exotic species information from "quote/exotic.json"
#    And User calculate premium value for exotic
#    And User enters all required information and click on save quote
#    And  User Generates policy for exotic with using direct debit payment option

#    @Sanity
#  Scenario: Generate and save quote  for horse breed
#    When User clicks on add quote button
#    And User selects the introductory value of horse form product dropdown
#    And User enters client details form "client/client.json"
##    And User selects horse species for introductory
#    And User enters horse species information for introductory from "quote/horse.json"
#    And User calculate premium value for horse introductory

#  @Sanity
#  Scenario: Generate and save quote  for horse breed using credit and debit card payment option
#    When User clicks on add quote button
#    And User selects the introductory value of horse form product dropdown
#    And User enters client details form "client/client.json"
##    And User selects horse species for introductory
#    And User enters horse species information for introductory from "quote/horse.json"
#    And User calculate premium value for horse introductory using credit and debit card payment option

#  @Sanity
#  Scenario: Generate and save quote  for horse breed using direct debit payment option
#    When User clicks on add quote button
#    And User selects the introductory value of horse form product dropdown
#    And User enters client details form "client/client.json"
##    And User selects horse species for introductory
#    And User enters horse species information for introductory from "quote/horse.json"
#    And User calculate premium value for horse introductory using direct debit payment option


#  @Sanity
#  Scenario: Generate and save quote  for professional breed
#    When User clicks on add quote button
#    And User selects the professional value of  form product dropdown
#    And User enters client details form "client/client.json"
##    And User selects horse species for introductory
#    And User enters professional species information
#    And User calculate premium value for professional and generate policy

  @Sanity
  Scenario: Generate and save quote  for professional breed using credit and debit card option
    When User clicks on add quote button
    And User selects the professional value of  form product dropdown
    And User enters client details form "client/client.json"
#    And User selects horse species for introductory
    And User enters professional species information
    And User calculate premium value for professional and generate policy using credit and debit card option

  @Sanity
  Scenario: Generate and save quote  for professional breed using direct debit payment option
    When User clicks on add quote button
    And User selects the professional value of  form product dropdown
    And User enters client details form "client/client.json"
#    And User selects horse species for introductory
    And User enters professional species information
    And User calculate premium value for professional and generate policy using direct debit payment option





#  @Sanity
#  Scenario: Respected quote information page will be displayed upon clicking quote number on manage quote page
#    When User clicks on quote number on manage quote page
#    Then Quote Information page displays with details

#  @Sanity (Do not use this one for uk1)
#  Scenario: Items on manage quote page displays upon item select from quote status dropdown
#    When User selects appropriate option from quote status dropdown
#    Then Respected data will be displayed on Manage quote page

#  @Sanity
#  Scenario: Fetch list of quote based on product option from product dropdown on manage quote page
#    When User selects appropriate option from product dropdown on manage quote page
#    And User clicks on search button on manage quote page
#    Then Appropriate list of quote will display
#
#  @Sanity
#  Scenario: Fetch list of quote based on option from Is referred dropdown on manage quote page
#    When User selects appropriate option from Is referred dropdown on manage quote page
#    And User clicks on search button on manage quote page
#    Then Appropriate list of quote will display upon drop down option
#
#
#  Scenario: Fetch list of quote based on option from division dropdown on manage quote page
#    When User selects appropriate option from division dropdown on manage quote page
#    And User clicks on search button on manage quote page
#    Then Appropriate list of quote will display upon division drop down option
#
#  @Stage
#  Scenario:Fetch quotation based on quote number on manage quote page
#    When User enters quote number inside search box on manage quote page
#    And User clicks on search button on manage quote page
#    Then Appropriate quote information displays on manage quote page


#  Scenario:Verify include payment feature of quote module
#    When User selects include payment only quotes checkbox
#    And User clicks on search button on manage quote page
#    Then Appropriate quote list displays on manage quote page

#  @Stage
#  Scenario: Edit quote details and verifies the same
#    When User selects edit quote option from cog icon on quote information page
#    Then User can edit all required field on edit quote page




