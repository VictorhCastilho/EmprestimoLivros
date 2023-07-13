public class Professor extends Usuario {
    private String departamento;

    public Professor(String nome, String email, String genero, String departamento) {
        super(nome, email, genero);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        String str = this.departamento;
        return str;
    }

    @Override
    public String getDescricaoUsuario() {
        if (getGenero().equalsIgnoreCase("feminino")) {
            return "Professora";
        } else {
            return "Professor";
        }
    }

    @Override
    public double getValorMultaPorDia() {
        return 0;
    }
}