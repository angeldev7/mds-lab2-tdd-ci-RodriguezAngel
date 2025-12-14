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
	
	// ========== ITERACIÓN 4: N números (cantidad variable) ==========
	@Test
	public void testCantidadVariableDeNumeros() {
		StringCalculator calc = new StringCalculator();
		assertEquals(6, calc.add("1,2,3"));
		assertEquals(15, calc.add("1,2,3,4,5"));
		assertEquals(10, calc.add("2,2,2,2,2"));
	}
	
	// ========== ITERACIÓN 5: Saltos de línea como separador ==========
	@Test
	public void testSaltosDeLineaComoSeparador() {
		StringCalculator calc = new StringCalculator();
		assertEquals(6, calc.add("1\n2,3"));
		assertEquals(10, calc.add("1\n2\n3\n4"));
	}
	
	// ========== ITERACIÓN 6: Delimitador personalizado ==========
	@Test
	public void testDelimitadorPersonalizado() {
		StringCalculator calc = new StringCalculator();
		assertEquals(3, calc.add("//;\n1;2"));
		assertEquals(10, calc.add("//|\n1|2|3|4"));
	}
	
	// ========== ITERACIÓN 7: Números negativos lanzan excepción ==========
	@Test
	public void testNumerosNegativosLanzanExcepcion() {
		StringCalculator calc = new StringCalculator();
		
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			calc.add("1,-2,3");
		});
		assertTrue(exception.getMessage().contains("-2"));
		
		exception = assertThrows(IllegalArgumentException.class, () -> {
			calc.add("1,-2,-3,4");
		});
		assertTrue(exception.getMessage().contains("-2"));
		assertTrue(exception.getMessage().contains("-3"));
	}
}
