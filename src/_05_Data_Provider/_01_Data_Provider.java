package _05_Data_Provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_Data_Provider {
    @Test(dataProvider = "getData")
    public void UserName(String name) {
        System.out.println("name = " + name);
    }

    @DataProvider// es ist  enine Data provider
    public Object[] getData() {
        Object[] data = {
                "ali", "hilal", "serdar",
        };
        return data;
    }

    @Test(dataProvider = "getVor_Nach_Name")
    public void User_VorName_Nachname(String vorname, String nachname) {

        System.out.println("user " + vorname + " " + nachname);
    }

    @DataProvider// wir sollen zuerst DataProvider feststellen,
    // dann konnen wir diese method in inserem normalen Method
    public Object[][] getVor_Nach_Name() {
        Object[][] data = {
                {"ali", "tarcan",},
                {"mahmut", "özen",},
                {"nacu", "toraman",}
        };
        return data;
    }

}
