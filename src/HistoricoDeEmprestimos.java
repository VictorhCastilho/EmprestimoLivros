import java.util.ArrayList;
import java.util.List;

public class HistoricoDeEmprestimos {
    private ListaGenerica<Emprestimo> emprestimosRealizados;

    public HistoricoDeEmprestimos() {
        emprestimosRealizados = new ListaGenerica<>();
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimosRealizados.adicionar(emprestimo);
    }

    public void removerEmprestimo(Emprestimo emprestimo) {
        emprestimosRealizados.remover(emprestimo);
    }

    public boolean verificarEmprestimo(Emprestimo emprestimo) {
        return emprestimosRealizados.verificar(emprestimo);
    }

    public List<Emprestimo> getEmprestimosRealizados() {
        return emprestimosRealizados.getLista();
    }

    public void setEmprestimosRealizados(List<Emprestimo> emprestimosRealizados) {
        this.emprestimosRealizados.setLista(emprestimosRealizados);
    }
}