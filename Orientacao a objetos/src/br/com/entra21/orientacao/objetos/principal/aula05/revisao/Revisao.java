package br.com.entra21.orientacao.objetos.principal.aula05.revisao;

import java.util.Scanner;

public class Revisao {

	static Scanner entrada = new Scanner(System.in);
	static Professor oliota;
	public static void revisar() {

		byte opcao;
		System.out.println("aprendendo sobre orienta��o a objetos");

		gerarMassaDados();
		do {
			System.out.println("Escolha uma op��o");
			System.out.println("0 - Finalizar revis�o"); 
			System.out.println("1 - Emitir dossi�"); 
			opcao = entrada.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Saindo");
				break;
			case 1:
				gerarDossie();
				break;

			default:
				break;
			}

		} while (opcao != 0);

	}

	private static void gerarDossie() {
		System.out.println(oliota.listarEstudantes()); 
		System.out.println("Informe o nome do aluno que deseja gerar o dossie:");
		System.out.println(oliota.gerarDossie(entrada.next()));
		
	}

	private static void gerarMassaDados() {
		Disciplina disciplinas[]=new Disciplina[3];
		disciplinas[0]= new Disciplina();
		disciplinas[0].setNome("Metodologias �geis e Git");
		disciplinas[0].setAssuntos(new String[3]);
		disciplinas[0].getAssuntos()[0]="Scrum";
		disciplinas[0].getAssuntos()[1]="Kanban";
		disciplinas[0].getAssuntos()[2]="Git";
		

		disciplinas[1]= new Disciplina();
		disciplinas[1].setNome("Logica de programa��o com java");
		disciplinas[1].setAssuntos(new String[6]);
		disciplinas[1].getAssuntos()[0]="Variaveis";
		disciplinas[1].getAssuntos()[1]="Desvios condicionais";
		disciplinas[1].getAssuntos()[2]="La�os de repeti��o";
		disciplinas[1].getAssuntos()[3]="Fun��es";
		disciplinas[1].getAssuntos()[4]="Vetores";
		disciplinas[1].getAssuntos()[5]="Matrizes";
		

		disciplinas[2]= new Disciplina();
		disciplinas[2].setNome("Programa��o orientada a objetos");
		disciplinas[2].setAssuntos(new String[6]);
		disciplinas[2].getAssuntos()[0]="Classes";
		disciplinas[2].getAssuntos()[1]="Objetos";
		disciplinas[2].getAssuntos()[2]="Encapsulamento";
		disciplinas[2].getAssuntos()[3]="Heran�a";
		disciplinas[2].getAssuntos()[4]="Conceitos POO";
		disciplinas[2].getAssuntos()[5]="Polimorfismo";
		
		
		Estudante estudantes[] = new Estudante[24];
		estudantes[0]= new Estudante("Fulano",(byte) 22,"000.000.000-01");
		estudantes[0].setMinhasDisciplinas(disciplinas);
		estudantes[0].getMinhasDisciplinas()[0].setNota(8);
		estudantes[0].getMinhasDisciplinas()[1].setNota(9.5f);
		estudantes[0].getMinhasDisciplinas()[2].setNota(10);
		
		estudantes[0].setPontosDestaque(new String[2]); 
		estudantes[0].getPontosDestaque()[0]="Reposit�rios bem documentados";
		estudantes[0].getPontosDestaque()[1]="Boa l�gica de programa��o";
		
		estudantes[0].setPontosMelhorar(new String[1]);  
		estudantes[0].getPontosMelhorar()[0]="Traduzir o perfil do github para english";
		estudantes[0].setObservacao("Tem bom engajamento no trello e demonstra ter facilidade para aprender");
		
		
		
		estudantes[1]= new Estudante("Fera",(byte) 31,"000.000.000-02");
		estudantes[1].setMinhasDisciplinas(disciplinas);
		estudantes[1].getMinhasDisciplinas()[0].setNota(10);
		estudantes[1].getMinhasDisciplinas()[1].setNota(10);
		estudantes[1].getMinhasDisciplinas()[2].setNota(10);
		
		estudantes[1].setPontosDestaque(new String[2]); 
		estudantes[1].getPontosDestaque()[0]="Se n�o contratar agora, outro alguem vai contratar";
		estudantes[1].getPontosDestaque()[1]="Sempre supera as espectativas";
		
		estudantes[1].setPontosMelhorar(new String[1]);  
		estudantes[1].getPontosMelhorar()[0]="Ainda resta muito tempo de curso, tomara que o ritmo de excelencia n�o diminua";
		estudantes[1].setObservacao("Perfil de lideran�a, ajuda os colegas e demnostra ter dominado os assunto at� o momento pois sempre evidencia pr�ticas em sala e pr�ticas extras");
		
		
		
		
		  oliota = new Professor("Rubem",(byte) 33,"000.000.000-00",disciplinas,estudantes);
		oliota.realizarApresentacao();
		oliota.participarAula();
		
	}

}
