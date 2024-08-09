import java.util.Scanner;

public class questao1 {
    public static void max(int n, int m) {
        if (n > m) {
            System.out.println("O maior número é: " + n);
        } else if (n < m) {
            System.out.println("O maior número é: " + m);
        } else { // if (n == m) {

            System.out.println("Os números são iguais.");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números inteiros: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        max(n, m);

    }
}