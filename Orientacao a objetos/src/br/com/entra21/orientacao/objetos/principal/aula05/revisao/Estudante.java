package br.com.entra21.orientacao.objetos.principal.aula05.revisao;

import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;

public class Estudante extends Pessoa implements ComportamentosAcademicos {

	private Disciplina minhasDisciplinas[];
	private String pontosMelhorar[];
	private String pontosDestaque[];

	public Estudante() {
setObservacao("");
	}

	public Estudante(Disciplina[] minhasDisciplinas, String[] pontosMelhorar, String[] pontosDestaque) {
		super();
		this.minhasDisciplinas = minhasDisciplinas;
		this.pontosMelhorar = pontosMelhorar;
		this.pontosDestaque = pontosDestaque;
	}
	
	

	public Estudante(String nome, byte idade, String cpf) {
		super(nome, idade, cpf);
		// TODO Auto-generated constructor stub
	}

	public Disciplina[] getMinhasDisciplinas() {
		return minhasDisciplinas;
	}

	public void setMinhasDisciplinas(Disciplina[] minhasDisciplinas) {
		this.minhasDisciplinas = minhasDisciplinas;
	}

	public String[] getPontosMelhorar() {
		return pontosMelhorar;
	}

	public void setPontosMelhorar(String[] pontosMelhorar) {
		this.pontosMelhorar = pontosMelhorar;
	}

	public String[] getPontosDestaque() {
		return pontosDestaque;
	}

	public void setPontosDestaque(String[] pontosDestaque) {
		this.pontosDestaque = pontosDestaque;
	}

	@Override
	public String realizarApresentacao() {
		String mensagem = "Olá meu nom é " + getNome() + ", tenho " + getIdade();
		mensagem += "\n Até o momento já estudei " + minhasDisciplinas.length + " disciplinas";
		float soma = 0;
		for (int disciplina = 0; disciplina < minhasDisciplinas.length; disciplina++) {
			mensagem += "\n\t-" + minhasDisciplinas[disciplina].getNome() + "com nota = "
					+ minhasDisciplinas[disciplina].getNota();
			soma += minhasDisciplinas[disciplina].getNota();
		}
		mensagem += "\nMinha média até o momento é " + (soma / minhasDisciplinas.length);
		mensagem += "\nVeja as informações coletadas sobre a minha jornada durante o curso ENTRA21";
		mensagem += "\n------------------------------------";
		mensagem += "\nPontos de detaque (entregas além do esperado)";
		for (int destaque = 0; destaque < pontosDestaque.length; destaque++) {
			mensagem += "\n\t-" + pontosDestaque[destaque];
		}
		mensagem += "\n------------------------------------";
		mensagem += "\nPontos a melhorar (pois a melhoria continua deve ser mantida):";
		for (int melhorar = 0; melhorar < pontosMelhorar.length; melhorar++) {
			mensagem += "\n\t-" + pontosMelhorar[melhorar];
		}
		mensagem += "\n------------------------------------";
		mensagem += "\nDe forma geral é essa a visão que eu ajudei a montar ao interagir com o professor e a turma";
		mensagem += "\n" + getObservacao();
		return mensagem;
	}

	@Override
	public void participarAula() {
		System.out.println(
				"Como estudante a minha participação deve ser absorvendos conteudos e aproveitando momentos de interação em aula");

	}

	@Override
	public String gerarDossie(String nome) {

		return "Como estudante a minha forma de gerar dossiê é buscar aprender e participar nas aulas, pois tudo esta sendo visto pelo algoritmo do Oliota";
	}

}
