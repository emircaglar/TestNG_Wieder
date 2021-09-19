package _06_Tag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.GeneralWebDriver;

public class _03_Einkauf_Elements  {
    public _03_Einkauf_Elements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "search")
    public WebElement search_input;

    @FindBy(className = "input-group-btn")
    public WebElement search_button;

    @FindBy(css= "div[class='button-group']>:nth-child(1)")
    public WebElement erste_sache;

    @FindBy(xpath= "//span[text()='Shopping Cart']")
    public WebElement shopping_Chart;

    @FindBy(xpath= "//a[text()='Checkout']")
    public WebElement Check_Out;

    @FindBy(id= "button-payment-address")
    public WebElement Continue_1;

    @FindBy(id= "button-shipping-address")
    public WebElement Continue_2;

    @FindBy(id= "button-shipping-method")
    public WebElement Continue_3;

    @FindBy(name= "agree")
    public WebElement Continue_agree;

    @FindBy(id= "button-payment-method")
    public WebElement Continue_4;

    @FindBy(id= "button-confirm")
    public WebElement Confirm_Order;

    @FindBy(css= "div[id='content']>h1")
    public WebElement Assert_Dialog;

}
