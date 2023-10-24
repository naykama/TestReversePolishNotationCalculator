package notation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {
    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAdditionFor5And3() {
        int addition = calculator.calculatePolishNotation("5 3 +");
        Assertions.assertEquals(5 + 3, addition);
    }

    @Test
    public void shouldCalculateSubtractionFor5And3() {
        int subtraction = calculator.calculatePolishNotation("5 3 -");
        Assertions.assertEquals(5 - 3, subtraction);
    }

    @Test
    public void shouldCalculateMultiplicationFor5And3() {
        int multiplication = calculator.calculatePolishNotation("5 3 *");
        Assertions.assertEquals(5 * 3, multiplication);
    }

    @Test
    public void shouldCalculateWithTwoSpacesForMultiplication5And3() {
        int multiplication = calculator.calculatePolishNotation("5  3 *");
        Assertions.assertEquals(5 * 3, multiplication);
    }

    @Test
    public void shouldCalculateWithThreeSpacesForMultiplication5And3() {
        int multiplication = calculator.calculatePolishNotation("5 3   *");
        Assertions.assertEquals(5 * 3, multiplication);
    }
}