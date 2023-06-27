import java.time.LocalDate;

public class TesteEmprestimo {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("João", "joao@email.com", "Masculino", "Engenharia");

        LocalDate dataEmprestimo = LocalDate.now();
        LocalDate dataDevolucao = LocalDate.now().plusDays(7);
        Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, aluno);

        Livro livro1 = new Livro("As Aventuras de Jobercleison", "Jobercleison", 3);
        Livro livro2 = new Livro("Pneu Assassino", "Flavin do Pneu", 5);
        try {
            emprestimo.emprestimoDeLivro(livro1);
        } catch (LivroNaoDisponivelException e) {
            throw new RuntimeException(e);
        }
        try {
            emprestimo.emprestimoDeLivro(livro2);
        } catch (LivroNaoDisponivelException e) {
            throw new RuntimeException(e);
        }

        String descricaoUsuario = IdentificadorDeUsuario.identificarUsuario(aluno);
        System.out.println("Tipo de usuário: " + descricaoUsuario);

        System.out.println("Curso: " + aluno.getCurso());

        System.out.println("Informações do Empréstimo:");
        System.out.println(emprestimo.getInformacoesEmprestimo());
    }
}
