package _05_Data_Provider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.GeneralWebDriver;

import java.util.List;

public class _02_Data_Provider extends GeneralWebDriver {

    @Test(dataProvider="getData")
    public void mac_smasung(String suchen) {

        WebElement search_button = driver.findElement(By.cssSelector("input[name='search']"));
        search_button.clear();
        search_button.sendKeys(suchen);

        WebElement search_search = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        search_search.click();

        List<WebElement> elements_suchen=driver.findElements(By.cssSelector("div[class='caption']>h4"));

        for (WebElement element:elements_suchen
        ) {
            Assert.assertTrue(element.getText().toLowerCase().contains(suchen.toLowerCase()));
        }
    }

    @DataProvider// es ist  enine Data provider
    public Object[] getData() {
        Object[] data = {
                "mac", "samsung","ipod"
        };
        return data;
    }



}
