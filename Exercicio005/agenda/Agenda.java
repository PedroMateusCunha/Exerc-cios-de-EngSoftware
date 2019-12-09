package agenda;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<ContatoBasico>contatos;
	
	public Agenda(){
		contatos = new ArrayList<ContatoBasico>();
	}
	
	public void inserir(ContatoBasico contato) {
		contatos.add(contato);
	}
	
	public ContatoBasico buscarNome(String nome) {
		for(int i=0; i<contatos.size(); i++) {
			ContatoBasico contato=contatos.get(i);
			if(contato.getNome().equalsIgnoreCase(nome)) {
				return contatos.get(i);
			}
		}
		return null;
	}
	
	public ContatoBasico buscarPosicao(int posicao) {
		if(posicao>=0 && posicao<contatos.size()) {
			return contatos.get(posicao);
		}
		return null;
	}
	
	 public String[] buscarGeral(String palavraChave){
		 ArrayList<ContatoBasico>todosContatos=new ArrayList<ContatoBasico>();
         for(int i=0;i<contatos.size();i++) {
        	 ContatoBasico contato=contatos.get(i);
        	 if(contato.getDados().contains(palavraChave)) {
        		 todosContatos.add(contato);
        	 }
    	 }
         String[] vetorContatos=new String[todosContatos.size()];
         return (todosContatos.toArray(vetorContatos));
     }
	 
	 public String[] buscarTodos() {
		 String[] vetorContatos=new String[contatos.size()];
		 return (contatos.toArray(vetorContatos));
	 }
	 
	 public int getQuantidade(){
		 return contatos.size();
	 }
}
