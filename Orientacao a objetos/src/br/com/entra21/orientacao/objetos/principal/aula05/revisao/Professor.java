package br.com.entra21.orientacao.objetos.principal.aula05.revisao;

import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;

public class Professor extends Pessoa implements ComportamentosAcademicos {

	private Disciplina disciplinasMinistradas[];
	private Estudante estudantes[];

	public Professor() {
		super();
		setObservacao("");
	}

	public Professor(Disciplina[] disciplinasMinistradas, Estudante[] estudantes) {
		super();
		this.disciplinasMinistradas = disciplinasMinistradas;
		this.estudantes = estudantes;
	}
	
	

	public Professor(String nome, byte idade, String cpf,Disciplina[] disciplinasMinistradas, Estudante[] estudantes) {
		super(nome, idade, cpf);
		this.disciplinasMinistradas = disciplinasMinistradas;
		this.estudantes = estudantes;
	}

	public Disciplina[] getDisciplinasMinistradas() {
		return disciplinasMinistradas;
	}

	public void setDisciplinasMinistradas(Disciplina[] disciplinasMinistradas) {
		this.disciplinasMinistradas = disciplinasMinistradas;
	}

	public Estudante[] getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(Estudante[] estudantes) {
		this.estudantes = estudantes;
	}

	@Override
	public String realizarApresentacao() {
		String mensagem = "Ol� meu nom � " + getNome() + ", tenho " + getIdade();
		mensagem += "\n At� o momento j� ministrei " + disciplinasMinistradas.length + " disciplinas"; 
		for (int disciplina = 0; disciplina < disciplinasMinistradas.length; disciplina++) {
			if(disciplinasMinistradas[disciplina]!=null) {
				
				mensagem += "\n\t-" + disciplinasMinistradas[disciplina].getNome();
			}
		}
		mensagem+=listarEstudantes();
		return mensagem;
	}

	@Override
	public void participarAula() {
		System.out.println("Como professor devo ministrar o assunto e manter os estudantes motivados");

	}

	@Override
	public String gerarDossie(String nome) {
		Estudante selecionado = null;
		if (estudantes != null && estudantes.length != 0) {

			for (int estudante = 0; estudante < estudantes.length; estudante++) {
				if (estudantes[estudante] !=null && nome.equalsIgnoreCase(estudantes[estudante].getNome())) {
					selecionado = estudantes[estudante];
					break;
				}
			}
			if (selecionado != null) {
				return escreverDetalhes(selecionado);
			}else {
				return "Infelizmente o " + nome
						+ " n�o consta na minha lista seleta de alunos, ser� que o nome esta correto?"+listarEstudantes();	
			}

		} else {

			return "Parece que eu n�o tenho alunos ainda";
		}
 
	}

	public String listarEstudantes() {
		String lista="\nVerifique os nomes que constam em minha lista de estudantes:"; 
		for (int estudante = 0; estudante < estudantes.length; estudante++) {
			if(estudantes[estudante]!=null) {
				
				lista += "\n\t-" + estudantes[estudante].getNome();
			}
		}
		return lista;
	}

	private String escreverDetalhes(Estudante estudante) {
		String detalhe = "Ol� meu nome � " + estudante.getNome() + ", tenho " + getIdade();
		Disciplina disciplinas[]= estudante.getMinhasDisciplinas();
		detalhe += "\n At� o momento j� estudei " + estudante.getMinhasDisciplinas().length + " disciplinas";
		float soma = 0;
		for (int disciplina = 0; disciplina < estudante.getMinhasDisciplinas().length; disciplina++) {
			detalhe += "\n\t-" + estudante.getMinhasDisciplinas()[disciplina].getNome() + "com nota = "
					+ estudante.getMinhasDisciplinas()[disciplina].getNota();
			soma += estudante.getMinhasDisciplinas()[disciplina].getNota();
		}
		detalhe += "\nMinha m�dia at� o momento � " + (soma / estudante.getMinhasDisciplinas().length);
		detalhe += "\nVeja as informa��es coletadas sobre a minha jornada durante o curso ENTRA21";
		detalhe += "\n------------------------------------";
		detalhe += "\nPontos de detaque (entregas al�m do esperado)";
		for (int destaque = 0; destaque < estudante.getPontosDestaque().length; destaque++) {
			detalhe += "\n\t-" + estudante.getPontosDestaque()[destaque];
		}
		detalhe += "\n------------------------------------";
		detalhe += "\nPontos a melhorar (pois a melhoria continua deve ser mantida):";
		for (int melhorar = 0; melhorar < estudante.getPontosMelhorar().length; melhorar++) {
			detalhe += "\n\t-" + estudante.getPontosMelhorar()[melhorar];
		}
		detalhe += "\n------------------------------------";
		detalhe += "\nDe forma geral � essa a vis�o que eu ajudei a montar ao interagir com o professor e a turma";
		detalhe += "\n" + estudante.getObservacao();
		return detalhe;

	}

}
