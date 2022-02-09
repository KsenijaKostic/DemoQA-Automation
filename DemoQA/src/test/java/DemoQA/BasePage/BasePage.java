package DemoQA.BasePage;

import DemoQA.Pages.Elements.*;
import DemoQA.Pages.Forms.FormsSideBar;
import DemoQA.Pages.Forms.PracticeFormsPage;
import DemoQA.Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public String homeURL;
    public HomePage homePage;
    public ElementsSideBar elementsSideBar;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
    public WebTablesPage webTablesPage;
    public ButtonsPage buttonsPage;
    public LinksPage linksPage;
    public BrokenLinksImagesPage brokenLinksImagesPage;
    public UploadDownloadPage uploadDownloadPage;
    public FormsSideBar formsSideBar;
    public PracticeFormsPage practiceFormsPage;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        excelReader = new ExcelReader("C:\\Users\\Xenia\\IdeaProjects\\DemoQA\\src\\test\\java\\DemoQA\\DemoQa.xlsx");
        homeURL = excelReader.getStringData("URL", 0, 1);
        homePage = new HomePage(driver);
        elementsSideBar = new ElementsSideBar(driver);
        textBoxPage = new TextBoxPage(driver);
        checkBoxPage = new CheckBoxPage(driver);
        radioButtonPage = new RadioButtonPage(driver);
        webTablesPage = new WebTablesPage(driver);
        buttonsPage = new ButtonsPage(driver);
        linksPage = new LinksPage(driver);
        brokenLinksImagesPage = new BrokenLinksImagesPage(driver);
        uploadDownloadPage = new UploadDownloadPage(driver);
        formsSideBar = new FormsSideBar(driver);
        practiceFormsPage = new PracticeFormsPage(driver);

    }

    @AfterClass
    public void tearDown(){
       /* driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();*/
    }


}
