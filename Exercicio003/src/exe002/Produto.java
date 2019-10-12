package exe002;

public class Produto {
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;

	public void calcularMargemLucro() {
		this.margemLucro = this.precoVenda - this.precoCusto;
	}
	
	public double getMargemLucroPorcetagem() {
		return this.margemLucro / this.precoCusto * 100;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getMargemLucro() {
		return margemLucro;
	}

	public void setMargeLucro(double margeLucro) {
		this.margemLucro = margeLucro;
	}

}
