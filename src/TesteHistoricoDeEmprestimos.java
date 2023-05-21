import java.time.LocalDate;

public class TesteHistoricoDeEmprestimos {
    public static void main(String[] args) {

        Emprestimo emprestimo1 = new Emprestimo(LocalDate.now(), LocalDate.now().plusDays(7), null);
        Emprestimo emprestimo2 = new Emprestimo(LocalDate.now(), LocalDate.now().plusDays(10), null);
        Emprestimo emprestimo3 = new Emprestimo(LocalDate.now(), LocalDate.now().plusDays(14), null);

        HistoricoDeEmprestimos historico = new HistoricoDeEmprestimos();

        historico.adicionarEmprestimo(emprestimo1);
        historico.adicionarEmprestimo(emprestimo2);

        System.out.println("Existe empréstimo 1 no histórico? " + historico.verificarEmprestimo(emprestimo1));
        System.out.println("Existe empréstimo 3 no histórico? " + historico.verificarEmprestimo(emprestimo3));

        historico.removerEmprestimo(emprestimo1);

        System.out.println("Existe empréstimo 1 no histórico após remoção? " + historico.verificarEmprestimo(emprestimo1));
    }
}
