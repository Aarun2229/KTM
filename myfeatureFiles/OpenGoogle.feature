@Simple
Feature: This is to test google search
@Positive
Scenario: Google search scenario
Given user is entering the google.co.in
When user is typing the search term "Arun"
And enter the return key
Then the user should see the search results




@Negtive
Scenario: invalid
Given user is entering the google.co.in
When user is typing the search term "Arun"
And enter the return key
Then the user should see the search results

