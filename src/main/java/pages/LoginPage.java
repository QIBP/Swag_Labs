package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By username_txt = By.xpath("//input[@id='user-name']");
    By password_txt = By.xpath("//input[@id='password']");
    By login_btn = By.id("login-button");
    By backpack_item = By.xpath("//div[text()='Sauce Labs Backpack']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String username) {
        driver.findElement(username_txt).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(password_txt).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(login_btn).click();
    }

    public void verifyTheItem() {
        driver.findElement(backpack_item).isDisplayed();
    }

    public void loginValidUser(String username, String password) {
        driver.findElement(username_txt).sendKeys(username);
        driver.findElement(password_txt).sendKeys(password);
        driver.findElement(login_btn).click();
    }
}
