public class Main {
    public static void main(String[] args) {

        int n = 5;
        int first = 0, second = 1;

        System.out.println("The first " + n + " numbers of the fibonacci series are: ");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}