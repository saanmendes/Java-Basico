import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        int n = scanner("digite um número").nextInt();
    }
    public static Scanner scanner (String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
