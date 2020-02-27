Feature: CRMPro Login feature
Scenario Outline: Free CRM Login Data Driven Test Scenario
Given user is already on the login page
When the title of the login page is "CRMPRO  - CRM software for customer relationship management, sales, and support."
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on the home page
Then user clicks on contact link
Then user colse the browser

Examples: 
 | username | password |
 | Alef190187 | Au2155941186 |
 | naveenk | test@123 |
 | batchautomation | test@12345 |
