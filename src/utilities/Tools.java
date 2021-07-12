package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {

    public static void vergleichList(List<String>expectedlist,List<WebElement>actuallist){
        for (int i = 0; i < expectedlist.size() ; i++) {
            Assert.assertEquals(actuallist.get(i).getText(),expectedlist.get(i));
        }
        // wir können naturlich foreach loop verwenden
      /*
        int i=0;
        for (WebElement element:actuallist){ Assert.assertEquals(element.getText(),expectedlist.get(i++)) }
        */
    }

    public static void MessageBestätigung(WebDriver driver){
        WebElement ssuccessfully_Message = driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible"));
        Assert.assertTrue(ssuccessfully_Message.getText().contains("success"));
    }
}
