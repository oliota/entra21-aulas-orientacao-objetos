package br.com.entra21.orientacao.objetos.principal.aula01.classes;

import java.util.Scanner;

public class Aluno {
	
	// definir atributos de uma aluno e cada objeto aluno tera essas variaveis, chamadas de atributos
	public String nome;
	public byte idade;
	public byte quantidadePresencas; 
	
	// na declaração so tem , acesso e tipo de retorno
	public Aluno() {// construtor vazio que ao utilizar o (new Aluno) ele é executado
		
	}
	
	public byte responderChamada() { 
		Scanner entrada = new Scanner(System.in);
		System.out.println("O aluno "+this.nome+"está ai?");
		String resposta = entrada.next();
		if(resposta.equalsIgnoreCase("sim")) {
			this.quantidadePresencas++;
			// o this serve para reafirmar que estamos mencionando
			//um atributo do meu objeto
		}
		return this.quantidadePresencas;
	}

}
