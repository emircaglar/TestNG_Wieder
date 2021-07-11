package _01_Tag;

import org.testng.Assert;
import org.testng.annotations.*;

public class _01_Anfang {
    // nereye tiklanirsa orasi calismaya baslar
    // wenn ich elle Functions beginnen lassen will, soll ich ganz oben clicken

    @BeforeClass
    void beforclass(){
        System.out.println("funktioniert vor jede Class");
    }

    @AfterClass
    void afterclass(){
        System.out.println("funktioniert nach jede Class");
    }

    @BeforeMethod
    void beforMethod(){
        System.out.println("funktioniert vor jede Method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("funktioniert nach jede Method");
    }


    @Test               (priority = 1)
   // Annotations      // priorität/ öncelik siarsi
    void offneWebseite() {
        System.out.println("webseite wurde geoffnet");

    }

    @Test(priority = 2)

    void loginWebseite() {
        System.out.println("login wurde gemacht");

    }

    @Test(priority = 3)

    void schließeWebseite() {
        System.out.println("webseite wurde geschloßen");
    }

    @Test(priority = 4)
    void Assert1() {

        String s1="herzlichen wilkommen ";
        String s2="gute Nacht";
        Assert.assertEquals(s1,s2,"comment");
    }
    @Test(priority = 7)
    void AssertnotEquals1() {

        String s1="herzlichen wilkommen ";
        String s2="gute Nacht";
        Assert.assertNotEquals(s1,s2,"comment");
    }
    @Test(priority = 5)
    void AssertTrue2() {

        int a=44;
        int b=44;
        Assert.assertTrue(a==b);
    }

    @Test(priority = 6)
    void AssertNull3() {
      String s1=null;
        Assert.assertNull(s1);
    }

}
