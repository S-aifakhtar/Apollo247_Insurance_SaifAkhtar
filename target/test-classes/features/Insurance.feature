Feature: Insurance

Scenario: Validate User navigate onto Insurance page
Given Chrome is opened and Apollo247 App is opened
When User Click on the Insurance Page
Then User navigate on the Insurance page

Scenario: Validate Insurance page UI
Given Chrome is opened and Apollo247 App is opened
When User Click on the Insurance Page
Then User navigate on the Insurance page
Then Insurance page fields are visible to the user

Scenario: Validate SortBy field on Insurance Page
Given Chrome is opened and Apollo247 App is opened
When User Click on the Insurance Page
Then User navigate on the Insurance page
Then Insurance page fields are visible to the user
When User select the SortBy value
Then Application sort the data according to SortBy value

#Scenario: Validate insurance detail page
#Given Chrome is opened and Apollo247 App is opened
#When User Click on the Insurance Page
#Then User navigate on the Insurance page
#Then Insurance page fields are visible to the user
#When User select the SortBy value
#Then Application sort the data according to SortBy value
#When User click on data
#Then Insurance detail page is opened


