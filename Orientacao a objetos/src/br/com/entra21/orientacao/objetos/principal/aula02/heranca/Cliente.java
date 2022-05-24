package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

public class Cliente {

	private String nome;
	private byte idade;
	private String formaPagamento;

	public Cliente() {

	}

	public Cliente(String nome, byte idade, String formaPagamento) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.formaPagamento = formaPagamento;
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

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

}
