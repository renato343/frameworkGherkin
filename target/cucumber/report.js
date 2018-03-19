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
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: E:\\gherkin\\plugin\\chromedriver.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:534)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:32)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:137)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:329)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:88)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat com.altran.steps.GoogleSearchStep.lambda$new$0(GoogleSearchStep.java:23)\r\n\tat cucumber.runtime.java8.Java8HookDefinition.lambda$execute$0(Java8HookDefinition.java:49)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.java8.Java8HookDefinition.execute(Java8HookDefinition.java:47)\r\n\tat cucumber.runtime.HookDefinitionMatch.runStep(HookDefinitionMatch.java:17)\r\n\tat cucumber.runner.UnskipableStep.executeStep(UnskipableStep.java:22)\r\n\tat cucumber.api.TestStep.run(TestStep.java:83)\r\n\tat cucumber.api.TestCase.run(TestCase.java:58)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:80)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:99)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:41)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:108)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.step({
  "name": "the search phrase \"1.0\" is entered",
  "keyword": "When "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "results for \"panda\" are shown",
  "keyword": "Then "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/features/LoginNos.feature");
formatter.feature({
  "name": "Login in NOS customer area",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@NOS"
    }
  ]
});
formatter.scenario({
  "name": "Successful Login on Area Cliente",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@NOS"
    },
    {
      "name": "@NOS"
    }
  ]
});
formatter.step({
  "name": "I use Data from test case \"Test Case 1\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.iUseDataFromTestCase(String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat com.altran.steps.LoginSteps.iUseDataFromTestCase(LoginSteps.java:12)\r\n\tat ✽.I use Data from test case \"Test Case 1\"(src/features/LoginNos.feature:6)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "I open browser to \"Login Page\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iOpenBrowserTo(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on \"Iniciar Sessão\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iClickOn(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter \"Username\" to \"Email/Nome de utilizador\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iEnterTo(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter \"Password\" to \"Password\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iEnterTo(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on \"Entrar\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iClickOn(String)"
});
formatter.result({
  "status": "skipped"
});
});