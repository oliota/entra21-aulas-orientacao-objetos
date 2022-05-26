package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Pato implements Individuo{

	@Override
	public void alimentar(String alimento) {
		System.out.println("Não sei oq o pato come é pouco provavel que ele coma "+alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println("QUA QUA: Sou especial pois ando, corro, nado e voo");
		
	}

	@Override
	public void comunicar(String assunto) {
		System.out.println("Somente com QUA QUA");
		
	}

}
