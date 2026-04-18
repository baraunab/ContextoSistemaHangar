package controle;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import entidade.Funcionario;

public class ControllerFuncionario {
	ArrayList<Funcionario> funcionarios = new ArrayList<>();

	public void novoFuncionario () {
		Scanner scId= new Scanner(System.in);
		Scanner scNome = new Scanner(System.in);
		Scanner scFuncao= new Scanner(System.in);
		Scanner scinicioTurno = new Scanner(System.in);
		Scanner scFImTurno = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("===== ADICIONAR FUNCIONÁRIO =====");
		
		System.out.print("ID: ");
		funcionario.setIdentificador(scId.nextInt());
		System.out.print("Nome: ");
		funcionario.setNome(scNome.nextLine());
		System.out.print("Função: ");
		funcionario.setFuncao(scFuncao.nextLine());
		System.out.print("Início do turno (hh:mmAM/PM): ");
		
		
		String temp = scinicioTurno.nextLine();
		DateTimeFormatter hora = DateTimeFormatter.ofPattern("hh[:mm]a");
		funcionario.setInicioTurno(LocalTime.parse(temp, hora));
	
		System.out.print("Fim do turno (hh:mmAM/PM): ");
		temp = scFImTurno.nextLine();	
		funcionario.setFimTurno(LocalTime.parse(temp, hora));		
		
		funcionarios.add(funcionario);
	}
	
	public void mostrarFuncionario(Funcionario func) {
		System.out.println("Nome: " + func.getNome());
		System.out.println("Função: " + func.getFuncao());
		System.out.println("Periodo de Atuacao: " + func.getInicioTurno() + " a " + func.getFimTurno() + "\n");
	}
	
	public void mostrarFuncionarios() {
		System.out.println("===== LISTA DE FUNCIONÁRIOS =====");
		int i = 1;
		for (Funcionario funcionario : funcionarios) {
			System.out.println("- REGISTRO " + i);
			mostrarFuncionario(funcionario);
			i++;
		}
	}
	
}
