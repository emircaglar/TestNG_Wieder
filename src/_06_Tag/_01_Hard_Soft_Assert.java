package _06_Tag;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_Hard_Soft_Assert {
    @Test
    public void hardAssert(){
        String name="John";
        System.out.println("  vor hard Assert ");//  diese code wird geschrieben werden
        Assert.assertEquals("George",name);
        System.out.println("nach hard Assert" );// todo diese code wird nicth geschrieben werden

    }

    @Test
    public void softAssert(){
        String name1="John";
        String name2="John";
        String name3="John";
        System.out.println("  vor soft Assert ");//  diese code wird geschrieben werden
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals("George",name1);
        System.out.println("nach soft Assert 1" );//  diese code wird geschrieben werden
        softAssert.assertEquals("George",name2);
        System.out.println("nach soft Assert 2" );//  diese code wird geschrieben werden
        softAssert.assertEquals("George",name3);
        System.out.println("nach soft Assert 3" );//  diese code wird geschrieben werden

        softAssert.assertAll();

    }
}
