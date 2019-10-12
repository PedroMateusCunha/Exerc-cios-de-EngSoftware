package exe007;

public class Jogador {
	private Time time;
	private String posicao;
	private int golsPro;
	private int golsContra;
	private int cartoesAmarelos;
	private int cartoesVermelhos;
	private int partidasJogadas;

	public int saldoGols() {
		return this.golsPro - this.golsContra;
	}

	@Override
	public String toString() {
		return "Jogador [time=" + time + ", posicao=" + posicao + ", golsPro=" + golsPro + ", golsContra=" + golsContra
				+ ", cartoesAmarelos=" + cartoesAmarelos + ", cartoesVermelhos=" + cartoesVermelhos
				+ ", partidasJogadas=" + partidasJogadas + "]";
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public int getGolsPro() {
		return golsPro;
	}

	public void setGolsPro(int golsPro) {
		this.golsPro = golsPro;
	}

	public int getGolsContra() {
		return golsContra;
	}

	public void setGolsContra(int golsContra) {
		this.golsContra = golsContra;
	}

	public int getCartoesAmarelos() {
		return cartoesAmarelos;
	}

	public void setCartoesAmarelos(int cartoesAmarelos) {
		this.cartoesAmarelos = cartoesAmarelos;
	}

	public int getCartoesVermelhos() {
		return cartoesVermelhos;
	}

	public void setCartoesVermelhos(int cartoesVermelhos) {
		this.cartoesVermelhos = cartoesVermelhos;
	}

	public int getPartidasJogadas() {
		return partidasJogadas;
	}

	public void setPartidasJogadas(int partidasJogadas) {
		this.partidasJogadas = partidasJogadas;
	}

}
