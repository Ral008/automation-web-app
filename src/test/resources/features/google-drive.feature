Feature: Crear documento Microsoft Word en Google Drive
  Como usuario
  Quiero crear un documento equivalente a Microsoft Word
  
  Scenario: Crear documento en google drive
    Given la pagina de google   
    When vamos al menu de Google Apps
    And seleccionamos Drive  
    And accedemos a la cuenta de google con usuario "laboratory.testing911@gmail.com"
    And clave "Peru$2018"
    Then creamos un documento equivalente al de Microsoft Word
    And nombramos el documento con "E01_Raul Lucero Avila"  