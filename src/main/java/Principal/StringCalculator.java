package Principal;

/**
 * String Calculator - Kata TDD
 * Implementación mediante Test-Driven Development
 */
public class StringCalculator {
	
	/**
	 * ITERACIÓN 1: Cadena vacía retorna 0
	 * ITERACIÓN 2: Un número retorna ese número
	 * ITERACIÓN 3: Dos números separados por coma
	 */
	public int add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}
		
		String[] nums = numbers.split(",");
		int sum = 0;
		for (String num : nums) {
			sum += Integer.parseInt(num);
		}
		return sum;
	}
}
