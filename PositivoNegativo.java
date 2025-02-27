import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o número inteiro
        int numero = scanner.nextInt();

        // Verificando se o número é positivo, negativo ou zero
        if (numero > 0) {
            System.out.println("POSITIVO");
        } else if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("ZERO");
        }

        scanner.close();
    }
}
