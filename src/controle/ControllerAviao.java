package controle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entidade.Aviao;
import util.Input;

public class ControllerAviao {
	
	Aviao aviao = new Aviao();
	public void novoAviao () {
		System.out.println("===== REGISTRO DE AVIÃO =====");
		System.out.print("Nome: ");
		aviao.setNomeAviao(Input.get());
		
		System.out.print("Data de Embarque (dd/mm/aaaa): ");
		String temp = Input.get();
		DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		aviao.setDataEmbarque(LocalDate.parse(temp, data));
		
		System.out.print("Data de Desembarque (dd/mm/aaaa): ");
		temp = Input.get();
		aviao.setDataDesembarque(LocalDate.parse(temp, data));

		System.out.print("Destino: ");
		aviao.setDestino(Input.get());
		
		System.out.print("Quantidade de Lotes: ");
		aviao.setQtdLotes(Integer.parseInt(Input.get()));
		
	}
	
	public void mostrarAviao () {
		System.out.println("==============  AVIÃO  ===============");
		System.out.println("Nome da aeronave: " + aviao.getNomeAviao());
		System.out.println("Data de desembarque: " + aviao.getDataDesembarque());
		System.out.println("Destino: " + aviao.getDestino());
		System.out.println("Quantidade de lotes: " + aviao.getQtdLotes()+ "\n");

	}
	
}
