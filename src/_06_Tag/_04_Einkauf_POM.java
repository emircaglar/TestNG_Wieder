package _06_Tag;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.GeneralWebDriver;

public class _04_Einkauf_POM extends GeneralWebDriver {


    @Test
    @Parameters("search")
    public  void prozess_Einkauf(String suche_sache){
        _03_Einkauf_Elements elements=new _03_Einkauf_Elements(driver);
        elements.search_input.sendKeys(suche_sache);
        elements.search_button.click();
        elements.erste_sache.click();
        elements.shopping_Chart.click();
        elements.Check_Out.click();
        elements.Continue_1.click();
        WebDriverWait wait=new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elements.Continue_2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.Continue_3)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.Continue_agree)).click();
        elements.Continue_4.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.Confirm_Order)).click();
        wait.until(ExpectedConditions.urlContains("success"));
        Assert.assertEquals("Your order has been placed!",elements.Assert_Dialog.getText());



    }



}
