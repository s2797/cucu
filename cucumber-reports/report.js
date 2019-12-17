$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:cucu3/cucu3.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "New User SignUp",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@unit"
    }
  ]
});
formatter.step({
  "name": "User navigates to the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_navigates_to_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enters the username \"lalitha\" and Enter the password 123",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.enters_the_username_and_Enter_the_password(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_clicks_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is taken to Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_is_taken_to_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Existing User",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@unit"
    }
  ]
});
formatter.step({
  "name": "User enters user name",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_enters_user_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_enters_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page is dispalyed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.home_page_is_dispalyed()"
});
formatter.result({
  "status": "passed"
});
});