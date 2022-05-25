package br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo;

public class Velocista extends Atleta {

	private String marcaDeCalcado;
	private float distanciaPadrao;
	
	public Velocista() {
		
	}
	public Velocista(String marcaDeCalcado, float distanciaPadrao) {
		super();
		this.marcaDeCalcado = marcaDeCalcado;
		this.distanciaPadrao = distanciaPadrao;
	}
	public String getMarcaDeCalcado() {
		return marcaDeCalcado;
	}
	public void setMarcaDeCalcado(String marcaDeCalcado) {
		this.marcaDeCalcado = marcaDeCalcado;
	}
	public float getDistanciaPadrao() {
		return distanciaPadrao;
	}
	public void setDistanciaPadrao(float distanciaPadrao) {
		this.distanciaPadrao = distanciaPadrao;
	}
	@Override
	public void agradecerVitoria() {
		// TODO Auto-generated method stub
		super.agradecerVitoria();
		System.out.println("Ufa estou cansado, mas consegui");
	}
	
	
	
}
