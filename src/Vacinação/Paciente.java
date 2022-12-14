package Vacinação;

import java.util.Comparator;

public class Paciente {
	private String nome;
	private int idade;
	
	public Paciente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Paciente(Paciente paciente) {
		this.nome = paciente.nome;
		this.idade = paciente.idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
