import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = sc.nextInt();

        int counter = 0;

        if (num < 0)
        {
            num = -num;
        }

        while (num > 0)
        {
            num /= 10;
            counter++;
        }
        System.out.println("The number of digits is: " + counter);

        sc.close();
    }
}