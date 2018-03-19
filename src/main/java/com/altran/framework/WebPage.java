package com.altran.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class WebPage {

    private WebDriver driver;
    private By OBJECT_XPATH;

    public WebPage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return driver;
    }

    protected WebDriverWait driverWait(long timeoutSeconds) {
        return new WebDriverWait(driver, timeoutSeconds);
    }

    public void navigate(String path) {
        driver.navigate().to(path);
    }

    public void FillField(String xpath, String phrase){

        OBJECT_XPATH = By.xpath(xpath);
        WebElement obj = driverWait(10).until(ExpectedConditions.elementToBeClickable(OBJECT_XPATH));
        obj.sendKeys(phrase);
        obj.submit();
    }

    public void WaitAndClick(String xpath){

        OBJECT_XPATH = By.xpath(xpath);
        WebElement obj = driverWait(10).until(ExpectedConditions.elementToBeClickable(OBJECT_XPATH));
        obj.click();
    }

}
