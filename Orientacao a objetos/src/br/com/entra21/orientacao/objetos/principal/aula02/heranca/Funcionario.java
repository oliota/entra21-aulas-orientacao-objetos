package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

public class Funcionario extends Pessoa {
	

	private String cargoAtual;
    private float salario;
    
	public Funcionario() { 
	}

	public Funcionario(String nome, byte idade,String cpf, String cargoAtual, float salario) { 
		super(nome, idade, cpf);
		this.cargoAtual = cargoAtual;
		this.salario = salario;
	}



	public String getCargoAtual() {
		return cargoAtual;
	}

	public void setCargoAtual(String cargoAtual) {
		this.cargoAtual = cargoAtual;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
    
    

}
