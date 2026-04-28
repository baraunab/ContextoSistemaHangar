package controle;

import java.util.ArrayList;

import entidade.Correspondencia;
import util.Input;

public class ControllerCorrespondencia {
	ArrayList<Correspondencia> correspondencias = new ArrayList<>();

	public void novaCorrespondencia() {
		Correspondencia correspondencia = new Correspondencia();
		
		System.out.println("===== ADICIONAR CORRESPONDÊNCIA =====");
		
		System.out.print("Nome do Remetente: ");
		correspondencia.setNomeRemetente(Input.get());
		System.out.print("Nome do Destinatário: ");
		correspondencia.setNomeDestinatario(Input.get());
		System.out.print("Documento: ");
		correspondencia.setDocumentoRemetente(Input.get());
		System.out.print("Destino: ");
		correspondencia.setDestino(Input.get());
		System.out.print("Código: ");
		correspondencia.setCodigoRastreio(Integer.parseInt(Input.get()));
		
		correspondencias.add(correspondencia);
	
	}
	
	public void mostrarCorrespondencia(Correspondencia c) {
		System.out.println("Nome do Remetente: " + c.getNomeRemetente());
		System.out.println("Nome do Destinatário: " + c.getNomeDestinatario());
		System.out.println("Documento: " + c.getDocumentoRemetente());
		System.out.println("Destino: " + c.getDestino());
		System.out.println("Código: " + c.getCodigoRastreio() + "\n");
	}
	
	public void mostrarCorrespondencias() {
		System.out.println("===== LISTA DE CORRESPONDÊNCIAS ======");
		int i = 1;
		for (Correspondencia correspondencia : correspondencias) {
			System.out.println("- REGISTRO " + i);
			mostrarCorrespondencia(correspondencia);
			i++;
		}
	}
}
