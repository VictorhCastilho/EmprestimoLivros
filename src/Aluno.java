public class Aluno extends Usuario {
    private String curso;

    public Aluno(String nome, String email, String genero, String curso) {
        super(nome, email, genero);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String getDescricaoUsuario() {
        if (getGenero().equalsIgnoreCase("feminino")) {
            return "Aluna";
        } else {
            return "Aluno";
        }
    }
}
