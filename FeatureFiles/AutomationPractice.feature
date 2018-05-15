Feature: Automation

Background:
Given user is on Home page
When user navigates to sign in page

@ValidEmail
Scenario Outline: Successful registration with Valid email address
	And user enters valid "<email>"
	And user clicks on Create an account
	Then user should be able to register successfully
	
Examples:
	| email          |
	| test123@gmail.com |


@InvalidEmail
Scenario Outline: Successful registration with Valid email address
	And user enters invalid "<emailAddress>"
	And user clicks on Create an account
	Then error message should be displayed
	
Examples:
	| emailAddress |
	| testmail.com |



