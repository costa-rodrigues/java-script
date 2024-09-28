import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando um autor
        Autor autor = new Autor("Jessica Felix", "Brasil");

        // Criando um livro
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");
        autor.adicionarObra(livro); // Adicionando o livro à lista de obras do autor

        // Criando um usuário
        Usuario usuario = new Usuario("Lucas Rafael", 25);

        // Data de empréstimo
        Date dataRetirada = new Date(); // Data atual
        Date dataDevolucao = new Date(); // Data atual
        dataDevolucao.setTime(dataRetirada.getTime() + (7 * 24 * 60 * 60 * 1000)); // 7 dias depois

        // Criando um empréstimo
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);
        usuario.adicionarEmprestimo(emprestimo); // Adiciona o empréstimo ao histórico do usuário

        // Verificando a disponibilidade do livro
        livro.validarDisponibilidade();

        // Exibindo as informações do empréstimo
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}
