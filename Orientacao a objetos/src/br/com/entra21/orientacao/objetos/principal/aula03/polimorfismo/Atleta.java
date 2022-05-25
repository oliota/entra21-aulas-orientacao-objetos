package br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo;

public class Atleta {
	
	private String nome;
	private byte idade;
	private int quantidadeVitorias;
	private int quantidadeDerrotas; 
	
	public Atleta() {
		super();
	}

	public Atleta(String nome, byte idade, short quantidadeVitorias, byte quantidadeDerrotas ) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.quantidadeVitorias = quantidadeVitorias;
		this.quantidadeDerrotas = quantidadeDerrotas; 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public int getQuantidadeVitorias() {
		return quantidadeVitorias;
	}

	public void setQuantidadeVitorias(int quantidadeVitorias) {
		this.quantidadeVitorias = quantidadeVitorias;
	}

	public int getQuantidadeDerrotas() {
		return quantidadeDerrotas;
	}

	public void setQuantidadeDerrotas(int quantidadeDerrotas) {
		this.quantidadeDerrotas = quantidadeDerrotas;
	}
	
	public void agradecerVitoria() {
		setQuantidadeVitorias(getQuantidadeVitorias()+1);
		System.out.println("Obrigado meu DEUS!!!");
	}
 
 
	
	
	
	

}
