$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/features/GoogleSearch.feature");
formatter.feature({
  "name": "Google Searching",
  "description": "  As a web surfer,\n  I want to search Google,\n  So that I can learn new things.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Simple Google search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@web"
    },
    {
      "name": "@google"
    },
    {
      "name": "@panda"
    },
    {
      "name": "@automated"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a web browser is on the Google page",
  "keyword": "Given "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the search phrase \"1.0\" is entered",
  "keyword": "When "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results for \"panda\" are shown",
  "keyword": "Then "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});