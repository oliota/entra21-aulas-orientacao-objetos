package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Aviao implements Veiculo{
	private String modelo;
	private float velocidadeAtual;
	public Aviao() {
		
	}
	public Aviao(String modelo) {
		super();
		this.setModelo(modelo);
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	@Override
	public String freiar() { 
		return "Avião freia como? usando FLAP";
	}
	
	@Override
	public void acelerar(float velocidade) {
		System.out.println("Acelerando a velocidate até = "+velocidade);
		this.velocidadeAtual+=velocidade;
		
	}
	public float getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(float velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	

}
