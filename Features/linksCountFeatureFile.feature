Feature: Application login

Scenario: Validating user login
Given user chooses the chrome browser
And navigated to the link "https://qaclickacademy.com"
When counts the number of links in the bottom of the page
Then printing the links count
And closed the browser