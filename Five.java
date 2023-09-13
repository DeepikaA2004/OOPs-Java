import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isStrongNumber(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is a weak number.");
        }

        scanner.close();
    }

    public static boolean isStrongNumber(int number) {
        if (number < 2) {
            return false; // Numbers less than 2 are neither strong nor weak
        }

        // The minimum even value = 2 because 0 is a neutral number

        return number % 2 == 0; // Check if the number is divisible by 2
    }
}