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

	public static void main(String[] args) {
		Estoque estoque1 = new Estoque("Impressora Jato de Tinta", 13, 6);
		Estoque estoque2 = new Estoque("Monitor LCD 17 polegadas", 11, 13);
		Estoque estoque3 = new Estoque("IMouse Ótico", 6, 2);
		estoque1.darBaixa(5);
		estoque2.repor(7);
		estoque3.darBaixa(4);
		System.out.println(estoque1.mostra());
		System.out.println(estoque1.precisaRepor() + "\n");
		System.out.println(estoque2.mostra());
		System.out.println(estoque2.precisaRepor() + "\n");
		System.out.println(estoque3.mostra());
		System.out.println(estoque3.precisaRepor() + "\n");
		
	}
}
