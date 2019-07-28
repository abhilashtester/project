Feature: User should be able to search the flight 

@Test123
Scenario Outline: Search Flight Details and list

Given user is on Emirates site
When user enter "<Departure Airport>" and "<Arrival airport>"
When user enter Departure Date "<Dep Date>"
When user enter Arrival Date "<Arrival Date>"
And Click on seach flight button
Then user is able to see the all flight list
Then close the browser

Examples:
       |Departure Airport|Arrival airport|Dep Date|Arrival date|
       |Dubai|Mumbai|25 Aug|18 Sep|

