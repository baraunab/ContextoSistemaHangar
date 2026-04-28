package controle;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import entidade.Lote;
import util.Input;

public class ControllerLote {

	ArrayList<Lote> lotes = new ArrayList<>();

	public void novoLote() {
		Lote lote = new Lote();
		String temp = new String();

		System.out.println("===== ADICIONAR LOTE =====");

		System.out.print("ID: ");
		lote.setIdentificador(Integer.parseInt(Input.get()));

		System.out.print("Data de Envio (dd/mm/aaaa): ");
		temp = Input.get();
		DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		lote.setDataEnvio(LocalDate.parse(temp, data));

		System.out.print("Horário de envio (hh:mmAM/PM): ");
		temp = Input.get();
		DateTimeFormatter hora = DateTimeFormatter.ofPattern("hh[:mm]a");
		lote.setHoraEnvio(LocalTime.parse(temp, hora));

		System.out.print("Destino: ");
		lote.setDestino(Input.get());

		lotes.add(lote);
	}

	public void mostrarLote(Lote lote) {
		System.out.println("ID: " + lote.getIdentificador());
		System.out.println("Data de Envio: " + lote.getDataEnvio());
		System.out.println("Horário de Envio: " + lote.getHoraEnvio());
		System.out.println("Destino: " + lote.getDestino() + "\n");
	}

	public void mostrarLotes() {
		System.out.println("=========== LISTA DE LOTES ===========");
		int i = 1;

		for (Lote lote : lotes) {
			System.out.println("- REGISTRO " + i);
			mostrarLote(lote);
		}
	}
}
