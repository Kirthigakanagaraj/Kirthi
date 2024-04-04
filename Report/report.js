$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/fbregistration.feature");
formatter.feature({
  "name": "To validate the account creation of fb application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@feature2"
    }
  ]
});
formatter.scenario({
  "name": "To create new account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature2"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "To launch the browser and maximise the window",
  "keyword": "Given "
});
formatter.match({
  "location": "Fbcreateaccount.to_launch_the_browser_and_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch url of fb application",
  "keyword": "When "
});
formatter.match({
  "location": "Fbcreateaccount.to_launch_url_of_fb_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the creat new button button",
  "keyword": "And "
});
formatter.match({
  "location": "Fbcreateaccount.to_click_the_creat_new_button_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass firstname in firstname text box",
  "rows": [
    {
      "cells": [
        "Selenium",
        "Python",
        "Java",
        "PHP",
        "React Native"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Fbcreateaccount.to_pass_firstname_in_firstname_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass second name in second text box",
  "keyword": "And "
});
formatter.match({
  "location": "Fbcreateaccount.to_pass_second_name_in_second_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass mobileno or email in email text box",
  "rows": [
    {
      "cells": [
        "kirthi@gmail.com",
        "8976056432",
        "jay@gmail.com",
        "9876549870"
      ]
    },
    {
      "cells": [
        "keerthu@gmail.com",
        "9345637289",
        "gokul@gmail.com",
        "9876543982"
      ]
    },
    {
      "cells": [
        "gopika@gmail.com",
        "8756493620",
        "9876504353",
        "9870654325"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Fbcreateaccount.to_pass_mobileno_or_email_in_email_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To create new password using new password text box",
  "keyword": "And "
});
formatter.match({
  "location": "Fbcreateaccount.to_create_new_password_using_new_password_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to close the edge browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Fbcreateaccount.to_close_the_edge_browser()"
});
formatter.result({
  "status": "passed"
});
});