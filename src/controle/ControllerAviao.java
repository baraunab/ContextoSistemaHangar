package controle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entidade.Aviao;

public class ControllerAviao {
	
	Aviao aviao = new Aviao();
	public void novoAviao () {
		Scanner scNome = new Scanner(System.in);
		Scanner scDataEm = new Scanner(System.in);
		Scanner scDataDes = new Scanner(System.in);
		Scanner scDestino = new Scanner(System.in);
		Scanner scQtdLotes = new Scanner(System.in);
		
		
		System.out.println("===== REGISTRO DE AVIÃO =====");
		System.out.print("Nome: ");
		aviao.setNomeAviao(scNome.nextLine());
		
		System.out.print("Data de Embarque (dd/mm/aaaa): ");
		String temp = scDataEm.nextLine();
		DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		aviao.setDataEmbarque(LocalDate.parse(temp, data));
		
		System.out.print("Data de Desembarque (dd/mm/aaaa): ");
		temp = scDataDes.nextLine();
		aviao.setDataDesembarque(LocalDate.parse(temp, data));

		System.out.print("Destino: ");
		aviao.setDestino(scDestino.nextLine());
		
		System.out.print("Quantidade de Lotes: ");
		aviao.setQtdLotes(scQtdLotes.nextInt());
		
	}
	
	public void mostrarAviao () {
		System.out.println("==============  AVIÃO  ===============");
		System.out.println("Nome da aeronave: " + aviao.getNomeAviao());
		System.out.println("Data de desembarque: " + aviao.getDataDesembarque());
		System.out.println("Destino: " + aviao.getDestino());
		System.out.println("Quantidade de lotes: " + aviao.getQtdLotes()+ "\n");

	}
	
}
