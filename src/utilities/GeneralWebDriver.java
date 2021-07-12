package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class GeneralWebDriver {

    public static WebDriver driver;

    @BeforeClass
    public void anfangAktionen() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        Login();

    }

    @AfterClass
    public void schlussAktionen() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       //driver.quit();

    }

    void Login() {
        WebElement inputEmail = driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("asd@gmail.com");

        WebElement inputPassword = driver.findElement(By.id("input-password"));
        inputPassword.sendKeys("123qweasd");

        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Login']"));
        loginButton.click();

        WebElement loginButtonCheck = driver.findElement(By.id("details-button"));
        loginButtonCheck.click();

        WebElement loginButtonCheck2 = driver.findElement(By.id("proceed-link"));
        loginButtonCheck2.click();
    }


}
