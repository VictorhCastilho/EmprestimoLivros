public class Livro {
    private String titulo;
    private String autor;
    private int unidadesDisponiveis;

    public Livro(String titulo, String autor, int unidadesDisponiveis) {
        this.titulo = titulo;
        this.autor = autor;
        this.unidadesDisponiveis = unidadesDisponiveis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getUnidadesDisponiveis() {
        return unidadesDisponiveis;
    }

    public void setUnidadesDisponiveis(int unidadesDisponiveis) {
        this.unidadesDisponiveis = unidadesDisponiveis;
    }
}