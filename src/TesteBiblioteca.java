import java.time.LocalDate;

public class TesteBiblioteca {
    public static void main(String[] args) {

        Livro livro = new Livro("Livro 1", "Autor 1", 5);

        Emprestimo emprestimo = new Emprestimo(LocalDate.now(), LocalDate.now().plusDays(7), null);

        emprestimo.adicionarLivro(livro);

        System.out.println("O livro está emprestado? " + emprestimo.verificarLivro(livro));

        emprestimo.removerLivro(livro);

        System.out.println("O livro está emprestado? " + emprestimo.verificarLivro(livro));
    }
}

