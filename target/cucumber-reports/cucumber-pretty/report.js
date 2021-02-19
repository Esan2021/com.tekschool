$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/DesktopsFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Retail Website Features",
  "description": "",
  "id": "retail-website-features",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12484858300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User add HP LP 3065 from Desktops tab to the cart",
  "description": "",
  "id": "retail-website-features;user-add-hp-lp-3065-from-desktops-tab-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TestNG"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click on Desktops tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click on Show all desktops",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click ADD TO CART option on ‘HP LP3065’ item",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User select quantity 1",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click add to Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 4473269700,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 1401345900,
  "status": "passed"
});
});