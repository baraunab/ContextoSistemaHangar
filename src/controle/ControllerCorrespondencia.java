package controle;

import java.util.ArrayList;
import java.util.Scanner;

import entidade.Correspondencia;

public class ControllerCorrespondencia {
	ArrayList<Correspondencia> correspondencias = new ArrayList<>();

	public void novaCorrespondencia() {
		Scanner scNomeRem = new Scanner(System.in);
		Scanner scNomeDes = new Scanner(System.in);
		Scanner scDoc = new Scanner(System.in);
		Scanner scDestino = new Scanner(System.in);
		Scanner scCod= new Scanner(System.in);
		
		Correspondencia correspondencia = new Correspondencia();
		
		System.out.println("===== ADICIONAR CORRESPONDÊNCIA =====");
		
		System.out.print("Nome do Remetente: ");
		correspondencia.setNomeRemetente(scNomeRem.nextLine());
		System.out.print("Nome do Destinatário: ");
		correspondencia.setNomeDestinatario(scNomeDes.nextLine());
		System.out.print("Documento: ");
		correspondencia.setDocumentoRemetente(scDoc.nextLine());
		System.out.print("Destino: ");
		correspondencia.setDestino(scDestino.nextLine());
		System.out.print("Código: ");
		correspondencia.setCodigoRastreio(scCod.nextInt());
		
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
			System.out.print("- REGISTRO " + i);
			mostrarCorrespondencia(correspondencia);
			i++;
		}
	}
}
