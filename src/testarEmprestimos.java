import java.time.LocalDate;

public class testarEmprestimos {
    public static void main(String[] args) {
        usuario aluno = new aluno("Pedrin", "pedrin@example", "masculino", "engenharia");
        usuario professor = new professor("Joana", "joana@example", "feminino", "matemática");
        usuario funcionario = new funcionario("Marcos", "marcos@example", "masculino", "administração");

        livro livro1 = new livro("Exatas: Use a cabeça! Java", "Kathy Sierra e Bert Bates", 7);
        livro livro2 = new livro("Aventura: O Senhor dos Anéis", "J.R.R. Tolkien", 3);

        LocalDate dataEmprestimo = LocalDate.parse("2023-05-18");
        LocalDate dataDevolucao = LocalDate.parse("2023-05-25");

        emprestimo emprestimoAluno = new emprestimo(dataEmprestimo, dataDevolucao, aluno);
        emprestimoAluno.adicionarLivro(livro1);

        emprestimo emprestimoProfessor = new emprestimo(dataEmprestimo, dataDevolucao, professor);
        emprestimoProfessor.adicionarLivro(livro2);

        emprestimo emprestimoFuncionario = new emprestimo(dataEmprestimo, dataDevolucao, funcionario);
        emprestimoFuncionario.adicionarLivro(livro1);
        emprestimoFuncionario.adicionarLivro(livro2);

        System.out.println("Empréstimo do Aluno:");
        System.out.println(emprestimoAluno.getDescricao());

        System.out.println("Empréstimo do Professor:");
        System.out.println(emprestimoProfessor.getDescricao());

        System.out.println("Empréstimo do Funcionário:");
        System.out.println(emprestimoFuncionario.getDescricao());
    }
}