package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Funcionario;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Atleta;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Gamer;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Nadador;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Velocista;

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
			System.out.println("3 - Polimorfismo");
			opcao = entrada.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Saindo");
				break;
			case 1:
				aprenderClasses();
				break;
			case 2:
				aprenderHeranca();
				break;
			case 3:
				aprenderPolimorfismo();
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
		Pessoa pessoa1 = new Pessoa();

		Diretor diretor1 = new Diretor("Paulo", (byte) 80, "08938491212", "Entra21", (byte) 10);
		diretor1.setNome("Paulo");

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setIdade((byte) 22);
		funcionario1.setObservacao("novato");

		Funcionario funcionario2 = new Funcionario("Fulano", (byte) 18, "07821199901", "Junin", 4000.05f);
		funcionario2.getCpf();

	}

	private static void aprenderPolimorfismo() {
		Atleta atleta = new Atleta();
		Gamer gamer = new Gamer();
		Velocista velocista = new Velocista();
		Nadador nadador = new Nadador();

		atleta.agradecerVitoria();
		System.out.println("---------------");
		gamer.agradecerVitoria();
		System.out.println("---------------");
		velocista.agradecerVitoria();
		System.out.println("---------------");
		nadador.agradecerVitoria();

	}

}
