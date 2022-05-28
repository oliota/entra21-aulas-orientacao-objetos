package br.com.entra21.orientacao.objetos.principal.aula05.revisao;

public class Disciplina {
	
	private String nome;
	private String preRequisitos[];
	private String assuntos[];
	private float nota;
	public Disciplina() {
		
	}
	public Disciplina(String nome, String[] preRequisitos, String[] assuntos, float nota) {
		super();
		this.nome = nome;
		this.preRequisitos = preRequisitos;
		this.assuntos = assuntos;
		this.nota = nota;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String[] getPreRequisitos() {
		return preRequisitos;
	}
	public void setPreRequisitos(String[] preRequisitos) {
		this.preRequisitos = preRequisitos;
	}
	public String[] getAssuntos() {
		return assuntos;
	}
	public void setAssuntos(String[] assuntos) {
		this.assuntos = assuntos;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	public void setPosicaoAssunto(int posicao, String valor) {
		assuntos[posicao]=valor;
	}
	

}
