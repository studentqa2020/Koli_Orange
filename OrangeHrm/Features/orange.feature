@Test
Feature: OrangeHrm
Background: User is LoggedIn
Given User is on Orange Hrm webpage
When User click on Signin Buton
And User Enters Credentials and Submit
Then User LoggedIn

Scenario: Search Who are on Leave of the hrm office 
Given User is on Orange Hrm Dashboard
When User check for the modules
Then User gets the Module list
When User click on Leave Module
And User Selects My Leave
Then User select second row data
And User Signs Out
