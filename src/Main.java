import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base: ");
        int base = input.nextInt();

        System.out.println("Enter the exponent: ");
        int exponent = input.nextInt();

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }
}