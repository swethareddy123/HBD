Feature: Hotel Login Functionality
Scenario: Username Password not entered
Given User is on Login Page
When username and password is blank
Then Display error message 'Please enter Username'

Scenario: password is blank
Given User is on Login Page
When username is given but password is blank
Then Display error message 'Please enter password'

Scenario: Invalid Login
Given User is on Login Page
When username and password are invalid
Then Display alert message 'Invalid login'

Scenario: Valid Login
Given User is on Login Page
When username and password are valid
Then go to registration form