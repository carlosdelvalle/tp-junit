package aplicacion;

import static tp.junit.Assert.assertTrue;
import tp.junit.TestCase;

public class testSumaCalculadoraConSetUp extends TestCase {

    public void metodoPruebaConSetUp() {
        Calculadora calc = (Calculadora) getSetUp().getAttribute(0);
        assertTrue(calc.suma(1, 1) == 2);
    }

    @Override
    public void runTest() {
        metodoPruebaConSetUp();
    }
}
