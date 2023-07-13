import java.time.LocalDate;

public class TesteDevolucaoAtrasada {
    public static void main(String[] args) {

        // Criação de um livro
        Livro livro1 = new Livro("Bartolomeu Kuma", "Desconhecido", 3);

        Livro livro2 = new Livro("Ace", "Portgas", 3);

        // Criação de um usuário
        Usuario usuario1 = new Aluno("Flávio", "flavio@gmail.com", "Masculino", "metalurgia") {
            @Override
            public String getDescricaoUsuario() {
                return null;
            }
        };

        Usuario usuario2 = new Professor("Kátia", "Kátia@gmail.com", "Feminino", "metalurgia") {
            @Override
            public String getDescricaoUsuario() {
                return null;
            }
        };

        // Criação de um empréstimo
        LocalDate dataEmprestimo = LocalDate.now();
        LocalDate dataDevolucao = LocalDate.now().minusDays(7); // Data de devolução atrasada (7 dias atrás)
        Emprestimo emprestimo1 = new Emprestimo(dataEmprestimo, dataDevolucao, usuario1);

        Emprestimo emprestimo2 = new Emprestimo(dataEmprestimo, dataDevolucao, usuario2);

        try {
            // Realizar o empréstimo do livro
            emprestimo1.emprestimoDeLivro(livro1);
        } catch (LivroNaoDisponivelException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Realizar o empréstimo do livro
            emprestimo2.emprestimoDeLivro(livro2);
        } catch (LivroNaoDisponivelException e) {
            System.out.println(e.getMessage());
        }

        // Verificar devolução atrasada
        emprestimo1.verificarDevolucaoAtrasada(livro1);
        emprestimo2.verificarDevolucaoAtrasada(livro2);

    }
}

