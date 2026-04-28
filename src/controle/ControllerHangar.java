package controle;

import entidade.Hangar;
import util.Input;

public class ControllerHangar {
	
	Hangar hangar = new Hangar();
	public void novoHangar () {
		System.out.println("===== REGISTRO DE HANGAR =====");
		System.out.print("ID: ");
		hangar.setIdentificador(Integer.parseInt(Input.get()));
		System.out.print("Localização: ");
		hangar.setLocalizacao(Input.get());
		System.out.print("Tamanho: ");
		hangar.setTamanho(Input.get());
		System.out.print("Capacidade: ");
		hangar.setCapacidadeLotes(Integer.parseInt(Input.get()));
		System.out.print("Quantidade de lotes: ");
		hangar.setQuantidadeLotes(Integer.parseInt(Input.get()));
		
	}
	
	public void mostrarHangar() {
		System.out.println("==============  HANGAR  ==============");
		System.out.println("ID: " + hangar.getIdentificador());
		System.out.println("Localização: " + hangar.getLocalizacao());
		System.out.println("Tamanho: " + hangar.getTamanho());
		System.out.println("Capacidade total de lotes: " + hangar.getCapacidadeLotes());
		System.out.println("Quantidade atual de lotes: " + hangar.getQuantidadeLotes() + "\n");
		
	}
}
