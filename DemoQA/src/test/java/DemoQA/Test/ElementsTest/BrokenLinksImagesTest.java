package DemoQA.Test.ElementsTest;

import DemoQA.BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenLinksImagesTest extends BasePage {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to(homeURL);
        homePage.clickElements();
        elementsSideBar.clickOnBrokenLinks();
    }

    @Test
    public void VerifyThatThereIsValidImageOnThePage(){

        Assert.assertTrue(brokenLinksImagesPage.getValidImage().isDisplayed());
    }

    @Test
    public void verifyThatBrokenImageHaveBrokenImageSign(){

        Assert.assertTrue(brokenLinksImagesPage.getBrokenImage().isDisplayed());
    }

    @Test
    public void verifyThatUserWillBeRedirectedToNewPageWhenClicksOnValidLink(){
        brokenLinksImagesPage.clickOnValidLink();

        String actualLink = driver.getCurrentUrl();
        String expectedLink = excelReader.getStringData("URL", 0, 1);
        Assert.assertEquals(actualLink, expectedLink);
        Assert.assertTrue(homePage.getElements().get(1).isDisplayed());
    }

    @Test
    public void verifyThatUserWillBeRedirectedToBrokenPage(){
        brokenLinksImagesPage.clickOnBronekLink();

        String actualLink = driver.getCurrentUrl();
        String expectedLink = excelReader.getStringData("URL", 9, 2);
        Assert.assertEquals(actualLink, expectedLink);

    }

}
