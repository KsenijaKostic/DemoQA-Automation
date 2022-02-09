package DemoQA.Pages.Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class PracticeFormsPage {

    public WebDriver driver;
    WebElement firstName;
    WebElement lastName;
    WebElement email;
    WebElement maleGender;
    WebElement femaleGender;
    WebElement otherGender;
    WebElement mobileNumber;
    WebElement subject;
    WebElement sport;
    WebElement reading;
    WebElement music;
    WebElement uploadPicture;
    WebElement currentAddress;
    WebElement state;
    WebElement city;
    WebElement submitButton;

    public PracticeFormsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getMobileNumber() {
        return driver.findElement(By.id("userNumber"));
    }

    public WebElement getMaleGender() {
        return driver.findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label"));
    }

    public WebElement getFemaleGender() {
        return driver.findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(2) > label"));
    }

    public WebElement getOtherGender() {
        return driver.findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(3) > label"));
    }


//calendar



    public WebElement getSubject() {
        return driver.findElement(By.cssSelector("#subjectsContainer"));
    }

    public WebElement getSport() {
        return driver.findElement(By.cssSelector("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label"));
    }

    public WebElement getReading() {
        return driver.findElement(By.cssSelector("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(2) > label"));
    }

    public WebElement getMusic() {
        return driver.findElement(By.cssSelector("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(3) > label"));
    }

    public WebElement getUploadPicture() {
        return driver.findElement(By.id("uploadPicture"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getState() {
        return driver.findElement(By.id("state"));
    }

    public WebElement getCity() {
        return driver.findElement(By.id("city"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }


    //---------------------------------------------------

    public void scroll(WebElement element) {
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void inputFirstName(String name){
        getFirstName().clear();
        getFirstName().sendKeys(name);
    }

    public void inputLastName(String lname){
        getLastName().clear();
        getLastName().sendKeys(lname);
    }

    public void inputEmail(String mail){
        getEmail().clear();
        getEmail().sendKeys(mail);
    }

    public void selectMaleGender(){
        getMaleGender().click();
    }

    public void selectFemaleGender(){
        getFemaleGender().click();
    }

    public void selectOtherGender(){
        getOtherGender().click();
    }

    public void inputPhoneNumber(String number){
        getMobileNumber().clear();
        getMobileNumber().sendKeys(number);
    }


    //calendar


    public void inputSubject(String subject){
        getSubject().click();
        getSubject().sendKeys(subject);
        //getSubject().sendKeys(ENTER);
    }

    public void selectSport(){
        getSport().click();
    }

    public void selectReading(){
        getReading().click();
    }

    public void selectMusic(){
        getMusic().click();
    }

    public void uploadPicture(String path){
        scroll(getUploadPicture());
        getUploadPicture().sendKeys(path);
    }

    public void inputCurrentAddress(String address){
        scroll(getCurrentAddress());
        getCurrentAddress().clear();
        getCurrentAddress().sendKeys(address);
    }

    public void chooseState() throws InterruptedException {
        //State i City sam probala na 20 nacina da uradim. select nece da radi jer ne postoji tag koji kaze da je to padajuca lista/meni
        //Pokusacu ovo da resim dok radim projekat na dalje. probala sam i sa petljom da prodjem kroz listu, medjutim on listu uopste ne vidi.
        //promenila sam i 10ak lokatora, ali i sa promenom se isto desava.
        scroll(getState());
        //getState().click();
       // getState().clear();
       // getState().sendKeys(stat);
        getState().click();
        Thread.sleep(1000);

        getState().sendKeys(ENTER);
    }

    public void chooseCity() throws InterruptedException {
        scroll(getCity());
        //Select city = new Select(getCity());
        //city.selectByValue(citi);
        getCity().click();
        Thread.sleep(1000);
        getCity().sendKeys(ENTER);
    }

    public void clickSubmit(){
        scroll(getSubmitButton());
        getSubmitButton().click();
    }
}
