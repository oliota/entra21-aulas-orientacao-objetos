package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;

public class Humano extends Pessoa implements Individuo{

	@Override
	public void alimentar(String alimento) {
		System.out.println(getNome()+": eu posso comer "+alimento+" pois sou onivoro");
		
	}

	@Override
	public void locomover() {
		System.out.println(getNome()+": geralmente andando, mas posso correr e nada");
		
	}

	@Override
	public void comunicar(String assunto) {
		System.out.println(getNome()+": sou especial pois posso falar e vou provar \""+assunto+"\"");
		
	}
	

}
