package DemoQA.Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage {

    public WebDriver driver;
    WebElement name;
    WebElement email;
    WebElement currentAddress;
    WebElement permanentAddress;
    WebElement submitButton;
    WebElement message;
    WebElement errorForm;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getMessage() {
        return driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12"));
    }

    public WebElement getErrorForm() {
        return driver.findElement(By.cssSelector(".field-error.form-control"));
    }
//--------------------------------------------------

    public void scroll(WebElement element){
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void inputFullName(String namee){
        getName().clear();
        getName().sendKeys(namee);
    }

    public void inputEmail(String emaill){
        getEmail().clear();
        getEmail().sendKeys(emaill);
    }

    public void inputCurrentAddress(String address){
        getCurrentAddress().clear();
        getCurrentAddress().sendKeys(address);
    }
    public void inputPermanentAddress(String addres){
        getPermanentAddress().clear();
        getPermanentAddress().sendKeys(addres);
    }

    public void clickSubmit(){
        scroll(getSubmitButton());
        getSubmitButton().click();
    }



}
