public class identificadorDeUsuario {
    public static String identificarUsuario(usuario usuario) {
        if (usuario instanceof aluno) {
            aluno aluno = (aluno) usuario;
            if (aluno.getGenero().equalsIgnoreCase("feminino")) {
                return "Aluna";
            } else {
                return "Aluno";
            }
        } else if (usuario instanceof professor) {
            professor professor = (professor) usuario;
            if (professor.getGenero().equalsIgnoreCase("feminino")) {
                return "Professora";
            } else {
                return "Professor";
            }
        } else if (usuario instanceof funcionario) {
            funcionario funcionario = (funcionario) usuario;
            if (funcionario.getGenero().equalsIgnoreCase("feminino")) {
                return "Funcionária";
            } else {
                return "Funcionário";
            }
        } else {
            return "Usuário";
        }
    }
}
