package entidade;

public class Hangar {
	private int identificador;
	private	String localizacao;
	private String tamanho;
	private int capacidadeLotes;
	private int quantidadeLotes;
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public int getCapacidadeLotes() {
		return capacidadeLotes;
	}
	public void setCapacidadeLotes(int capacidadeLotes) {
		this.capacidadeLotes = capacidadeLotes;
	}

	public int getQuantidadeLotes() {
		return quantidadeLotes;
	}
	public void setQuantidadeLotes(int quantidadeLotes) {
		this.quantidadeLotes = quantidadeLotes;
	}
	
}
