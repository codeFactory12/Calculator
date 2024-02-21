import com.example.calculadorabinarios.calculation.BinaryOperations;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class BinaryOperationsTest {

  @Test
  public void testAddition() {
    BinaryOperations binaryOperations = new BinaryOperations();
    assertEquals("101", binaryOperations.addition("10", "11", 2));
    assertEquals("110", binaryOperations.addition("100", "10", 2));

    String binaryA = "100001000101100101010001011000010100000000010100100010000000000000000000000000000000";
    String binaryB = "100001000101100101010001011000010100000000010100100010000000000000000000000000000000";
    String manualSum = "1000010001011001010100010110000101000000000101001000100000000000000000000000000000000";

    String resultSum = binaryOperations.addition(binaryA, binaryB, 2);
    assertEquals(manualSum.trim(), resultSum.trim());



  }

  @Test
  public void testSubtraction() {
    BinaryOperations binaryOperations = new BinaryOperations();
    assertEquals("1", binaryOperations.subtraction("10", "1", 2));
    assertEquals("10", binaryOperations.subtraction("101", "11", 2));
    // Agrega más casos de prueba según sea necesario
  }

  @Test
  public void testMultiplication() {
    BinaryOperations binaryOperations = new BinaryOperations();
    assertEquals("110", binaryOperations.multiplication("10", "11", 2));
    assertEquals("1100", binaryOperations.multiplication("100", "11", 2));
    // Agrega más casos de prueba según sea necesario
  }

  @Test
  public void testDivision() {
    BinaryOperations binaryOperations = new BinaryOperations();
    assertEquals("10", binaryOperations.division("110", "11", 2));
    assertEquals("11", binaryOperations.division("1100", "100", 2));
    // Agrega más casos de prueba según sea necesario
  }

  @Test
  public void testInvalidBase() {
    BinaryOperations binaryOperations = new BinaryOperations();
    assertEquals("0", binaryOperations.addition("10", "11", 8)); // Prueba con base no válida
    assertEquals("0", binaryOperations.subtraction("101", "11", 16)); // Prueba con base no válida
    assertEquals("0", binaryOperations.multiplication("100", "11", 7)); // Prueba con base no válida
    assertEquals("0", binaryOperations.division("1100", "100", 5)); // Prueba con base no válida
  }
}
