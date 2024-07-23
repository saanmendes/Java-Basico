import java.util.Scanner;
public class Contagem_de_Digitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int d = 1;

        System.out.println("digite um número inteiro");
        n = scanner.nextInt();

        while (n >= 10) {
            n /= 10;
            d++;
        }
        System.out.println("quantidade de digitos " + d);
        }


    }
