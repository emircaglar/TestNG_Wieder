package _01_Tag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _02_Enable {

    public static WebDriver driver;// wir schreiben hier, weil wir es  in der Zukunft wieder verwenden werden

    @BeforeClass
    void anfangAktionen() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

    }
    @AfterClass
    void schlussAktionen() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }


    @Test
    void test1() {
        System.out.println("für url");
        System.out.println(driver.getCurrentUrl());
    }

    @Test(enabled = false)// wenn wir gerade diese Method nicht benutzen wollen ,könne wir so schreiben
    void test2() {
        System.out.println(driver.getTitle());
    }

    @Test
    void test3() {
        System.out.println(driver.getWindowHandle());
    }
}
