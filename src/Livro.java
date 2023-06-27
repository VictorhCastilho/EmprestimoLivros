import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private int unidadesDisponiveis;
    private List<Usuario> usuariosEmprestimo;

    public Livro(String titulo, String autor, int unidadesDisponiveis) {
        this.titulo = titulo;
        this.autor = autor;
        this.unidadesDisponiveis = unidadesDisponiveis;
        this.usuariosEmprestimo = new ArrayList<>();
    }

    public String getDescricao() {
        return "Livro: " + getTitulo() + "\n" + getAutor() + "\n" + getUnidadesDisponiveis() + " unidades disponíveis.";
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

    public void adicionarUsuarioEmprestimo(Usuario usuario) {
        if (!usuariosEmprestimo.contains(usuario)) {
            usuariosEmprestimo.add(usuario);
        } else {
            throw new IllegalArgumentException("O usuário já está na lista de empréstimo do livro.");
        }
    }

    public void removerUsuarioEmprestimo(Usuario usuario) {
        if (usuariosEmprestimo.contains(usuario)) {
            usuariosEmprestimo.remove(usuario);
        } else {
            throw new IllegalArgumentException("O usuário não está na lista de empréstimo do livro.");
        }
    }

    public Usuario getUsuario() {
        if (usuariosEmprestimo.isEmpty()) {
            return null;
        }
        return usuariosEmprestimo.get(0);
    }

    public String getDescricaoUsuariosEmprestimo() {
        StringBuilder descricao = new StringBuilder("Usuários que emprestaram o livro ").append(titulo).append(":\n");

        for (Usuario usuario : usuariosEmprestimo) {
            descricao.append(usuario.getNome()).append("\n");
        }

        return descricao.toString();
    }
}