import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter the third number: ");
        double num3 = sc.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The largest number is the first number: " + num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("The largest number is the second number: " + num2);
        }
        else if (num3 > num1 && num3 > num2) {
            System.out.println("The largest number is the third number: " + num3);
        }
        else {
            System.out.println("All 3 numbers are equal");
        }
        sc.close();
    }
}