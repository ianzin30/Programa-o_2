import java.util.Scanner;

public class questao4 {
    public static int operacao(int n, int m){
        if (n == m) {
            return n * m;
        }
        else if (n > m) {
            return n - m;
        }
        else {
            return n + m;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        operacao(n, m);
    }
}
