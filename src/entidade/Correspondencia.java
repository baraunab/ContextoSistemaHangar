package entidade;

public class Correspondencia {
	private String nomeRemetente;
	private String nomeDestinatario;
	private String documentoRemetente;
	private String destino;
	private int codigoRastreio;
	
	public String getNomeRemetente() {
		return nomeRemetente;
	}
	public void setNomeRemetente(String nomeRemetente) {
		this.nomeRemetente = nomeRemetente;
	}
	
	public String getNomeDestinatario() {
		return nomeDestinatario;
	}
	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}
	
	public String getDocumentoRemetente() {
		return documentoRemetente;
	}
	public void setDocumentoRemetente(String documentoRemetente) {
		this.documentoRemetente = documentoRemetente;
	}
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getCodigoRastreio() {
		return codigoRastreio;
	}
	public void setCodigoRastreio(int codigoRastreio) {
		this.codigoRastreio = codigoRastreio;
	}
	
}
