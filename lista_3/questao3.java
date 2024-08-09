import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = 0;
        while (true) {
            int x = scanner.nextInt();
            if (x == 0) {
                break;
            }
            if (x > 0) {
                valor++;
            }
        }
        System.out.println("Quantidade de positivos: " + valor);
    }
}