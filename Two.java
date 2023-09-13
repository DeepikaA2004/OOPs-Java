public class Two {
    public static void main(String[] args) {
        double accountBalance = 200000.0; // Initial account balance

        // Transactions
        double deposit = 100000.0;
        double fundsTransfer = 25000.0;
        double loanTaken = 10000.0;
        double interestRate = 0.05; // 5% interest rate
        int loanDurationMonths = 6;
        double withdrawal = 20000.0;

        // Apply transactions
        accountBalance += deposit;
        accountBalance -= fundsTransfer;
        accountBalance += loanTaken;

        // Calculate interest on the loan (Simple Interest)
        double interest = (loanTaken * interestRate * loanDurationMonths) / 12;
        accountBalance -= interest;

        accountBalance -= withdrawal;

        // Display the final account balance
        System.out.println("Mr. M's Final Account Balance: Rs " + accountBalance);
    }
}