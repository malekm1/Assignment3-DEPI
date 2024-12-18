public class Main {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000 are:");

        for (int number = 1; number <= 1000; number++)
        {
            int sum = 0;

            for (int i = 1; i < number; i++)
            {
                if (number % i == 0)
                {
                    sum += i;
                }
            }
            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}