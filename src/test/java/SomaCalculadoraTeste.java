import org.junit.Test;
import static org.junit.Assert.*;

public class SomaCalculadoraTeste {

        @Test
        public void testeSoma() {
            Calculadora calculadora = new Calculadora();
            int resultado = calculadora.soma(5, 3);
            assertEquals(8, resultado);
        }

        @Test
        public void testeSomaComNegativos() {
            Calculadora calculadora = new Calculadora();
            int resultado = calculadora.soma(-5, 3);
            assertEquals(-2, resultado);
        }
    }
