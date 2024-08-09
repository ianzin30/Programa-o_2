import java.util.Scanner;

public class questao2 {
    public static void compare(int n1, int n2, int n3) {
        if (n1 == n2 || n1 == n3) {
            System.out.println("erro");
        } else if (n1 > n2 && n1 > n3) {
            System.out.println("Condição satisfeita");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        compare(num1, num2, num3);

    }
}
