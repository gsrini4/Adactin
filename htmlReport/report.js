$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Login Adactin application",
  "description": "",
  "id": "login-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User login adatin application",
  "description": "",
  "id": "login-adactin-application;user-login-adatin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User navigate to adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters username as \"SowmiyaSrini\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters password as \"Sowmiya\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User valid the username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User click login button",
  "keyword": "And "
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
});