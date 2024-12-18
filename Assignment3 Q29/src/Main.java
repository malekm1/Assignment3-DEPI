import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum1 = 0, sum2 = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                sum1 += i;
            }
        }
        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                sum2 += i;
            }
        }
        if (sum1 == num2 && sum2 == num1) {
            System.out.println(num1 + " and " + num2 + " are amicable numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not amicable numbers.");
        }
        scanner.close();
    }
}