Feature: Home Page Feature

Background:
Given user has already logged in to application
|username|password|
|standard_user|secret_sauce|

@temp
Scenario: Home page title
Given user is on Home page
When search on homepage "T-shirts"
