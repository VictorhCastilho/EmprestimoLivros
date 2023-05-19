public class testarUsuarios {
    public static void main(String[] args) {
        aluno aluno = new aluno("João", "joao@example.com", "masculino", "Engenharia");
        professor professor = new professor("Maria", "maria@example.com", "feminino", "Ciências");
        funcionario funcionario = new funcionario("Pedro", "pedro@example.com", "masculino", "Administração");

        String identificacaoAluno = identificadorDeUsuario.identificarUsuario(aluno);
        String identificacaoProfessor = identificadorDeUsuario.identificarUsuario(professor);
        String identificacaoFuncionario = identificadorDeUsuario.identificarUsuario(funcionario);

        System.out.println("Identificação do Aluno: " + identificacaoAluno);
        System.out.println("Identificação do Professor: " + identificacaoProfessor);
        System.out.println("Identificação do Funcionário: " + identificacaoFuncionario);
    }
}
