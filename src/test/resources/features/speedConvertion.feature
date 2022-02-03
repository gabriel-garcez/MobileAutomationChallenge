Feature: Speed Validation 

Scenario: Validate convertion of Mile per minute to Mile per hour 
Given the app is open in Speed
When select Mile per Minute in the first dropdown
And select Mile per hour in the second dropdown
And inform valid values to convert 
Then the convertion of Mile per minute to Mile per hour should be displayed






