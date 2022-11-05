package Vacinação;

public class main {

	public static void main(String[] args) {
		Paciente paciente1 = new Paciente("Thomaz", 22);
		Paciente paciente2 = new Paciente("Sofia", 20);
		Paciente paciente3 = new Paciente("Teste1", 30);
		Paciente paciente4 = new Paciente("Teste3", 22);
		Paciente paciente5 = new Paciente("Teste2", 25);
		
		FilaDeVacinação filaDeVacinação = new FilaDeVacinação();
		ListaVacinados ListaVacinados = new ListaVacinados();
		
		
		filaDeVacinação.adicionar(paciente1);
		filaDeVacinação.adicionar(paciente2);
		filaDeVacinação.adicionar(paciente3);
		filaDeVacinação.adicionar(paciente4);
		filaDeVacinação.adicionar(paciente5);
		
		filaDeVacinação.printing();
		filaDeVacinação.vacinar(2);
		System.out.println("-----------");
		filaDeVacinação.printing();
		
		ListaVacinados.printLista();
	}

}
