import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        int n = scanner("digite um número").nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma = soma + i;
        }
        System.out.print("a resposta da soma é " + soma);



    }
    public static Scanner scanner (String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
