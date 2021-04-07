Feature: Login functionality unhappy path

Scenario Outline: Verify login with invalid username and password
Given Open application
When I click on login button
Then I enter "<username>" and "<password>"
And I should see following message

Examples:
|username| password|
|pichi| 123 |
|selenium1986|Selenium1986|
|8989| 787878|

 