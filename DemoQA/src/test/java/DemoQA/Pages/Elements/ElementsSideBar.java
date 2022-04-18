package DemoQA.Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsSideBar {

    public WebDriver driver;
    WebElement textBox;
    WebElement checkBox;
    WebElement radioButton;
    WebElement webTables;
    WebElement buttons;
    WebElement links;
    WebElement brokenLinks;
    WebElement uploadDownload;
    WebElement dynamicProperties;

    public ElementsSideBar(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getTextBox() {
        return driver.findElement(By.id("item-0"));
    }

    public WebElement getCheckBox() {
        return driver.findElement(By.id("item-1"));
    }

    public WebElement getRadioButton() {
        return driver.findElement(By.id("item-2"));
    }

    public WebElement getWebTables() {
        return driver.findElement(By.id("item-3"));
    }

    public WebElement getButtons() {
        return driver.findElement(By.id("item-4"));
    }

    public WebElement getLinks() {
        return driver.findElement(By.id("item-5"));
    }

    public WebElement getBrokenLinks() {
        return driver.findElement(By.id("item-6"));
    }

    public WebElement getUploadDownload() {
        return driver.findElement(By.id("item-7"));
    }

    public WebElement getDynamicProperties() {
        return driver.findElement(By.id("item-8"));
    }

    //-------------------------------------------

    public void clickOnTextBox() {
        getTextBox().click();
    }

    public void clickOnCheckBox() {
        getCheckBox().click();
    }

    public void clickOnRadioButton() {
        getRadioButton().click();
    }

    public void clickOnWebTables() {
        getWebTables().click();
    }

    public void clickOnButtons() {
        scroll(getButtons());
        getButtons().click();
    }

    public void clickOnLinks() {
        scroll(getLinks());
        getLinks().click();
    }

    public void clickOnBrokenLinks() {
        scroll(getBrokenLinks());
        getBrokenLinks().click();
    }

    public void clickOnUploadDownload() {
        scroll(getUploadDownload());
        getUploadDownload().click();
    }

    public void clickOnDynamicProperties() {
        scroll(getDynamicProperties());
        getDynamicProperties().click();
    }

    public void scroll(WebElement element) {
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}