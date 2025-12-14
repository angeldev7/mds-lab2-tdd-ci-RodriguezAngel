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
	 * ITERACIÓN 4: N números (cantidad variable)
	 * ITERACIÓN 5: Saltos de línea como separador
	 * ITERACIÓN 6: Delimitador personalizado
	 */
	public int add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}
		
		String delimiter = "[,\n]";
		String numStr = numbers;
		
		// Detectar delimitador personalizado: //[delimitador]\n
		if (numbers.startsWith("//")) {
			int delimiterEnd = numbers.indexOf("\n");
			delimiter = numbers.substring(2, delimiterEnd);
			numStr = numbers.substring(delimiterEnd + 1);
			delimiter = java.util.regex.Pattern.quote(delimiter);
		}
		
		String[] nums = numStr.split(delimiter);
		int sum = 0;
		for (String num : nums) {
			sum += Integer.parseInt(num);
		}
		return sum;
	}
}
