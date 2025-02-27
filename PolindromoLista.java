import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNextLine()) {
            String palavra = scanner.nextLine().trim();


            String palavraProcessada = palavra.replaceAll("\\s+", "").toLowerCase();


            if (isPalindromo(palavraProcessada)) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
        }

        scanner.close();
    }


    private static boolean isPalindromo(String palavra) {
        int inicio = 0;
        int fim = palavra.length() - 1;

        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    }
}
