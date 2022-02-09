package DemoQA.Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage {

    public WebDriver driver;
    WebElement yessRB;
    WebElement impressiveRB;
    WebElement noRB;
    WebElement message;

    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getYessRB() {
        return driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div:nth-child(2) > label")); //div.custom-control:nth-child(2) > label:nth-child(2)
    }

    public WebElement getImpressiveRB() {
        return driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div:nth-child(3) > label"));
    }

    public WebElement getNoRB() {
        return driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div.custom-control.disabled.custom-radio.custom-control-inline"));
    }

    public WebElement getMessage() {
        return driver.findElement(By.className("text-success"));
    }

    //---------------------------------------------------

    public void clickYesRadioButton(){
        getYessRB().click();
    }

    public void clickImpressiveRadioButton(){
        getImpressiveRB().click();
    }

    public void clickNoRadioButton(){
        getNoRB().click();
    }

    public String message(){
        return getMessage().getText();
    }

}
