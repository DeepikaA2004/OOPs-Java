public class Three {
    public static void main(String[] args) {
        int bHome = 10; // Mr. B's home address
        int uHome = 20; // Mr. U's home address

        // Swap their locations
        int temp = bHome;
        bHome = uHome;
        uHome = temp;

        System.out.println("Mr. B, please go to Door No. " + bHome);
        System.out.println("Mr. U, please go to Door No. " + uHome);
    }
}