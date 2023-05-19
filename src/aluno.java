public class aluno extends usuario {
    private String curso;

    public aluno(String nome, String email, String genero, String curso) {
        super(nome, email, genero);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

}
