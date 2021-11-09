Feature: Application login

Scenario Outline: Validating user login
Given user enters the chrome browser
And navigated to the "https://qaclickacademy.com"
When user enters the <username> and <password> and login
Then validating the home page displayed 
And close the browser

Examples:
|username											|password 					|
|madhu4641999@gmail.com				|123456							|
|madhu19991999@gmail.com			|Herohonda@990	  	|

