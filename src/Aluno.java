public class Aluno extends Usuario {
    private String curso;

    public Aluno(String nome, String email, String genero, String curso) {
        super(nome, email, genero);
        this.curso = curso;
    }

    public String getCurso() {
        String str = this.curso;
        return str;
    }

    @Override

    public String getDescricaoUsuario() {
        if (getGenero().equalsIgnoreCase("feminino")) {
            return "Aluna";
        } else {
            return "Aluno";
        }
    }

    @Override
    public double getValorMultaPorDia() {
        return 2.0; // Valor da multa por dia para Aluno
    }
}