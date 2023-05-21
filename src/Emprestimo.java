import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private Usuario usuario;
    private List<Livro> livrosEmprestados;

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataDevolucao, Usuario usuario) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.usuario = usuario;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    public boolean verificarLivro(Livro livro) {
        return livrosEmprestados.contains(livro);
    }

    public String getDescricao() {
        StringBuilder descricao = new StringBuilder();
        descricao.append("Usuário: ").append(usuario.getNome()).append(" (").append(usuario.getEmail()).append(")\n");
        descricao.append("Livros:\n");
        for (Livro livro : livrosEmprestados) {
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public String getInformacoesEmprestimo() {
        StringBuilder informacoes = new StringBuilder();
        informacoes.append("Usuário: ").append(usuario.getNome()).append("\n");
        informacoes.append("Data do Empréstimo: ").append(dataEmprestimo.toString()).append("\n");
        informacoes.append("Data de Devolução: ").append(dataDevolucao.toString()).append("\n");
        return informacoes.toString();
    }
}
