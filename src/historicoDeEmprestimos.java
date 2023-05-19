import java.util.ArrayList;
import java.util.List;

public class historicoDeEmprestimos {
    private List<emprestimo> emprestimosRealizados;

    public historicoDeEmprestimos() {
        this.emprestimosRealizados = new ArrayList<>();
    }

    public void adicionarEmprestimo(emprestimo emprestimo) {
        emprestimosRealizados.add(emprestimo);
    }

    public void removerEmprestimo(emprestimo emprestimo) {
        emprestimosRealizados.remove(emprestimo);
    }

    public boolean verificarEmprestimo(emprestimo emprestimo) {
        return emprestimosRealizados.contains(emprestimo);
    }

    public List<emprestimo> getEmprestimosRealizados() {
        return emprestimosRealizados;
    }

    public void setEmprestimosRealizados(List<emprestimo> emprestimosRealizados) {
        this.emprestimosRealizados = emprestimosRealizados;
    }
}