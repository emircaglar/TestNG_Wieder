package _02_Tag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.GeneralWebDriver;
import utilities.Tools;

import java.util.ArrayList;
import java.util.List;

public class _01_ValidateMenu extends GeneralWebDriver {

    @Test
    void menuValidation(){
        // hier konnen wir vergleichen, ob das menu stimmt ist

        List<String>menuExpectedList=new ArrayList<>();
        menuExpectedList.add("Desktops");
        menuExpectedList.add("Laptops & Notebooks");
        menuExpectedList.add("Components");
        menuExpectedList.add("Tablets");
        menuExpectedList.add("Software");
        menuExpectedList.add("Phones & PDAs");
        menuExpectedList.add("Cameras");
        menuExpectedList.add("MP3 Players");

        List<WebElement>menuActuallist=driver.findElements(By.cssSelector("ul[class='nav navbar-nav']>li"));
        Tools.vergleichList(menuExpectedList,menuActuallist);



    }
}
