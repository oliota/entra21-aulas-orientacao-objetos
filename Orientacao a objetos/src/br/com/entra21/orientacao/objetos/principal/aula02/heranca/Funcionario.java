package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

public class Funcionario {

	private String nome;
	private byte idade;
	private float salario;

	public Funcionario() {

	}

	public Funcionario(String nome, byte idade, float salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
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

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
