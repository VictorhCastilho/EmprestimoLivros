import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteNomeLivroOrdemAlfabetica {
    public static void main(String[] args) {
        // Criação de alguns livros
        Livro livro1 = new Livro("Abacaxi Receitas", "Autor 1", 3);
        Livro livro2 = new Livro("Aonias Magia", "Autor 2", 2);
        Livro livro3 = new Livro("Batuque do duque", "Autor 3", 1);

        // Criação de uma lista genérica de livros emprestados
        ListaGenerica<Livro> livrosEmprestados = new ListaGenerica<>();

        // Criação de dois usuários diferentes
        Usuario usuario1 = new Aluno("João", "joao@example.com", "masculino", "BSI");
        Usuario usuario2 = new Aluno("Maria", "maria@example.com", "feminino", "Engenharia");

        // Adiciona usuários diferentes aos livros
        livro1.setUsuario(usuario1);
        livro2.setUsuario(usuario2);
        livro3.setUsuario(usuario1);

        // Adiciona os livros à lista de livros emprestados
        livrosEmprestados.adicionar(livro2);
        livrosEmprestados.adicionar(livro1);
        livrosEmprestados.adicionar(livro3);

        // Criação do objeto de empréstimo
        LocalDate dataEmprestimo = LocalDate.now();
        LocalDate dataDevolucao = dataEmprestimo.plusDays(14);
        Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, usuario1);
        emprestimo.setLivrosEmprestados(livrosEmprestados.getLista());

        // Obtém a lista de livros emprestados em ordem alfabética
        List<Livro> livrosOrdenados = emprestimo.getLivrosEmprestadosOrdemAlfabetica();

        // Imprime os livros emprestados em ordem alfabética
        System.out.println("Livros emprestados em ordem alfabética:");
        for (Livro livro : livrosOrdenados) {
            System.out.println("Livro: " + livro.getTitulo() + ", Usuário: " + livro.getUsuario().getNome());
        }
    }
}
