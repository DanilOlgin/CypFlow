import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int a = 155;
        int b = 711;
        int actual = calculator.add(a, b);
        int expected = 866;
        assertEquals(expected, actual);
    }
}
