public class TesteRanking {
    public static void main(String[] args) {
        // Criar alguns livros
        Livro livro1 = new Livro("Livro 1", "joao", 7);
        Livro livro2 = new Livro("Livro 2","pedro", 7);
        Livro livro3 = new Livro("Livro 3","cleber", 7);
        Livro livro4 = new Livro("Livro 4","jussimara", 7);
        Livro livro5 = new Livro("Livro 5","hilton", 7);
        Livro livro6 = new Livro("Livro 6","pablo", 7);

        // Criar uma instância do RankingLivros
        RankingLivros rankingLivros = new RankingLivros();

        // Registrar empréstimos de livros
        rankingLivros.registrarEmprestimo(livro1);
        rankingLivros.registrarEmprestimo(livro2);
        rankingLivros.registrarEmprestimo(livro1);
        rankingLivros.registrarEmprestimo(livro3);
        rankingLivros.registrarEmprestimo(livro2);
        rankingLivros.registrarEmprestimo(livro4);
        rankingLivros.registrarEmprestimo(livro5);
        rankingLivros.registrarEmprestimo(livro6);
        rankingLivros.registrarEmprestimo(livro5);
        rankingLivros.registrarEmprestimo(livro6);
        rankingLivros.registrarEmprestimo(livro6);

        // Listar o ranking de livros
        rankingLivros.listarRanking();

    }
}