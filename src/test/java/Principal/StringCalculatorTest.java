package Principal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests TDD para StringCalculator
 * Siguiendo ciclo: RED -> GREEN -> REFACTOR
 */
public class StringCalculatorTest {
	
	// ========== ITERACIÓN 1: Cadena vacía retorna 0 ==========
	@Test
	public void testCadenaVaciaRetornaCero() {
		StringCalculator calc = new StringCalculator();
		assertEquals(0, calc.add(""));
	}
	
	// ========== ITERACIÓN 2: Un número retorna ese número ==========
	@Test
	public void testUnNumeroRetornaEseNumero() {
		StringCalculator calc = new StringCalculator();
		assertEquals(1, calc.add("1"));
		assertEquals(5, calc.add("5"));
	}
	
	// ========== ITERACIÓN 3: Dos números separados por coma ==========
	@Test
	public void testDosNumerosSeparadosPorComa() {
		StringCalculator calc = new StringCalculator();
		assertEquals(3, calc.add("1,2"));
		assertEquals(10, calc.add("4,6"));
	}
}
