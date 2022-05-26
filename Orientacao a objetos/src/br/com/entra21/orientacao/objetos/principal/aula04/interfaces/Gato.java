package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Gato implements Individuo{

	@Override
	public void alimentar(String alimento) {
		System.out.println("MIAU: eu prefiro comer carne e não sei se gosto de "+alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println("MIAU: eu ando e corro, mas prefiro dormir");
		
	}

	@Override
	public void comunicar(String assunto) {
		System.out.println("MIAU : eu até falo mas vcs so escutam MIAU MIAU");
		
	}

}
