package exe007;

import java.util.Date;
import java.util.List;

public class Time {
	private String nome;
	private Date dataFundacao;
	private List<Jogador> jogadores;
	private Tecnico tecnico;

	public Jogador artilheiro() {
		if (this.jogadores.size() > 0) {
			Jogador artilheiro = this.jogadores.get(0);
			int saldoGols = artilheiro.saldoGols();

			for (int i = 1; i < this.jogadores.size(); i++) {
				if (this.jogadores.get(i).saldoGols() > saldoGols) {
					artilheiro = this.jogadores.get(i);
					saldoGols = artilheiro.saldoGols();
				}
			}

			return artilheiro;
		}
		return null;
	}

	public Jogador experiente() {
		if (this.jogadores.size() > 0) {
			Jogador experiente = this.jogadores.get(0);
			int partidas = experiente.getPartidasJogadas();

			for (int i = 1; i < this.jogadores.size(); i++) {
				if (this.jogadores.get(i).getPartidasJogadas() > partidas) {
					experiente = this.jogadores.get(i);
					partidas = experiente.getPartidasJogadas();
				}
			}

			return experiente;
		}

		return null;
	}

	public void statusTime() {
		System.out.println("Jogadores: " + this.jogadores);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

}
