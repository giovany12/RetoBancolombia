#Autor: Geovany Oquendo Murillo
@stories
Feature: Utest Register
  As a user
  I want register on the utest website
  To access content for testers

  @scenario1
  Scenario Outline: Register in the utest website
    Given that Geovany wants to register on the utest website
    When he complete the registration form
      | name   | lastName   | email   | password   | confirmPassword   |
      | <name> | <lastName> | <email> | <password> | <confirmPassword> |
    Then he is registered
      | verification   |
      | <verification> |

    Examples:
      | name | lastName | email            | password    | confirmPassword | verification      |
      | Pepe | Roa      | pepito@gmail.com | Pepito2021* | 0Pepito2021*    | Password mismatch |


