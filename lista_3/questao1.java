import java.util.Scanner;

public class questao1 {
    public static int pa(int n1, int n2) {
        int n = n2 - n1 + 1; 
        int sum = (n * (n1 + n2)) / 2; 
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the last number: ");
        int n2 = scanner.nextInt();
        System.out.println("The sum of the arithmetic progression is: " + pa(n1, n2));
        scanner.close();
    }
}
