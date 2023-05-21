import java.util.ArrayList;
import java.util.List;

public class HistoricoDeEmprestimos {
    private List<Emprestimo> emprestimosRealizados;

    public HistoricoDeEmprestimos() {
        this.emprestimosRealizados = new ArrayList<>();
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimosRealizados.add(emprestimo);
    }

    public void removerEmprestimo(Emprestimo emprestimo) {
        emprestimosRealizados.remove(emprestimo);
    }

    public boolean verificarEmprestimo(Emprestimo emprestimo) {
        return emprestimosRealizados.contains(emprestimo);
    }

    public List<Emprestimo> getEmprestimosRealizados() {
        return emprestimosRealizados;
    }

    public void setEmprestimosRealizados(List<Emprestimo> emprestimosRealizados) {
        this.emprestimosRealizados = emprestimosRealizados;
    }
}