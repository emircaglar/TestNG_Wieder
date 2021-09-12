package _05_Data_Provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_Data_Provider {
    @Test(dataProvider = "getData")
    public void UserName(String name){
        System.out.println("name = " + name);
    }

    @DataProvider// es ist  enine Data provider
    public Object[] getData(){
        Object[] data={
          "ali","hilal","serdar",
        };
        return data;
    }




}
