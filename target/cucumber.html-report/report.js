$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AutomationPractice.feature");
formatter.feature({
  "line": 1,
  "name": "Automation",
  "description": "",
  "id": "automation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "Successful registration with Valid email address",
  "description": "",
  "id": "automation;successful-registration-with-valid-email-address",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@InvalidEmail"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user enters invalid \"\u003cemailAddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user clicks on Create an account",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "error message should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "automation;successful-registration-with-valid-email-address;",
  "rows": [
    {
      "cells": [
        "emailAddress"
      ],
      "line": 25,
      "id": "automation;successful-registration-with-valid-email-address;;1"
    },
    {
      "cells": [
        "testmail.com"
      ],
      "line": 26,
      "id": "automation;successful-registration-with-valid-email-address;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user navigates to sign in page",
  "keyword": "When "
});
formatter.match({
  "location": "Test.user_is_on_Home_page()"
});
formatter.result({
  "duration": 13721519507,
  "status": "passed"
});
formatter.match({
  "location": "Test.user_navigates_to_sign_in_page()"
});
formatter.result({
  "duration": 2760960637,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Successful registration with Valid email address",
  "description": "",
  "id": "automation;successful-registration-with-valid-email-address;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@InvalidEmail"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user enters invalid \"testmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user clicks on Create an account",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "error message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "testmail.com",
      "offset": 21
    }
  ],
  "location": "Test.user_enters_invalid(String)"
});
formatter.result({
  "duration": 74764234,
  "status": "passed"
});
formatter.match({
  "location": "Test.user_clicks_on_Create_an_account()"
});
formatter.result({
  "duration": 268007525,
  "status": "passed"
});
formatter.match({
  "location": "Test.error_message_should_be_displayed()"
});
formatter.result({
  "duration": 3075664019,
  "status": "passed"
});
});