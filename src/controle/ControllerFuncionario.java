package controle;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import entidade.Funcionario;
import util.Input;

public class ControllerFuncionario {
	ArrayList<Funcionario> funcionarios = new ArrayList<>();

	public void novoFuncionario () {
		Funcionario funcionario = new Funcionario();
		
		System.out.println("===== ADICIONAR FUNCIONÁRIO =====");
		
		System.out.print("ID: ");
		funcionario.setIdentificador(Integer.parseInt(Input.get()));
		System.out.print("Nome: ");
		funcionario.setNome(Input.get());
		System.out.print("Função: ");
		funcionario.setFuncao(Input.get());
		System.out.print("Início do turno (hh:mmAM/PM): ");
		
		
		String temp = Input.get();
		DateTimeFormatter hora = DateTimeFormatter.ofPattern("hh[:mm]a");
		funcionario.setInicioTurno(LocalTime.parse(temp, hora));
	
		System.out.print("Fim do turno (hh:mmAM/PM): ");
		temp = Input.get();	
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
