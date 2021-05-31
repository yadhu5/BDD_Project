@Login
Feature: Validate the user login information

Background:
Given User is in the loginpage  

Scenario:
When User enter the login information as "demo@techfios.com" 
When User enter the password information as "abc123"
And User click login button
Then User land on login Page

@SmokeTest
Scenario:
When User enter the login information from database  
When User enter the password information from database      
And User click login button
Then User land on login Page