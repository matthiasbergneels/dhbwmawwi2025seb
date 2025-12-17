package lecture.excursion;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Test Cases for Calculator Class")
class CalculatorTest {

  Calculator calc;

  @BeforeAll
  static void setupAll(){
    System.out.println("@BeforeAll - wird einmal vor allen Tests aufgerufen");
  }

  @AfterAll
  static void cleanUpAll(){
    System.out.println("@AfterAll - wird einmal nach allen Tests aufgerufen");
  }

  @BeforeEach
  void setupEach(){
    System.out.println("@BeforeEach - wird vor jedem Test aufgerufen");
    calc = new Calculator();
  }

  @AfterEach
  void cleanUpEach(){
    System.out.println("@AfterEach - wird nach jedem Test aufgerufen");
    calc = null;
  }

  @Nested
  @DisplayName("add-Test Cases")
  class AddTestCases {

    @BeforeEach
    void setupEach(){
      System.out.println("@BeforeEach - wird vor jedem Test aufgerufen - NUR @Nested AddTestCases");

    }


    @Test
    @Tag("unit")
    @DisplayName("add Test - Basic")
    void add() {

      System.out.println("@Test - einfacher add-Test");

      // Arrange -> Aufbau für den Test


      // Act -> Testdurchführung
      int result = calc.add(1, 2);

      // Assert -> Validierung des Ergebnisses
      Assertions.assertEquals(3, result);

    }

    @Test
    @Tag("integration")
    @DisplayName("add Test - Big Numbers")
    void addBigNumbers() {
      System.out.println("@Test - Big Number add-Test");

      // Arrange -> Aufbau für den Test


      // Act -> Testdurchführung
      int result = calc.add(1000000000, 1000000000);

      // Assert -> Validierung des Ergebnisses
      Assertions.assertEquals(2000000000, result);
    }

    @Test
    @DisplayName("add Test - Negtaiv Numbers")
    void addNegativNumbers() {
      System.out.println("@Test - negativ Number add-Test");

      // Arrange -> Aufbau für den Test


      // Act -> Testdurchführung
      int result = calc.add(-5, -5);

      // Assert -> Validierung des Ergebnisses
      Assertions.assertEquals(-10, result);
    }
  }


  @Nested
  @DisplayName("subtract-Test Cases")
  class SubtractTestCases {


    @DisplayName("subtract Test - Basic")
    @RepeatedTest(5)
    void subtractBasic() {
      System.out.println("@Test - einfacher subtract-Test");

      // Arrange

      // Act
      double result = calc.subtract(1, 2);

      // Assert
      Assertions.assertEquals(-1, result);
    }
  }

  @Nested
  class MultiplyTestCases {

    @ParameterizedTest(name = "multiply {0} with {1} expected {2}")
    @CsvSource({
      "1.0, 2.0, 2.0",
      "5, 4, 20",
      "3,2,6.0"
    })
    @DisplayName("multiply-Basic Tests")
    void basicMultiply(double numberA, double numberB, double expected) {
      System.out.println("@Test - einfacher multiply-Test");

      // Arrange

      // Act
      double result = calc.multiply(numberA, numberB);

      // Assert
      Assertions.assertEquals(expected, result);

    }

    @ParameterizedTest(name = "multiply {0} with {1} expected {2}")
    @CsvFileSource(resources = "/MultiplyTestCases.csv")
    @DisplayName("multiply-Basic Tests from CSV File")
    void basicMultiplyFromCsvFile(double numberA, double numberB, double expected) {
      System.out.println("@Test - einfacher multiply-Test");

      // Arrange

      // Act
      double result = calc.multiply(numberA, numberB);

      // Assert
      Assertions.assertEquals(expected, result);

    }

  }

}