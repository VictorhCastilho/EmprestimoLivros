import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteGetLivrosEmprestadosCrescente {
    public static void main(String[] args) {
        // Criação de alguns livros
        Livro livro1 = new Livro("Abacaxi Receitas", "Autor 1", 3);
        Livro livro2 = new Livro("zonias Magia", "Autor 2", 2);
        Livro livro3 = new Livro("Batuque do duque", "Autor 3", 1);

        // Criação de uma lista genérica de livros emprestados
        ListaGenerica<Livro> livrosEmprestados = new ListaGenerica<>();
        livrosEmprestados.adicionar(livro2);
        livrosEmprestados.adicionar(livro1);
        livrosEmprestados.adicionar(livro3);

        // Criação de um objeto de empréstimo
        LocalDate dataEmprestimo = LocalDate.now();
        LocalDate dataDevolucao = dataEmprestimo.plusDays(14);
        Usuario usuario = new Usuario("João", "joao@example.com", "masculino") {
            @Override
            public String getDescricaoUsuario() {
                return null;
            }
        };
        Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, usuario);
        emprestimo.setLivrosEmprestados(livrosEmprestados.getLista());

        // Obtém a lista de livros emprestados em ordem crescente
        List<Livro> livrosOrdenados = emprestimo.getLivrosEmprestadosCrescente();

        // Imprime os livros emprestados em ordem crescente
        System.out.println("Livros emprestados em ordem crescente:");
        for (Livro livro : livrosOrdenados) {
            System.out.println(livro.getTitulo());
        }
    }
}
