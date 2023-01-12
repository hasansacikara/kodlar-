import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @Then("amazon arama kutusuna Nutella yazip aratir")
    public void amazon_arama_kutusuna_nutella_yazip_aratir() {
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);

    }

    @And("arama sonuclarinin Nutellla icerdigini test eder")
    public void aramaSonuclarininNutelllaIcerdiginiTestEder() {

        String actualKelime = amazonPage.aramaSonucuElementi.getText();
        String expectedKelime ="Nutella";
        String expectedKelim = "Nutella";

        Assert.assertTrue(actualKelime.contains(expectedKelime));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @Then("amazon arama kutusuna Java yazip aratir")
    public void amazonAramaKutusunaJavaYazipAratir() {
        amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Java" + Keys.ENTER);
    }

    @And("arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String actualKelime = amazonPage.aramaSonucuElementi.getText();
        String expectedKelime = "Java";

        Assert.assertTrue(actualKelime.contains(expectedKelime));
    }

    @Then("amazon arama kutusuna Samsung yazip aratir")
    public void amazon_arama_kutusuna_samsung_yazip_aratir() {
        amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Samsung" + Keys.ENTER);
    }


    @Then("arama sonuclarinin Samsung icerdigini test eder")
    public void arama_sonuclarinin_samsung_icerdigini_test_eder() {

        String actualKelime = amazonPage.aramaSonucuElementi.getText();
        String expectedKelime = "Samsung";

        Assert.assertTrue(actualKelime.contains(expectedKelime));

    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String arg0) {
    }
}


