Feature: Verify Task Module Features


  Background:
    Given User should log in with username "kavyajakkula" and password "VLJakkkav$9" to the admin panel
    When User clicks on task icon on left tool bar

  @Sanity
  Scenario: User will redirect to manage task page after clicking on task icon on left tool bar
    Then User redirects to "Manage Task" page
    And User see concern data on manage task page


  Scenario: To check whether Assign to dropdown on add task page appears with current user after clicking on add task button on add task page
    When user clicks on add task button
    Then User redirects to page with "Add Task" message
    And Assigned to dropdown appears with initial current user


  Scenario:Appropriate data should display upon selecting an option from the status drop down on managing task page
    When User Selects any option from status dropdown on manage task page
    Then Status tage of manage task data displays accordingly


  Scenario:Appropriate data should display upon selecting an option from the priority drop down on managing task page
    When User Selects any option from priority dropdown on manage task page
    Then Data under priority column of task data displays accordingly


  Scenario:Appropriate data should display upon selecting an option from the type drop down on managing task page
    When User Selects any option from type dropdown on manage task page
    Then Data under type column of task data displays accordingly
#
#  @Sanity(do not use for uk1)
#  Scenario:Appropriate data should display upon selecting an option from the client drop down on managing task page
#    When User Selects any option from client dropdown on manage task page
#    Then Data under client column of task data displays accordingly


  Scenario:To check task details should open after clicking on task title on manage task page
    When User clicks on task tile on task manage page
    Then Task details window will open with all task details

