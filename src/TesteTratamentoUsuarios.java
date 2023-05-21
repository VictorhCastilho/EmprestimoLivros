public class TesteTratamentoUsuarios {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("José da Silva", "aluno@gmail.com", "Masculino", "Engenharia");
        Aluno aluna = new Aluno("Joana de Oliveira", "aluna@gmail.com", "Feminino", "Medicina");
        Professor professor = new Professor("Joao", "professor@gmail.com", "Masculino", "Matemática");
        Professor professora = new Professor("Clara", "professora@gmail.com", "Feminino", "História");
        Funcionario funcionario = new Funcionario("Jonathan", "funcionario@gmail.com", "Masculino", "Administrativo");
        Funcionario funcionaria = new Funcionario("Lucia", "funcionaria@gmail.com", "Feminino", "Recursos Humanos");

        System.out.println("Tratamento para José: " + aluno.getDescricaoUsuario());
        System.out.println("Tratamento para Joana: " + aluna.getDescricaoUsuario());
        System.out.println("Tratamento para Joao: " + professor.getDescricaoUsuario());
        System.out.println("Tratamento para Clara: " + professora.getDescricaoUsuario());
        System.out.println("Tratamento para Jonathan: " + funcionario.getDescricaoUsuario());
        System.out.println("Tratamento para Lucia: " + funcionaria.getDescricaoUsuario());
    }
}

