@AddBankInformation
Feature: Validate the customer can enter the information 

Background: 
	Given User is in the loginpage 
Scenario Outline:User should able to enter the information
	When user enter the "<userName>" and "<password>"  
	And User click login button 
	Then User land on login Page 
	Then User click on Bank and Cash button       
	Then User click on New Account 
	Then User can add the information "<accountTittle>" and "<Description>" and "<initialBalance>" and "<accountNumber>" and "<contactPerson>" and "<phoneNumber>" and "<internetUrl>" 
	Then User click submit button
	
Examples: 
		|userName|password|accountTittle|description|initialBalance|accountNumber|contactPerson|phoneNumber|
		|demo@techfios.com|abc123|Checking|Saving account|250000        |15484545    |817-558-5555|800-585-5555|
		
		
