package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features" ,
        glue = "stepdefinitions" ,
        tags = "@wip",
        dryRun = false
)

public class Runner {
     /*
    Cucumber'da Runner Class'ı bos bir class'tır.
    Runner class'ını diğer class'lardan farklı kılan ve TestNG'deki
    xml dosyaları gibi calışmasını saglayan iki adet notasyon mevcuttur
    @RunWith notasyonu projemize cucumber junit dependency eklememizin sebebidir.
    bu sayede runner class'larımız cucumber ile çalışır.

    @CucumberOptions notasyonu  ile istediğimiz özellikleri Runner Class'ına ekleyebiliriz
    Raporlama gibi extra option'larıda ileride ekleyeceğiz
    Ancak !

    Öncelikli görevi features dosyaları ile stepdefinitions'da bulunan java methodlarını
    ilişiklendirmektir.

    tags: features klasörü icerisinde yazilan tag(lari) aratip
    buldugu tüm feature ve ya scenario'lari calistirir

    dryRun : iki deger alabilir
    true : secilirse , verilen tag ile isaretli olan Feature veya scenario'daki
           eksik stepdefinitions'lari bulup ilgili method'lari olusturur
           hic bir sekilde testimizi calistirmaz
           eksik adim yoksa test passed olarak isaretler

           false : seçilirse verilen tag ile işaretlenen Feature veya Scenario'ları calıstırır.
     */
}
