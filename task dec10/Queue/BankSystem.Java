public class BankSystem {
    public static void main(String[] args) {
        // Create the banking queue
        BankQueue bankQueue = new BankQueue();

        // Create customers
        Customer customer1 = new Customer("Alice", 101, 500.0);
        Customer customer2 = new Customer("Bob", 102, 300.0);
        Customer customer3 = new Customer("Charlie", 103, 1000.0);

        // Add customers to the queue
        bankQueue.addCustomer(customer1);
        bankQueue.addCustomer(customer2);
        bankQueue.addCustomer(customer3);

        // Display current queue
        bankQueue.displayQueue();

        // Serve customers
        bankQueue.serveCustomer(); // Serve Alice
        bankQueue.serveCustomer(); // Serve Bob
        bankQueue.serveCustomer(); // Serve Charlie

        // Display current queue after serving customers
        bankQueue.displayQueue();
    }
}