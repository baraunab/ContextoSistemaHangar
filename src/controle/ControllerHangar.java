package controle;

import java.util.Scanner;

import entidade.Hangar;

public class ControllerHangar {
	
	Hangar hangar = new Hangar();
	public void novoHangar () {
		
		Scanner scID = new Scanner(System.in);
		Scanner scLoc = new Scanner(System.in);
		Scanner scTamanho = new Scanner(System.in);
		Scanner scCapacidade= new Scanner(System.in);
		Scanner scQuantidade= new Scanner(System.in);
		
		System.out.println("===== REGISTRO DE HANGAR =====");
		System.out.print("ID: ");
		hangar.setIdentificador(scID.nextInt());
		System.out.print("Localização: ");
		hangar.setLocalizacao(scLoc.nextLine());
		System.out.print("Tamanho: ");
		hangar.setTamanho(scTamanho.nextLine());
		System.out.print("Capacidade: ");
		hangar.setCapacidadeLotes(scCapacidade.nextInt());
		System.out.print("Quantidade de lotes: ");
		hangar.setQuantidadeLotes(scQuantidade.nextInt());
		
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
