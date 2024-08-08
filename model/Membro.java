package model;

public class Membro {

	private String nome;
	private String idMembro;
	
	public Membro(String nome, String idMembro) {
		this.nome = nome;
		this.idMembro = idMembro;
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
	
	@Override
	public String toString() {
		return "MEMBRO [" 
				+ "NOME:'" + nome + '\'' 
				+ ", ID:'" + idMembro + '\'' 
				+ ']';
	}
	
}
