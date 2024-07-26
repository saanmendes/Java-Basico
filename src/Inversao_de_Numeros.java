import java.util.Scanner;

public class Inversao_de_Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("digite um número inteiro");
        numero = scanner.nextInt();

        int numeroInvertido = 0;
        int numeroOrigem = numero;

        while (numero > 0) {
            int digito = numero % 10;

            numeroInvertido = numeroInvertido * 10 + digito;

            numero = numero / 10;
        }
        System.out.println("Número invertido: " + numeroInvertido);

    }
}





