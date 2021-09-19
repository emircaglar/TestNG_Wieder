package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Tools {

    public static void vergleichList(List<String> expectedlist, List<WebElement> actuallist) {
        for (int i = 0; i < expectedlist.size(); i++) {
            Assert.assertEquals(actuallist.get(i).getText(), expectedlist.get(i));
        }
        // wir können naturlich foreach loop verwenden
      /*
        int i=0;
        for (WebElement element:actuallist){ Assert.assertEquals(element.getText(),expectedlist.get(i++)) }
        */
    }

    public static void MessageBestätigung(WebDriver driver) {
        WebElement ssuccessfully_Message = driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible"));
        Assert.assertTrue(ssuccessfully_Message.getText().contains("success"));
    }

    public static void warte(int sekunde) {
        try {
            Thread.sleep(sekunde * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void selectRandom(WebElement element) {

        Select select = new Select(element);
        select.selectByIndex(Random_Nummer_Get(select.getOptions().size()));
    }

    public static int Random_Nummer_Get(int random) {
        int donut = (int) (Math.random() * random) + 1;

        return donut;
    }

    public static void list_contains(List<WebElement> list, String sache) {


        Boolean gibt_es = false;
        for (WebElement element : list
        ) {
            if (element.getText().equalsIgnoreCase(sache))
            {   gibt_es = true;
            break;}
        }

        if (gibt_es == false)
            Assert.fail();

    }


}
