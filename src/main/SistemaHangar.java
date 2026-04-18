package main;

import controle.*;

public class SistemaHangar {

	static ControllerHangar Hangar = new ControllerHangar();
	static ControllerAviao Aviao = new ControllerAviao(); 
	static ControllerLote Lote = new ControllerLote(); 
	static ControllerCorrespondencia Correspondencia = new ControllerCorrespondencia();
	static ControllerFuncionario Funcionario = new ControllerFuncionario();
	
	public static void main(String[] args) {
	
		Hangar.novoHangar();
		Aviao.novoAviao();
		
		Lote.novoLote();
	
		Funcionario.novoFuncionario();
		Funcionario.novoFuncionario();

		Correspondencia.novaCorrespondencia();
		Correspondencia.novaCorrespondencia();
		
		Hangar.mostrarHangar();
		Funcionario.mostrarFuncionarios();
		
		Aviao.mostrarAviao();
		Lote.mostrarLotes();
		Correspondencia.mostrarCorrespondencias();
		
	}	
	
}