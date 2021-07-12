package _02_Tag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.GeneralWebDriver;

public class _03_EditAccount extends GeneralWebDriver {
    @Test
    void editaccount(){
    WebElement edit_Button=driver.findElement(By.xpath("(//div//a[text()='Edit Account'])[1]"));
    edit_Button.click();
    WebElement edit_firstname=driver.findElement(By.id("input-firstname"));
        edit_firstname.clear();
        edit_firstname.sendKeys("emmim");

        WebElement edit_lastname=driver.findElement(By.id("input-firstname"));
        edit_lastname.clear();
        edit_lastname.sendKeys("darin");

        WebElement edit_Continue_Button=driver.findElement(By.cssSelector("input[value='Continue']"));
        edit_Continue_Button.click();

    }

}
