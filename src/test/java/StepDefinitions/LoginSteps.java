package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver = null;

    @Given("User is on login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @Then("user navigated to the home page")
    public void user_navigated_to_the_home_page() {
        driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed();

    }

    @Given("Prakash is on login page")
    public void prakash_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
    }

    @When("Prakash enters {} and {}")
    public void prakashEntersAnd(String username, String password) {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }

    @And("Backpack item is available under product section in home page")
    public void backpackItemIsAvailableUnderProductSectionInHomePage() {
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).isDisplayed();
        driver.quit();
    }
}


