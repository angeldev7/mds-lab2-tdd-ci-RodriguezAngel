package Principal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests TDD para StringCalculator
 * Siguiendo ciclo: RED -> GREEN -> REFACTOR
 */
public class StringCalculatorTest {
	
	// ========== ITERACIÓN 1: Cadena vacía ==========
	@Test
	public void testCadenaVaciaRetornaCero() {
		StringCalculator calc = new StringCalculator();
		assertEquals(0, calc.add(""));
	}
	
	// ========== ITERACIÓN 2: Un número ==========
	@Test
	public void testUnNumeroRetornaEseNumero() {
		StringCalculator calc = new StringCalculator();
		assertEquals(1, calc.add("1"));
	}
	
	@Test
	public void testUnNumero5() {
		StringCalculator calc = new StringCalculator();
		assertEquals(5, calc.add("5"));
	}
	
	// ========== ITERACIÓN 3: Dos números ==========
	@Test
	public void testDosNumerosSeparadosPorComa() {
		StringCalculator calc = new StringCalculator();
		assertEquals(3, calc.add("1,2"));
	}
	
	@Test
	public void testDosNumeros10y20() {
		StringCalculator calc = new StringCalculator();
		assertEquals(30, calc.add("10,20"));
	}
	
	// ========== ITERACIÓN 4: N números ==========
	@Test
	public void testTresNumeros() {
		StringCalculator calc = new StringCalculator();
		assertEquals(6, calc.add("1,2,3"));
	}
	
	@Test
	public void testCincoNumeros() {
		StringCalculator calc = new StringCalculator();
		assertEquals(15, calc.add("1,2,3,4,5"));
	}
}
