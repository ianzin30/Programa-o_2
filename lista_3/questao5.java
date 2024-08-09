import java.util.Scanner;

public class questao5 {
    public static void primo(int n1) {
        if (n1 <= 1) {
            System.out.println("Não é primo"); 
            return;
        }
        for (int i = 2; i <= Math.sqrt(n1); i++) { 
            if (n1 % i == 0) {
                System.out.println("Não é primo");
                return;
            }
        }
        System.out.println("É primo");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int n1 = scanner.nextInt();
        primo(n1); 
        scanner.close(); 
    }
}
