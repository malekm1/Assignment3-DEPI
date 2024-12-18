public class Main {
    public static void main(String[] args) {
        for (int num = 1; num <= 500; num++) {
            int sum = 0;
            int temp = num;
            int digits = String.valueOf(num).length();  // Get the number of digits

            // Calculate the sum of the digits raised to the power of the number of digits
            while (temp != 0) {
                int digit = temp % 10;  // Get the last digit
                sum += Math.pow(digit, digits);  // Add the digit raised to the power of 'digits'
                temp /= 10;  // Remove the last digit
            }

            // Check if the number is an Armstrong number
            if (sum == num) {
                System.out.println(num + " is an Armstrong number.");
            }
        }
    }
}