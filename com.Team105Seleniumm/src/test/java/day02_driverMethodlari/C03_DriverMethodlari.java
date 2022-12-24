package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrom.driver", "exe");
        WebDriver driver = new ChromeDriver();

        driver.get("htps://www.amazon.com");


        // pageSource'un MEOW içerdigini test ediniz

        String pageSource = driver.getPageSource();

        String expectedKelime = "MEOW";

        if (pageSource.contains(expectedKelime)) {
            System.out.println("Pagesourc testi PASSED");
        } else {
            System.out.println("PAGE SOURCE TESTİ faild meow kelimesi bukunamadı");
        }



      }
    }
