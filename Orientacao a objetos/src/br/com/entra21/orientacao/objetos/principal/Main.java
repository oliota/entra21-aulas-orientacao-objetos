package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;

public class Main {

	// o objeto da classe Scanner esta na variavel de entrada, ent�o � um obj
	// porem o System.in � uma chamada static pq
	// para acessar o in do System nao precisei dar new
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;
		System.out.println("aprendendo sobre orienta��o a objetos");

		do {
			System.out.println("Escolha uma op��o");
			System.out.println("0 - Sair");
			System.out.println("1 - Classes e objetos");
			System.out.println("2 - Heran�a");
			opcao = entrada.nextByte();

			switch (opcao) {
			case 0:

				break;
			case 1:
				aprenderClasses();
				break;
			case 2:
				aprenderHeranca();
				break;

			default:
				break;
			}

		} while (opcao != 0);

	}

	private static void aprenderClasses() {
		// instanciando um objeto da classe Professor na variavel professorJava
		Professor professorJava = new Professor();

		// instanciando um objeto da classe Professor na variavel professoraIngles
		Professor professoraIngles = new Professor("Isabelle", (byte) 30);

		// Acessando os atributos com encapsulamento
		System.out.println("Nome dela = " + professoraIngles.getNome());
		professoraIngles.setNome("Isabelle 2");
		System.out.println("agora o nome  dela = " + professoraIngles.getNome());
		System.out.println("A idade dela � " + professoraIngles.getIdade());

		// Acessando o atributo est�tico da Classe Professor, atributos est�ticos ou
		// metodos estatico n�o pertencem aos objetos da Classe
		// dessa forma � possivel acessar em a necessidade de criar um objeto com new
		System.out.println("Os professoes trabalham na " + Professor.instituicao);

		// Criando varios objetos da classe Aluno nas variaveis
		// cada variavel � independente e possui seus atributos e metodos
		Aluno alunoTeste = new Aluno();
		Aluno outroAluno = new Aluno();
		Aluno alunoNovato = new Aluno();
		Aluno alunoObjeto;
		alunoObjeto = new Aluno();

		// as altera��es aqui s� afetam esse objeto
		alunoObjeto.idade = 18;

		// as altera��es aqui s� afetam esse objeto
		alunoTeste.nome = "Rubem";
		alunoTeste.idade = 33;

		// as altera��es aqui s� afetam esse objeto
		outroAluno.idade = 18;
		outroAluno.nome = "Visitante";

		// Executando varias vezes o metodo desse objeto
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();

		// Interagindo com o usuario para preencher os atributos do Aluno que ainda n�o
		// tem encapsulamento
		System.out.println("Qual o nome do aluno novato?");
		alunoNovato.nome = entrada.next();

		System.out.println("Qual a idade do " + alunoNovato.nome + "?");
		alunoNovato.idade = entrada.nextByte();

		System.out.println("Bem vindo " + alunoNovato.nome);

	}

	private static void aprenderHeranca() {
		 //aprender heran�a

	}
}
