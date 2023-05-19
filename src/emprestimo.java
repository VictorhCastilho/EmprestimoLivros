import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class emprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private usuario usuario;
    private List<livro> livrosEmprestados;

    public emprestimo(LocalDate dataEmprestimo, LocalDate dataDevolucao, usuario usuario) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.usuario = usuario;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void adicionarLivro(livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivro(livro livro) {
        livrosEmprestados.remove(livro);
    }

    public boolean verificarLivro(livro livro) {
        return livrosEmprestados.contains(livro);
    }

    public String getDescricao() {
        StringBuilder descricao = new StringBuilder();
        descricao.append("Usuário: ").append(usuario.getNome()).append(" (").append(usuario.getEmail()).append(")\n");
        descricao.append("Livros:\n");
        for (livro livro : livrosEmprestados) {
            descricao.append(livro.getTitulo()).append("\n");
            descricao.append(livro.getAutor()).append("\n");
            descricao.append(livro.getUnidadesDisponiveis()).append(" unidades disponíveis.\n");
        }
        return descricao.toString();
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }

    public List<livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
}