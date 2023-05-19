public class professor extends usuario {
    private String departamento;

    public professor(String nome, String email, String genero, String departamento) {
        super(nome, email, genero);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}
