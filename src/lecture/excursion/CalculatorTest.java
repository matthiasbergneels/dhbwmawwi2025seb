package lecture.excursion;

import org.junit.jupiter.api.*;

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

  @Test
  @Tag("unit")
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
  void addBigNumbers() {
    System.out.println("@Test - Big Number add-Test");

    // Arrange -> Aufbau für den Test


    // Act -> Testdurchführung
    int result = calc.add(1000000000, 1000000000);

    // Assert -> Validierung des Ergebnisses
    Assertions.assertEquals(2000000000, result);
  }

  @Test
  void addNegativNumbers() {
    System.out.println("@Test - negativ Number add-Test");

    // Arrange -> Aufbau für den Test


    // Act -> Testdurchführung
    int result = calc.add(-5, -5);

    // Assert -> Validierung des Ergebnisses
    Assertions.assertEquals(-10, result);
  }


}