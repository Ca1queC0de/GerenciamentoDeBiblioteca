package model;

public class Livro {
	
	private String titulo;
	private String autor;
	private int numeroPaginas;
	
	public Livro(String titulo, String autor, int numeroPaginas) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setNumeroPaginas(numeroPaginas);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	public String exibirInformacoes() {
		return "LIVRO [" 
				+ "TÍTULO:'" + titulo + '\'' 
				+ ", AUTOR:'" + autor + '\'' 
				+ ", PAGINAS:'" + numeroPaginas + '\'' 
				+ ']';
	}
	
}

