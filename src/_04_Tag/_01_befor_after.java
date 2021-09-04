package _04_Tag;

import org.testng.annotations.*;
import org.testng.internal.annotations.IBeforeSuite;

public class _01_befor_after {
    @BeforeSuite
    public void bSuit(){
        System.out.println("beforeSuite");
    }
    @AfterSuite
    public void aSuit(){
        System.out.println("AfterSuite");
    }
    @BeforeTest
    public void bTest(){
        System.out.println("BeforeTest");
    }
    @AfterTest
    public void aTest(){
        System.out.println("AfterTest");
    }
    @BeforeGroups
    public void bGroups(){
        System.out.println("BeforeGroups");
    }
    @AfterGroups
    public void aGroups(){
        System.out.println("AfterGroups");
    }
    @BeforeClass
    public void bclass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public void aclass(){
        System.out.println("AfterClass");
    }
    @BeforeMethod
    public void bmethod(){
        System.out.println("BeforeMethod");
    }
    @AfterMethod
    public void amethod(){
        System.out.println("AfterMethod");
    }

@Test
    void Intro1(){
    System.out.println("Abhängig Methods");
}

}
