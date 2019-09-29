public class ContaBancaria {
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private String data_abertura;

	public ContaBancaria(String titular, int numero, String agencia, double saldo, String data_abertura) {
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.data_abertura = data_abertura;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double calculaRendimento() {
		return this.saldo * 0.1;
	}

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("Joao", 1000, "0111-1", 1200, "28-01-2019");
		
		conta.saca(100);
		conta.deposita(200);
		
		System.out.println(conta.calculaRendimento());
	}
}
