import java.util.Scanner;

public class questao4 {
    public static void valores_entre(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 1) {
                System.out.println("É ímpar: " + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        valores_entre(n1, n2);
    }
}
