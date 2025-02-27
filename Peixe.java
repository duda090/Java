import java.util.Scanner;

public class Main {
    String nome;
    String especie;
    String cor;
    double tamanho;
    int idade;

    public Main(String nome, String especie, String cor, double tamanho, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.cor = cor;
        this.tamanho = tamanho;
        this.idade = idade;
    }

    public void nadando() {
        System.out.println(this.nome + " esta nadando.");
    }

    public void comer() {
        System.out.println(this.nome + " esta se alimentando.");
    }

    public void dormir() {
        System.out.println(this.nome + " esta dormindo.");
    }

    public void tomarBanho() {
        System.out.println(this.nome + " esta tomando banho.");
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Especie: " + this.especie + " | Cor: " + this.cor + 
               " | Tamanho: " + this.tamanho + " cm | Idade: " + this.idade + " meses";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        String especie = scanner.nextLine();
        String cor = scanner.nextLine();
        double tamanho = scanner.nextDouble();
        int idade = scanner.nextInt();
        scanner.close();

        Main peixe = new Main(nome, especie, cor, tamanho, idade);

        System.out.println(peixe);
        peixe.nadando();
        peixe.comer();
        peixe.dormir();
        peixe.tomarBanho();
    }
}
