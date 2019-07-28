$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Java Selenium/ProjectCode/BDDCucumberFramework/src/test/java/Features/HomePage.feature");
formatter.feature({
  "name": "User should be able to search the flight",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test123"
    }
  ]
});
formatter.step({
  "name": "user is on Emirates site",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter \"\u003cDeparture Airport\u003e\" and \"\u003cArrival airport\u003e\"",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Departure Airport",
        "Arrival airport"
      ]
    },
    {
      "cells": [
        "Dubai",
        "Mumbai"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test123"
    }
  ]
});
formatter.step({
  "name": "user is on Emirates site",
  "keyword": "Given "
});
formatter.match({
  "location": "FlightSearchStepDef.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"Dubai\" and \"Mumbai\"",
  "keyword": "When "
});
formatter.match({
  "location": "FlightSearchStepDef.userEnterDepartureAndArrivalAirport(String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d75.0.3770.142)\nBuild info: version: \u00273.141.0\u0027, revision: \u00272ecb7d9a\u0027, time: \u00272018-10-31T20:09:30\u0027\nSystem info: host: \u0027LKNDSS2V7CLQ2\u0027, ip: \u0027172.21.234.49\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 75.0.3770.142, chrome: {chromedriverVersion: 75.0.3770.90 (a6dcaf7e3ec6f..., userDataDir: C:\\Users\\P10468~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:50179}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: a61254d6e695d704c8b90d15e8812b43\n*** Element info: {Using\u003dname, value\u003dDeparture airport}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:404)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:284)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy13.click(Unknown Source)\r\n\tat pageObject.FlightSearch.DeptArrivalFlight(FlightSearch.java:65)\r\n\tat StepDefinition.FlightSearchStepDef.userEnterDepartureAndArrivalAirport(FlightSearchStepDef.java:40)\r\n\tat ✽.user enter \"Dubai\" and \"Mumbai\"(C:/Java Selenium/ProjectCode/BDDCucumberFramework/src/test/java/Features/HomePage.feature:22)\r\n",
  "status": "failed"
});
});