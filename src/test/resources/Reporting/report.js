$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cancel.feature");
formatter.feature({
  "line": 1,
  "name": "Cancel Booking functionalites",
  "description": "",
  "id": "cancel-booking-functionalites",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Cancel current booking",
  "description": "",
  "id": "cancel-booking-functionalites;cancel-current-booking",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is on Adactin page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Shld enter \"\u003cusername\u003e\",\"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click Booked itinery",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enter \"\u003cbooking\u003e\" click go, click radio button ,click cancel",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "cancel-booking-functionalites;cancel-current-booking;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "booking"
      ],
      "line": 10,
      "id": "cancel-booking-functionalites;cancel-current-booking;;1"
    },
    {
      "cells": [
        "arunuvan",
        "JYN144",
        "AQL0ZDF049"
      ],
      "line": 11,
      "id": "cancel-booking-functionalites;cancel-current-booking;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Cancel current booking",
  "description": "",
  "id": "cancel-booking-functionalites;cancel-current-booking;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is on Adactin page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Shld enter \"arunuvan\",\"JYN144\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click Booked itinery",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enter \"AQL0ZDF049\" click go, click radio button ,click cancel",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsNew.user_is_on_Adactin_page()"
});
formatter.result({
  "duration": 11225820788,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "arunuvan",
      "offset": 17
    },
    {
      "val": "JYN144",
      "offset": 28
    }
  ],
  "location": "LoginStepsNew.user_Shld_enter(String,String)"
});
formatter.result({
  "duration": 2401829155,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepsNew.click_Booked_itinery()"
});
formatter.result({
  "duration": 732723675,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AQL0ZDF049",
      "offset": 12
    }
  ],
  "location": "LoginStepsNew.user_enter_click_go_click_radio_button_click_cancel(String)"
});
formatter.result({
  "duration": 10116712837,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d(//input[@type\u003d\u0027checkbox\u0027])[2]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LUMIA_COMP\u0027, ip: \u0027192.168.42.13\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat com.runner.BaseClass.click(BaseClass.java:35)\r\n\tat org.sub.Itinerary.itinePg(Itinerary.java:33)\r\n\tat org.stepdefinition.LoginStepsNew.user_enter_click_go_click_radio_button_click_cancel(LoginStepsNew.java:52)\r\n\tat ✽.And User enter \"AQL0ZDF049\" click go, click radio button ,click cancel(cancel.feature:7)\r\n",
  "status": "failed"
});
});