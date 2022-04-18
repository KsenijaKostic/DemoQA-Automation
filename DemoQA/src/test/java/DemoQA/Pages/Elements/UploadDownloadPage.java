package DemoQA.Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadDownloadPage {

    public WebDriver driver;
    WebElement downloadButton;
    WebElement upload;
    WebElement message;

    public UploadDownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDownloadButton() {
        return driver.findElement(By.id("downloadButton"));
    }

    public WebElement getUpload() {
        return driver.findElement(By.id("uploadFile"));
    }

    public WebElement getMessage() {
        return driver.findElement(By.id("uploadedFilePath"));
    }

    //------------------------------------------

    public void clickDownload(){
        getDownloadButton().click();
    }

    public void uploadFile(String upload){
        getUpload().sendKeys(upload);
    }

    public String messageTextPath(){
        return getMessage().getText();
    }
}