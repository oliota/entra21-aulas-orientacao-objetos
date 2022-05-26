package br.com.entra21.orientacao.objetos.principal.aula04.conceitos.poo;

public class Reta {

	//A associa��o esta de 1 para muitos, onde cada reta esta relacionada a 2 pontos
	//A agrega��o � uni direcional pois Reta possui pontos, mas cada ponto pode existir sem uma Reta
	//A composi��o n�o existe entra elas pois � possivel existir
	private Ponto pontaA;
	private Ponto pontaB;
	public Reta() {
		
	}
	public Reta(Ponto pontaA, Ponto pontaB) {
		super();
		this.pontaA = pontaA;
		this.pontaB = pontaB;
	}
	public Ponto getPontaA() {
		return pontaA;
	}
	public void setPontaA(Ponto pontaA) {
		this.pontaA = pontaA;
	}
	public Ponto getPontaB() {
		return pontaB;
	}
	public void setPontaB(Ponto pontaB) {
		this.pontaB = pontaB;
	}
	
	
	
	

}
