package entidade;

import java.time.LocalDate;
import java.time.LocalTime;

public class Lote {
	private int identificador;
	private LocalDate dataEnvio;
	private LocalTime horaEnvio;
	private String destino;
	//Correspondencia correspondencia;
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public LocalDate getDataEnvio() {
		return dataEnvio;
	}
	public void setDataEnvio(LocalDate dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	
	public LocalTime getHoraEnvio() {
		return horaEnvio;
	}
	public void setHoraEnvio(LocalTime horaEnvio) {
		this.horaEnvio = horaEnvio;
	}
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
}