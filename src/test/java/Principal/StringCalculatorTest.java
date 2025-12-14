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
}
