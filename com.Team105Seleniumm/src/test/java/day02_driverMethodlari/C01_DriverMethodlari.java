package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodlari {

    public static void main(String[] args) throws InterruptedException {

        // Biz brows'lari olusturdugumuz driver sayesinde otomate edebiliyoruz,
        // bunun için her testin nasında mutlaka driver objesiolusturacagiz

        System.setProperty("webdriver.chrom.driver","exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        // acilan sayfanın baslıgının amazon içerdigini test ediniz.

        String expectedKelime= "amazon";
        String actualResult= driver.getTitle();

        if (actualResult.contains(expectedKelime)){
            System.out.println("title testi PASSED");
        }else {
            System.out.println("Title amazon içermiyor, test FAILED");
            System.out.println(driver.getTitle());
        }


        // gittigimiz sayfanın URL'inin https://www.amazon.com/ oldugunu test edin

        String ecpectedUrl="https://www.amazon.com/";
        String actualUrl= driver.getCurrentUrl();

        if (ecpectedUrl.equals(actualUrl)){
            System.out.println("uRL testi PASSED");
        }else {
            System.out.println("Url istediginiz degerde degildir ");
        }


        Thread.sleep(5000);
        driver.close();
    }
}


