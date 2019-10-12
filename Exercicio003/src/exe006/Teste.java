package exe006;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Verificar verificar = new Verificar();
		
		System.out.println("Tamanho: " + verificar.tamanho());
		System.out.println("Positivos: " + verificar.positivos());
		System.out.println("Negativos: " + verificar.negativos());
		System.out.println("Primos: " + verificar.primos());
		System.out.print("Digite o divisor: ");
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		System.out.println("Divisores por " + n + ": " + verificar.divisiveis(n));
	}
}
