package service;

import model.Livro;
import model.Emprestimo;
import model.Membro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServicoBiblioteca {

    private List<Livro> livros = new ArrayList<>();
    private List<Membro> membros = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    //Livros
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public List<Livro> listarLivros() {
        return new ArrayList<>(livros);
    }

    //Membros
    public void adicionarMembro(Membro membro) {
        membros.add(membro);
    }

    public void removerMembro(Membro membro) {
        membros.remove(membro);
    }

    public List<Membro> listarMembros() {
        return new ArrayList<>(membros);
    }

    //Empréstimos
    public void emprestarLivro(Livro livro, Membro membro) {
        Emprestimo emprestimo = new Emprestimo(livro, membro, LocalDate.now(), null);
        emprestimos.add(emprestimo);
    }

    public void devolverLivro(Emprestimo emprestimo) {
        emprestimo.setDataDevolucao(LocalDate.now());
    }

    public List<Emprestimo> listarEmprestimos() {
        return new ArrayList<>(emprestimos);
    }

    //verifica se um livro já está emprestado
    public boolean isLivroEmprestado(Livro livro) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().equals(livro) && emprestimo.getDataDevolucao() == null) {
                return true; 
            }
        }
        return false;
    }
}
