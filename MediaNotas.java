import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo as notas das três provas
        double p1 = scanner.nextDouble();
        double p2 = scanner.nextDouble();
        double p3 = scanner.nextDouble();

        // Calculando a média aritmética
        double media = (p1 + p2 + p3) / 3;

        // Exibindo a média com 2 casas decimais
        System.out.printf("%.2f\n", media);

        scanner.close();
    }
}
