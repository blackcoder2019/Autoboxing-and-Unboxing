package developer.arifkhan;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Bangladesh Bank");
        bank.addBranch("Dhaka");
        bank.addCustomer("Dhaka", "Arif", 20.50);
        bank.addCustomer("Dhaka", "Khan", 20.50);
        bank.addCustomer("Dhaka", "Arif", 20.50);
        bank.addCustomer("Dhaka", "Arif", 20.50);
        bank.addBranch("Kumilla");
        bank.addCustomer("Kumilla", "Arif", 20.50);
        bank.addCustomer("Kumilla", "Khan", 20.50);
        bank.addCustomer("Kumilla", "Arif", 20.50);
        bank.addCustomer("Kumilla", "Arif", 20.50);

        bank.listCustomers("Dhaka",false);
    }
}
