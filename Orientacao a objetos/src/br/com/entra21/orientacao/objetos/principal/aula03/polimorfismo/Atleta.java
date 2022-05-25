package br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo;

public class Atleta {
	
	private String nome;
	private byte idade;
	private short quantidadeVitorias;
	private byte quantidadeDerrotas; 
	
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

	public short getQuantidadeVitorias() {
		return quantidadeVitorias;
	}

	public void setQuantidadeVitorias(short quantidadeVitorias) {
		this.quantidadeVitorias = quantidadeVitorias;
	}

	public byte getQuantidadeDerrotas() {
		return quantidadeDerrotas;
	}

	public void setQuantidadeDerrotas(byte quantidadeDerrotas) {
		this.quantidadeDerrotas = quantidadeDerrotas;
	}
	
	public void agradecerVitoria() {
		System.out.println("Obrigado meu DEUS!!!");
	}
 
 
	
	
	
	

}
