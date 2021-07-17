package _03_Tag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.GeneralWebDriver;
import utilities.Tools;

public class _02_address_Funktionality extends GeneralWebDriver {


    @Test
   void address_Hinzufugen() {


        WebElement address_Book_button = driver.findElement(By.xpath("(//a[text()='Address Book'])[1]"));
        address_Book_button.click();

        WebElement address_Book_NewAddres_button = driver.findElement(By.xpath("//a[text()='New Address']"));
        address_Book_NewAddres_button.click();

        WebElement address_Book_Newaddres_Name = driver.findElement(By.id("input-firstname"));
        address_Book_Newaddres_Name.sendKeys("emin");

        WebElement address_Book_Newaddres_Last_name = driver.findElement(By.id("input-lastname"));
        address_Book_Newaddres_Last_name.sendKeys("eminoglu");

        WebElement address_Book_Newaddres_Address = driver.findElement(By.id("input-address-1"));
        address_Book_Newaddres_Address.sendKeys("emmoglu straße 47");

        WebElement address_Book_Newaddres_City = driver.findElement(By.id("input-city"));
        address_Book_Newaddres_City.sendKeys("emmoland");

        WebElement address_Book_Newaddres_PostCode = driver.findElement(By.id("input-postcode"));
        address_Book_Newaddres_PostCode.sendKeys("54125");

        WebElement address_Book_Newaddres_Country = driver.findElement(By.id("input-country"));
        //Select Countr_Menu=new Select(address_Book_Newaddres_Country);
        //Countr_Menu.selectByIndex(5);
        Tools.selectRandom(address_Book_Newaddres_Country);



        WebDriverWait wait=new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("select[id='input-zone']")));
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("select[id='input-zone']>option"),108));
        WebElement address_Book_Newaddres_Zone= driver.findElement(By.id("input-zone"));
        //Select Zone_Menu=new Select(address_Book_Newaddres_Zone);
        //Zone_Menu.selectByIndex(3);
        Tools.selectRandom(address_Book_Newaddres_Zone);

    }

    @Test(dependsOnMethods = {"address_Hinzufugen"})
// dieser Code hängt vom vorherigen Code ab
    void address_Bearbeiten() {


    }

    @Test(dependsOnMethods = {"address_Bearbeiten"})
    void address_Löschen() {


    }
}
