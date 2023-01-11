Feature: US1002 Kullanici amazon anasayfada birden fazla ürün aratir

  @wip
  Scenario: TC02 Kullanici urunleri aratip test edebilir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna Nutella yazip aratir
    And  arama sunuclarinin Nutella icerdigini test eder
    And sayfayi kapatir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna Java yazip aratir
    And arama sunuclarinin Java icerdigini test eder
    Then sayfayi kapatir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna samsung yazip aratir
    And arama sunuclarinin samsung icerdigini test eder
    Then sayfayi kapatir




