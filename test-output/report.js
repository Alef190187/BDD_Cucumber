$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/alef1/eclipse-workspace/BDD_Cucumber/src/main/java/Feature/createContacts.feature");
formatter.feature({
  "line": 1,
  "name": "Free Crm Pro Create new Contacts with dataTable feature",
  "description": "",
  "id": "free-crm-pro-create-new-contacts-with-datatable-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free Crm Pro Create new Contacts dataTable scenario",
  "description": "",
  "id": "free-crm-pro-create-new-contacts-with-datatable-feature;free-crm-pro-create-new-contacts-datatable-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user should be login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the login page title is \"CRMPRO\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters valid username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "Alef190187",
        "Au2155941186"
      ],
      "line": 9
    },
    {
      "cells": [
        "batchautomation",
        "test@12345"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user hits on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on New Contacts link",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters firstname and lastname and position",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "position"
      ],
      "line": 14
    },
    {
      "cells": [
        "Shahin",
        "Alam",
        "QA"
      ],
      "line": 15
    },
    {
      "cells": [
        "Uddin",
        "Alef",
        "Manager"
      ],
      "line": 16
    },
    {
      "cells": [
        "Ripon",
        "Shipon",
        "QA Lead"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user hits on the save button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user quite the browser.",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContacts.user_should_be_login_page()"
});
formatter.result({
  "duration": 10232867000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CRMPRO",
      "offset": 25
    }
  ],
  "location": "CreateContacts.the_login_page_title_is(String)"
});
formatter.result({
  "duration": 21506900,
  "status": "passed"
});
formatter.match({
  "location": "CreateContacts.user_enters_valid_username_and_password(DataTable)"
});
formatter.result({
  "duration": 1300505100,
  "status": "passed"
});
formatter.match({
  "location": "CreateContacts.user_hits_on_the_login_button()"
});
formatter.result({
  "duration": 2697151100,
  "status": "passed"
});
formatter.match({
  "location": "CreateContacts.user_clicks_on_New_Contacts_link()"
});
formatter.result({
  "duration": 1682319500,
  "status": "passed"
});
formatter.match({
  "location": "CreateContacts.user_enters_firstname_and_lastname_and_position(DataTable)"
});
formatter.result({
  "duration": 9121391300,
  "status": "passed"
});
formatter.match({
  "location": "CreateContacts.user_hits_on_the_save_button()"
});
formatter.result({
  "duration": 281329900,
  "status": "passed"
});
formatter.match({
  "location": "CreateContacts.user_quite_the_browser()"
});
formatter.result({
  "duration": 1019184300,
  "status": "passed"
});
});