package br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo;

public class Gamer extends Atleta {
	
	private String categoriaFavorita;
	private String configuracao;
	
	public Gamer() {
		
	}
	public Gamer(String categoriaFavorita, String configuracao) {
		super();
		this.categoriaFavorita = categoriaFavorita;
		this.configuracao = configuracao;
	}
	public String getCategoriaFavorita() {
		return categoriaFavorita;
	}
	public void setCategoriaFavorita(String categoriaFavorita) {
		this.categoriaFavorita = categoriaFavorita;
	}
	public String getConfiguracao() {
		return configuracao;
	}
	public void setConfiguracao(String configuracao) {
		this.configuracao = configuracao;
	}
	
	public void agradecerVitoria() {
		System.out.println("Eu sou o melhor!!!");
	}
	
	
	

}
