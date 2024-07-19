import java.util.Scanner;
public class Numeros_Primos {
    public static void main(String[] args) {
        int numero = scanner("digite um número").nextInt();

        for(int i = 2; i < numero; i++);

        int resultado = numero%2;

        if(resultado == 0) {
            System.out.println(+numero "um número é primo");
        }else{ System.out.println(+numero " um número não é primo");

        }



    }

    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);}
}

