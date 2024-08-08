package model;

public class Livro {
	
	private String titulo;
	private String autor;
	private String numeroPaginas;
	
	public Livro(String titulo, String autor, String numeroPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
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

	public String getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(String numeroPaginas2) {
		this.numeroPaginas = numeroPaginas2;
	}
	
	@Override
	public String toString() {
		return "LIVRO [" 
			+ "TÍTULO:'" + titulo + '\'' 
			+ ", AUTOR:'" + autor + '\'' 
			+ ", PAGINAS:'" + numeroPaginas + '\'' 
			+ ']';
	}
	

}
