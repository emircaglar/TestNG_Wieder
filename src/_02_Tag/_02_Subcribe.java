package _02_Tag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.GeneralWebDriver;
import utilities.Tools;

public class _02_Subcribe extends GeneralWebDriver {

    @Test
    void subcribeFunction_Yes() {
        WebElement newsletterClick = driver.findElement(By.xpath("(//a[text()='Newsletter'])[1]"));
        newsletterClick.click();

        WebElement newsletterClick_Yes_button = driver.findElement(By.cssSelector("input[value='1']"));
        newsletterClick_Yes_button.click();

        WebElement newsletterClick_radio_Continue = driver.findElement(By.cssSelector("input[value='Continue']"));
        newsletterClick_radio_Continue.click();

        Tools.MessageBestätigung(driver);
    }

    @Test
    void subcribeFunction_No() {
        WebElement newsletterClick = driver.findElement(By.xpath("(//a[text()='Newsletter'])[1]"));
        newsletterClick.click();

        WebElement newsletterClick_No_button = driver.findElement(By.cssSelector("input[value='0']"));
        newsletterClick_No_button.click();

        WebElement newsletterClick_radio_Continue = driver.findElement(By.cssSelector("input[value='Continue']"));
        newsletterClick_radio_Continue.click();

        Tools.MessageBestätigung(driver);
    }

    @Test
    void subcribeFunction_No_oder_Yes() {
        WebElement newsletterClick = driver.findElement(By.xpath("(//a[text()='Newsletter'])[1]"));
        newsletterClick.click();

        WebElement newsletterClick_Yes_button = driver.findElement(By.cssSelector("input[value='0']"));
        WebElement newsletterClick_No_button = driver.findElement(By.cssSelector("input[value='1']"));

        if (newsletterClick_Yes_button.isSelected())
            newsletterClick_No_button.click();
        else
            newsletterClick_Yes_button.click();

        WebElement newsletterClick_radio_Continue = driver.findElement(By.cssSelector("input[value='Continue']"));
        newsletterClick_radio_Continue.click();

        Tools.MessageBestätigung(driver);
    }

}
