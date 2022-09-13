Feature: Account Page Feature

Background:
Given user has already logged in to application
|username|password|
|standard_user|secret_sauce|

@accounts
Scenario: Accounts page title
Given user is on Home page
When user gets the title of the page
Then page title should be "My account - My Store"


