package DemoQA.Test.ElementsTest;

import DemoQA.BasePage.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadDownloadTest extends BasePage {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to(homeURL);
        homePage.clickElements();
        elementsSideBar.clickOnUploadDownload();
    }

    @Test
    public void verifyThatUserCanUploadImage(){
        uploadDownloadPage.uploadFile(excelReader.getStringData("Upload", 0, 1));

        String actualPath = uploadDownloadPage.messageTextPath();
        String expectedPath = excelReader.getStringData("Messages", 4, 1);
        Assert.assertTrue(uploadDownloadPage.getMessage().isDisplayed());
        Assert.assertEquals(actualPath, expectedPath);
    }
}