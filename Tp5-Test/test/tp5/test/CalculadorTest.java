package tp5.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadorTest {
     static Calculador calc;
    
    public CalculadorTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Bienvenido a las pruebas de Calculador");
        calc = new Calculador();
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("La operación ha finalizado");
    }
    
    @Before
    public void setUp() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    
    @After
    public void tearDown() {
         System.out.println("Prueba finalizada, campos en 0");
    }

    /**
     * Test of sumar method, of class Calculador.
     */
    @Test
    public void testSumar() {
        assertEquals(5.0, calc.sumar(2.0, 3.0), 0.001);
    }

    /**
     * Test of restar method, of class Calculador.
     */
    @Test
    public void testRestar() {
        assertEquals(1.0, calc.restar(3.0, 2.0), 0.001);
    }
    
}
