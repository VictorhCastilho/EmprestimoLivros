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

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public abstract String getDescricaoUsuario();

}