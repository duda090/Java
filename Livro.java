import java.time.Year;
import java.util.Scanner;

public class Main {
    String titulo;
    String autor;
    int anoPublicacao;
    String genero;

    public Main(String titulo, String autor, int anoPublicacao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
    }

    public void exibirDetalhes() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de Publicacao: " + this.anoPublicacao);
        System.out.println("Genero: " + this.genero);
    }

    public boolean isNovo() {
        int anoAtual = Year.now().getValue();
        return (anoAtual - this.anoPublicacao) <= 5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String titulo1 = scanner.nextLine();
        String autor1 = scanner.nextLine();
        int anoPublicacao1 = scanner.nextInt();
        scanner.nextLine();
        String genero1 = scanner.nextLine();

        String titulo2 = scanner.nextLine();
        String autor2 = scanner.nextLine();
        int anoPublicacao2 = scanner.nextInt();
        scanner.nextLine();
        String genero2 = scanner.nextLine();

        Main livro1 = new Main(titulo1, autor1, anoPublicacao1, genero1);
        Main livro2 = new Main(titulo2, autor2, anoPublicacao2, genero2);

        livro1.exibirDetalhes();
        System.out.println("Novo: " + (livro1.isNovo() ? "Sim" : "Nao"));

        livro2.exibirDetalhes();
        System.out.println("Novo: " + (livro2.isNovo() ? "Sim" : "Nao"));

        scanner.close();
    }
}
