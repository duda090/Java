import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo a sequência de números inteiros
        String linha = scanner.nextLine();

        // Convertendo a linha em um array de strings e depois em um array de inteiros
        String[] numerosStr = linha.split(" ");
        int[] numeros = new int[numerosStr.length];

        // Convertendo para inteiros
        int soma = 0;
        for (int i = 0; i < numerosStr.length; i++) {
            numeros[i] = Integer.parseInt(numerosStr[i]);
            soma += numeros[i];  // Calculando a soma dos números
        }

        // Calculando a média
        double media = soma / (double)numeros.length;

        // Imprimindo a média com duas casas decimais
        System.out.printf("%.2f\n", media);

        scanner.close();
    }
}
