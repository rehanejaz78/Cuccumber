package StepDefination;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static StepDefination.Hook.driver;

public class Steps {


    //@Given if we have multiple given statements
    @Given("As a user I am on the login page")
    public void as_a_user_i_am_on_the_login_page() {
        System.out.println("My first test");

        driver.get("https://parabank.parasoft.com/parabank/index.html");
        driver.manage().window().maximize();
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        driver.findElement(By.name("username")).sendKeys("testuser");
        driver.findElement(By.name("password")).sendKeys("password");

    }

    @And("I click on the Login button")
    public void i_click_on_the_login_button() {

        driver.findElement(By.cssSelector("input[value='Log In']")).click();
    }

    @Then("I should be taken to overview page")
    public void i_should_be_taken_to_overview_page() throws InterruptedException {

        Thread.sleep(5000);
       String text =driver.findElement(By.cssSelector(".title")).getText();
        Assert.assertEquals("Accounts Overview",text);

        Thread.sleep(2000);
        driver.findElement(By.linkText("Log Out")).click();
    }

    //google steps

    @Given("As a user I opened browser")
    @Given("browser is launched")
    public void as_a_user_i_opened_browser() {
        driver.get("https://www.google.com");
    }

    @When("I enter {string} in search bar")
    public void i_enter_in_search_bar(String string) {
        driver.findElement(By.name("q")).sendKeys(string);
    }

    @When("I click on the search button")
    @And("I click search button")
    public void i_click_on_the_search_button() {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("I should be taken to reult page")
    @Then("I should be taken to gmail page")
    public void i_should_be_taken_to_reult_page() throws InterruptedException {

        Thread.sleep(2000);
        System.out.println("I am on the result page");

        driver.get("https://mail.google.com");

    }

    // gmail steps

    @When("I type in search bar")
    public void i_type_gmail_com_in_search_bar() {
        driver.findElement(By.name("q")).sendKeys("gmail");
    }



}
