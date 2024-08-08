package main;

import model.Livro;
import model.Membro;
import model.Emprestimo;
import service.ServicoBiblioteca;

import java.util.Scanner;

public class AppBiblioteca {

    public static void main(String[] args) {
    	
        ServicoBiblioteca servicoBiblioteca = new ServicoBiblioteca();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos livros serão adicionados? ");
        int quantidadeLivros = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidadeLivros; i++) {
            System.out.print("Qual o título da obra? ");
            String titulo = scanner.nextLine().toUpperCase();
            System.out.print("Qual o nome do autor? ");
            String autor = scanner.nextLine().toUpperCase();
            System.out.print("Qual o número de páginas? ");
            String numeroPaginas = scanner.nextLine();

            Livro livro = new Livro(titulo, autor, numeroPaginas);
            servicoBiblioteca.adicionarLivro(livro);
        }

        System.out.print("Quantos membros serão adicionados? ");
        int quantidadeMembros = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidadeMembros; i++) {
            System.out.print("Nome do membro [" + i + "]: ");
            String nome = scanner.nextLine().toUpperCase();
            System.out.print("ID do membro [" + i + "]: ");
            String idMembro = scanner.nextLine();

            Membro membro = new Membro(idMembro, idMembro);
            servicoBiblioteca.adicionarMembro(membro);
        }

        System.out.println("Livros Disponíveis: ");
        for (Livro livro : servicoBiblioteca.listarLivros()) {
            System.out.println(livro);
        }

        System.out.print("Digite o nome do livro para emprestar: ");
        String emprestarLivro = scanner.nextLine().toUpperCase();
        System.out.print("Insira a ID do membro: ");
        String emprestimoMembroID = scanner.nextLine();

        Livro emprestimoLivro = null;
        Membro emprestimoMembro = null;

        for (Livro livro : servicoBiblioteca.listarLivros()) {
            if (livro.getTitulo().equals(emprestarLivro)) {
                emprestimoLivro = livro;
                break;
            }
        }

        for (Membro membro : servicoBiblioteca.listarMembros()) {
            if (membro.getIdMembro().equals(emprestimoMembroID)) {
                emprestimoMembro = membro;
                break;
            }
        }

        if (emprestimoLivro != null && emprestimoMembro != null) {
            servicoBiblioteca.emprestarLivro(emprestimoLivro, emprestimoMembro);
        } else {
            System.out.println("Livro ou membro não encontrado :(");
        }

        System.out.println("Empréstimos: ");
        for (Emprestimo emprestimo : servicoBiblioteca.listarEmprestimos()) {
            System.out.println(emprestimo);
        }

        System.out.print("Digite o nome do livro para devolver: ");
        String devolverLivro = scanner.nextLine().toUpperCase();

        Emprestimo devEmprestimo = null;

        for (Emprestimo emprestimo : servicoBiblioteca.listarEmprestimos()) {
            if (emprestimo.getLivro().getTitulo().equals(devolverLivro) && emprestimo.getDataDevolucao() == null) {
                devEmprestimo = emprestimo;
                break;
            }
        }

        if (devEmprestimo != null) {
            servicoBiblioteca.devolverLivro(devEmprestimo);
        } else {
            System.out.println("Empréstimo não encontrado ou livro já devolvido.");
        }

        System.out.println("Empréstimos após retorno: ");
        for (Emprestimo emprestimo : servicoBiblioteca.listarEmprestimos()) {
            System.out.println(emprestimo);
        }

        scanner.close();
    }
}
