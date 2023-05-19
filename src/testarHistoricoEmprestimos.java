import java.time.LocalDate;

public class testarHistoricoEmprestimos {
    public static void main(String[] args) {
        usuario usuario1 = new aluno("Pedrin", "pedrin@example", "masculino", "engenharia");
        usuario usuario2 = new professor("Joana", "joana@example", "feminino", "matemática");
        livro livro1 = new livro("Exatas: Use a cabeça! Java", "Kathy Sierra e Bert Bates", 7);
        livro livro2 = new livro("Aventura: O Senhor dos Anéis", "J.R.R. Tolkien", 3);
        LocalDate dataEmprestimo1 = LocalDate.parse("2023-05-18");
        LocalDate dataDevolucao1 = LocalDate.parse("2023-05-25");
        LocalDate dataEmprestimo2 = LocalDate.parse("2023-05-20");
        LocalDate dataDevolucao2 = LocalDate.parse("2023-05-27");

        emprestimo emprestimo1 = new emprestimo(dataEmprestimo1, dataDevolucao1, usuario1);
        emprestimo1.adicionarLivro(livro1);
        emprestimo1.adicionarLivro(livro2);

        emprestimo emprestimo2 = new emprestimo(dataEmprestimo2, dataDevolucao2, usuario2);
        emprestimo2.adicionarLivro(livro1);

        historicoDeEmprestimos historico = new historicoDeEmprestimos();
        historico.adicionarEmprestimo(emprestimo1);
        historico.adicionarEmprestimo(emprestimo2);

        System.out.println("Histórico de Empréstimos:");
        for (emprestimo emprestimo : historico.getEmprestimosRealizados()) {
            System.out.println(emprestimo.getDescricao());
        }

        boolean emprestimoEncontrado = historico.verificarEmprestimo(emprestimo1);
        if (emprestimoEncontrado) {
            System.out.println("Empréstimo encontrado no histórico.");
        } else {
            System.out.println("Empréstimo não encontrado no histórico.");
        }

        historico.removerEmprestimo(emprestimo1);

        System.out.println("Histórico de Empréstimos após remoção:");
        for (emprestimo emprestimo : historico.getEmprestimosRealizados()) {
            System.out.println(emprestimo.getDescricao());
        }
    }
}








