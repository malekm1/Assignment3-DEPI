import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        Double num = sc.nextDouble();

        if (num > 0) {
            System.out.println("The number " + num + " is a positive number");
        }
        else if (num < 0) {
            System.out.println("The number " + num + " is a negative number");
        }
        else {
            System.out.println("The number is zero");
        }
        sc.close();
    }
}