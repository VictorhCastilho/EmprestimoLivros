import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RankingLivros {
    private ListaGenerica<Livro> ranking;

    public RankingLivros() {
        ranking = new ListaGenerica<>();
    }

    public void registrarEmprestimo(Livro livro) {
        ranking.adicionar(livro);
    }

    public void listarRanking() {
        if (ranking.getLista().isEmpty()) {
            System.out.println("O ranking está vazio.");
        } else {
            System.out.println("Ranking de livros mais emprestados:");
            Map<Livro, Integer> livroQuantidadeMap = new HashMap<>();
            for (Livro livro : ranking.getLista()) {
                int quantidade = livroQuantidadeMap.getOrDefault(livro, 0);
                livroQuantidadeMap.put(livro, quantidade + 1);
            }

            List<Map.Entry<Livro, Integer>> sortedEntries = livroQuantidadeMap.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .collect(Collectors.toList());

            for (int i = 0; i < sortedEntries.size(); i++) {
                Map.Entry<Livro, Integer> entry = sortedEntries.get(i);
                Livro livro = entry.getKey();
                int quantidade = entry.getValue();
                String posicao = obterPosicao(i + 1);
                System.out.println(posicao + " lugar: " + livro.getTitulo() + ": " + quantidade + " empréstimos");
            }
        }
    }

    private String obterPosicao(int posicao) {
        String sufixo;
        int ultimoDigito = posicao % 10;
        int ultimoDoisDigitos = posicao % 100;
        if (ultimoDigito == 1 && ultimoDoisDigitos != 11) {
            sufixo = "º";
        } else if (ultimoDigito == 2 && ultimoDoisDigitos != 12) {
            sufixo = "º";
        } else if (ultimoDigito == 3 && ultimoDoisDigitos != 13) {
            sufixo = "º";
        } else {
            sufixo = "º";
        }
        return posicao + sufixo;
    }
}
