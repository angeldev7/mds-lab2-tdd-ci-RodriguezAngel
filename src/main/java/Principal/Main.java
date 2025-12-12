package Principal;

import java.util.Scanner;

/**
 * Clase principal para probar StringCalculator de forma interactiva
 */
public class Main {

	public static void main(String[] args) {
		StringCalculator calculator = new StringCalculator();
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;
		
		System.out.println("╔═══════════════════════════════════════════╗");
		System.out.println("║     STRING CALCULATOR - KATA TDD          ║");
		System.out.println("╚═══════════════════════════════════════════╝");
		
		while (continuar) {
			mostrarMenu();
			System.out.print("Selecciona una opción: ");
			String opcion = scanner.nextLine();
			
			switch (opcion) {
				case "1":
					probarCalculadora(calculator, scanner);
					break;
				case "2":
					mostrarEjemplos();
					break;
				case "3":
					mostrarInstrucciones();
					break;
				case "4":
					System.out.println("\n¡Hasta luego! 👋");
					continuar = false;
					break;
				default:
					System.out.println("\n❌ Opción inválida. Intenta de nuevo.\n");
			}
		}
		
		scanner.close();
	}
	
	private static void mostrarMenu() {
		System.out.println("\n┌─────────────────────────────────────────┐");
		System.out.println("│           MENÚ PRINCIPAL                │");
		System.out.println("├─────────────────────────────────────────┤");
		System.out.println("│ 1. Probar calculadora                   │");
		System.out.println("│ 2. Ver ejemplos                         │");
		System.out.println("│ 3. Ver instrucciones                    │");
		System.out.println("│ 4. Salir                                │");
		System.out.println("└─────────────────────────────────────────┘");
	}
	
	private static void probarCalculadora(StringCalculator calculator, Scanner scanner) {
		System.out.println("\n╔═══════════════════════════════════════════╗");
		System.out.println("║         PROBAR CALCULADORA                ║");
		System.out.println("╚═══════════════════════════════════════════╝");
		System.out.println("(Escribe 'volver' para regresar al menú)\n");
		
		while (true) {
			System.out.print("Ingresa números: ");
			String input = scanner.nextLine();
			
			if (input.equalsIgnoreCase("volver")) {
				break;
			}
			
			try {
				int resultado = calculator.add(input);
				System.out.println("✅ Resultado: " + resultado + "\n");
			} catch (Exception e) {
				System.out.println("❌ Error: " + e.getMessage() + "\n");
			}
		}
	}
	
	private static void mostrarEjemplos() {
		System.out.println("\n╔═══════════════════════════════════════════╗");
		System.out.println("║              EJEMPLOS                     ║");
		System.out.println("╚═══════════════════════════════════════════╝");
		System.out.println("┌─────────────────┬─────────────────────────┐");
		System.out.println("│ Entrada         │ Resultado               │");
		System.out.println("├─────────────────┼─────────────────────────┤");
		System.out.println("│ ''              │ 0 (cadena vacía)        │");
		System.out.println("│ '1'             │ 1                       │");
		System.out.println("│ '5'             │ 5                       │");
		System.out.println("│ '1,2'           │ 3                       │");
		System.out.println("│ '1,2,3'         │ 6                       │");
		System.out.println("│ '10,20,30'      │ 60                      │");
		System.out.println("│ '1,2,3,4,5'     │ 15                      │");
		System.out.println("└─────────────────┴─────────────────────────┘");
		
		System.out.println("\nPresiona ENTER para continuar...");
		new Scanner(System.in).nextLine();
	}
	
	private static void mostrarInstrucciones() {
		System.out.println("\n╔═══════════════════════════════════════════╗");
		System.out.println("║           INSTRUCCIONES                   ║");
		System.out.println("╚═══════════════════════════════════════════╝");
		System.out.println("\n📋 Formato de entrada:");
		System.out.println("   • Números separados por comas (,)");
		System.out.println("   • Ejemplo: 1,2,3,4,5");
		System.out.println("\n📌 Reglas:");
		System.out.println("   ✓ Cadena vacía retorna 0");
		System.out.println("   ✓ Un solo número retorna ese número");
		System.out.println("   ✓ Múltiples números retorna la suma");
		System.out.println("   ✓ Espacios son ignorados");
		System.out.println("\n⚠️  Nota:");
		System.out.println("   Esta es la implementación básica (Iteraciones 1-4)");
		System.out.println("   Próximas versiones soportarán:");
		System.out.println("   - Saltos de línea (\\n) como separador");
		System.out.println("   - Delimitadores personalizados");
		System.out.println("   - Validación de números negativos");
		
		System.out.println("\nPresiona ENTER para continuar...");
		new Scanner(System.in).nextLine();
	}

}
