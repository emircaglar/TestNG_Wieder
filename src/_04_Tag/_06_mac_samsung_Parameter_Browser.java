package _04_Tag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.GeneralWebDriver;
import utilities.Parameter_Driver;

import java.util.List;

public class _06_mac_samsung_Parameter_Browser extends Parameter_Driver {

    @Test
    @Parameters("search")
    public void mac_smasung(String suchen) {

        WebElement search_button = driver.findElement(By.cssSelector("input[name='search']"));
        search_button.sendKeys(suchen);

        WebElement search_search = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        search_search.click();

        List<WebElement> elements_suchen=driver.findElements(By.cssSelector("div[class='caption']>h4"));

        for (WebElement element:elements_suchen
             ) {
            Assert.assertTrue(element.getText().toLowerCase().contains(suchen.toLowerCase()));
        }
    }


}
