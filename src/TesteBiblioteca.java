import java.time.LocalDate;

public class TesteBiblioteca {
    public static void main(String[] args) {

        Livro livro = new Livro("Livro 1", "Autor 1", 1);

        Emprestimo emprestimo = new Emprestimo(LocalDate.now(), LocalDate.now().plusDays(7), null);

        try {
            emprestimo.emprestimoDeLivro(livro);
        } catch (LivroNaoDisponivelException e) {
            throw new RuntimeException(e);
        }

        System.out.println("O livro está emprestado? " + emprestimo.disponibilidadeDoLivro(livro));

        emprestimo.devoluçãoDeLivro(livro);

        System.out.println("O livro está emprestado? " + emprestimo.disponibilidadeDoLivro(livro));
    }
}

