package _06_Tag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.GeneralWebDriver;
import utilities.Tools;

import java.util.List;

public class _06_Einkauf_Elements {


    public _06_Einkauf_Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[class='caption']>h4>a")
    public  List<WebElement> erste_sache;

    @FindBy(css = "button[data-original-title='Add to Wish List']")
    public  List<WebElement> wish_list;

    @FindBy(id = "wishlist-total")
    public WebElement wish_letzte;

    @FindBy(css = "table[class='table table-bordered table-hover']>tbody>tr>:nth-child(2)")
    public  List<WebElement> wish_list_total;





}
