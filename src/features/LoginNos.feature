@NOS
Feature: Login in NOS customer area

  @NOS
  Scenario: Successful Login on Area Cliente
    Given I use Data from test case "Test Case 1"
    And I open browser to "Login Page"
    Then  I click on "Iniciar Sessão"
    And  I enter "Username" to "Email/Nome de utilizador"
    And  I enter "Password" to "Password"
    And  I click on "Entrar"