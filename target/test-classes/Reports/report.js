$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature Files/Adactin.feature");
formatter.feature({
  "name": "verifing the adactin webpage",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Hotelfunctionality"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify the login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is in Adactin page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks login button",
  "keyword": "And "
});
formatter.step({
  "name": "User verify sucess message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "chrisgreen10",
        "ipl2021csk"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Hotelfunctionality"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in Adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinSteps.user_is_in_Adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"chrisgreen10\" and \"ipl2021csk\"",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinSteps.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks login button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinSteps.user_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify sucess message",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinSteps.user_verify_sucess_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify the search hotel page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Select \"\u003cLocation\u003e\"and\"\u003cHotels\u003e\"and\"\u003cRoom Type\u003e\"and\"\u003cNumber of Rooms\u003e\"and\"\u003cAdults per Room\u003e\"and\"\u003cChildren per Room\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click search button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Location",
        "Hotels",
        "Room Type",
        "Number of Rooms",
        "Adults per Room",
        "Children per Room"
      ]
    },
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Standard",
        "1 - One",
        "1 - One",
        "1 - One"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the search hotel page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Hotelfunctionality"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Select \"Sydney\"and\"Hotel Creek\"and\"Standard\"and\"1 - One\"and\"1 - One\"and\"1 - One\"",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinSteps.user_Select_and_and_and_and_and(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click search button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinSteps.user_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the Select Hotel Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Hotelfunctionality"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User select the hotel",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinSteps.user_select_the_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinSteps.user_click_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify the search hotel page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enter \"\u003cFirst Name\u003e\"and\"\u003cLast Name\u003e\"and\"\u003cBilling Address\u003e\"and\"\u003cCredit Card No\u003e\"and\"\u003cCredit Card Type\u003e\"and\"\u003cSelect month\u003e\"and\"\u003cSelect year\u003e\"and\"\u003cCVV Number\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click booknow button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Billing Address",
        "Credit Card No",
        "Credit Card Type",
        "Select month",
        "Select year",
        "CVV Number"
      ]
    },
    {
      "cells": [
        "chris",
        "green10",
        "Chennai",
        "1234567890123456",
        "VISA",
        "January",
        "2022",
        "123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the search hotel page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Hotelfunctionality"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enter \"chris\"and\"green10\"and\"Chennai\"and\"1234567890123456\"and\"VISA\"and\"January\"and\"2022\"and\"123\"",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinSteps.user_enter_and_and_and_and_and_and_and(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click booknow button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinSteps.user_click_booknow_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify booking confirmation page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Hotelfunctionality"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in bokoking confirmation page",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinSteps.user_is_in_bokoking_confirmation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinSteps.user_clicks_logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});