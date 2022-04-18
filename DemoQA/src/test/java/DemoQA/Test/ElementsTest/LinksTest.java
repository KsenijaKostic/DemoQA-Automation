package DemoQA.Test.ElementsTest;

import DemoQA.BasePage.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinksTest extends BasePage {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to(homeURL);
        homePage.clickElements();
        elementsSideBar.clickOnLinks();
    }

    @Test
    public void verifyThatUserCanClickOnCreatedLink() {
        linksPage.clickCreatedLink();
        Assert.assertEquals(linksPage.respondMessage(), excelReader.getStringData("Messages", 3, 1));
    }

    @Test
    public void verifyThatUserCanClickOnNoContentLink() {
        linksPage.clickNoContentLink();
        String respondedMessage = linksPage.respondMessage();
        String expectedResponse = excelReader.getStringData("Messages", 3, 2);
        Assert.assertEquals(respondedMessage, expectedResponse);
    }

    @Test
    public void verifyThatUserCanClickOnMovedLink() {
        linksPage.clickMovedLink();
        String actualMessage = linksPage.respondMessage();
        String expectedMessage = excelReader.getStringData("Messages", 3, 3);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void verifyThatUserCanClickOnBadRequestLink() {
        linksPage.clickBedRequestLink();
        String actualMessage = linksPage.respondMessage();
        String expectedMessage = excelReader.getStringData("Messages", 3, 4);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void verifyThatUserCanClickOnUnautorizedLink() {
        linksPage.clickUnauthorizedLink();;
        String actualMessage = linksPage.respondMessage();
        String expectedMessage = excelReader.getStringData("Messages", 3, 5);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void verifyThatUserCanClickOnForbiddenLink() {
        linksPage.clickForbiddenLink();
        String actualMessage = linksPage.respondMessage();
        String expectedMessage = excelReader.getStringData("Messages", 3, 6);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void verifyThatUserCanClickOnNotFoundLink() {
        linksPage.clickNotFoundLink();
        String actualMessage = linksPage.respondMessage();
        String expectedMessage = excelReader.getStringData("Messages", 3, 7);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void verifyThatUserCanClickOnAllAPILinksFromFirstToLast() throws InterruptedException {
        linksPage.clickCreatedLink();
        Thread.sleep(500);
        Assert.assertEquals(linksPage.respondMessage(), excelReader.getStringData("Messages", 3, 1));
        linksPage.clickNoContentLink();
        Thread.sleep(500);
        String respondedMessage = linksPage.respondMessage();
        String expectedResponse = excelReader.getStringData("Messages", 3, 2);
        Assert.assertEquals(respondedMessage, expectedResponse);
        linksPage.clickMovedLink();
        Thread.sleep(500);
        String actualMessage = linksPage.respondMessage();
        String expectedMessage = excelReader.getStringData("Messages", 3, 3);
        Assert.assertEquals(actualMessage, expectedMessage);
        linksPage.clickBedRequestLink();
        Thread.sleep(500);
        String actualMessage1 = linksPage.respondMessage();
        String expectedMessage1 = excelReader.getStringData("Messages", 3, 4);
        Assert.assertEquals(actualMessage1, expectedMessage1);
        linksPage.clickUnauthorizedLink();
        Thread.sleep(500);
        String actualMessage2 = linksPage.respondMessage();
        String expectedMessage2 = excelReader.getStringData("Messages", 3, 5);
        Assert.assertEquals(actualMessage2, expectedMessage2);
        linksPage.clickForbiddenLink();
        Thread.sleep(500);
        String actualMessage3 = linksPage.respondMessage();
        String expectedMessage3 = excelReader.getStringData("Messages", 3, 6);
        Assert.assertEquals(actualMessage3, expectedMessage3);
        linksPage.clickNotFoundLink();
        Thread.sleep(500);
        String actualMessage4 = linksPage.respondMessage();
        String expectedMessage4 = excelReader.getStringData("Messages", 3, 7);
        Assert.assertEquals(actualMessage4, expectedMessage4);
    }
}