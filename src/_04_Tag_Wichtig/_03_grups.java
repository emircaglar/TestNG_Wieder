package _04_Tag_Wichtig;

import org.testng.annotations.Test;

public class _03_grups {
    @Test(groups = "smoke")
    void test1()
    {
        System.out.println("test1  smoke");
    }
    @Test(groups = "regresion")
    void test2(){
        System.out.println("test2  regresion");
    }
    @Test(groups = "smoke")
    void test3(){
        System.out.println("test3  smoke");
    }
    @Test(groups = "regresion")
    void test4(){
        System.out.println("test4  regresion");
    }
    @Test(groups = "smoke")
    void test5(){
        System.out.println("test5  smoke");
    }
    @Test(groups = "regresion")
    void test6(){
        System.out.println("test6  regresion");
    }

    @Test
    void test7(){
        System.out.println("test7  null");
    }


}
