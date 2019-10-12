package exe004;

public enum TipoFuncionario {
	EXECUTIVO(2000), ADMINISTRATIVO(1000), EMPRESARIAL(3000);
	
	private double salario;
	
	private TipoFuncionario(double valor) {
		this.salario = valor;
	}
	
	public double getSalario() {
		return this.salario;
	}
}
