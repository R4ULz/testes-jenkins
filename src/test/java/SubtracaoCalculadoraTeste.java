import org.junit.Test;
import static org.junit.Assert.*;

public class SubtracaoCalculadoraTeste {
    @Test
    public void testeSubtracao{
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtracao(8,5);
        assertEquals(3, resultado);
    }
}
