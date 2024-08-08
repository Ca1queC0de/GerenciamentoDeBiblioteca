package model;

public class Membro {

	private String nome;
	private String idMembro;
	
	public Membro() {
		this.setNome(nome);
		this.setIdMembro(idMembro);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdMembro() {
		return idMembro;
	}

	public void setIdMembro(String idMembro) {
		this.idMembro = idMembro;
	}
	
	public String exibirInformacoes() {
		return "MEMBRO [" 
				+ "NOME:'" + nome + '\'' 
				+ ", ID:'" + idMembro + '\'' 
				+ ']';
	}
	
}
