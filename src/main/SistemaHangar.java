package main;

import controle.*;
import util.Input;

public class SistemaHangar {

	static ControllerHangar Hangar = new ControllerHangar();
	static ControllerAviao Aviao = new ControllerAviao();
	static ControllerLote Lote = new ControllerLote();
	static ControllerCorrespondencia Correspondencia = new ControllerCorrespondencia();
	static ControllerFuncionario Funcionario = new ControllerFuncionario();
	static ControllerPacote Pacote = new ControllerPacote();

	public static void main(String[] args) {
		menu();

	}

	public static void menu() {
		int opcao;
		System.out.println("\t\t===== SISTEMA HANGAR =====");
		System.out.println("\tESCOLHA UMA OPÇÃO PELO NÚMERO: ");
		System.out.println("1. HANGAR");
		System.out.println("2. AVIÃO");
		System.out.println("3. LOTES");
		System.out.println("4. FUNCIONÁRIOS");
		System.out.print("\nESCOLHA: ");
		opcao = Integer.parseInt(Input.get());

		switch (opcao) {
		case 1: // HANGAR
			System.out.println("===== HANGAR =====");
			System.out.println("1. CADASTRAR HANGAR");
			System.out.println("2. MOSTRAR HANGAR ");
			System.out.print("\nESCOLHA: ");
			opcao = Integer.parseInt(Input.get());

			switch (opcao) {
			case 1:
				Hangar.novoHangar();
				menu();
				break;
			case 2:
				Hangar.mostrarHangar();
				menu();
				break;
			default:
				menuDef();
			}// fim switch

			break; // fim hangar
		case 2: // AVIÃO
			System.out.println("===== AVIÃO =====");
			System.out.println("1. CADASTRAR AVIÃO");
			System.out.println("2. MOSTAR AVIÃO");
			System.out.print("\nESCOLHA: ");
			opcao = Integer.parseInt(Input.get());

			switch (opcao) {
			case 1:
				Aviao.novoAviao();
				menu();
				break;
			case 2:
				Aviao.mostrarAviao();
				menu();
				break;
			default:
				menuDef();
			}// fim switch

			break; // fim aviao
		case 3: // LOTES
			System.out.println("===== LOTES =====");
			System.out.println("1. ADICIONAR LOTE");
			System.out.println("2. MOSTAR LOTE");
			System.out.println("3. CORRESPONDÊNCIAS");
			System.out.print("\nESCOLHA: ");
			opcao = Integer.parseInt(Input.get());

			switch (opcao) {
			case 1:
				Lote.novoLote();
				menu();
				break;
			case 2:
				Lote.mostrarLotes();
				menu();
				break;
			case 3:
				System.out.println("===== CORRESPONDÊNCIAS =====");
				System.out.println("1. ADICIONAR CORRESPONDÊNCIA");
				System.out.println("2. MOSTRAR CORRESPONDÊNCIAS");
				System.out.println("3. ADICIONAR PACOTE");
				System.out.println("4. MOSTRAR PACOTES");
				System.out.print("\nESCOLHA: ");
				opcao = Integer.parseInt(Input.get());

				switch (opcao) {
				case 1:
					Correspondencia.novaCorrespondencia();
					menu();
					break;
				case 2:
					Correspondencia.mostrarCorrespondencias();
					menu();
					break;
				case 3:
					Pacote.novoPacote();
					menu();
					break;
				case 4:
					Pacote.mostrarPacotes();
					menu();
					break;
				default:
					menuDef();
				}// fim switch

			default:
				menuDef();
			}// fim switch

			break; // fim lote

		case 4: // FUNCIONARIOS
			System.out.println("===== FUNCIONÁRIOS =====");
			System.out.println("1. ADICIONAR FUNCIONÁRIO");
			System.out.println("2. MOSTRAR FUNCIONÁRIOS");
			System.out.print("\nESCOLHA: ");
			opcao = Integer.parseInt(Input.get());

			switch (opcao) {
			case 1:
				Funcionario.novoFuncionario();
				menu();
				break;
			case 2:
				Funcionario.mostrarFuncionarios();
				menu();
				break;
			default:
				menuDef();
			}// fim switch

			break; // fim funcionarios
		default:

		} // fim switch

	} // fim menu

	public static void menuDef() {
		System.out.println("OPÇÃO INVÁLIDA! TENTE NOVAMENTE");
		menu();
	}

}