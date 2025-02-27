import java.util.Scanner;

public class Main {
    String marca;
    String modelo;
    int ano;
    String cor;

    public Main(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String marca1 = scanner.nextLine();
        String modelo1 = scanner.nextLine();
        int ano1 = scanner.nextInt();
        scanner.nextLine();
        String cor1 = scanner.nextLine();

        String marca2 = scanner.nextLine();
        String modelo2 = scanner.nextLine();
        int ano2 = scanner.nextInt();
        scanner.nextLine();
        String cor2 = scanner.nextLine();

        Main carro1 = new Main(marca1, modelo1, ano1, cor1);
        Main carro2 = new Main(marca2, modelo2, ano2, cor2);

        carro1.exibirInformacoes();
        carro2.exibirInformacoes();
        
        scanner.close();
    }
}
