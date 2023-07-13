import java.time.LocalDate;
import java.util.List;

public class TesteListaNomeUsuario {
    public static void main(String[] args) throws LivroNaoDisponivelException {
        // Criar alguns objetos de livro e usuário
        Livro livro1 = new Livro("Harry Potter", "Matheus", 7);
        Livro livro2 = new Livro("O pequeno principe", "Carlos", 5);
        Livro livro3 = new Livro("João e o pe de feijão", "Lipe", 3);

        Usuario usuario1 = new Aluno("Joaozin", "joaozin@gmail.com", "Masculino", "Química");
        Usuario usuario2 = new Aluno("clara", "clarinha@gmail.com", "Feminino", "Letras");

        // Criar um objeto de empréstimo
        Emprestimo emprestimo = new Emprestimo(LocalDate.now(), LocalDate.now().plusDays(7), usuario1);

        // Adicionar os livros ao empréstimo e definir o usuário correspondente
        emprestimo.emprestimoDeLivro(livro1);
        livro1.setUsuario(usuario1);

        emprestimo.emprestimoDeLivro(livro2);
        livro2.setUsuario(usuario2);

        emprestimo.emprestimoDeLivro(livro3);
        livro3.setUsuario(usuario1);

        // Obter a lista de livros em ordem alfabética pelo nome do usuário
        List<Livro> livrosOrdenados = emprestimo.getListaUsuarioOrdemAlfabetica();

        // Exibir os livros na ordem obtida
        for (Livro livro : livrosOrdenados) {
            System.out.println("Livro: " + livro.getTitulo() + ", Usuário: " + livro.getUsuario().getNome());
        }
    }
}
