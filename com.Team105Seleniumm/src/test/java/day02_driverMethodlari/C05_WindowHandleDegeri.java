package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_WindowHandleDegeri {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrom.driver", "exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://wisequarter.com/");

        System.out.println(driver.getWindowHandle()); // CDwindow-9C783ACC6D7ABD9A2E35F95AA340884B

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:/www.amazon.com");
        System.out.println(driver.getWindowHandle());



        Thread.sleep(3000);
        driver.quit();
    }
}
