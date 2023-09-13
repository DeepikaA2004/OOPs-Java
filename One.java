import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        // Initialize the cash position
        int cashPosition = 12000 - 4000 + 3000 + 3000 - 4000 - 2000 + 8000 - 5000;

        // Determine whether Aman has a surplus amount or deficit amount
        String cashPositionStatus;
        if (cashPosition >= 0) {
            cashPositionStatus = "Surplus";
        } else {
            cashPositionStatus = "Deficit";
        }

        // Print the cash position report
        System.out.println("Cash position at the end of the month: " + cashPosition);
        System.out.println("Cash position status: " + cashPositionStatus);
    }
}
