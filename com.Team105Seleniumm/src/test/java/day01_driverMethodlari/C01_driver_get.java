package day01_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_driver_get {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chromedriver.driver","exe");


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        driver.close();


      /*
        1- Selenium jar dosyalarini ve chromedriver'ini manuel olarak sisteme
        tanitmis olduk.

        Eger firefox veya safari ile calismamiz gerekirse bu defa da
        onlarin driver'larini indirip, manuel olarak
        9.satirda olan driver'lari tanimlamaliyiz.

        2- 12.satirda ChromeDriver() constructor'ini kullanarak bir obje olusturduk
        bu objeyi kullanmasak bile
        bu satirdan dolayi bos bir browser acilir

        3- driver.get(url) driver'i yazdigimiz url'e goturur
        url yazarken www yazmasak dahi calisir
        ancak https:// yazmazsak method calismaz.

       */

    }
}

