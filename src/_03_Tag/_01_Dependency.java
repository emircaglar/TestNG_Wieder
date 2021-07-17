package _03_Tag;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency {
    @Test
    void startCar(){
        System.out.println("das Auto hat funktioniert");
      //Assert.fail();// wir schreiben so,damit der Code nict funktioniert
    }
    @Test(dependsOnMethods ={"startCar"} )// das ist eine Abhängigkeit, deswegen wird der Code ignoriert
    void driveCar(){
        System.out.println("das Auto is gegangen");
    }
    @Test(dependsOnMethods ={"driveCar"} )// das ist eine Abhängigkeit, deswegen wird der Code ignoriert
    void stopCar(){
        System.out.println("das Auto is eingehalten");
    }
    @Test(dependsOnMethods ={"stopCar"} ,alwaysRun = true)// der Code  funktioniert immer , weil es alwaysRun geschrieben wurde
    void parkCar(){
        System.out.println("das Auto wurde geparket");
    }
}
