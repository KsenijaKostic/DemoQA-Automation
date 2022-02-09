package DemoQA.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    public WebDriver driver;
    List<WebElement> elements;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getElements() {
        return driver.findElements(By.className("card-body"));
    }

    //----------------------------------
    public void scroll(WebElement element) {
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickElements() {
        scroll(getElements().get(0));
        getElements().get(0).click();
    }

    public void clickForms() {
        scroll(getElements().get(1));
        getElements().get(1).click();
    }

    public void clickAlerts() {
        scroll(getElements().get(2));
        getElements().get(2).click();
    }

    public void clickWidgets() {
        scroll(getElements().get(3));
        getElements().get(3).click();
    }

    public void clickInteractions() {
        scroll(getElements().get(4));
        getElements().get(4).click();
    }

    public void clickBookStore() {
        scroll(getElements().get(5));
        getElements().get(5).click();
    }
}
