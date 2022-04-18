package DemoQA.Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ButtonsPage {
    public WebDriver driver;
    List<WebElement> Buttons;

    WebElement message1;
    WebElement message2;
    WebElement message3;

    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getButtons() {
        return driver.findElements(By.cssSelector(".btn.btn-primary"));
    }

    public WebElement getMessage1() {
        return driver.findElement(By.id("doubleClickMessage"));
    }

    public WebElement getMessage2() {
        return driver.findElement(By.id("rightClickMessage"));
    }

    public WebElement getMessage3() {
        return driver.findElement(By.id("dynamicClickMessage"));
    }

    //--------------------------------------------------------

    public void dubleClickButton(int i){
        Actions doubleC = new Actions(driver);
        doubleC.doubleClick(getButtons().get(i-1)).perform();
    }

    public void rightClickButton(int i){
        Actions rightC = new Actions(driver);
        rightC.contextClick(getButtons().get(i-1)).perform();
    }

    public void clickOnButton(int i){
        Actions click = new Actions(driver);
        click.click(getButtons().get(i-1)).perform();
    }

    public String getMessageForDoubleClick(){
        return getMessage1().getText();
    }

    public String getMessageForRightClick(){
        return getMessage2().getText();
    }

    public String getMesageGorClick(){
        return getMessage3().getText();
    }
}