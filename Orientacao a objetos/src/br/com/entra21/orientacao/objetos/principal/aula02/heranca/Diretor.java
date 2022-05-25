package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

public class Diretor extends Pessoa{

	//removi os atributos comuns
	//private String nome;//
	//private byte idade;//
	//private String cpf;//
	
	//mantive os especificos
	private String cursoAtual;
	private byte quantidadeProfessores;
	
	
	public Diretor() { 
		super();
	}
	
	



	public Diretor(String nome, byte idade, String cpf,String cursoAtual,byte quantidadeProfessores) {
		super(nome, idade, cpf);
		setNome(nome);
		setIdade(idade);
		this.cursoAtual=cursoAtual;
		this.quantidadeProfessores=quantidadeProfessores;
	}




	//removi os metodos comuns
	/*
	 * public String getNome() { return nome; }
	 * 
	 * 
	 * public void setNome(String nome) { this.nome = nome; }
	 * 
	 * 
	 * public byte getIdade() { return idade; }
	 * 
	 * 
	 * public void setIdade(byte idade) { this.idade = idade; }
	 * 
	 * 
	 * public String getCpf() { return cpf; }
	 * 
	 * 
	 * public void setCpf(String cpf) { this.cpf = cpf; }
	 */

	










	public String getCursoAtual() {
		return cursoAtual;
	}


	public void setCursoAtual(String cursoAtual) {
		this.cursoAtual = cursoAtual;
	}


	public byte getQuantidadeProfessores() {
		return quantidadeProfessores;
	}


	public void setQuantidadeProfessores(byte quantidadeProfessores) {
		this.quantidadeProfessores = quantidadeProfessores;
	}
	
	public void realizarParesentacao() {
		System.out.println("Oi meu nome é "+getNome()+" tenho "+getIdade());
	}
	
	
	
	
}
