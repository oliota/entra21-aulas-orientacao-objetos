package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;

public class Main {

	// o objeto da classe Scanner esta na variavel de entrada, então é um obj
	//porem o System.in é uma chamada static pq
	//para acessar o in do System nao precisei dar new
	static Scanner entrada = new Scanner(System.in);
	static Scanner entrada2 = new Scanner(System.in);
	public static void main(String[] args) {

		
		Professor professorJava = new Professor();
		 
		Professor professoraIngles = new Professor("Isabelle", (byte) 30);

		System.out.println("Nome dela = "+professoraIngles.getNome());
		
		professoraIngles.setNome("Isabelle 2");

		System.out.println("agora o nome  dela = "+professoraIngles.getNome());
		System.out.println("A idade dela é "+professoraIngles.getIdade());
		
		System.out.println("Os professoes trabalham na "+Professor.instituicao);

		Aluno alunoTeste= new Aluno(); 
		
		Aluno outroAluno= new Aluno();
		
		Aluno alunoNovato=new Aluno();
		
		Aluno alunoObjeto ;
		
		alunoObjeto= new Aluno();
		
		alunoObjeto.idade=18;
		
		 
		alunoTeste.nome="Rubem";
		alunoTeste.idade=33;
		
		outroAluno.idade=18;
		outroAluno.nome="Visitante";

		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		
		/*
		 * System.out.println("Qual o nome do aluno novato?");
		 * alunoNovato.nome=entrada.next();
		 * 
		 * System.out.println("Qual a idade do "+alunoNovato.nome+"?");
		 * alunoNovato.idade=entrada.nextByte();
		 * 
		 * System.out.println("Bem vindo "+alunoNovato.nome);
		 */
		
		

	}

}
