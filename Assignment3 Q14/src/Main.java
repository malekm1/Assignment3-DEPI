public class Main {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 50 are:");

        for (int number = 2; number <= 50; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}