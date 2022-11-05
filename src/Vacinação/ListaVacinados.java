package Vacinação;

import java.util.ArrayList;
import java.util.List;

public class ListaVacinados {
	private ArrayList<Paciente> lista;
	
	public ListaVacinados() {
		this.lista = new ArrayList<>();
	}

	public void adicionaLista(Paciente paciente) {
		lista.add(paciente);
	}
	
	public void printLista() {
		System.out.println(lista);
	}
	
}
