package controle;

import java.util.ArrayList;

import entidade.Pacote;
import util.Input;

public class ControllerPacote {
	ArrayList<Pacote> pacotes = new ArrayList<>();
	ControllerCorrespondencia controllerCorrespondencia = new ControllerCorrespondencia();
	
	public void novoPacote() {
		Pacote pacote = new Pacote();
		
		System.out.println("==== ADICIONAR PACOTE=====");
		System.out.print("Nome do Remetente: ");
		pacote.setNomeRemetente(Input.get());
		System.out.print("Nome do Destinatário: ");
		pacote.setNomeDestinatario(Input.get());
		System.out.print("Documento: ");
		pacote.setDocumentoRemetente(Input.get());
		System.out.print("Destino: ");
		pacote.setDestino(Input.get());
		System.out.print("Código: ");
		pacote.setCodigoRastreio(Integer.parseInt(Input.get()));
		
		System.out.println("===== INFORMAÇÕES SOBRE PACOTE=====");
		System.out.print("Peso: ");
		pacote.setPeso(Input.get());
		System.out.print("Dimensões: ");
		pacote.setDimensoes(Input.get());
		System.out.print("Conteúdo: ");
		pacote.setConteudo(Input.get());
		System.out.print("Avisos: ");
		pacote.setConteudo(Input.get());
		
		pacotes.add(pacote);
	}
	
	public void mostrarPacote(Pacote p) {
		System.out.println("Nome do Remetente: " + p.getNomeRemetente());
		System.out.println("Nome do Destinatário: " + p.getNomeDestinatario());
		System.out.println("Documento: " + p.getDocumentoRemetente());
		System.out.println("Destino: " + p.getDestino());
		System.out.println("Código: " + p.getCodigoRastreio() + "\n");
	}
	
	public void mostrarPacotes() {
		System.out.println("===== LISTA DE PACOTES ======");
		int i = 1;
		for (Pacote pacote : pacotes) {
			System.out.println("- REGISTRO " + i);
			mostrarPacote(pacote);
			i++;
		}
	}
	

}
