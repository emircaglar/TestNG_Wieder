package utilities;

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
        for (WebElement element:actuallist
             ) {
            Assert.assertEquals(element.getText(),expectedlist.get(i++));
        }
        */


    }
}
