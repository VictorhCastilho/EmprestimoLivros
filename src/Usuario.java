public abstract class Usuario {
    private static int proximaMatricula = 1;
    private int matricula;
    private String nome;
    private String email;
    private String genero;

    public Usuario(String nome, String email, String genero) {
        this.matricula = proximaMatricula++;
        this.nome = nome;
        this.email = email;
        this.genero = genero;
    }

    public String getDecriçãoDoUsuario() {
        return "Usuário: " + getDescricaoUsuario() + " " + getNome() + " (" + getEmail() + ")";
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        String str = this.nome;
        return str;
    }

    public String getEmail() {
        String str = this.email;
        return str;
    }

    public String getGenero() {
        String str = this.genero;
        return str;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public abstract String getDescricaoUsuario();

    public abstract double getValorMultaPorDia();
}