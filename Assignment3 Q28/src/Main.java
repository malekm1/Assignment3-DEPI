public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum += number;
            }
        }

        System.out.println("The sum of all prime numbers between 1 and 100 is: " + sum);
    }
}