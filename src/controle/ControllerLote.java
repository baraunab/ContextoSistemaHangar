package controle;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import entidade.Lote;

public class ControllerLote {
	
	ArrayList<Lote> lotes = new ArrayList<>();
	
	public void novoLote() {
		Scanner scID = new Scanner(System.in);
		Scanner scDataEnvio = new Scanner(System.in);
		Scanner scHoraEnvio = new Scanner(System.in);
		Scanner scDestino = new Scanner(System.in);
		
		Lote lote = new Lote();
		String temp = new String();
		
		System.out.println("===== ADICIONAR LOTE =====");
		
		System.out.print("ID: ");
		lote.setIdentificador(scID.nextInt());
		
		System.out.print("Data de Envio (dd/mm/aaaa): ");
		temp = scDataEnvio.nextLine();
		DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		lote.setDataEnvio(LocalDate.parse(temp, data));
	
		System.out.print("Horário de envio (hh:mmAM/PM): ");
		temp = scHoraEnvio.nextLine();	
		DateTimeFormatter hora = DateTimeFormatter.ofPattern("hh[:mm]a");
		lote.setHoraEnvio(LocalTime.parse(temp, hora));
		
		System.out.print("Destino: ");
		lote.setDestino(scDestino.nextLine());
		
		lotes.add(lote);
	}
	
	public void mostrarLote (Lote lote) {
	System.out.print("ID: " + lote.getIdentificador());
		System.out.print("Data de Envio: " + lote.getDataEnvio());
		System.out.print("Horário de Envio: " + lote.getHoraEnvio());
		System.out.print("Destino: " + lote.getDestino() + "\n");
	}
	
	public void mostrarLotes() {
		System.out.println("=========== LISTA DE LOTES ===========");
		int i = 1;

		for (Lote lote : lotes) {
			System.out.print("- REGISTRO " + i);
			mostrarLote(lote);
		}
	}
}
