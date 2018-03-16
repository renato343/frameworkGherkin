package com.altran.steps;

import com.altran.excelReader.ExcelReader;
import com.altran.pages.GooglePage;
import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleSearchStep implements En {

    private WebDriver driver;
    private GooglePage googlePage;

    // Warning: Make sure the timeouts for hooks using a web driver are zero

    public GoogleSearchStep() {
        Before(new String[]{"@web"}, 0, 1, (Scenario scenario) -> {
            System.setProperty("webdriver.chrome.driver", "E:\\gherkin\\plugin\\chromedriver.exe");
            driver = new ChromeDriver();
        });
        Before(new String[]{"@google"}, 0, 10, (Scenario scenario) -> {
            googlePage = new GooglePage(driver);
        });
        Given("^a web browser is on the Google page$", () -> {
            googlePage.navigateToHomePage();
        });
        When("^the search phrase \"([^\"]*)\" is entered$", (String phrase) -> {
            googlePage.enterSearchPhrase(phrase);
        });
        Then("^results for \"([^\"]*)\" are shown$", (String phrase) -> {
            assertThat(googlePage.pageTitleContains(phrase)).isTrue();
        });
        After(new String[]{"@web"}, (Scenario scenario) -> {
            driver.quit();
        });
    }
}
