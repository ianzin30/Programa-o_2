import java.util.Scanner;

public class questao5 {
    public static void calculadora(int n, int m, int op) {
        if (op == 1) {
            System.out.println("Soma: " + (n + m));
        } else if (op == 2) {
            System.out.println("Subtração: " + (n - m));
        } else if (op == 3) {
            System.out.println("Multiplicação: " + (n * m));
        } else if (op == 4) {
            int k = n / m;
            if (k == 0) {
                System.out.println("Erro: Divisão por zero.");
            } else {
                System.out.println("Divisão: " + (n / m));
            }
        } else {
            System.out.println("Operação inválida.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para somar;");
        System.out.println("Digite 2 para subtrair;");
        System.out.println("Digite 3 para multiplicar;");
        System.out.println("Digite 4 para dividir;");
        int op = sc.nextInt();
        System.out.println("Digite dois números inteiros: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        calculadora(n, m, op);
    }
}
