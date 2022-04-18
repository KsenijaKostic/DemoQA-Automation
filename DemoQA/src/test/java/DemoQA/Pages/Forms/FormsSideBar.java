package DemoQA.Pages.Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormsSideBar {
    public WebDriver driver;
    WebElement practiceForms;

    public FormsSideBar(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getPracticeForms() {
        return driver.findElement(By.cssSelector(".btn.btn-light.active"));
    }
    //---------------------------------
    public void clickPracticeForms(){
        getPracticeForms().getText();
        getPracticeForms().click();
    }
}