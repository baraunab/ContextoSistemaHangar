package entidade;

import java.time.LocalDate;

public class Aviao {
	private String nomeAviao;
	private LocalDate dataEmbarque;
	private LocalDate dataDesembarque;
	private String destino;
	private int qtdLotes;
	//Lote lote;
	
	public String getNomeAviao() {
		return nomeAviao;
	}
	public void setNomeAviao(String nomeAviao) {
		this.nomeAviao = nomeAviao;
	}
	
	public LocalDate getDataEmbarque() {
		return dataEmbarque;
	}
	public void setDataEmbarque(LocalDate dataEmbarque) {
		this.dataEmbarque = dataEmbarque;
	}
	
	public LocalDate getDataDesembarque() {
		return dataDesembarque;
	}
	public void setDataDesembarque(LocalDate dataDesembarque) {
		this.dataDesembarque = dataDesembarque;
	}
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public int getQtdLotes() {
		return qtdLotes;
	}
	public void setQtdLotes(int qtdLotes) {
		this.qtdLotes = qtdLotes;
	}

}
