package exe001;

public class Teste {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Pedro", 10, 1.50, 45);

		pessoa.setNome("Joao");
		pessoa.setIdade(20);
		pessoa.setAltura(1.79);
		pessoa.setPeso(79);

		System.out.println("Características da pessoa: ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("Altura: " + pessoa.getAltura());
		System.out.println("Peso: " + pessoa.getPeso());

		System.out.printf("IMC: %.2f", pessoa.iMC());
	}
}
