package exe002;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Produto produto = new Produto();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o preço de custo: ");
		double custo = scanner.nextDouble();
		
		System.out.print("Informe o preço de venda: ");
		produto.setPrecoCusto(custo);
		produto.setPrecoVenda(scanner.nextDouble());
		
		scanner.close();
		
		System.out.println("Preço de Custo: " + produto.getPrecoCusto());
		System.out.println("Preço de Venda: " + produto.getPrecoVenda());
		
		produto.calcularMargemLucro();
		
		System.out.println("Margem de Lucro: " + produto.getMargemLucro());
		System.out.println("Margem de Lucro Percentual (%): " + produto.getMargemLucroPorcetagem());
		
	}
}
