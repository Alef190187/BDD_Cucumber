Feature: Free Crm Pro Create new Contacts with dataTable feature

Scenario: Free Crm Pro Create new Contacts dataTable scenario

Given user should be login page
When the login page title is "CRMPRO"
Then user enters valid username and password
 | username | password |
 | Alef190187 | Au2155941186 |
 | batchautomation | test@12345 |
Then user hits on the login button
Then user clicks on New Contacts link
Then user enters firstname and lastname and position
 | firstname | lastname | position |
 | Shahin | Alam | QA |
 | Uddin | Alef | Manager | 
 | Ripon | Shipon | QA Lead |
Then user hits on the save button
Then user quite the browser.


