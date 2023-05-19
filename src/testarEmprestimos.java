import java.time.LocalDate;
public class testarEmprestimos {
    public static void main(String[] args) {
        usuario usuario = new aluno("Fulano", "fulano@example", "masculino", "engenharia");
        livro livro1 = new livro("Exatas: Use a cabeça! Java", "Kathy Sierra e Bert Bates", 7);
        livro livro2 = new livro("Aventura: O Senhor dos Anéis", "J.R.R. Tolkien", 3);
        LocalDate dataEmprestimo = LocalDate.parse("2023-05-18");
        LocalDate dataDevolucao = LocalDate.parse("2023-05-25");

        emprestimo emprestimo = new emprestimo(dataEmprestimo, dataDevolucao, usuario);

        emprestimo.adicionarLivro(livro1);
        emprestimo.adicionarLivro(livro2);

        System.out.println(emprestimo.getDescricao());

        emprestimo.removerLivro(livro1);

        System.out.println(emprestimo.getDescricao());

        boolean livroEncontrado = emprestimo.verificarLivro(livro1);
        if (livroEncontrado) {
            System.out.println("Livro encontrado no empréstimo.");
        } else {
            System.out.println("Livro não encontrado no empréstimo.");
        }
    }
}







