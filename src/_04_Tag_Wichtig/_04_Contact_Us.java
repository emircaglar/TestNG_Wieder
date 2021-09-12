package _04_Tag_Wichtig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.GeneralWebDriver;

public class _04_Contact_Us extends GeneralWebDriver {
    @Test
    @Parameters("message")
    public void contact_us(String Unser_message){

        WebElement contact_us=driver.findElement(By.linkText("Contact Us"));
        contact_us.click();

        WebElement message_input=driver.findElement(By.id("input-enquiry"));
        message_input.sendKeys(Unser_message);

        WebElement submiz_button=driver.findElement(By.cssSelector("input[value='Submit']"));
        submiz_button.click();

        WebElement contact_us_test=driver.findElement(By.cssSelector("div[id='content']>h1"));
        System.out.println("contact_us_test = " + contact_us_test.getText());
        Assert.assertEquals("Contact Us",contact_us_test.getText());




    }
}
