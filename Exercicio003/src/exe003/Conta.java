package exe003;

public class Conta {
	private String nome;
	private int numero;
	private double saldo;

	public Conta(String nome, int numero, double saldo) {
		super();
		this.nome = nome;
		this.setNumero(numero);
		this.saldo = saldo;
	}

	public boolean saca(double valor) {
		boolean certo = false;

		if (saldo - valor >= 0) {
			certo = true;
			saldo -= valor;
		}
		return certo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean transfere(Conta destino, double valor) {
		boolean certo = false;

		if (this.saldo - valor >= 0) {
			certo = true;
			destino.deposita(valor);
			this.saldo -= valor;
		}

		return certo;
	}

	public void imprimeNome() {
		System.out.println("Nome: " + this.nome + "\nSaldo atual: " + this.saldo);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
