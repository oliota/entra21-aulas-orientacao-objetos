package br.com.entra21.orientacao.objetos.principal.aula04.conceitos.poo;

public class Ponto {
	private int coordenadaX;
	private int coordenadaY;
	public Ponto() {
		
	}
	public Ponto(int coordenadaX, int coordenadaY) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}
	public int getCoordenadaX() {
		return coordenadaX;
	}
	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}
	public int getCoordenadaY() {
		return coordenadaY;
	}
	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
}
