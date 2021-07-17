package _02_Tag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.GeneralWebDriver;
import utilities.Tools;

public class _02_Subcribe extends GeneralWebDriver {

    By link = By.xpath("(//a[text()='Newsletter'])[1]");
    By cont = By.cssSelector("input[value='Continue']");
    By yes = By.cssSelector("input[value='1']");
    By no = By.cssSelector("input[value='0']");
    // das ist wie POM (page object model)


    @Test(priority = 1)
    void subcribeFunction_Yes() {
        WebElement newsletterClick = driver.findElement(link);
        newsletterClick.click();

        WebElement newsletterClick_Yes_button = driver.findElement(yes);
        newsletterClick_Yes_button.click();

        WebElement newsletterClick_radio_Continue = driver.findElement(cont);
        newsletterClick_radio_Continue.click();

        Tools.MessageBestätigung(driver);
    }

    @Test(priority = 2)
    void subcribeFunction_No() {
        WebElement newsletterClick = driver.findElement(link);
        newsletterClick.click();

        WebElement newsletterClick_No_button = driver.findElement(no);
        newsletterClick_No_button.click();

        WebElement newsletterClick_radio_Continue = driver.findElement(cont);
        newsletterClick_radio_Continue.click();

        Tools.MessageBestätigung(driver);
    }

    @Test(priority = 3)
    void subcribeFunction_No_oder_Yes() {
        WebElement newsletterClick = driver.findElement(By.xpath("(//a[text()='Newsletter'])[1]"));
        newsletterClick.click();

        WebElement newsletterClick_Yes_button = driver.findElement(yes);
        WebElement newsletterClick_No_button = driver.findElement(no);

        if (newsletterClick_Yes_button.isSelected())
            newsletterClick_No_button.click();
        else
            newsletterClick_Yes_button.click();

        WebElement newsletterClick_radio_Continue = driver.findElement(By.cssSelector("input[value='Continue']"));
        newsletterClick_radio_Continue.click();

        Tools.MessageBestätigung(driver);
    }

}
