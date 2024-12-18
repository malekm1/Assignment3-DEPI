import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Please enter the second number: ");
        double num2 = sc.nextDouble();

        if (num1 > num2)
        {
            System.out.println(num1 + " is greater than " + num2);
        }
        else if (num1 < num2)
        {
            System.out.println(num2 + " is greater than " + num1);
        }
        else
        {
            System.out.println("Both numbers are equal");
        }
        sc.close();
    }
}