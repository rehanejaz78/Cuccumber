package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {
    public static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.getInstance().setup();
        driver= new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
