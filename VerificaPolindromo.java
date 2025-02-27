import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo a palavra fornecida pelo usuário
        String palavra = scanner.nextLine();

        // Remover espaços e converter para minúsculas
        palavra = palavra.replaceAll("\\s", "").toLowerCase();

        // Verificando se a palavra é um palíndromo
        if (isPalindromo(palavra)) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }

        scanner.close();
    }

    // Função que verifica se a palavra é um palíndromo
    public static boolean isPalindromo(String palavra) {
        int i = 0;
        int j = palavra.length() - 1;

        while (i < j) {
            if (palavra.charAt(i) != palavra.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
