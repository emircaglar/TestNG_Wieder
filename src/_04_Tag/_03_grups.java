package _04_Tag;

import org.testng.annotations.Test;

public class _03_grups {
    @Test(groups = "smoke")
    void test1()
    {
        System.out.println("test1");
    }
    @Test(groups = "regresion")
    void test2(){
        System.out.println("test2");
    }
    @Test(groups = "smoke")
    void test3(){
        System.out.println("test3");
    }
    @Test(groups = "regresion")
    void test4(){
        System.out.println("test4");
    }
    @Test(groups = "smoke")
    void test5(){
        System.out.println("test5");
    }
    @Test(groups = "regresion")
    void test6(){
        System.out.println("test6");
    }



}
