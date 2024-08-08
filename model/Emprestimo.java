package model;

import java.time.LocalDate;

public class Emprestimo {

	private Livro livro;
	private Membro membro;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	
	public Emprestimo(Livro livro, Membro membro, 
			LocalDate dataEmprestimo, LocalDate dataDevolucao) {
		
		this.setLivro(livro);
		this.setMembro(membro);
		this.setDataEmprestimo(dataEmprestimo);
		this.setDataDevolucao(dataDevolucao);
		
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Membro getMembro() {
		return membro;
	}

	public void setMembro(Membro membro) {
		this.membro = membro;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public String exibirInformacoes() {
		return "EMPRÉSTIMO [" 
				+ "LIVRO:'" + livro + '\'' 
				+ ", MEMBRO:'" + membro + '\'' 
				+ ", DATA DO EMPRÉSTIMO:'" + dataEmprestimo + '\'' 
				+ ", DATA DA DEVOLUÇÃO:'" + dataDevolucao + '\'' 
				+ ']';
	}
	
}
