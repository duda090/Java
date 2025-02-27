import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String linha = scanner.nextLine();


        String[] numerosStr = linha.split(" ");
        int[] numeros = new int[numerosStr.length];

        for (int i = 0; i < numerosStr.length; i++) {
            numeros[i] = Integer.parseInt(numerosStr[i]);
        }


        int maior = numeros[0];
        int menor = numeros[0];


        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }


        System.out.println(maior);
        System.out.println(menor);

        scanner.close();
    }
}
