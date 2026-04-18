package entidade;

import java.time.LocalTime;

public class Funcionario {
	private int identificador;
	private String nome;
	private String funcao;
	private LocalTime inicioTurno;
	private LocalTime fimTurno;
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public LocalTime getInicioTurno() {
		return inicioTurno;
	}
	public void setInicioTurno(LocalTime inicioTurno) {
		this.inicioTurno = inicioTurno;
	}
	
	public LocalTime getFimTurno() {
		return fimTurno;
	}
	public void setFimTurno(LocalTime fimTurno) {
		this.fimTurno = fimTurno;
	}

}
