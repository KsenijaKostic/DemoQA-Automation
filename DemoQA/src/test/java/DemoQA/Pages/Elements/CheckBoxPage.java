package DemoQA.Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckBoxPage {

    public WebDriver driver;

    List<WebElement> uncheckedCheckboxes;
    List<WebElement> checkedCheckboxes;
    WebElement homeCB;
    WebElement desktopCB;
    List<WebElement> arrow;
    List<WebElement> openArrow;
    WebElement result;

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getUncheckedCheckboxes() {
        return driver.findElements(By.cssSelector(".rct-icon.rct-icon-uncheck"));
    }

    public List<WebElement> getCheckedCheckboxes() {
        return driver.findElements(By.cssSelector(".rct-icon.rct-icon-check"));
    }

    public List<WebElement> getArrow() {
        return driver.findElements(By.cssSelector(".rct-collapse.rct-collapse-btn"));
    }

    public List<WebElement> getOpenArrow() {
        return driver.findElements(By.cssSelector(".rct-icon.rct-icon-expand-open"));
    }

    public WebElement getResult() {
        return driver.findElement(By.id("result"));
    }

    public WebElement getHomeCB() {
        return driver.findElement(By.cssSelector("#tree-node > ol > li > span > label"));
    }

    public WebElement getDesktopCB() {
        return driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > span > label"));
    }

    //---------------------------------------------------------
    public void scroll(WebElement element) {
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickOnArrow(int i) {
        scroll(getArrow().get(i-1));
        getArrow().get(i - 1).click();
    }

    public String openedArrow(int i){
        scroll(getOpenArrow().get(i-1));
        return getOpenArrow().get(i-1).getAttribute("class");
    }

    public void clickOnHomeCheckbox(){
        getHomeCB().click();
    }

    public void clickOnDesktopCheckbox(){
        getDesktopCB().click();
    }

    public String textResult(){
        return getResult().getText();
    }
}
