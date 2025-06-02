package tp5.test;

import org.junit.Test;

public class DivisionTest {
    
     public int dividir(int a, int b) {
        if (b == 0) throw new ArithmeticException("No se puede dividir por cero");
        return a / b;
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionCero() {
        dividir(10, 0);
    }
    
}
