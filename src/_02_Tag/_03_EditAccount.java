package _02_Tag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.GeneralWebDriver;
import utilities.Tools;

public class _03_EditAccount extends GeneralWebDriver {
    @Test
    void editAccount() {
        editaccount("erhan", "karsli");
        editaccount("erdal", "adanali");

    }

    public void editaccount(String ad, String soyad) {
        WebElement edit_Button = driver.findElement(By.xpath("(//div//a[text()='Edit Account'])[1]"));
        edit_Button.click();
        WebElement edit_firstname = driver.findElement(By.id("input-firstname"));
        edit_firstname.clear();
        edit_firstname.sendKeys(ad);

        //Tools.warte(2); wenn ich beobachten möchte, kann ich die code warten lassen
        WebElement edit_lastname = driver.findElement(By.id("input-lastname"));
        edit_lastname.clear();
        edit_lastname.sendKeys(soyad);

        //Tools.warte(2);

        WebElement edit_Continue_Button = driver.findElement(By.cssSelector("input[value='Continue']"));
        edit_Continue_Button.click();

        Tools.MessageBestätigung(driver);

    }

}
