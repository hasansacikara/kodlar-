Feature: US1001 Kullanici amazonda test yapar

  Scenario: TC01 Kullanici amazonda Nutella aratir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna Nutella yazip aratir
    And arama sunuclarinin Nutella icerdigini test eder
    Then sayfayi kapatir

    