import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteCalculadora {

    private Calculadora calc;

    @Before
    public void setUp() {
        calc = new Calculadora();
    }

    @Test
    public void testeSomar() {
        int res = calc.somar(2, 3);
        assertEquals(5, res);
    }

    @Test
    public void testeSubtrair() {
        int res = calc.subtrair(5, 4);
        assertEquals(1, res);
    }

    @Test
    public void testeMultiplicar() {
        int res = calc.multiplicar(6, 7);
        assertEquals(42, res);
    }

    @Test
    public void testeDividir() {
        double res = calc.dividir(30, 4);
        assertEquals(7.5, res, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testeDividirPor0() {
        double res = calc.dividir(30, 0);
    }

}
