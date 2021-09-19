package _06_Tag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.GeneralWebDriver;

import java.time.Instant;

public class _02_Einkauf extends GeneralWebDriver {
    @Test
    @Parameters("search")
    public void Einkauf(String search_sache) throws InterruptedException {
        WebElement search_input = driver.findElement(By.name("search"));
        search_input.sendKeys(search_sache);

        WebElement search_button = driver.findElement(By.className("input-group-btn"));
        search_button.click();

        WebElement erste_sache = driver.findElement(By.cssSelector("div[class='button-group']>:nth-child(1)"));
        erste_sache.click();

        WebElement shopping_Chart = driver.findElement(By.xpath("//span[text()='Shopping Cart']"));
        shopping_Chart.click();

        WebElement Check_Out = driver.findElement(By.xpath("//a[text()='Checkout']"));
        Check_Out.click();



        WebElement Continue_1 = driver.findElement(By.id("button-payment-address"));
        Continue_1.click();

        WebDriverWait wait=new WebDriverWait(driver, 10);

        WebElement Continue_2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-address")));
        Continue_2.click();

        WebElement Continue_3 =  wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-method")));
        Continue_3.click();

        WebElement Continue_agree = wait.until(ExpectedConditions.elementToBeClickable(By.name("agree")));
        Continue_agree.click();

        WebElement Continue_4 = driver.findElement(By.id("button-payment-method"));
        Continue_4.click();

        WebElement Confirm_Order = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-confirm")));
        Confirm_Order.click();

        wait.until(ExpectedConditions.urlContains("success"));

        WebElement Assert_Dialog = driver.findElement(By.cssSelector("div[id='content']>h1"));

        Assert.assertEquals("Your order has been placed!",Assert_Dialog.getText());


    }
}
