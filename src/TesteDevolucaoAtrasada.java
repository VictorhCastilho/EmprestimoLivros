import java.time.LocalDate;

public class TesteDevolucaoAtrasada {
    public static void main(String[] args) {
        // Criação de um livro
        Livro livro1 = new Livro("Livro 1", "Autor 1", 3);

        // Criação de um usuário
        Usuario usuario1 = new Usuario("Usuário 1", "pedro@gmail.com", "masculino") {
            @Override
            public String getDescricaoUsuario() {
                return null;
            }
        };

        // Criação de um empréstimo
        LocalDate dataEmprestimo = LocalDate.now();
        LocalDate dataDevolucao = LocalDate.now().minusDays(7); // Data de devolução atrasada (7 dias atrás)
        Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, usuario1);

        try {
            // Realizar o empréstimo do livro
            emprestimo.emprestimoDeLivro(livro1);
        } catch (LivroNaoDisponivelException e) {
            System.out.println(e.getMessage());
        }

        // Verificar devolução atrasada
        emprestimo.verificarDevolucaoAtrasada(livro1);
    }
}

