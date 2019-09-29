public class Estoque {
	private String nome;
	private int qtdAtual;
	private int qtdMinima;

	public Estoque() {
	}

	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

	public void mudarNome(String nome) {
		this.nome = nome;
	}
	
	public void mudarQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	
	public void repor(int qtd) {
		qtdAtual += qtd;
	}
	
	public void darBaixa(int qtd) {
		qtdAtual -= qtd;
	}
	
	public String mostra() {
		return "Nome: " + this.nome + "\nQuatidade mínima: " + this.qtdMinima + "\nQuantida máxima: " + this.qtdAtual;
	}
	
	public boolean precisaRepor() {
		return qtdMinima > qtdAtual;
	}
}