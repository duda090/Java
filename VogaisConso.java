import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String frase = scanner.nextLine();


        int numVogais = 0;
        int numConsoantes = 0;


        frase = frase.toLowerCase();


        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (Character.isLetter(c)) {

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    numVogais++;
                } else {
                    numConsoantes++;
                }
            }
        }


        System.out.println(numVogais);
        System.out.println(numConsoantes);

        scanner.close();
    }
}
