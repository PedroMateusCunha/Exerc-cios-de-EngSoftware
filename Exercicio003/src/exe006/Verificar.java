package exe006;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Verificar {
	private List<Integer> numerosIntegers = new ArrayList<>();

	public Verificar() {
		Random random = new Random();

		int n = random.nextInt(1000);

		for (int i = 0; i < n; i++) {
			this.numerosIntegers.add((random.nextInt(1000) + 1) * -1);
		}
		System.out.println("dsads");

		for (int i = n; i < 1000; i++) {
			this.numerosIntegers.add(random.nextInt(1000) + 1);
		}
	}

	public int tamanho() {
		return numerosIntegers.size();
	}

	public List<Integer> positivos() {
		List<Integer> positivos = new ArrayList<>();
		for (Integer inteiro : this.numerosIntegers) {
			if (inteiro > 0)
				positivos.add(inteiro);
		}

		return positivos;
	}

	public List<Integer> negativos() {
		List<Integer> negativos = new ArrayList<>();
		for (Integer inteiro : this.numerosIntegers) {
			if (inteiro < 0)
				negativos.add(inteiro);
		}

		return negativos;
	}

	public List<Integer> primos() {
		List<Integer> primos = new ArrayList<>();

		for (Integer inteiro : this.numerosIntegers) {
			if (inteiro > 0 && ehPrimo(inteiro)) {
				primos.add(inteiro);
			}
		}

		return primos;
	}

	public boolean ehPrimo(Integer n) {
		if (n == 2)
			return true;
		else if (n % 2 == 0)
			return false;

		for (int i = 3; i < n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

	public List<Integer> divisiveis(Integer n) {
		List<Integer> divisiveis = new ArrayList<>();

		for (Integer inteiro : this.numerosIntegers) {
			if (inteiro % n == 0) {
				divisiveis.add(inteiro);
			}
		}

		return divisiveis;
	}

}
