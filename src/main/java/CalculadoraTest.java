import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        int resultado = Calculadora.somar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testSubtrair() {
        int resultado = Calculadora.subtrair(5, 3);
        assertEquals(2, resultado);
    }
}
