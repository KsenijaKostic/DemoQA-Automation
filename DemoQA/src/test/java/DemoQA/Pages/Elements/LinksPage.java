package DemoQA.Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LinksPage {
    public WebDriver driver;
    WebDriverWait wdwait;
    WebElement homeLink;
    WebElement homeDynamiclink;
    WebElement createdLink;
    WebElement noContentLink;
    WebElement movedLink;
    WebElement bedRequestLink;
    WebElement unauthorizedLink;
    WebElement forbiddenLink;
    WebElement notFoundLink;
    WebElement response;


    public LinksPage(WebDriver driver) {
        this.driver = driver;
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public WebElement getHomeLink() {
        return driver.findElement(By.linkText("Home"));
    }

    public WebElement getHomeDynamiclink() {
        return driver.findElement(By.id("dynamicLink"));
    }

    public WebElement getCreatedLink() {
        return driver.findElement(By.id("created"));
    }

    public WebElement getNoContentLink() {
        return driver.findElement(By.cssSelector("#no-content"));
    }

    public WebElement getMovedLink() {
        return driver.findElement(By.id("moved"));
    }

    public WebElement getBedRequestLink() {
        return driver.findElement(By.id("bad-request"));
    }

    public WebElement getUnauthorizedLink() {
        return driver.findElement(By.id("unauthorized"));
    }

    public WebElement getForbiddenLink() {
        return driver.findElement(By.id("forbidden"));
    }

    public WebElement getNotFoundLink() {
        return driver.findElement(By.id("invalid-url"));
    }

    public WebElement getResponse() {
        return driver.findElement(By.id("linkResponse"));
    }

    //-------------------------------------------------------
    public void waitVisibility(WebElement element){
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scroll(WebElement element) {
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickHomeLink(){
        getHomeLink().click();
    }

    public void clickDynamicLink(){
        getHomeDynamiclink().click();
    }

    public void clickCreatedLink(){
        getCreatedLink().click();
    }
    public void clickNoContentLink(){
        scroll(getNoContentLink());
        getNoContentLink().click();
    }
    public void clickMovedLink(){
        scroll(getMovedLink());
        getMovedLink().click();
    }
    public void clickBedRequestLink(){
        scroll(getBedRequestLink());
        getBedRequestLink().click();
    }
    public void clickUnauthorizedLink(){
        scroll(getUnauthorizedLink());
        getUnauthorizedLink().click();
    }
    public void clickForbiddenLink(){
        scroll(getForbiddenLink());
        getForbiddenLink().click();
    }
    public void clickNotFoundLink(){
        scroll(getNotFoundLink());
        getNotFoundLink().click();
    }

    public String respondMessage(){
        scroll(getResponse());
        waitVisibility(getResponse());
        return getResponse().getText();
    }
}
