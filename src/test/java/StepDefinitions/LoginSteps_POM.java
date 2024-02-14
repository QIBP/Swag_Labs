package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginSteps_POM {
    WebDriver driver = null;
    LoginPage login;

    @Given("User is on login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
    }

    @When("Prakash enters {} and {}")
    public void prakashEntersAnd(String username, String password) {
        login = new LoginPage(driver);
        login.enterUserName(username);
        login.enterPassword(password);
    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {

        login.clickLogin();
    }

    @Then("the backpack is available under products section")
    public void the_backpack_is_available_under_products_section() throws InterruptedException {
        login.verifyTheItem();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}


