package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrom.driver", "exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("htps://www.amazon.com");
        // get ile aynı islevi yapar

        Thread.sleep(3000);
        driver.get("https://www.sahibinden.com");

        //yeniden amazona git
        Thread.sleep(3000);
        driver.navigate().back();
    }
}
