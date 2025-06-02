package tp5.test;

import java.util.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ParameterTest {

    private double a;
    private double b;
    private double resultadoEsperado;

    public ParameterTest(double a, double b, double resultadoEsperado) {
        this.a = a;
        this.b = b;
        this.resultadoEsperado = resultadoEsperado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][] {
            {8.0, 7.0, 15.0},
            {2.0, 0.0, 2.0},
            {10.0, -1.0, 9.0}
        });
    }

    @Test
    public void testSumar() {
        Calculador calc = new Calculador();
        assertEquals(resultadoEsperado, calc.sumar(a, b), 0.001);
    }
}