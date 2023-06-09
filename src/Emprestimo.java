import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private Usuario usuario;
    private List<Livro> livrosEmprestados;
    private List<Usuario> usuariosEmprestimo;

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataDevolucao, Usuario usuario) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.usuario = usuario;
        this.livrosEmprestados = new ArrayList<>();
        this.usuariosEmprestimo = new ArrayList<>();
    }

    public void emprestimoDeLivro(Livro livro) throws LivroNaoDisponivelException {
        if (livro.getUnidadesDisponiveis() == 0) {
            throw new LivroNaoDisponivelException("O livro " + livro.getTitulo() + " não está disponível para empréstimo.");
        }

        livrosEmprestados.add(livro);
        livro.setUnidadesDisponiveis(livro.getUnidadesDisponiveis() - 1);
        livro.adicionarUsuarioEmprestimo(usuario);
    }

    public void devoluçãoDeLivro(Livro livro) {
        livrosEmprestados.remove(livro);             //  Remove um livro da lista de livros emprestados
        livro.removerUsuarioEmprestimo(usuario);
    }

    public void verificarDevolucaoAtrasada(Livro livro) {     // Verifica se a devolução foi atrasada e aplica multa
        LocalDate dataAtual = LocalDate.now();
        if (dataAtual.isAfter(dataDevolucao)) {
            long diasAtraso = ChronoUnit.DAYS.between(dataDevolucao, dataAtual);
            double valorMultaPorDia = usuario.getValorMultaPorDia();
            double valorMulta = valorMultaPorDia * diasAtraso;
            String formaTratamento = usuario.getGenero().equals("Masculino") ? "Sr." : "Sra.";
            StringBuilder mensagem = new StringBuilder();
            mensagem.append(formaTratamento).append(" ").append(usuario.getNome()).append(",\n");

            if (usuario instanceof Professor) {    // Caso seja um professor, não tem uma multa, só um aviso
                mensagem.append("Dê um bom exemplo aos seus alunos, devolva os seguintes livros em atraso:\n");
            } else {
                mensagem.append("Segue a lista de livros com devolução em atraso:\n");
                mensagem.append("Dias em atraso: ").append(diasAtraso).append("\n");
                mensagem.append("Multa a ser paga: R$ ").append(valorMulta).append("\n");
            }

            for (Livro livroEmprestado : livrosEmprestados) {
                mensagem.append(livroEmprestado.getTitulo()).append("\n");
            }

            System.out.println(mensagem.toString());
        }
    }

    public boolean disponibilidadeDoLivro(Livro livro) {
        return livrosEmprestados.contains(livro);
    }

    public List<Livro> getLivrosEmprestadosOrdemAlfabetica() {    //Disponibilizar uma listagem de livros emprestados em ordem crescente por título do livro.
        List<Livro> livrosOrdenados = new ArrayList<>(livrosEmprestados);
        Collections.sort(livrosOrdenados, Comparator.comparing(Livro::getTitulo));
        return livrosOrdenados;
    }

    public List<Livro> getListaUsuarioOrdemAlfabetica() { //Disponibiliza uma listagem de livros emprestados em ordem decrescente pelo nome do usuário.
        List<Livro> livrosOrdenados = new ArrayList<>(livrosEmprestados);
        livrosOrdenados.sort(Comparator.comparing(livro -> livro.getUsuario().getNome()));
        return livrosOrdenados;
    }

    public String getInformacoesEmprestimo() {
        StringBuilder informacoes = new StringBuilder();
        informacoes.append("Usuário: ").append(usuario.getNome()).append("\n");
        informacoes.append("Data do Empréstimo: ").append(dataEmprestimo.toString()).append("\n");
        informacoes.append("Data de Devolução: ").append(dataDevolucao.toString()).append("\n");
        return informacoes.toString();
    }

    public String getInformacaoDeLivroDeUsuario() {  //Pega informações de Emprestimos de certo usuário
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
        LocalDate data = this.dataEmprestimo;
        return data;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        LocalDate data = this.dataDevolucao;
        return data;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Usuario getUsuario() {
        Usuario usu = this.usuario;
        return usu;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Livro> getLivrosEmprestados() {
        return new ArrayList<>(livrosEmprestados);
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

}
