package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverManageMethodlari {
//https://github.com/hasansacikara/selenium.git
    public static void main(String[] args) {

        System.setProperty("webdriver.chrom.driver", "exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // implicitliy wait gittigimiz sayfa acılıncaya veya aradıgımız webelement bulununcaya kadar
        // driver'in bekleyebilecegi max süreyi belirler

        // bu dörtlü her test method'unun basina yazılacak

    }
}
