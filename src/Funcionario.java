public class Funcionario extends Usuario {
    private String departamento;

    public Funcionario(String nome, String email, String genero, String departamento) {
        super(nome, email, genero);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        String str = departamento;
        return str;
    }

    @Override
    public String getDescricaoUsuario() {
        if (getGenero().equalsIgnoreCase("feminino")) {
            return "Funcionária";
        } else {
            return "Funcionário";
        }
    }

    @Override
    public double getValorMultaPorDia() {
        return 1.0; // Valor da multa por dia para funcionário
    }
}