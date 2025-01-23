public class TestAccount {
    public static void main(String[] args) {
        // Create two accounts
        Account acc1 = new Account("ACC1", "Account 1", 5000);
        Account acc2 = new Account("ACC2", "Account 2", 4000);

        //Display Initial Balances
        System.out.println("Initial Balances: ");
        System.out.println("acc1: " + acc1.getBalance());
        System.out.println("acc1: " + acc2.getBalance());

        // Initiate $1000 transfer from acc1 to acc2
        acc1.transferTo(acc2, 1000);

        // Display updated balances

        System.out.println("\nUpdated Balances: ");
        System.out.println("acc1: " + acc1.getBalance());
        System.out.println("acc2: " + acc2.getBalance());
    }
}