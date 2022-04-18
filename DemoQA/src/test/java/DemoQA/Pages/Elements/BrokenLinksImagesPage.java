package DemoQA.Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrokenLinksImagesPage {

    public WebDriver driver;
    WebDriverWait wdwait;
    WebElement validImage;
    WebElement brokenImage;
    WebElement validLink;
    WebElement brokenLink;


    public BrokenLinksImagesPage(WebDriver driver) {
        this.driver = driver;
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public WebElement getValidImage() {
        return driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > img:nth-child(2)"));
    }

    public WebElement getBrokenImage() {
        WebElement brImg = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > img:nth-child(6)"));
        waitVisibility(brImg);
        return brImg;
    }

    public WebElement getValidLink() {
        return driver.findElement(By.linkText("Click Here for Valid Link"));
    }

    public WebElement getBrokenLink() {
        return driver.findElement(By.linkText("Click Here for Broken Link"));
    }

    //-----------------------------------------
    public void scroll(WebElement element) {
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void waitVisibility(WebElement element){
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickOnValidLink(){
        scroll(getValidLink());
        getValidLink().click();
    }

    public void clickOnBronekLink(){
        scroll(getBrokenLink());
        getBrokenLink().click();
    }
}