public class TesteIdentificadorDeUsuario {
    public static void main(String[] args) {

        String identificacaoAluno = IdentificadorDeUsuario.identificarUsuario(new Aluno("José da Silva", "aluno@gmail.com", "Masculino", "Engenharia"));
        String identificacaoProfessor = IdentificadorDeUsuario.identificarUsuario(new Professor("Joana", "professora@gmail.com", "Feminino", "Matemática"));
        String identificacaoFuncionario = IdentificadorDeUsuario.identificarUsuario(new Funcionario("Carlos", "funcionario@gmail.com", "Masculino", "Administrativo"));

        System.out.println(identificacaoAluno);
        System.out.println(identificacaoProfessor);
        System.out.println(identificacaoFuncionario);
    }
}

