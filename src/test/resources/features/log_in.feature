Feature: Log in

  @CP_001
  Scenario: Try to log in with valid credentials
    Given John Wick ingresa a la session login
    When el ingresa sus credenciales "valid user"
    Then el accedera a su cuenta exitosamente