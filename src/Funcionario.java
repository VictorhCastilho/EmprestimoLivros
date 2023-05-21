public class Funcionario extends Usuario {
    private String departamento;

    public Funcionario(String nome, String email, String genero, String departamento) {
        super(nome, email, genero);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String getDescricaoUsuario() {
        if (getGenero().equalsIgnoreCase("feminino")) {
            return "Funcionária";
        } else {
            return "Funcionário";
        }
    }
}