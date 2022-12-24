package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrom.driver", "exe");
        WebDriver driver = new ChromeDriver();

        // sayfayı tam ekran yapalım
        driver.manage().window().maximize();
        System.out.println("maxima window boyutlari: + " + driver.manage().window().getSize());
        System.out.println("fullscren window boyutlari" + driver.manage().window().getPosition());

        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        System.out.println("fullscren window boyutlari" + driver.manage().window().getSize());
        System.out.println("fullscren window konumlari" + driver.manage().window().getSize());

        // browser'i istedigimiz konuma ve boyuta getiriniz
        Thread.sleep(3000);

        driver.manage().window().setPosition(new Point(100, 100));
        driver.manage().window().setSize(new Dimension(300, 300));

        Thread.sleep(3000);
        driver.close();


    }
}
