package exe003;

public class Teste {
	public static void main(String[] args) {
		Conta conta1 = new Conta("Joao", 1234, 100);
		Conta conta2 = new Conta("Pedro", 1000, 4000);
		
		conta1.saca(2500);
		conta2.deposita(300);
		conta2.saca(1000);
		
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());
		
		conta2.transfere(conta1, 2000);
		conta1.transfere(conta2, 2500);
		
		conta1.imprimeNome();
		conta2.imprimeNome();

		conta1.setNome(conta1.getNome() + " Lima");
		conta1.imprimeNome();
	}
}
