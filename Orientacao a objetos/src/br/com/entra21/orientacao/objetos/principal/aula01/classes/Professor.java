package br.com.entra21.orientacao.objetos.principal.aula01.classes;

public class Professor {
	
	//atributos static são de dominio da CLASSE e nao de cada objeto
	//entao nemhum objeto dessa classe tem esse tipo de atributo
	//para fazer acessos static basta informar a Classe.oqueVcquer, sem utilizar new
	public static String instituicao="Proway";
	
	
	
	//atributos devem ser private e se possivel
	//criar gets e sets para quem realmente precisa
	private String nome;
	private byte idadeAtual;
	private byte quantidadeAlunos;
	
	
	//new é criar objetos
	public Professor() {
		//construtor vazio nao inicializa os atributos
	}
	
	public Professor(String nome,byte idade) {
		this.nome=nome;
		 this.idadeAtual=idade;
		// construtor com parametros
		//pode inicializar alguns ou todos os atributos
	}
	
	public String getNome() {
		//ler o valor la fora
		return this.nome;
	}
	
	public void setNome(String nome) {
		// receber um valor novo la de fora
		this.nome=nome;
	}
	
	public byte getIdade() {
		return this.idadeAtual;
	}
	
	 
	

}
