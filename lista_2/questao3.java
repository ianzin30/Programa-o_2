import java.util.Scanner;

public class questao3 {
    public static void paridade(int n1) {
        if (n1 % 2 == 0) {
            System.out.println(n1 + " O número é par.");
        } else {
            System.out.println(n1 + " O número é ímpar.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        paridade(num1);
    }
}
