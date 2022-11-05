package Vacinação;

import java.util.ArrayList;
import java.util.List;

public class ListaVacinados {
	protected List<Paciente> lista = new ArrayList<>();
	
	public void adicionaLista(Paciente paciente) {
		lista.add(paciente);
	}
	
	public void printLista() {
		System.out.println(lista);
	}
	
}
