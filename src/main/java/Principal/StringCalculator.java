package Principal;

/**
 * String Calculator - Kata TDD
 * Implementación mediante Test-Driven Development
 */
public class StringCalculator {
	
	/**
	 * ITERACIÓN 1: Cadena vacía retorna 0
	 * ITERACIÓN 2: Un número retorna ese número
	 */
	public int add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}
		return Integer.parseInt(numbers);
	}
}
