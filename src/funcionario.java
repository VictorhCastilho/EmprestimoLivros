public class funcionario extends usuario {
    private String departamento;

    public funcionario(String nome, String email, String genero, String departamento) {
        super(nome, email, genero);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}