@wip
Feature: US1006 Kullanici configration dosyasindaki bilgilerle login olabilmeli

  Scenario: TC09 Gecerli kullanici adi ve sifre ile Pozitif Login testi

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "qdGecerliUsername" yazar
    And password kurusuna "qdGecerlipassword"yazar
    Then login butonuna basar
    And basarili giris yapildigini test eder
    Then sayfayi kapatir