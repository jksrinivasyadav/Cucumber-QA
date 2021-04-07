@test2
Feature: Register with valid credentials
Scenario: Verify user can register
Given I m app homepage and click on login bttn
When I type valid user <username> and <password>

Scenario: Verify user can login
Given I access following site
When user <emailuser> and <passcred>
Then I should login successfully


