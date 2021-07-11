package _01_Tag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.GeneralWebDriver;

import java.util.concurrent.TimeUnit;

public class _03_Beispiel extends GeneralWebDriver {

    @Test
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

    @Test
    void testAssertAccount() {

        WebElement accoutCheck = driver.findElement(By.cssSelector("div[id='content']>h2"));
        Assert.assertEquals(accoutCheck.getText(), "My Account");

    }
}
