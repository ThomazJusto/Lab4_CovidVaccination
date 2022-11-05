package Vacinação;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class FilaDeVacinação {
	private Comparator<Paciente> comparator;
	private PriorityQueue<Paciente> Fila;
	private PriorityQueue<Paciente> FilaAux;
	private ListaVacinados lista = new ListaVacinados();
	
	public FilaDeVacinação() {
		comparator = new PacienteIdadeComparator();
		Fila = new PriorityQueue<>(10, comparator);
	}
	
	public void adicionar(Paciente paciente) {
		Fila.add(paciente);
	}
	
	public void remove(Paciente paciente) {
		Fila.remove(paciente);
	}
	
	public void vacinar(int quantidade) {
		for(int i=0; i < quantidade; i++) {
			Paciente temp = Fila.poll();
			lista.adicionaLista(temp);
		}
	}
	
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("[");
		for (Paciente paciente : Fila) {
			string.append(paciente.getNome() + "\n");
		}
		string.append("]");
		
		return string.toString();
	}
	
	public void printing() {
		FilaAux = new PriorityQueue<>(Fila);
		while(!FilaAux.isEmpty()) {
			Paciente pa = FilaAux.remove();
			System.out.println(pa.getIdade());
		}
	}
	
}