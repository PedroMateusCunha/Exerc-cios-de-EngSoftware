package exe004;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private TipoFuncionario tipoFuncionario;
	
	public Funcionario(String nome, String cpf, TipoFuncionario tipoFuncionario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = tipoFuncionario.getSalario();
		this.setTipoFuncionario(tipoFuncionario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public TipoFuncionario getTipoFuncionario() {
		return tipoFuncionario;
	}

	public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}

}
